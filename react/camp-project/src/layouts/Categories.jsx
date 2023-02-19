import React from 'react'
import { Input, Label, Menu } from 'semantic-ui-react'

export default function Categories() {
  return (
    <div>
      <Menu pointing vertical>
        <Menu.Item
          name='home'
        />
        <Menu.Item
          name='spam'
        />
        <Menu.Item
          name='updates'
        />
      </Menu>
    </div>
  )
}
