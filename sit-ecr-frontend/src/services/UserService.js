import api from '../utils/api'

const UserService = {
  getUserFromUserID: studentId => {
    return api.get(`http://localhost:8091/user/student-id/${studentId}`)
  }
}

export default UserService
