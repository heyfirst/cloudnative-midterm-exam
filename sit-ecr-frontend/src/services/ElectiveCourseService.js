import api from '../utils/api'

const ElectiveCourseService = {
  getAllElectiveCourses: () => {
    return api.get(`http://localhost:8090/elective-courses/`)
  }
}

export default ElectiveCourseService
