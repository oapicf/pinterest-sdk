const utils = require('../utils/utils');
const AnalyticsDailyMetrics = require('../models/AnalyticsDailyMetrics');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}summary_metrics`,
                label: `The metric name and value over the requested period for each requested metric - [${labelPrefix}summary_metrics]`,
                type: 'object',
            },
            {
                key: `${keyPrefix}daily_metrics`,
                label: `[${labelPrefix}daily_metrics]`,
                children: AnalyticsDailyMetrics.fields(`${keyPrefix}daily_metrics${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'summary_metrics': bundle.inputData?.[`${keyPrefix}summary_metrics`],
            'daily_metrics': utils.childMapping(bundle.inputData?.[`${keyPrefix}daily_metrics`], `${keyPrefix}daily_metrics`, AnalyticsDailyMetrics),
        }
    },
}
