const utils = require('../utils/utils');
const Currency = require('../models/Currency');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}start_date`,
                label: `Starting date of time period. Format: YYYY-MM-DD - [${labelPrefix}start_date]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}end_date`,
                label: `End date of time period. Format: YYYY-MM-DD - [${labelPrefix}end_date]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}po_number`,
                label: `The po number - [${labelPrefix}po_number]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}budget_amount`,
                label: `If Budget order line, the budget amount. - [${labelPrefix}budget_amount]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}billing_contact_firstname`,
                label: `The billing contact first name - [${labelPrefix}billing_contact_firstname]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}billing_contact_lastname`,
                label: `The billing contact last name - [${labelPrefix}billing_contact_lastname]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}billing_contact_email`,
                label: `The billing contact email - [${labelPrefix}billing_contact_email]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}media_contact_firstname`,
                label: `The media contact first name - [${labelPrefix}media_contact_firstname]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}media_contact_lastname`,
                label: `The media contact last name - [${labelPrefix}media_contact_lastname]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}media_contact_email`,
                label: `The media contact email - [${labelPrefix}media_contact_email]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}agency_link`,
                label: `URL link for agency - [${labelPrefix}agency_link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}user_email`,
                label: `The email of user submitting the insertion order - [${labelPrefix}user_email]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}accepted_terms_time`,
                label: `The UTC timestamp (to the nearest sec) of when terms were accepted - [${labelPrefix}accepted_terms_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}pmp_id`,
                label: `The pmp id - [${labelPrefix}pmp_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}order_name`,
                label: `The order name - [${labelPrefix}order_name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}order_line_type`,
                label: `Type can be Budget or Perpetual - [${labelPrefix}order_line_type]`,
                required: true,
                type: 'string',
                choices: [
                    'BUDGET',
                    'PERPETUALS',
                ],
            },
            {
                key: `${keyPrefix}accepted_terms_id`,
                label: `The SFDC id for the terms - [${labelPrefix}accepted_terms_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}billto_company_id`,
                label: `The bill-to company id - [${labelPrefix}billto_company_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}billto_business_address_id`,
                label: `The bill-to business address id - [${labelPrefix}billto_business_address_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}billto_billing_address_id`,
                label: `The bill-to billing address id - [${labelPrefix}billto_billing_address_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}estimated_monthly_spend`,
                label: `If Ongoing (perpetual) order line, the estimated monthly spend - [${labelPrefix}estimated_monthly_spend]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}currency_info`,
                ...Currency.fields(`${keyPrefix}currency_info`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'start_date': bundle.inputData?.[`${keyPrefix}start_date`],
            'end_date': bundle.inputData?.[`${keyPrefix}end_date`],
            'po_number': bundle.inputData?.[`${keyPrefix}po_number`],
            'budget_amount': bundle.inputData?.[`${keyPrefix}budget_amount`],
            'billing_contact_firstname': bundle.inputData?.[`${keyPrefix}billing_contact_firstname`],
            'billing_contact_lastname': bundle.inputData?.[`${keyPrefix}billing_contact_lastname`],
            'billing_contact_email': bundle.inputData?.[`${keyPrefix}billing_contact_email`],
            'media_contact_firstname': bundle.inputData?.[`${keyPrefix}media_contact_firstname`],
            'media_contact_lastname': bundle.inputData?.[`${keyPrefix}media_contact_lastname`],
            'media_contact_email': bundle.inputData?.[`${keyPrefix}media_contact_email`],
            'agency_link': bundle.inputData?.[`${keyPrefix}agency_link`],
            'user_email': bundle.inputData?.[`${keyPrefix}user_email`],
            'accepted_terms_time': bundle.inputData?.[`${keyPrefix}accepted_terms_time`],
            'pmp_id': bundle.inputData?.[`${keyPrefix}pmp_id`],
            'order_name': bundle.inputData?.[`${keyPrefix}order_name`],
            'order_line_type': bundle.inputData?.[`${keyPrefix}order_line_type`],
            'accepted_terms_id': bundle.inputData?.[`${keyPrefix}accepted_terms_id`],
            'billto_company_id': bundle.inputData?.[`${keyPrefix}billto_company_id`],
            'billto_business_address_id': bundle.inputData?.[`${keyPrefix}billto_business_address_id`],
            'billto_billing_address_id': bundle.inputData?.[`${keyPrefix}billto_billing_address_id`],
            'estimated_monthly_spend': bundle.inputData?.[`${keyPrefix}estimated_monthly_spend`],
            'currency_info': bundle.inputData?.[`${keyPrefix}currency_info`],
        }
    },
}
