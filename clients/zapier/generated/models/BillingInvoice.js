const utils = require('../utils/utils');
const BillingInvoiceDocumentType = require('../models/BillingInvoiceDocumentType');
const BillingInvoiceStatus = require('../models/BillingInvoiceStatus');
const Currency = require('../models/Currency');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_account_id`,
                label: `The ID of the ad account this invoice belongs to - [${labelPrefix}ad_account_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ad_account_name`,
                label: `The name of the ad account this invoice belongs to - [${labelPrefix}ad_account_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}amount_billed_micro_currency`,
                label: `The amount billed in this invoice. Denoted in micro currency - [${labelPrefix}amount_billed_micro_currency]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}amount_discount_micro_currency`,
                label: `The discount in this invoice. Denoted in micro currency - [${labelPrefix}amount_discount_micro_currency]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}amount_net_micro_currency`,
                label: `The net amount in this invoice. Denoted in micro currency - [${labelPrefix}amount_net_micro_currency]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}amount_tax_micro_currency`,
                label: `The tax in this invoice. Denoted in micro currency - [${labelPrefix}amount_tax_micro_currency]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}bill_to_country`,
                label: `The country of the bill to address - [${labelPrefix}bill_to_country]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}billing_period_end_date`,
                label: `The end date of the billing period. Format: YYYY-MM-DD - [${labelPrefix}billing_period_end_date]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}billing_period_start_date`,
                label: `The start date of the billing period. Format: YYYY-MM-DD - [${labelPrefix}billing_period_start_date]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}currency`,
                ...Currency.fields(`${keyPrefix}currency`, isInput),
            },
            {
                key: `${keyPrefix}document_type`,
                ...BillingInvoiceDocumentType.fields(`${keyPrefix}document_type`, isInput),
            },
            {
                key: `${keyPrefix}id`,
                label: `Unique identifier for the billing invoice - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}invoice_due_date`,
                label: `The date the invoice is due. Format: YYYY-MM-DD - [${labelPrefix}invoice_due_date]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}payment_terms`,
                label: `The payment terms of the invoice - [${labelPrefix}payment_terms]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...BillingInvoiceStatus.fields(`${keyPrefix}status`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'ad_account_name': bundle.inputData?.[`${keyPrefix}ad_account_name`],
            'amount_billed_micro_currency': bundle.inputData?.[`${keyPrefix}amount_billed_micro_currency`],
            'amount_discount_micro_currency': bundle.inputData?.[`${keyPrefix}amount_discount_micro_currency`],
            'amount_net_micro_currency': bundle.inputData?.[`${keyPrefix}amount_net_micro_currency`],
            'amount_tax_micro_currency': bundle.inputData?.[`${keyPrefix}amount_tax_micro_currency`],
            'bill_to_country': bundle.inputData?.[`${keyPrefix}bill_to_country`],
            'billing_period_end_date': bundle.inputData?.[`${keyPrefix}billing_period_end_date`],
            'billing_period_start_date': bundle.inputData?.[`${keyPrefix}billing_period_start_date`],
            'currency': bundle.inputData?.[`${keyPrefix}currency`],
            'document_type': bundle.inputData?.[`${keyPrefix}document_type`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'invoice_due_date': bundle.inputData?.[`${keyPrefix}invoice_due_date`],
            'payment_terms': bundle.inputData?.[`${keyPrefix}payment_terms`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
