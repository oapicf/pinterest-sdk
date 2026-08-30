const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}scrollup_goal_value_in_micro_currency`,
                label: `[${labelPrefix}scrollup_goal_value_in_micro_currency]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'scrollup_goal_value_in_micro_currency': bundle.inputData?.[`${keyPrefix}scrollup_goal_value_in_micro_currency`],
        }
    },
}
