const utils = require('../utils/utils');
const AnyType = require('../models/AnyType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}AD_ACCOUNT_ID`,
                label: `The ID of the advertiser that this metrics belongs to. - [${labelPrefix}AD_ACCOUNT_ID]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}DATE`,
                label: `Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) - [${labelPrefix}DATE]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'AD_ACCOUNT_ID': bundle.inputData?.[`${keyPrefix}AD_ACCOUNT_ID`],
            'DATE': bundle.inputData?.[`${keyPrefix}DATE`],
        }
    },
}
