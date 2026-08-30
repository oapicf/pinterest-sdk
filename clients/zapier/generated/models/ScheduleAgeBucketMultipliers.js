const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}AGE_BUCKET`,
                label: `[${labelPrefix}AGE_BUCKET]`,
                type: 'string',
                choices: [
                    '18-24',
                    '25-34',
                    '35-44',
                    '45-49',
                    '50-54',
                    '55-64',
                    '65+',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'AGE_BUCKET': bundle.inputData?.[`${keyPrefix}AGE_BUCKET`],
        }
    },
}
