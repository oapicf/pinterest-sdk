const utils = require('../utils/utils');
const Currency = require('../models/Currency');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}action_timestamps`,
                label: `Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. - [${labelPrefix}action_timestamps]`,
                list: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}ad_group_id`,
                label: `The ID of the ad group that was attributed to the conversion event. - [${labelPrefix}ad_group_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}attribution_model`,
                label: `The attribution model used to attribute the conversion event. - [${labelPrefix}attribution_model]`,
                type: 'string',
                choices: [
                    'first_touch',
                    'last_touch',
                    'multi_touch',
                ],
            },
            {
                key: `${keyPrefix}attribution_scope`,
                label: `Ad event type. - [${labelPrefix}attribution_scope]`,
                required: true,
                type: 'string',
                choices: [
                    'view',
                    'engagement',
                    'click',
                ],
            },
            {
                key: `${keyPrefix}attribution_score`,
                label: `Credit given to the attributed ad actions. Allowed values are > 0 and <= 1. - [${labelPrefix}attribution_score]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}campaign_id`,
                label: `The ID of the campaign that was attributed to the conversion event. - [${labelPrefix}campaign_id]`,
                type: 'string',
            },
            ...Currency.fields(`${keyPrefix}currency`, isInput),
            {
                key: `${keyPrefix}event_id`,
                label: `A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. - [${labelPrefix}event_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}event_name`,
                label: `Type of user event. - [${labelPrefix}event_name]`,
                required: true,
                type: 'string',
                choices: [
                    'add_to_cart',
                    'checkout',
                    'lead',
                    'signup',
                ],
            },
            {
                key: `${keyPrefix}event_timestamp`,
                label: `The time when the event occurred. Unix timestamp in seconds. - [${labelPrefix}event_timestamp]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}total_event_touchpoints`,
                label: `Total number of ad events including other non-Pinterest ad platforms. - [${labelPrefix}total_event_touchpoints]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}total_events`,
                label: `Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p> - [${labelPrefix}total_events]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}value`,
                label: `Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'. - [${labelPrefix}value]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'action_timestamps': bundle.inputData?.[`${keyPrefix}action_timestamps`],
            'ad_group_id': bundle.inputData?.[`${keyPrefix}ad_group_id`],
            'attribution_model': bundle.inputData?.[`${keyPrefix}attribution_model`],
            'attribution_scope': bundle.inputData?.[`${keyPrefix}attribution_scope`],
            'attribution_score': bundle.inputData?.[`${keyPrefix}attribution_score`],
            'campaign_id': bundle.inputData?.[`${keyPrefix}campaign_id`],
            'currency': utils.removeIfEmpty(Currency.mapping(bundle, `${keyPrefix}currency`)),
            'event_id': bundle.inputData?.[`${keyPrefix}event_id`],
            'event_name': bundle.inputData?.[`${keyPrefix}event_name`],
            'event_timestamp': bundle.inputData?.[`${keyPrefix}event_timestamp`],
            'total_event_touchpoints': bundle.inputData?.[`${keyPrefix}total_event_touchpoints`],
            'total_events': bundle.inputData?.[`${keyPrefix}total_events`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
        }
    },
}
