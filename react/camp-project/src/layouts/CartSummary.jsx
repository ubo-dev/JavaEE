import React from 'react'
import { Dropdown, DropdownItem } from 'semantic-ui-react'

export default function CartSummary() {
  return (
    <div>
        <Dropdown item text='Language'>
              <Dropdown.Menu>
                <Dropdown.Item>English</Dropdown.Item>
                <Dropdown.Item>Russian</Dropdown.Item>
                <Dropdown.Item>Spanish</Dropdown.Item>
                <DropdownItem>CartCurt</DropdownItem>
              </Dropdown.Menu>
            </Dropdown>
    </div>
  )
}
