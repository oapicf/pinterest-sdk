const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}bid_floors`,
                label: `A list of bid floors in micro currency. For example, [100000, 200000] - [${labelPrefix}bid_floors]`,
                list: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}type`,
                label: `Always the string 'bidfloor' - [${labelPrefix}type]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'bid_floors': bundle.inputData?.[`${keyPrefix}bid_floors`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
        }
    },
}
