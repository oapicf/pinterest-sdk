const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}download_url`,
                label: `The download url for the billing invoice - [${labelPrefix}download_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `The billing invoice id - [${labelPrefix}id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'download_url': bundle.inputData?.[`${keyPrefix}download_url`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
        }
    },
}
