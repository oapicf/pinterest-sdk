# ConversionMSOTEventsCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_timestamps** | **List[int]** | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. | [optional] 
**ad_group_id** | **str** | The ID of the ad group that was attributed to the conversion event. | 
**attribution_model** | [**AttributionModel**](AttributionModel.md) | The attribution model used to attribute the conversion event. | [optional] 
**attribution_scope** | [**AttributionScope**](AttributionScope.md) | Ad event type. | [optional] 
**attribution_score** | **float** | Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. | [optional] 
**campaign_id** | **str** | The ID of the campaign that was attributed to the conversion event. | [optional] 
**click_window** | **str** | Click window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;, &#x60;lifetime&#x60;). | [optional] 
**currency** | [**Currency**](Currency.md) | Currency code for the &#x60;value&#x60; field, required if &#x60;value&#x60; is present. Currency Codes should be in ISO 4217 standard. | [optional] 
**event_id** | **str** | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. | 
**event_name** | [**MsotEventName**](MsotEventName.md) | Type of user event. | 
**event_timestamp** | **int** | The time when the event occurred. Unix timestamp in seconds. | 
**total_event_touchpoints** | **int** | Total number of ad events including other non-Pinterest ad platforms. | [optional] 
**total_events** | **int** | Deprecated: use &#x60;total_events_fractional&#x60; instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request. | [optional] 
**total_events_fractional** | **float** | Total number of conversion events that are reported in one API call. Use this field instead of &#x60;total_events&#x60; to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit). | [optional] 
**value** | **float** | Order value of the conversion event. Required if &#x60;event_name&#x60; is &#x60;add_to_cart&#x60; or &#x60;checkout&#x60;. | [optional] 
**view_window** | **str** | View window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;). | [optional] 

## Example

```python
from openapi_client.models.conversion_msot_events_create import ConversionMSOTEventsCreate

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionMSOTEventsCreate from a JSON string
conversion_msot_events_create_instance = ConversionMSOTEventsCreate.from_json(json)
# print the JSON string representation of the object
print ConversionMSOTEventsCreate.to_json()

# convert the object into a dict
conversion_msot_events_create_dict = conversion_msot_events_create_instance.to_dict()
# create an instance of ConversionMSOTEventsCreate from a dict
conversion_msot_events_create_from_dict = ConversionMSOTEventsCreate.from_dict(conversion_msot_events_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


