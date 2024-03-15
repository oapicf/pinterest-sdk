const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}pin_order_id`,
                label: `Salesforce order id - [${labelPrefix}pin_order_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                label: `Salesforce insertion order status - [${labelPrefix}status]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}creation_time`,
                label: `Salesforce insertion order creation time - [${labelPrefix}creation_time]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'pin_order_id': bundle.inputData?.[`${keyPrefix}pin_order_id`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'creation_time': bundle.inputData?.[`${keyPrefix}creation_time`],
        }
    },
}
