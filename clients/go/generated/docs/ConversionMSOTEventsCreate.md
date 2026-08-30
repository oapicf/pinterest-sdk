# ConversionMSOTEventsCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActionTimestamps** | Pointer to **[]int64** | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. | [optional] 
**AdGroupId** | **string** | The ID of the ad group that was attributed to the conversion event. | 
**AttributionModel** | Pointer to [**AttributionModel**](AttributionModel.md) | The attribution model used to attribute the conversion event. | [optional] 
**AttributionScope** | Pointer to [**AttributionScope**](AttributionScope.md) | Ad event type. | [optional] 
**AttributionScore** | Pointer to **float64** | Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. | [optional] 
**CampaignId** | Pointer to **string** | The ID of the campaign that was attributed to the conversion event. | [optional] 
**ClickWindow** | Pointer to **string** | Click window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;, &#x60;lifetime&#x60;). | [optional] 
**Currency** | Pointer to [**Currency**](Currency.md) | Currency code for the &#x60;value&#x60; field, required if &#x60;value&#x60; is present. Currency Codes should be in ISO 4217 standard. | [optional] 
**EventId** | **string** | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. | 
**EventName** | [**MsotEventName**](MsotEventName.md) | Type of user event. | 
**EventTimestamp** | **int64** | The time when the event occurred. Unix timestamp in seconds. | 
**TotalEventTouchpoints** | Pointer to **int32** | Total number of ad events including other non-Pinterest ad platforms. | [optional] 
**TotalEvents** | Pointer to **int32** | Deprecated: use &#x60;total_events_fractional&#x60; instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request. | [optional] 
**TotalEventsFractional** | Pointer to **float64** | Total number of conversion events that are reported in one API call. Use this field instead of &#x60;total_events&#x60; to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit). | [optional] 
**Value** | Pointer to **float64** | Order value of the conversion event. Required if &#x60;event_name&#x60; is &#x60;add_to_cart&#x60; or &#x60;checkout&#x60;. | [optional] 
**ViewWindow** | Pointer to **string** | View window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;). | [optional] 

## Methods

### NewConversionMSOTEventsCreate

`func NewConversionMSOTEventsCreate(adGroupId string, eventId string, eventName MsotEventName, eventTimestamp int64, ) *ConversionMSOTEventsCreate`

NewConversionMSOTEventsCreate instantiates a new ConversionMSOTEventsCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionMSOTEventsCreateWithDefaults

`func NewConversionMSOTEventsCreateWithDefaults() *ConversionMSOTEventsCreate`

NewConversionMSOTEventsCreateWithDefaults instantiates a new ConversionMSOTEventsCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActionTimestamps

`func (o *ConversionMSOTEventsCreate) GetActionTimestamps() []int64`

GetActionTimestamps returns the ActionTimestamps field if non-nil, zero value otherwise.

### GetActionTimestampsOk

`func (o *ConversionMSOTEventsCreate) GetActionTimestampsOk() (*[]int64, bool)`

GetActionTimestampsOk returns a tuple with the ActionTimestamps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActionTimestamps

`func (o *ConversionMSOTEventsCreate) SetActionTimestamps(v []int64)`

SetActionTimestamps sets ActionTimestamps field to given value.

### HasActionTimestamps

`func (o *ConversionMSOTEventsCreate) HasActionTimestamps() bool`

HasActionTimestamps returns a boolean if a field has been set.

### GetAdGroupId

`func (o *ConversionMSOTEventsCreate) GetAdGroupId() string`

GetAdGroupId returns the AdGroupId field if non-nil, zero value otherwise.

### GetAdGroupIdOk

`func (o *ConversionMSOTEventsCreate) GetAdGroupIdOk() (*string, bool)`

GetAdGroupIdOk returns a tuple with the AdGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroupId

`func (o *ConversionMSOTEventsCreate) SetAdGroupId(v string)`

SetAdGroupId sets AdGroupId field to given value.


### GetAttributionModel

`func (o *ConversionMSOTEventsCreate) GetAttributionModel() AttributionModel`

