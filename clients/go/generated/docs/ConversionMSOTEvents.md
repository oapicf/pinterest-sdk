# ConversionMSOTEvents

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActionTimestamps** | Pointer to **[]int64** | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. | [optional] 
**AdGroupId** | **string** | The ID of the ad group that was attributed to the conversion event. | 
**AttributionModel** | Pointer to **string** | The attribution model used to attribute the conversion event. | [optional] 
**AttributionScope** | **string** | Ad event type. | 
**AttributionScore** | Pointer to **float64** | Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. | [optional] 
**CampaignId** | Pointer to **string** | The ID of the campaign that was attributed to the conversion event. | [optional] 
**Currency** | Pointer to [**Currency**](Currency.md) |  | [optional] 
**EventId** | **string** | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. | 
**EventName** | **string** | Type of user event. | 
**EventTimestamp** | **int64** | The time when the event occurred. Unix timestamp in seconds. | 
**TotalEventTouchpoints** | Pointer to **int32** | Total number of ad events including other non-Pinterest ad platforms. | [optional] 
**TotalEvents** | Pointer to **int32** | Total number of conversion events that are reported in one API call. &lt;p&gt;If you are sending one API request for one attributed conversion event then this value should be 1.&lt;/p&gt; &lt;p&gt;If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.&lt;/p&gt; | [optional] 
**Value** | Pointer to **float64** | Order value of the conversion event. Required if &lt;code&gt;event_name&lt;/code&gt; is &#39;add_to_cart&#39; or &#39;checkout&#39;. | [optional] 

## Methods

### NewConversionMSOTEvents

`func NewConversionMSOTEvents(adGroupId string, attributionScope string, eventId string, eventName string, eventTimestamp int64, ) *ConversionMSOTEvents`

NewConversionMSOTEvents instantiates a new ConversionMSOTEvents object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionMSOTEventsWithDefaults

`func NewConversionMSOTEventsWithDefaults() *ConversionMSOTEvents`

NewConversionMSOTEventsWithDefaults instantiates a new ConversionMSOTEvents object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActionTimestamps

`func (o *ConversionMSOTEvents) GetActionTimestamps() []int64`

GetActionTimestamps returns the ActionTimestamps field if non-nil, zero value otherwise.

### GetActionTimestampsOk

`func (o *ConversionMSOTEvents) GetActionTimestampsOk() (*[]int64, bool)`

GetActionTimestampsOk returns a tuple with the ActionTimestamps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActionTimestamps

`func (o *ConversionMSOTEvents) SetActionTimestamps(v []int64)`

SetActionTimestamps sets ActionTimestamps field to given value.

### HasActionTimestamps

`func (o *ConversionMSOTEvents) HasActionTimestamps() bool`

HasActionTimestamps returns a boolean if a field has been set.

### GetAdGroupId

`func (o *ConversionMSOTEvents) GetAdGroupId() string`

GetAdGroupId returns the AdGroupId field if non-nil, zero value otherwise.

### GetAdGroupIdOk

`func (o *ConversionMSOTEvents) GetAdGroupIdOk() (*string, bool)`

GetAdGroupIdOk returns a tuple with the AdGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroupId

`func (o *ConversionMSOTEvents) SetAdGroupId(v string)`

SetAdGroupId sets AdGroupId field to given value.


### GetAttributionModel

`func (o *ConversionMSOTEvents) GetAttributionModel() string`

GetAttributionModel returns the AttributionModel field if non-nil, zero value otherwise.

### GetAttributionModelOk

`func (o *ConversionMSOTEvents) GetAttributionModelOk() (*string, bool)`

GetAttributionModelOk returns a tuple with the AttributionModel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributionModel

`func (o *ConversionMSOTEvents) SetAttributionModel(v string)`

SetAttributionModel sets AttributionModel field to given value.

### HasAttributionModel

`func (o *ConversionMSOTEvents) HasAttributionModel() bool`

HasAttributionModel returns a boolean if a field has been set.

### GetAttributionScope

`func (o *ConversionMSOTEvents) GetAttributionScope() string`

GetAttributionScope returns the AttributionScope field if non-nil, zero value otherwise.

### GetAttributionScopeOk

`func (o *ConversionMSOTEvents) GetAttributionScopeOk() (*string, bool)`

GetAttributionScopeOk returns a tuple with the AttributionScope field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributionScope

`func (o *ConversionMSOTEvents) SetAttributionScope(v string)`

