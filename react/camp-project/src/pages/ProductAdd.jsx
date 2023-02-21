import React from 'react'
import { FormField, Form, Button, Label } from 'semantic-ui-react';
import * as Yup from "yup";
import { Formik, Field, ErrorMessage } from 'formik';
import UboTextInput from '../utilities/customFormControls/UboTextInput';

export default function ProductAdd() {

    const initialValues = { productName: "", unitPrice: 10 }

    const schema = Yup.object({
        productName: Yup.string().required("Product name is mandatory."),
        unitPrice: Yup.number().required("Unit price is mandatory.")
    })
    return (
        <Formik
            initialValues={initialValues}
            validationSchema={schema}
            onSubmit={(values) => {
                console.log(values)
            }}
        >
            <Form className='ui form'>
                <UboTextInput name="productName" placeholder="Product Name" />
                <UboTextInput name="unitPrice" placeholder="Unit Price" />
                <Button color='green' type='submit'> Add </Button>
            </Form>
        </Formik>
    )
}