GetAttributionModel returns the AttributionModel field if non-nil, zero value otherwise.

### GetAttributionModelOk

`func (o *ConversionMSOTEventsCreate) GetAttributionModelOk() (*AttributionModel, bool)`

GetAttributionModelOk returns a tuple with the AttributionModel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributionModel

`func (o *ConversionMSOTEventsCreate) SetAttributionModel(v AttributionModel)`

SetAttributionModel sets AttributionModel field to given value.

### HasAttributionModel

`func (o *ConversionMSOTEventsCreate) HasAttributionModel() bool`

HasAttributionModel returns a boolean if a field has been set.

### GetAttributionScope

`func (o *ConversionMSOTEventsCreate) GetAttributionScope() AttributionScope`

GetAttributionScope returns the AttributionScope field if non-nil, zero value otherwise.

### GetAttributionScopeOk

`func (o *ConversionMSOTEventsCreate) GetAttributionScopeOk() (*AttributionScope, bool)`

GetAttributionScopeOk returns a tuple with the AttributionScope field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributionScope

`func (o *ConversionMSOTEventsCreate) SetAttributionScope(v AttributionScope)`

SetAttributionScope sets AttributionScope field to given value.

### HasAttributionScope

`func (o *ConversionMSOTEventsCreate) HasAttributionScope() bool`

HasAttributionScope returns a boolean if a field has been set.

### GetAttributionScore

`func (o *ConversionMSOTEventsCreate) GetAttributionScore() float64`

GetAttributionScore returns the AttributionScore field if non-nil, zero value otherwise.

### GetAttributionScoreOk

`func (o *ConversionMSOTEventsCreate) GetAttributionScoreOk() (*float64, bool)`

GetAttributionScoreOk returns a tuple with the AttributionScore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributionScore

`func (o *ConversionMSOTEventsCreate) SetAttributionScore(v float64)`

SetAttributionScore sets AttributionScore field to given value.

### HasAttributionScore

`func (o *ConversionMSOTEventsCreate) HasAttributionScore() bool`

HasAttributionScore returns a boolean if a field has been set.

### GetCampaignId

`func (o *ConversionMSOTEventsCreate) GetCampaignId() string`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *ConversionMSOTEventsCreate) GetCampaignIdOk() (*string, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *ConversionMSOTEventsCreate) SetCampaignId(v string)`

SetCampaignId sets CampaignId field to given value.

### HasCampaignId

`func (o *ConversionMSOTEventsCreate) HasCampaignId() bool`

HasCampaignId returns a boolean if a field has been set.

### GetClickWindow

`func (o *ConversionMSOTEventsCreate) GetClickWindow() string`

GetClickWindow returns the ClickWindow field if non-nil, zero value otherwise.

### GetClickWindowOk

`func (o *ConversionMSOTEventsCreate) GetClickWindowOk() (*string, bool)`

GetClickWindowOk returns a tuple with the ClickWindow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClickWindow

`func (o *ConversionMSOTEventsCreate) SetClickWindow(v string)`

SetClickWindow sets ClickWindow field to given value.

### HasClickWindow

`func (o *ConversionMSOTEventsCreate) HasClickWindow() bool`

HasClickWindow returns a boolean if a field has been set.

### GetCurrency

`func (o *ConversionMSOTEventsCreate) GetCurrency() Currency`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *ConversionMSOTEventsCreate) GetCurrencyOk() (*Currency, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *ConversionMSOTEventsCreate) SetCurrency(v Currency)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *ConversionMSOTEventsCreate) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetEventId

`func (o *ConversionMSOTEventsCreate) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *ConversionMSOTEventsCreate) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *ConversionMSOTEventsCreate) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetEventName

`func (o *ConversionMSOTEventsCreate) GetEventName() MsotEventName`

GetEventName returns the EventName field if non-nil, zero value otherwise.

### GetEventNameOk

`func (o *ConversionMSOTEventsCreate) GetEventNameOk() (*MsotEventName, bool)`

GetEventNameOk returns a tuple with the EventName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventName

`func (o *ConversionMSOTEventsCreate) SetEventName(v MsotEventName)`

