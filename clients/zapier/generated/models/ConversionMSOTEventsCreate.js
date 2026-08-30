const utils = require('../utils/utils');
const AttributionModel = require('../models/AttributionModel');
const AttributionScope = require('../models/AttributionScope');
const Currency = require('../models/Currency');
const MsotEventName = require('../models/MsotEventName');

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
                ...AttributionModel.fields(`${keyPrefix}attribution_model`, isInput),
            },
            {
                key: `${keyPrefix}attribution_scope`,
                ...AttributionScope.fields(`${keyPrefix}attribution_scope`, isInput),
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
            {
                key: `${keyPrefix}click_window`,
                label: `Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`). - [${labelPrefix}click_window]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}currency`,
                ...Currency.fields(`${keyPrefix}currency`, isInput),
            },
            {
                key: `${keyPrefix}event_id`,
                label: `A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. - [${labelPrefix}event_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}event_name`,
                ...MsotEventName.fields(`${keyPrefix}event_name`, isInput),
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
                label: `Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request. - [${labelPrefix}total_events]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}total_events_fractional`,
                label: `Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit). - [${labelPrefix}total_events_fractional]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}value`,
                label: `Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`. - [${labelPrefix}value]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}view_window`,
                label: `View window used for attribution (for example, `1d`, `7d`, `30d`). - [${labelPrefix}view_window]`,
                type: 'string',
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
            'click_window': bundle.inputData?.[`${keyPrefix}click_window`],
            'currency': bundle.inputData?.[`${keyPrefix}currency`],
            'event_id': bundle.inputData?.[`${keyPrefix}event_id`],
            'event_name': bundle.inputData?.[`${keyPrefix}event_name`],
            'event_timestamp': bundle.inputData?.[`${keyPrefix}event_timestamp`],
            'total_event_touchpoints': bundle.inputData?.[`${keyPrefix}total_event_touchpoints`],
            'total_events': bundle.inputData?.[`${keyPrefix}total_events`],
            'total_events_fractional': bundle.inputData?.[`${keyPrefix}total_events_fractional`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
            'view_window': bundle.inputData?.[`${keyPrefix}view_window`],
        }
    },
}