SetAttributionScope sets AttributionScope field to given value.


### GetAttributionScore

`func (o *ConversionMSOTEvents) GetAttributionScore() float64`

GetAttributionScore returns the AttributionScore field if non-nil, zero value otherwise.

### GetAttributionScoreOk

`func (o *ConversionMSOTEvents) GetAttributionScoreOk() (*float64, bool)`

GetAttributionScoreOk returns a tuple with the AttributionScore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributionScore

`func (o *ConversionMSOTEvents) SetAttributionScore(v float64)`

SetAttributionScore sets AttributionScore field to given value.

### HasAttributionScore

`func (o *ConversionMSOTEvents) HasAttributionScore() bool`

HasAttributionScore returns a boolean if a field has been set.

### GetCampaignId

`func (o *ConversionMSOTEvents) GetCampaignId() string`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *ConversionMSOTEvents) GetCampaignIdOk() (*string, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *ConversionMSOTEvents) SetCampaignId(v string)`

SetCampaignId sets CampaignId field to given value.

### HasCampaignId

`func (o *ConversionMSOTEvents) HasCampaignId() bool`

HasCampaignId returns a boolean if a field has been set.

### GetCurrency

`func (o *ConversionMSOTEvents) GetCurrency() Currency`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *ConversionMSOTEvents) GetCurrencyOk() (*Currency, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *ConversionMSOTEvents) SetCurrency(v Currency)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *ConversionMSOTEvents) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetEventId

`func (o *ConversionMSOTEvents) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *ConversionMSOTEvents) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *ConversionMSOTEvents) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetEventName

`func (o *ConversionMSOTEvents) GetEventName() string`

GetEventName returns the EventName field if non-nil, zero value otherwise.

### GetEventNameOk

`func (o *ConversionMSOTEvents) GetEventNameOk() (*string, bool)`

GetEventNameOk returns a tuple with the EventName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventName

`func (o *ConversionMSOTEvents) SetEventName(v string)`

SetEventName sets EventName field to given value.


### GetEventTimestamp

`func (o *ConversionMSOTEvents) GetEventTimestamp() int64`

GetEventTimestamp returns the EventTimestamp field if non-nil, zero value otherwise.

### GetEventTimestampOk

`func (o *ConversionMSOTEvents) GetEventTimestampOk() (*int64, bool)`

GetEventTimestampOk returns a tuple with the EventTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventTimestamp

`func (o *ConversionMSOTEvents) SetEventTimestamp(v int64)`

SetEventTimestamp sets EventTimestamp field to given value.


### GetTotalEventTouchpoints

`func (o *ConversionMSOTEvents) GetTotalEventTouchpoints() int32`

GetTotalEventTouchpoints returns the TotalEventTouchpoints field if non-nil, zero value otherwise.

### GetTotalEventTouchpointsOk

`func (o *ConversionMSOTEvents) GetTotalEventTouchpointsOk() (*int32, bool)`

GetTotalEventTouchpointsOk returns a tuple with the TotalEventTouchpoints field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalEventTouchpoints

`func (o *ConversionMSOTEvents) SetTotalEventTouchpoints(v int32)`

SetTotalEventTouchpoints sets TotalEventTouchpoints field to given value.

### HasTotalEventTouchpoints

`func (o *ConversionMSOTEvents) HasTotalEventTouchpoints() bool`

HasTotalEventTouchpoints returns a boolean if a field has been set.

### GetTotalEvents

`func (o *ConversionMSOTEvents) GetTotalEvents() int32`

GetTotalEvents returns the TotalEvents field if non-nil, zero value otherwise.

### GetTotalEventsOk

`func (o *ConversionMSOTEvents) GetTotalEventsOk() (*int32, bool)`

GetTotalEventsOk returns a tuple with the TotalEvents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalEvents

`func (o *ConversionMSOTEvents) SetTotalEvents(v int32)`

SetTotalEvents sets TotalEvents field to given value.

### HasTotalEvents

`func (o *ConversionMSOTEvents) HasTotalEvents() bool`

HasTotalEvents returns a boolean if a field has been set.

### GetValue

`func (o *ConversionMSOTEvents) GetValue() float64`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *ConversionMSOTEvents) GetValueOk() (*float64, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *ConversionMSOTEvents) SetValue(v float64)`

SetValue sets Value field to given value.

### HasValue

`func (o *ConversionMSOTEvents) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


