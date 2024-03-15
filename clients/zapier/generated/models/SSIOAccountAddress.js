const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}display`,
                label: `Address display - [${labelPrefix}display]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}purpose`,
                label: `Purpose for which the address is used, usually Billing or Businness - [${labelPrefix}purpose]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}address_id`,
                label: `Salesforce id for address - [${labelPrefix}address_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}order_legal_entity`,
                label: `Legal entity for this insertion order - [${labelPrefix}order_legal_entity]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'display': bundle.inputData?.[`${keyPrefix}display`],
            'purpose': bundle.inputData?.[`${keyPrefix}purpose`],
            'address_id': bundle.inputData?.[`${keyPrefix}address_id`],
            'order_legal_entity': bundle.inputData?.[`${keyPrefix}order_legal_entity`],
        }
    },
}
