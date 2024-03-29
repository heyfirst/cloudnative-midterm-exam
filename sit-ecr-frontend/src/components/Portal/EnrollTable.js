import React from 'react'
import { Icon } from 'antd'
import styled from 'styled-components'
import ElectiveCourseService from '../../services/ElectiveCourseService'

const Table = styled.table`
  .w-5 {
    width: 5%;
  }
  .w-15 {
    width: 15%;
  }
`
class EnrollTable extends React.Component {
  state = {
    courses: []
  }

  async componentDidMount() {
    const data = await ElectiveCourseService.getAllElectiveCourses().then(resp => resp.data)
    this.setState({
      courses: data
    })
  }

  checkCourseAvailable = (enrolls, maxEnrolls) => {
    if (enrolls < maxEnrolls) {
      return true
    }
    return false
  }

  render() {
    return (
      <div className="table-responsive">
        <Table className="table table-striped table-bordered mb-0">
          <thead>
            <tr>
              <th scope="col" className="w-5">
                Action
              </th>
              <th scope="col" className="w-15">
                Course ID.
              </th>
              <th scope="col">Course Name</th>
              <th scope="col">Lecturer</th>
              <th scope="col" className="w-15">
                Status
              </th>
            </tr>
          </thead>
          <tbody>
            {this.state.courses.map((course, index) => (
              <tr key={index}>
                <td scope="col">
                  <button className="btn btn-primary btn-block d-flex align-items-center">
                    <Icon type="check" theme="outlined" className="mr-1" />
                    CHOOSE
                  </button>
                </td>
                <td scope="col">{course.courseCode}</td>
                <td scope="col">{course.courseName}</td>
                <td scope="col">{course.lecturer}</td>
                <td scope="col">
                  {course.enrolls.length}/{course.maxEnrolls}{' '}
                  <span
                    className={`badge float-right ${
                      this.checkCourseAvailable(course.enrolls.length, course.maxEnrolls)
                        ? 'badge-success'
                        : 'badge-danger'
                    }`}
                  >
                    {this.checkCourseAvailable(course.enrolls.length, course.maxEnrolls)
                      ? 'Available'
                      : 'Max'}
                  </span>
                </td>
              </tr>
            ))}
          </tbody>
        </Table>
      </div>
    )
  }
}

export default EnrollTable
