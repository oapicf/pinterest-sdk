const utils = require('../utils/utils');
const PredictedTimeSeries = require('../models/PredictedTimeSeries');
const TimeSeries = require('../models/TimeSeries');
const TrendingKeyword_demographics = require('../models/TrendingKeyword_demographics');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...TrendingKeyword_demographics.fields(`${keyPrefix}demographics`, isInput),
            {
                key: `${keyPrefix}has_prediction`,
                label: `Indicates whether the keyword has a prediction available for the next 90 days.<br /> This field is only applicable when `include_prediction` query parameter is set to `true`. <br /> By default, the value is `false` and no prediction data is included in the response. - [${labelPrefix}has_prediction]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}keyword`,
                label: `The keyword that is trending. - [${labelPrefix}keyword]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}pct_growth_mom`,
                label: `The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth. - [${labelPrefix}pct_growth_mom]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}pct_growth_wow`,
                label: `The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth. - [${labelPrefix}pct_growth_wow]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}pct_growth_yoy`,
                label: `The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth. - [${labelPrefix}pct_growth_yoy]`,
                type: 'integer',
            },
            ...PredictedTimeSeries.fields(`${keyPrefix}predicted_time_series`, isInput),
            ...TimeSeries.fields(`${keyPrefix}time_series`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'demographics': utils.removeIfEmpty(TrendingKeyword_demographics.mapping(bundle, `${keyPrefix}demographics`)),
            'has_prediction': bundle.inputData?.[`${keyPrefix}has_prediction`],
            'keyword': bundle.inputData?.[`${keyPrefix}keyword`],
            'pct_growth_mom': bundle.inputData?.[`${keyPrefix}pct_growth_mom`],
            'pct_growth_wow': bundle.inputData?.[`${keyPrefix}pct_growth_wow`],
            'pct_growth_yoy': bundle.inputData?.[`${keyPrefix}pct_growth_yoy`],
            'predicted_time_series': utils.removeIfEmpty(PredictedTimeSeries.mapping(bundle, `${keyPrefix}predicted_time_series`)),
            'time_series': utils.removeIfEmpty(TimeSeries.mapping(bundle, `${keyPrefix}time_series`)),
        }
    },
}
