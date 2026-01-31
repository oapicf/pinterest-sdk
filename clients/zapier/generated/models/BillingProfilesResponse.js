const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}advertiser_id`,
                label: `Advertiser ID of the billing. - [${labelPrefix}advertiser_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}billing_type`,
                label: `Billing type of the advertiser - [${labelPrefix}billing_type]`,
                type: 'string',
                choices: [
                    'CREDIT_CARD',
                    'INVOICE',
                    'INTERNAL',
                    'RECURRING',
                    'PREPAID',
                ],
            },
            {
                key: `${keyPrefix}card_type`,
                label: `Type of the card. - [${labelPrefix}card_type]`,
                type: 'string',
                choices: [
                    'UNKNOWN',
                    'VISA',
                    'MASTERCARD',
                    'AMERICAN_EXPRESS',
                    'DISCOVER',
                    'ELO',
                ],
            },
            {
                key: `${keyPrefix}id`,
                label: `Billing ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}payment_method_brand`,
                label: `Brand of the payment method. - [${labelPrefix}payment_method_brand]`,
                type: 'string',
                choices: [
                    'UNKNOWN',
                    'VISA',
                    'MASTERCARD',
                    'AMERICAN_EXPRESS',
                    'DISCOVER',
                    'SOFORT',
                    'DINERS_CLUB',
                    'ELO',
                    'CARTE_BANCAIRE',
                ],
            },
            {
                key: `${keyPrefix}status`,
                label: `Status of the billing. - [${labelPrefix}status]`,
                type: 'string',
                choices: [
                    'UNSPECIFIED',
                    'VALID',
                    'INVALID',
                    'PENDING',
                    'DELETED',
                    'SECONDARY',
                    'PENDING_SECONDARY',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'advertiser_id': bundle.inputData?.[`${keyPrefix}advertiser_id`],
            'billing_type': bundle.inputData?.[`${keyPrefix}billing_type`],
            'card_type': bundle.inputData?.[`${keyPrefix}card_type`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'payment_method_brand': bundle.inputData?.[`${keyPrefix}payment_method_brand`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
