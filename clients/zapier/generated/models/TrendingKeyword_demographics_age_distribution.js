const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}age_distribution`,
                label: `[${labelPrefix}age_distribution]`,
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
            'age_distribution': bundle.inputData?.[`${keyPrefix}age_distribution`],
        }
    },
}
