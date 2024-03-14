const utils = require('../utils/utils');
const AdsAnalyticsFilterColumn = require('../models/AdsAnalyticsFilterColumn');
const AdsAnalyticsFilterOperator = require('../models/AdsAnalyticsFilterOperator');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}field`,
                ...AdsAnalyticsFilterColumn.fields(`${keyPrefix}field`, isInput),
            },
            {
                key: `${keyPrefix}operator`,
                ...AdsAnalyticsFilterOperator.fields(`${keyPrefix}operator`, isInput),
            },
            {
                key: `${keyPrefix}values`,
                label: `List of values for filtering - [${labelPrefix}values]`,
                required: true,
                list: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'field': bundle.inputData?.[`${keyPrefix}field`],
            'operator': bundle.inputData?.[`${keyPrefix}operator`],
            'values': bundle.inputData?.[`${keyPrefix}values`],
        }
    },
}
