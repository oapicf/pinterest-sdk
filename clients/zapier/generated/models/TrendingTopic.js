const utils = require('../utils/utils');
const TrendingPin = require('../models/TrendingPin');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}description`,
                label: `Description of the trending topic - [${labelPrefix}description]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `Unique identifier for the trending topic - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}percent_growth_mom`,
                label: `Month-over-month growth percentage - [${labelPrefix}percent_growth_mom]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}pins`,
                label: `[${labelPrefix}pins]`,
                children: TrendingPin.fields(`${keyPrefix}pins${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}related_interests`,
                label: `List of related interest categories - [${labelPrefix}related_interests]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}related_searches`,
                label: `List of related search terms - [${labelPrefix}related_searches]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}time_series`,
                label: `Time series data showing trend values over time, with dates as keys and values as numeric - [${labelPrefix}time_series]`,
                required: true,
                type: 'object',
            },
            {
                key: `${keyPrefix}title`,
                label: `Title of the trending topic - [${labelPrefix}title]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'percent_growth_mom': bundle.inputData?.[`${keyPrefix}percent_growth_mom`],
            'pins': utils.childMapping(bundle.inputData?.[`${keyPrefix}pins`], `${keyPrefix}pins`, TrendingPin),
            'related_interests': bundle.inputData?.[`${keyPrefix}related_interests`],
            'related_searches': bundle.inputData?.[`${keyPrefix}related_searches`],
            'time_series': bundle.inputData?.[`${keyPrefix}time_series`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
        }
    },
}
