const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}metrics`,
                label: `Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers). - [${labelPrefix}metrics]`,
                required: true,
                dict: true,
            },
            {
                key: `${keyPrefix}targeting_type`,
                label: `The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER) - [${labelPrefix}targeting_type]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}targeting_value`,
                label: `The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female') - [${labelPrefix}targeting_value]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'metrics': bundle.inputData?.[`${keyPrefix}metrics`],
            'targeting_type': bundle.inputData?.[`${keyPrefix}targeting_type`],
            'targeting_value': bundle.inputData?.[`${keyPrefix}targeting_value`],
        }
    },
}
