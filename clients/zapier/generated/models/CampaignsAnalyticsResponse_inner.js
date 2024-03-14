const utils = require('../utils/utils');
const AnyType = require('../models/AnyType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}CAMPAIGN_ID`,
                label: `The ID of the campaing that this metrics belongs to. - [${labelPrefix}CAMPAIGN_ID]`,
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
            'CAMPAIGN_ID': bundle.inputData?.[`${keyPrefix}CAMPAIGN_ID`],
            'DATE': bundle.inputData?.[`${keyPrefix}DATE`],
        }
    },
}
