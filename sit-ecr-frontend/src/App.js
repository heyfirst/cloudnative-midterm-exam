import React from 'react'
import { Route, Switch, withRouter, Redirect } from 'react-static'
import { hot } from 'react-hot-loader'
import * as R from 'ramda'
import { observer, inject } from 'mobx-react'

import './static/css/bootstrap.css'
import './App.css'

import Portal from './containers/Portal'
import NotFound from './containers/NotFound'

@observer
class App extends React.Component {
  render() {
    return (
      <React.Fragment>
        <Route
          path="/:url*"
          exact
          strict
          render={props => <Redirect to={`${props.location.pathname}/`} />}
        />
        <Switch>
          <Route key={1} exact path="/" component={Portal} />
          <Route component={NotFound} />
        </Switch>
      </React.Fragment>
    )
  }
}
export default R.compose(
  hot(module),
  withRouter
)(App)
