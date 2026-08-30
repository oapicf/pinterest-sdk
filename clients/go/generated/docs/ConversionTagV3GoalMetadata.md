# ConversionTagV3GoalMetadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AttributionWindows** | Pointer to [**AttributionWindows**](AttributionWindows.md) |  | [optional] 
**ConversionEvent** | Pointer to [**ConversionEvent**](ConversionEvent.md) |  | [optional] 
**ConversionTagId** | Pointer to **string** |  | [optional] 
**CpaGoalValueInMicroCurrency** | Pointer to **string** |  | [optional] 
**IsRoasOptimized** | Pointer to **NullableBool** | Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/). | [optional] 
**ReportingEvent** | Pointer to **string** | Event name for custom or standard events mapped to an oCPM model | [optional] 

## Methods

### NewConversionTagV3GoalMetadata

`func NewConversionTagV3GoalMetadata() *ConversionTagV3GoalMetadata`

NewConversionTagV3GoalMetadata instantiates a new ConversionTagV3GoalMetadata object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionTagV3GoalMetadataWithDefaults

`func NewConversionTagV3GoalMetadataWithDefaults() *ConversionTagV3GoalMetadata`

NewConversionTagV3GoalMetadataWithDefaults instantiates a new ConversionTagV3GoalMetadata object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttributionWindows

`func (o *ConversionTagV3GoalMetadata) GetAttributionWindows() AttributionWindows`

GetAttributionWindows returns the AttributionWindows field if non-nil, zero value otherwise.

### GetAttributionWindowsOk

`func (o *ConversionTagV3GoalMetadata) GetAttributionWindowsOk() (*AttributionWindows, bool)`

GetAttributionWindowsOk returns a tuple with the AttributionWindows field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributionWindows

`func (o *ConversionTagV3GoalMetadata) SetAttributionWindows(v AttributionWindows)`

SetAttributionWindows sets AttributionWindows field to given value.

### HasAttributionWindows

`func (o *ConversionTagV3GoalMetadata) HasAttributionWindows() bool`

HasAttributionWindows returns a boolean if a field has been set.

### GetConversionEvent

`func (o *ConversionTagV3GoalMetadata) GetConversionEvent() ConversionEvent`

GetConversionEvent returns the ConversionEvent field if non-nil, zero value otherwise.

### GetConversionEventOk

`func (o *ConversionTagV3GoalMetadata) GetConversionEventOk() (*ConversionEvent, bool)`

GetConversionEventOk returns a tuple with the ConversionEvent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionEvent

`func (o *ConversionTagV3GoalMetadata) SetConversionEvent(v ConversionEvent)`

SetConversionEvent sets ConversionEvent field to given value.

### HasConversionEvent

`func (o *ConversionTagV3GoalMetadata) HasConversionEvent() bool`

HasConversionEvent returns a boolean if a field has been set.

### GetConversionTagId

`func (o *ConversionTagV3GoalMetadata) GetConversionTagId() string`

GetConversionTagId returns the ConversionTagId field if non-nil, zero value otherwise.

### GetConversionTagIdOk

`func (o *ConversionTagV3GoalMetadata) GetConversionTagIdOk() (*string, bool)`

GetConversionTagIdOk returns a tuple with the ConversionTagId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionTagId

`func (o *ConversionTagV3GoalMetadata) SetConversionTagId(v string)`

SetConversionTagId sets ConversionTagId field to given value.

### HasConversionTagId

`func (o *ConversionTagV3GoalMetadata) HasConversionTagId() bool`

HasConversionTagId returns a boolean if a field has been set.

### GetCpaGoalValueInMicroCurrency

`func (o *ConversionTagV3GoalMetadata) GetCpaGoalValueInMicroCurrency() string`

GetCpaGoalValueInMicroCurrency returns the CpaGoalValueInMicroCurrency field if non-nil, zero value otherwise.

### GetCpaGoalValueInMicroCurrencyOk

`func (o *ConversionTagV3GoalMetadata) GetCpaGoalValueInMicroCurrencyOk() (*string, bool)`

GetCpaGoalValueInMicroCurrencyOk returns a tuple with the CpaGoalValueInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCpaGoalValueInMicroCurrency

`func (o *ConversionTagV3GoalMetadata) SetCpaGoalValueInMicroCurrency(v string)`

SetCpaGoalValueInMicroCurrency sets CpaGoalValueInMicroCurrency field to given value.

### HasCpaGoalValueInMicroCurrency

`func (o *ConversionTagV3GoalMetadata) HasCpaGoalValueInMicroCurrency() bool`

HasCpaGoalValueInMicroCurrency returns a boolean if a field has been set.

### GetIsRoasOptimized

`func (o *ConversionTagV3GoalMetadata) GetIsRoasOptimized() bool`

GetIsRoasOptimized returns the IsRoasOptimized field if non-nil, zero value otherwise.

### GetIsRoasOptimizedOk

`func (o *ConversionTagV3GoalMetadata) GetIsRoasOptimizedOk() (*bool, bool)`

GetIsRoasOptimizedOk returns a tuple with the IsRoasOptimized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsRoasOptimized

`func (o *ConversionTagV3GoalMetadata) SetIsRoasOptimized(v bool)`

SetIsRoasOptimized sets IsRoasOptimized field to given value.

### HasIsRoasOptimized

`func (o *ConversionTagV3GoalMetadata) HasIsRoasOptimized() bool`

HasIsRoasOptimized returns a boolean if a field has been set.

### SetIsRoasOptimizedNil

`func (o *ConversionTagV3GoalMetadata) SetIsRoasOptimizedNil(b bool)`

 SetIsRoasOptimizedNil sets the value for IsRoasOptimized to be an explicit nil

### UnsetIsRoasOptimized
`func (o *ConversionTagV3GoalMetadata) UnsetIsRoasOptimized()`

UnsetIsRoasOptimized ensures that no value is present for IsRoasOptimized, not even an explicit nil
### GetReportingEvent

`func (o *ConversionTagV3GoalMetadata) GetReportingEvent() string`

GetReportingEvent returns the ReportingEvent field if non-nil, zero value otherwise.

### GetReportingEventOk

`func (o *ConversionTagV3GoalMetadata) GetReportingEventOk() (*string, bool)`

GetReportingEventOk returns a tuple with the ReportingEvent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportingEvent

`func (o *ConversionTagV3GoalMetadata) SetReportingEvent(v string)`

SetReportingEvent sets ReportingEvent field to given value.

### HasReportingEvent

`func (o *ConversionTagV3GoalMetadata) HasReportingEvent() bool`

HasReportingEvent returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


