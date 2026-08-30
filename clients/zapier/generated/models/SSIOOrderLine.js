const utils = require('../utils/utils');
const Currency = require('../models/Currency');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}accepted_terms_id`,
                label: `The SFDC id for the terms - [${labelPrefix}accepted_terms_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}accepted_terms_time`,
                label: `The UTC timestamp (to the nearest second) when terms were accepted. - [${labelPrefix}accepted_terms_time]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ads_manager_order_line_id`,
                label: `Ads manager order line id - [${labelPrefix}ads_manager_order_line_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}agency_link`,
                label: `Agency link - [${labelPrefix}agency_link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}bill_to_company_name`,
                label: `Bill-to company name - [${labelPrefix}bill_to_company_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}billing_contact_email`,
                label: `Billing contact email - [${labelPrefix}billing_contact_email]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}billing_contact_firstname`,
                label: `Billing contact first name - [${labelPrefix}billing_contact_firstname]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}billing_contact_lastname`,
                label: `Billing contact last name - [${labelPrefix}billing_contact_lastname]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}budget_amount`,
                label: `If budget order line, the budget amount. - [${labelPrefix}budget_amount]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}currency_info`,
                ...Currency.fields(`${keyPrefix}currency_info`, isInput),
            },
            {
                key: `${keyPrefix}end_date`,
                label: `End date of the order line. - [${labelPrefix}end_date]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}estimated_monthly_spend`,
                label: `If ongoing (perpetual) order line, the estimated monthly spend. - [${labelPrefix}estimated_monthly_spend]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}last_modified_date_time`,
                label: `Last modified date. - [${labelPrefix}last_modified_date_time]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}media_contact_email`,
                label: `Billing media email - [${labelPrefix}media_contact_email]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}media_contact_firstname`,
                label: `Billing media contact first name - [${labelPrefix}media_contact_firstname]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}media_contact_lastname`,
                label: `Billing media contact last name - [${labelPrefix}media_contact_lastname]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}order_name`,
                label: `The order name - [${labelPrefix}order_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}pin_order_id`,
                label: `The pin order id associated with the order line in SFDC - [${labelPrefix}pin_order_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}pmp_name`,
                label: `The Pinterest marketing partner name - [${labelPrefix}pmp_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}po_number`,
                label: `The PO number - [${labelPrefix}po_number]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}salesforce_order_line_id`,
                label: `Order line id in SFDC - [${labelPrefix}salesforce_order_line_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}start_date`,
                label: `Start date of the order line. - [${labelPrefix}start_date]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'accepted_terms_id': bundle.inputData?.[`${keyPrefix}accepted_terms_id`],
            'accepted_terms_time': bundle.inputData?.[`${keyPrefix}accepted_terms_time`],
            'ads_manager_order_line_id': bundle.inputData?.[`${keyPrefix}ads_manager_order_line_id`],
            'agency_link': bundle.inputData?.[`${keyPrefix}agency_link`],
            'bill_to_company_name': bundle.inputData?.[`${keyPrefix}bill_to_company_name`],
            'billing_contact_email': bundle.inputData?.[`${keyPrefix}billing_contact_email`],
            'billing_contact_firstname': bundle.inputData?.[`${keyPrefix}billing_contact_firstname`],
            'billing_contact_lastname': bundle.inputData?.[`${keyPrefix}billing_contact_lastname`],
            'budget_amount': bundle.inputData?.[`${keyPrefix}budget_amount`],
            'currency_info': bundle.inputData?.[`${keyPrefix}currency_info`],
            'end_date': bundle.inputData?.[`${keyPrefix}end_date`],
            'estimated_monthly_spend': bundle.inputData?.[`${keyPrefix}estimated_monthly_spend`],
            'last_modified_date_time': bundle.inputData?.[`${keyPrefix}last_modified_date_time`],
            'media_contact_email': bundle.inputData?.[`${keyPrefix}media_contact_email`],
            'media_contact_firstname': bundle.inputData?.[`${keyPrefix}media_contact_firstname`],
            'media_contact_lastname': bundle.inputData?.[`${keyPrefix}media_contact_lastname`],
            'order_name': bundle.inputData?.[`${keyPrefix}order_name`],
            'pin_order_id': bundle.inputData?.[`${keyPrefix}pin_order_id`],
            'pmp_name': bundle.inputData?.[`${keyPrefix}pmp_name`],
            'po_number': bundle.inputData?.[`${keyPrefix}po_number`],
            'salesforce_order_line_id': bundle.inputData?.[`${keyPrefix}salesforce_order_line_id`],
            'start_date': bundle.inputData?.[`${keyPrefix}start_date`],
        }
    },
}
