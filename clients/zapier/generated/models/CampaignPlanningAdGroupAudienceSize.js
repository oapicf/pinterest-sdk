const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}count_lower`,
                label: `Lower bound of the audience size estimate. - [${labelPrefix}count_lower]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}count_upper`,
                label: `Upper bound of the audience size estimate. - [${labelPrefix}count_upper]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'count_lower': bundle.inputData?.[`${keyPrefix}count_lower`],
            'count_upper': bundle.inputData?.[`${keyPrefix}count_upper`],
        }
    },
}
