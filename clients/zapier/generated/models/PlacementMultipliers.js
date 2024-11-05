const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}PLACEMENT`,
                label: `[${labelPrefix}PLACEMENT]`,
                type: 'string',
                choices: [
                    'SEARCH',
                    'BROWSE',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'PLACEMENT': bundle.inputData?.[`${keyPrefix}PLACEMENT`],
        }
    },
}
