import api from '../utils/api'

const ElectiveCourseService = {
  getAllElectiveCourses: () => {
    return api.get(`elective-courses/`)
  }
}

export default ElectiveCourseService
