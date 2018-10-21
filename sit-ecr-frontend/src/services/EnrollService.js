import api from '../utils/api'

const EnrollService = {
  getAllEnrollByStudentID: studentId => {
    return api.get(`http://localhost:8090/enroll/student-id/${studentId}`)
  },
  createEnroll: (studentId, courseId) => {
    return api.post(`http://localhost:8090/enroll/`, {
      courseId,
      studentId
    })
  }
}

export default EnrollService
