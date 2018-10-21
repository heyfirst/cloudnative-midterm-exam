import React from 'react'
import styled from 'styled-components'

class LoginCard extends React.Component {
  render() {
    return (
      <div className="card bg-light">
        <div className="card-body">
          <h4>Login.</h4>
          <form action="">
            <div className="form-group">
              <label htmlFor="">Username:</label>
              <input type="text" className="form-control" />
            </div>
            <div className="form-group">
              <label htmlFor="">Password:</label>
              <input type="password" className="form-control" />
            </div>
            <button className="btn btn-primary btn-block">Login</button>
          </form>
        </div>
      </div>
    )
  }
}

export default LoginCard
