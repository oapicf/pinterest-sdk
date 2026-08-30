# AdGroupCreateRequestAllOf1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoTargetingEnabled** | Pointer to **bool** | Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;. | [optional] 
**BidMultiplier** | Pointer to **float32** | &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;. | [optional] 
**BudgetType** | Pointer to [**BudgetType**](BudgetType.md) |  | [optional] [default to DAILY]
**PacingDeliveryType** | Pointer to [**PacingDeliveryType**](PacingDeliveryType.md) |  | [optional] [default to STANDARD]

## Methods

### NewAdGroupCreateRequestAllOf1

`func NewAdGroupCreateRequestAllOf1() *AdGroupCreateRequestAllOf1`

NewAdGroupCreateRequestAllOf1 instantiates a new AdGroupCreateRequestAllOf1 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdGroupCreateRequestAllOf1WithDefaults

`func NewAdGroupCreateRequestAllOf1WithDefaults() *AdGroupCreateRequestAllOf1`

NewAdGroupCreateRequestAllOf1WithDefaults instantiates a new AdGroupCreateRequestAllOf1 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAutoTargetingEnabled

`func (o *AdGroupCreateRequestAllOf1) GetAutoTargetingEnabled() bool`

GetAutoTargetingEnabled returns the AutoTargetingEnabled field if non-nil, zero value otherwise.

### GetAutoTargetingEnabledOk

`func (o *AdGroupCreateRequestAllOf1) GetAutoTargetingEnabledOk() (*bool, bool)`

GetAutoTargetingEnabledOk returns a tuple with the AutoTargetingEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoTargetingEnabled

`func (o *AdGroupCreateRequestAllOf1) SetAutoTargetingEnabled(v bool)`

SetAutoTargetingEnabled sets AutoTargetingEnabled field to given value.

### HasAutoTargetingEnabled

`func (o *AdGroupCreateRequestAllOf1) HasAutoTargetingEnabled() bool`

HasAutoTargetingEnabled returns a boolean if a field has been set.

### GetBidMultiplier

`func (o *AdGroupCreateRequestAllOf1) GetBidMultiplier() float32`

GetBidMultiplier returns the BidMultiplier field if non-nil, zero value otherwise.

### GetBidMultiplierOk

`func (o *AdGroupCreateRequestAllOf1) GetBidMultiplierOk() (*float32, bool)`

GetBidMultiplierOk returns a tuple with the BidMultiplier field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidMultiplier

`func (o *AdGroupCreateRequestAllOf1) SetBidMultiplier(v float32)`

SetBidMultiplier sets BidMultiplier field to given value.

### HasBidMultiplier

`func (o *AdGroupCreateRequestAllOf1) HasBidMultiplier() bool`

HasBidMultiplier returns a boolean if a field has been set.

### GetBudgetType

`func (o *AdGroupCreateRequestAllOf1) GetBudgetType() BudgetType`

GetBudgetType returns the BudgetType field if non-nil, zero value otherwise.

### GetBudgetTypeOk

`func (o *AdGroupCreateRequestAllOf1) GetBudgetTypeOk() (*BudgetType, bool)`

GetBudgetTypeOk returns a tuple with the BudgetType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetType

`func (o *AdGroupCreateRequestAllOf1) SetBudgetType(v BudgetType)`

SetBudgetType sets BudgetType field to given value.

### HasBudgetType

`func (o *AdGroupCreateRequestAllOf1) HasBudgetType() bool`

HasBudgetType returns a boolean if a field has been set.

### GetPacingDeliveryType

`func (o *AdGroupCreateRequestAllOf1) GetPacingDeliveryType() PacingDeliveryType`

GetPacingDeliveryType returns the PacingDeliveryType field if non-nil, zero value otherwise.

### GetPacingDeliveryTypeOk

`func (o *AdGroupCreateRequestAllOf1) GetPacingDeliveryTypeOk() (*PacingDeliveryType, bool)`

GetPacingDeliveryTypeOk returns a tuple with the PacingDeliveryType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPacingDeliveryType

`func (o *AdGroupCreateRequestAllOf1) SetPacingDeliveryType(v PacingDeliveryType)`

SetPacingDeliveryType sets PacingDeliveryType field to given value.

### HasPacingDeliveryType

`func (o *AdGroupCreateRequestAllOf1) HasPacingDeliveryType() bool`

HasPacingDeliveryType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


