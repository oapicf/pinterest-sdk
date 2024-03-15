const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}frequency`,
                label: `[${labelPrefix}frequency]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}timerange`,
                label: `User entity counts time range - [${labelPrefix}timerange]`,
                type: 'string',
                choices: [
                    'THIRTY_DAY',
                    'DAY',
                    'SEVEN_DAY',
                    'TWENTY_MINUTE',
                    'TEN_MINUTE',
                    'TWENTY_FOUR_HOUR',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'frequency': bundle.inputData?.[`${keyPrefix}frequency`],
            'timerange': bundle.inputData?.[`${keyPrefix}timerange`],
        }
    },
}
