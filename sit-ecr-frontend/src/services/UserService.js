import api from '../utils/api'

const EnrollService = {
  getUserFromUserID: studentId => {
    return api.get(`http://localhost:8090/enroll/student-id/${studentId}`)
  }
}

export default EnrollService
