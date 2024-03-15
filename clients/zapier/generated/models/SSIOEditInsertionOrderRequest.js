const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}start_date`,
                label: `Starting date of time period. Format: YYYY-MM-DD - [${labelPrefix}start_date]`,
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
                type: 'string',
            },
            {
                key: `${keyPrefix}billing_contact_lastname`,
                label: `The billing contact last name - [${labelPrefix}billing_contact_lastname]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}billing_contact_email`,
                label: `The billing contact email - [${labelPrefix}billing_contact_email]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}media_contact_firstname`,
                label: `The media contact first name - [${labelPrefix}media_contact_firstname]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}media_contact_lastname`,
                label: `The media contact last name - [${labelPrefix}media_contact_lastname]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}media_contact_email`,
                label: `The media contact email - [${labelPrefix}media_contact_email]`,
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
                key: `${keyPrefix}oracle_line_id`,
                label: `LineId in the Oracle DB - [${labelPrefix}oracle_line_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}salesforce_order_id`,
                label: `OrderId in SFDC - [${labelPrefix}salesforce_order_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}salesforce_order_line_id`,
                label: `OrderLineId in SFDC - [${labelPrefix}salesforce_order_line_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ads_manager_order_line_id`,
                label: `Ads manager OrderLineId - [${labelPrefix}ads_manager_order_line_id]`,
                type: 'string',
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
            'oracle_line_id': bundle.inputData?.[`${keyPrefix}oracle_line_id`],
            'salesforce_order_id': bundle.inputData?.[`${keyPrefix}salesforce_order_id`],
            'salesforce_order_line_id': bundle.inputData?.[`${keyPrefix}salesforce_order_line_id`],
            'ads_manager_order_line_id': bundle.inputData?.[`${keyPrefix}ads_manager_order_line_id`],
        }
    },
}
