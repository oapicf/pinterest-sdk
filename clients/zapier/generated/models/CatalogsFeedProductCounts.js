const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ingested`,
                label: `The number of products successfully ingested from the feed file. - [${labelPrefix}ingested]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}original`,
                label: `The number of products in the feed file. - [${labelPrefix}original]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ingested': bundle.inputData?.[`${keyPrefix}ingested`],
            'original': bundle.inputData?.[`${keyPrefix}original`],
        }
    },
}
