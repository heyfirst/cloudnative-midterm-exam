import api from '../utils/api'

const EnrollService = {
  getAllEnrollByStudentID: studentId => {
    return api.get(`enroll/student-id/${studentId}`)
  },
  createEnroll: (studentId, courseId) => {
    return api.post(`enroll/`, {
      courseId,
      studentId
    })
  }
}

export default EnrollService
