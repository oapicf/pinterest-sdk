const utils = require('../utils/utils');
const TrendingKeywordsResponse_trends_inner_time_series = require('../models/TrendingKeywordsResponse_trends_inner_time_series');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}keyword`,
                label: `The keyword that is trending. - [${labelPrefix}keyword]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}pct_growth_wow`,
                label: `The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth. - [${labelPrefix}pct_growth_wow]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}pct_growth_mom`,
                label: `The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth. - [${labelPrefix}pct_growth_mom]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}pct_growth_yoy`,
                label: `The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth. - [${labelPrefix}pct_growth_yoy]`,
                type: 'integer',
            },
            ...TrendingKeywordsResponse_trends_inner_time_series.fields(`${keyPrefix}time_series`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'keyword': bundle.inputData?.[`${keyPrefix}keyword`],
            'pct_growth_wow': bundle.inputData?.[`${keyPrefix}pct_growth_wow`],
            'pct_growth_mom': bundle.inputData?.[`${keyPrefix}pct_growth_mom`],
            'pct_growth_yoy': bundle.inputData?.[`${keyPrefix}pct_growth_yoy`],
            'time_series': utils.removeIfEmpty(TrendingKeywordsResponse_trends_inner_time_series.mapping(bundle, `${keyPrefix}time_series`)),
        }
    },
}
