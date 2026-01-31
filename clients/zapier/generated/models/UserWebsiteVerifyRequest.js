const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}verification_method`,
                label: `[${labelPrefix}verification_method]`,
                type: 'string',
                choices: [
                    'FILENAME',
                    'METATAG',
                    'DNSTXT',
                ],
            },
            {
                key: `${keyPrefix}website`,
                label: `[${labelPrefix}website]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'verification_method': bundle.inputData?.[`${keyPrefix}verification_method`],
            'website': bundle.inputData?.[`${keyPrefix}website`],
        }
    },
}
