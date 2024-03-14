const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}IN_STOCK`,
                label: `The number of ingested products that are in stock. - [${labelPrefix}IN_STOCK]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}OUT_OF_STOCK`,
                label: `The number of ingested products that are in out of stock. - [${labelPrefix}OUT_OF_STOCK]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}PREORDER`,
                label: `The number of ingested products that are in preorder. - [${labelPrefix}PREORDER]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'IN_STOCK': bundle.inputData?.[`${keyPrefix}IN_STOCK`],
            'OUT_OF_STOCK': bundle.inputData?.[`${keyPrefix}OUT_OF_STOCK`],
            'PREORDER': bundle.inputData?.[`${keyPrefix}PREORDER`],
        }
    },
}
