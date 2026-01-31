# ConversionMsotEvents

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_timestamps** | Option<**Vec<i64>**> | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. | [optional]
**ad_group_id** | **String** | The ID of the ad group that was attributed to the conversion event. | 
**attribution_model** | Option<**String**> | The attribution model used to attribute the conversion event. | [optional]
**attribution_scope** | **String** | Ad event type. | 
**attribution_score** | Option<**f64**> | Credit given to the attributed ad actions. Allowed values are > 0 and <= 1. | [optional]
**campaign_id** | Option<**String**> | The ID of the campaign that was attributed to the conversion event. | [optional]
**currency** | Option<[**models::Currency**](Currency.md)> |  | [optional]
**event_id** | **String** | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. | 
**event_name** | **String** | Type of user event. | 
**event_timestamp** | **i64** | The time when the event occurred. Unix timestamp in seconds. | 
**total_event_touchpoints** | Option<**i32**> | Total number of ad events including other non-Pinterest ad platforms. | [optional]
**total_events** | Option<**i32**> | Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p> | [optional]
**value** | Option<**f64**> | Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


