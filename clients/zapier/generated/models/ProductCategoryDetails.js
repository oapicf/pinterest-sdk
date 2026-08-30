const utils = require('../utils/utils');
const ProductCategoriesDemographic = require('../models/ProductCategoriesDemographic');
const ProductCategoriesMetricsHighlights = require('../models/ProductCategoriesMetricsHighlights');
const ProductCategoryEnum = require('../models/ProductCategoryEnum');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ProductCategoriesDemographic.fields(`${keyPrefix}demographics`, isInput),
            {
                key: `${keyPrefix}has_prediction`,
                label: `    Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response. - [${labelPrefix}has_prediction]`,
                required: true,
                type: 'boolean',
            },
            ...ProductCategoriesMetricsHighlights.fields(`${keyPrefix}metrics_highlights`, isInput),
            {
                key: `${keyPrefix}predicted_time_series`,
                label: `    A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07. - [${labelPrefix}predicted_time_series]`,
                type: 'object',
            },
            {
                key: `${keyPrefix}product_category`,
                ...ProductCategoryEnum.fields(`${keyPrefix}product_category`, isInput),
            },
            {
                key: `${keyPrefix}related_searches`,
                label: `Related search terms for this product category - [${labelPrefix}related_searches]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}time_series`,
                label: `Time series data showing trend values over time, indexed between 0 and 100 - [${labelPrefix}time_series]`,
                type: 'object',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'demographics': utils.removeIfEmpty(ProductCategoriesDemographic.mapping(bundle, `${keyPrefix}demographics`)),
            'has_prediction': bundle.inputData?.[`${keyPrefix}has_prediction`],
            'metrics_highlights': utils.removeIfEmpty(ProductCategoriesMetricsHighlights.mapping(bundle, `${keyPrefix}metrics_highlights`)),
            'predicted_time_series': bundle.inputData?.[`${keyPrefix}predicted_time_series`],
            'product_category': bundle.inputData?.[`${keyPrefix}product_category`],
            'related_searches': bundle.inputData?.[`${keyPrefix}related_searches`],
            'time_series': bundle.inputData?.[`${keyPrefix}time_series`],
        }
    },
}
