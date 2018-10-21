import React from 'react'
import styled from 'styled-components'

import ECRNavbar from '../components/Core/Navbar'
import CourseTable from '../components/Portal/CourseTable'
import LoginCard from '../components/Portal/Login'
import EnrollTable from '../components/Portal/EnrollTable'

class Portal extends React.Component {
  render() {
    return (
      <div>
        <ECRNavbar />
        <div className="container mt-3">
          <section id="courses">
            <div className="row mb-3">
              <div className="col-12">
                <div className="card bg-light">
                  <div className="card-body">
                    <h3>Hi, Welcome to SIT's ECR System.</h3>
                  </div>
                </div>
              </div>
            </div>
            <div className="row mb-3">
              <div className="col-12">
                <div className="card bg-light">
                  <CourseTable />
                </div>
              </div>
            </div>
          </section>
          <section id="login" className="mb-3">
            <div className="row">
              <div className="col-12">
                <LoginCard />
              </div>
            </div>
          </section>
          <section id="enroll" className="mb-3">
            <div className="row">
              <div className="col-12">
                <div className="card bg-light">
                  <div className="card-body">
                    <h4>Enroll.</h4>
                    <div className="mb-2">
                      คุณเลือกได้อีก <span className="badge badge-success">2</span> วิชา
                    </div>
                    <EnrollTable />
                    <button className="btn btn-block btn-primary mt-3">Enroll</button>
                  </div>
                </div>
              </div>
            </div>
          </section>
        </div>
      </div>
    )
  }
}

export default Portal
