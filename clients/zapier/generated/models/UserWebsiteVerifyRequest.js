const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}website`,
                label: `[${labelPrefix}website]`,
                type: 'string',
            },
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
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'website': bundle.inputData?.[`${keyPrefix}website`],
            'verification_method': bundle.inputData?.[`${keyPrefix}verification_method`],
        }
    },
}
