import React from 'react'
import {
  Collapse,
  Navbar,
  NavbarToggler,
  Nav,
  NavItem,
  UncontrolledDropdown,
  DropdownToggle,
  DropdownMenu,
  DropdownItem
} from 'reactstrap'
import { NavLink as Link, withRouter } from 'react-static'
import styled from 'styled-components'

const NewNavbar = styled(Navbar)`
  height: 56px;
  padding: 0;
  filter: drop-shadow(0rem 0.25rem 0.15rem rgba(0, 0, 0, 0.1));
  box-shadow: 0px 2px 4px rgba(0, 0, 0, 0.2);
  z-index: 99;
  button {
    cursor: pointer;
  }
`

@withRouter
class ECRNavbar extends React.Component {
  state = {
    isOpen: false
  }

  logout = async () => {}

  toggle = () => {
    this.setState({
      isOpen: !this.state.isOpen
    })
  }

  render() {
    return (
      <NewNavbar color="info" dark expand="md">
        <div className="container">
          <Link className="navbar-brand" to="/">
            The SIT's Elective Courses Registration
          </Link>
          <NavbarToggler onClick={this.toggle} />
          <Collapse isOpen={this.state.isOpen} navbar>
            <Nav className="ml-auto" navbar>
              <NavItem>
                <a href="#" className="nav-link">
                  Login
                </a>
              </NavItem>
            </Nav>
          </Collapse>
        </div>
      </NewNavbar>
    )
  }
}

export default ECRNavbar
