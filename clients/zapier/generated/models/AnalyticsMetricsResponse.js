const utils = require('../utils/utils');
const AnalyticsMetricsResponse_daily_metrics_inner = require('../models/AnalyticsMetricsResponse_daily_metrics_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}daily_metrics`,
                label: `[${labelPrefix}daily_metrics]`,
                children: AnalyticsMetricsResponse_daily_metrics_inner.fields(`${keyPrefix}daily_metrics${!isInput ? '[]' : ''}`, isInput, true), 
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
            'daily_metrics': utils.childMapping(bundle.inputData?.[`${keyPrefix}daily_metrics`], `${keyPrefix}daily_metrics`, AnalyticsMetricsResponse_daily_metrics_inner),
            'summary_metrics': bundle.inputData?.[`${keyPrefix}summary_metrics`],
        }
    },
}
