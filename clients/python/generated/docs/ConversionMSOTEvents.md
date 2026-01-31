# ConversionMSOTEvents

Object containing the MSOT conversion events.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_timestamps** | **List[int]** | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. | [optional] 
**ad_group_id** | **str** | The ID of the ad group that was attributed to the conversion event. | 
**attribution_model** | **str** | The attribution model used to attribute the conversion event. | [optional] 
**attribution_scope** | **str** | Ad event type. | 
**attribution_score** | **float** | Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. | [optional] 
**campaign_id** | **str** | The ID of the campaign that was attributed to the conversion event. | [optional] 
**currency** | [**Currency**](Currency.md) |  | [optional] 
**event_id** | **str** | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. | 
**event_name** | **str** | Type of user event. | 
**event_timestamp** | **int** | The time when the event occurred. Unix timestamp in seconds. | 
**total_event_touchpoints** | **int** | Total number of ad events including other non-Pinterest ad platforms. | [optional] 
**total_events** | **int** | Total number of conversion events that are reported in one API call. &lt;p&gt;If you are sending one API request for one attributed conversion event then this value should be 1.&lt;/p&gt; &lt;p&gt;If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.&lt;/p&gt; | [optional] 
**value** | **float** | Order value of the conversion event. Required if &lt;code&gt;event_name&lt;/code&gt; is &#39;add_to_cart&#39; or &#39;checkout&#39;. | [optional] 

## Example

```python
from pinterestsdk.models.conversion_msot_events import ConversionMSOTEvents

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionMSOTEvents from a JSON string
conversion_msot_events_instance = ConversionMSOTEvents.from_json(json)
# print the JSON string representation of the object
print(ConversionMSOTEvents.to_json())

# convert the object into a dict
conversion_msot_events_dict = conversion_msot_events_instance.to_dict()
# create an instance of ConversionMSOTEvents from a dict
conversion_msot_events_from_dict = ConversionMSOTEvents.from_dict(conversion_msot_events_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


