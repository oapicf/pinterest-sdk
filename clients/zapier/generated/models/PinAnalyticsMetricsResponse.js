const utils = require('../utils/utils');
const PinAnalyticsDailyMetrics = require('../models/PinAnalyticsDailyMetrics');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}daily_metrics`,
                label: `[${labelPrefix}daily_metrics]`,
                children: PinAnalyticsDailyMetrics.fields(`${keyPrefix}daily_metrics${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}lifetime_metrics`,
                label: `The lifetime metric name and value. - [${labelPrefix}lifetime_metrics]`,
                type: 'object',
            },
            {
                key: `${keyPrefix}summary_metrics`,
                label: `The metric name and value over the requested period for each requested metric - [${labelPrefix}summary_metrics]`,
                type: 'object',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'daily_metrics': utils.childMapping(bundle.inputData?.[`${keyPrefix}daily_metrics`], `${keyPrefix}daily_metrics`, PinAnalyticsDailyMetrics),
            'lifetime_metrics': bundle.inputData?.[`${keyPrefix}lifetime_metrics`],
            'summary_metrics': bundle.inputData?.[`${keyPrefix}summary_metrics`],
        }
    },
}
