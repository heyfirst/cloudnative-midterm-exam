import React from 'react'
import { Icon } from 'antd'
import styled from 'styled-components'

const Table = styled.table`
  .w-5 {
    width: 5%;
  }
  .w-15 {
    width: 15%;
  }
`
class EnrollTable extends React.Component {
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
            <tr>
              <td scope="col">
                <button className="btn btn-danger btn-block" disabled>
                  MAX
                </button>
              </td>
              <td scope="col">INT491</td>
              <td scope="col">ABC</td>
              <td scope="col">-</td>
              <td scope="col">
                30/30 <span className="badge float-right badge-danger">Max</span>
              </td>
            </tr>
            <tr>
              <td scope="col">
                <button className="btn btn-success btn-block d-flex align-items-center">
                  <Icon type="check-circle" theme="outlined" className="mr-1" />
                  ENROLLED
                </button>
              </td>
              <td scope="col">INT491</td>
              <td scope="col">ABC</td>
              <td scope="col">-</td>
              <td scope="col">
                9/30 <span className="badge float-right badge-success">Available</span>
              </td>
            </tr>
            <tr>
              <td scope="col">
                <button className="btn btn-secondary btn-block">CHOOSE</button>
              </td>
              <td scope="col">INT491</td>
              <td scope="col">ABC</td>
              <td scope="col">-</td>
              <td scope="col">
                11/30 <span className="badge float-right badge-success">Available</span>
              </td>
            </tr>
            <tr>
              <td scope="col">
                <button className="btn btn-primary btn-block d-flex align-items-center">
                  <Icon type="check" theme="outlined" className="mr-1" />
                  CHOOSED
                </button>
              </td>
              <td scope="col">INT491</td>
              <td scope="col">ABC</td>
              <td scope="col">-</td>
              <td scope="col">
                11/30 <span className="badge float-right badge-success">Available</span>
              </td>
            </tr>
          </tbody>
        </Table>
      </div>
    )
  }
}

export default EnrollTable