SetEventName sets EventName field to given value.


### GetEventTimestamp

`func (o *ConversionMSOTEventsCreate) GetEventTimestamp() int64`

GetEventTimestamp returns the EventTimestamp field if non-nil, zero value otherwise.

### GetEventTimestampOk

`func (o *ConversionMSOTEventsCreate) GetEventTimestampOk() (*int64, bool)`

GetEventTimestampOk returns a tuple with the EventTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventTimestamp

`func (o *ConversionMSOTEventsCreate) SetEventTimestamp(v int64)`

SetEventTimestamp sets EventTimestamp field to given value.


### GetTotalEventTouchpoints

`func (o *ConversionMSOTEventsCreate) GetTotalEventTouchpoints() int32`

GetTotalEventTouchpoints returns the TotalEventTouchpoints field if non-nil, zero value otherwise.

### GetTotalEventTouchpointsOk

`func (o *ConversionMSOTEventsCreate) GetTotalEventTouchpointsOk() (*int32, bool)`

GetTotalEventTouchpointsOk returns a tuple with the TotalEventTouchpoints field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalEventTouchpoints

`func (o *ConversionMSOTEventsCreate) SetTotalEventTouchpoints(v int32)`

SetTotalEventTouchpoints sets TotalEventTouchpoints field to given value.

### HasTotalEventTouchpoints

`func (o *ConversionMSOTEventsCreate) HasTotalEventTouchpoints() bool`

HasTotalEventTouchpoints returns a boolean if a field has been set.

### GetTotalEvents

`func (o *ConversionMSOTEventsCreate) GetTotalEvents() int32`

GetTotalEvents returns the TotalEvents field if non-nil, zero value otherwise.

### GetTotalEventsOk

`func (o *ConversionMSOTEventsCreate) GetTotalEventsOk() (*int32, bool)`

GetTotalEventsOk returns a tuple with the TotalEvents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalEvents

`func (o *ConversionMSOTEventsCreate) SetTotalEvents(v int32)`

SetTotalEvents sets TotalEvents field to given value.

### HasTotalEvents

`func (o *ConversionMSOTEventsCreate) HasTotalEvents() bool`

HasTotalEvents returns a boolean if a field has been set.

### GetTotalEventsFractional

`func (o *ConversionMSOTEventsCreate) GetTotalEventsFractional() float64`

GetTotalEventsFractional returns the TotalEventsFractional field if non-nil, zero value otherwise.

### GetTotalEventsFractionalOk

`func (o *ConversionMSOTEventsCreate) GetTotalEventsFractionalOk() (*float64, bool)`

GetTotalEventsFractionalOk returns a tuple with the TotalEventsFractional field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalEventsFractional

`func (o *ConversionMSOTEventsCreate) SetTotalEventsFractional(v float64)`

SetTotalEventsFractional sets TotalEventsFractional field to given value.

### HasTotalEventsFractional

`func (o *ConversionMSOTEventsCreate) HasTotalEventsFractional() bool`

HasTotalEventsFractional returns a boolean if a field has been set.

### GetValue

`func (o *ConversionMSOTEventsCreate) GetValue() float64`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *ConversionMSOTEventsCreate) GetValueOk() (*float64, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *ConversionMSOTEventsCreate) SetValue(v float64)`

SetValue sets Value field to given value.

### HasValue

`func (o *ConversionMSOTEventsCreate) HasValue() bool`

HasValue returns a boolean if a field has been set.

### GetViewWindow

`func (o *ConversionMSOTEventsCreate) GetViewWindow() string`

GetViewWindow returns the ViewWindow field if non-nil, zero value otherwise.

### GetViewWindowOk

`func (o *ConversionMSOTEventsCreate) GetViewWindowOk() (*string, bool)`

GetViewWindowOk returns a tuple with the ViewWindow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewWindow

`func (o *ConversionMSOTEventsCreate) SetViewWindow(v string)`

SetViewWindow sets ViewWindow field to given value.

### HasViewWindow

`func (o *ConversionMSOTEventsCreate) HasViewWindow() bool`

HasViewWindow returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


