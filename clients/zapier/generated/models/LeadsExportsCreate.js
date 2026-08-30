const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_id`,
                label: `ID for the ad collecting leads. - [${labelPrefix}ad_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}end_date`,
                label: `Export leads collected on and before end date (UTC). Format: YYYY-MM-DD. - [${labelPrefix}end_date]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}start_date`,
                label: `Export leads collected on and after start date (UTC). Format: YYYY-MM-DD. - [${labelPrefix}start_date]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_id': bundle.inputData?.[`${keyPrefix}ad_id`],
            'end_date': bundle.inputData?.[`${keyPrefix}end_date`],
            'start_date': bundle.inputData?.[`${keyPrefix}start_date`],
        }
    },
}
