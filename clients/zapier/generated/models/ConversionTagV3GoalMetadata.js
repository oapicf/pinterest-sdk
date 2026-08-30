const utils = require('../utils/utils');
const AttributionWindows = require('../models/AttributionWindows');
const ConversionEvent = require('../models/ConversionEvent');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AttributionWindows.fields(`${keyPrefix}attribution_windows`, isInput),
            {
                key: `${keyPrefix}conversion_event`,
                ...ConversionEvent.fields(`${keyPrefix}conversion_event`, isInput),
            },
            {
                key: `${keyPrefix}conversion_tag_id`,
                label: `[${labelPrefix}conversion_tag_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}cpa_goal_value_in_micro_currency`,
                label: `[${labelPrefix}cpa_goal_value_in_micro_currency]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_roas_optimized`,
                label: `Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/). - [${labelPrefix}is_roas_optimized]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}reporting_event`,
                label: `Event name for custom or standard events mapped to an oCPM model - [${labelPrefix}reporting_event]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'attribution_windows': utils.removeIfEmpty(AttributionWindows.mapping(bundle, `${keyPrefix}attribution_windows`)),
            'conversion_event': bundle.inputData?.[`${keyPrefix}conversion_event`],
            'conversion_tag_id': bundle.inputData?.[`${keyPrefix}conversion_tag_id`],
            'cpa_goal_value_in_micro_currency': bundle.inputData?.[`${keyPrefix}cpa_goal_value_in_micro_currency`],
            'is_roas_optimized': bundle.inputData?.[`${keyPrefix}is_roas_optimized`],
            'reporting_event': bundle.inputData?.[`${keyPrefix}reporting_event`],
        }
    },
}
