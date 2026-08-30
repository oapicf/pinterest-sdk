# ConversionMsotEventsCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_timestamps** | Option<**Vec<i64>**> | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. | [optional]
**ad_group_id** | **String** | The ID of the ad group that was attributed to the conversion event. | 
**attribution_model** | Option<[**models::AttributionModel**](AttributionModel.md)> | The attribution model used to attribute the conversion event. | [optional]
**attribution_scope** | Option<[**models::AttributionScope**](AttributionScope.md)> | Ad event type. | [optional]
**attribution_score** | Option<**f64**> | Credit given to the attributed ad actions. Allowed values are > 0 and <= 1. | [optional]
**campaign_id** | Option<**String**> | The ID of the campaign that was attributed to the conversion event. | [optional]
**click_window** | Option<**String**> | Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`). | [optional]
**currency** | Option<[**models::Currency**](Currency.md)> | Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard. | [optional]
**event_id** | **String** | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. | 
**event_name** | [**models::MsotEventName**](MsotEventName.md) | Type of user event. | 
**event_timestamp** | **i64** | The time when the event occurred. Unix timestamp in seconds. | 
**total_event_touchpoints** | Option<**i32**> | Total number of ad events including other non-Pinterest ad platforms. | [optional]
**total_events** | Option<**i32**> | Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request. | [optional]
**total_events_fractional** | Option<**f64**> | Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit). | [optional]
**value** | Option<**f64**> | Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`. | [optional]
**view_window** | Option<**String**> | View window used for attribution (for example, `1d`, `7d`, `30d`). | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


