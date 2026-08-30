const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}retailer_id`,
                label: `Unique identifier for the retailer - [${labelPrefix}retailer_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}retailer_name`,
                label: `Name of the retailer - [${labelPrefix}retailer_name]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'retailer_id': bundle.inputData?.[`${keyPrefix}retailer_id`],
            'retailer_name': bundle.inputData?.[`${keyPrefix}retailer_name`],
        }
    },
}
