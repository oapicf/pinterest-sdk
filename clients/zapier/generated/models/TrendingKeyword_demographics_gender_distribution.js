const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}gender_distribution`,
                label: `[${labelPrefix}gender_distribution]`,
                type: 'string',
                choices: [
                    'male',
                    'female',
                    'unspecified',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'gender_distribution': bundle.inputData?.[`${keyPrefix}gender_distribution`],
        }
    },
}
