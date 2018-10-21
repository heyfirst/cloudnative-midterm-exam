import React from 'react'
import ReactDOM from 'react-dom'
import { Router } from 'react-static'
import { Provider } from 'mobx-react'

// Your top level component
import App from './App'

// Export your top level component as JSX (for static rendering)
export const Core = props => {
  return (
    <Router>
      <App {...props} />
    </Router>
  )
}
export default Core

// Render your app
if (typeof document !== 'undefined') {
  const renderMethod = module.hot ? ReactDOM.render : ReactDOM.hydrate || ReactDOM.render
  const render = Comp => {
    renderMethod(<Comp />, document.getElementById('root'))
  }

  // Render!
  render(Core)
}
