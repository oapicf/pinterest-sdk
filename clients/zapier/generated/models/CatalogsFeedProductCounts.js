const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}original`,
                label: `The number of products in the feed file. - [${labelPrefix}original]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}ingested`,
                label: `The number of products successfully ingested from the feed file. - [${labelPrefix}ingested]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'original': bundle.inputData?.[`${keyPrefix}original`],
            'ingested': bundle.inputData?.[`${keyPrefix}ingested`],
        }
    },
}
