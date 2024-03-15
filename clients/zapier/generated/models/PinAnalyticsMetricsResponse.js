const utils = require('../utils/utils');
const PinAnalyticsMetricsResponse_daily_metrics_inner = require('../models/PinAnalyticsMetricsResponse_daily_metrics_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}lifetime_metrics`,
                label: `The lifetime metric name and value. - [${labelPrefix}lifetime_metrics]`,
                type: 'object',
            },
            {
                key: `${keyPrefix}daily_metrics`,
                label: `[${labelPrefix}daily_metrics]`,
                children: PinAnalyticsMetricsResponse_daily_metrics_inner.fields(`${keyPrefix}daily_metrics${!isInput ? '[]' : ''}`, isInput, true), 
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
            'lifetime_metrics': bundle.inputData?.[`${keyPrefix}lifetime_metrics`],
            'daily_metrics': utils.childMapping(bundle.inputData?.[`${keyPrefix}daily_metrics`], `${keyPrefix}daily_metrics`, PinAnalyticsMetricsResponse_daily_metrics_inner),
            'summary_metrics': bundle.inputData?.[`${keyPrefix}summary_metrics`],
        }
    },
}
