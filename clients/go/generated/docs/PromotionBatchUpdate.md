# PromotionBatchUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DiscountStatus** | Pointer to [**DiscountStatus**](DiscountStatus.md) |  | [optional] 
**EndTime** | Pointer to **int32** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] 
**ExternalId** | Pointer to **string** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] 
**Id** | **string** | Promotion ID | 
**PlatformType** | Pointer to **string** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. | [optional] 
**PromotionCode** | Pointer to **string** | Code that can be used to redeem a promotion. | [optional] 
**PromotionCustomId** | Pointer to **string** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] 
**PromotionTitle** | Pointer to **string** | Internal name for the promotion. | [optional] 
**PromotionType** | Pointer to [**PromotionType**](PromotionType.md) |  | [optional] 
**StartTime** | Pointer to **int32** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] 
**TemplateValues** | Pointer to [**[]PromotionTemplateValue**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional] 

## Methods

### NewPromotionBatchUpdate

`func NewPromotionBatchUpdate(id string, ) *PromotionBatchUpdate`

NewPromotionBatchUpdate instantiates a new PromotionBatchUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPromotionBatchUpdateWithDefaults

`func NewPromotionBatchUpdateWithDefaults() *PromotionBatchUpdate`

NewPromotionBatchUpdateWithDefaults instantiates a new PromotionBatchUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDiscountStatus

`func (o *PromotionBatchUpdate) GetDiscountStatus() DiscountStatus`

GetDiscountStatus returns the DiscountStatus field if non-nil, zero value otherwise.

### GetDiscountStatusOk

`func (o *PromotionBatchUpdate) GetDiscountStatusOk() (*DiscountStatus, bool)`

GetDiscountStatusOk returns a tuple with the DiscountStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscountStatus

`func (o *PromotionBatchUpdate) SetDiscountStatus(v DiscountStatus)`

SetDiscountStatus sets DiscountStatus field to given value.

### HasDiscountStatus

`func (o *PromotionBatchUpdate) HasDiscountStatus() bool`

HasDiscountStatus returns a boolean if a field has been set.

### GetEndTime

`func (o *PromotionBatchUpdate) GetEndTime() int32`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *PromotionBatchUpdate) GetEndTimeOk() (*int32, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *PromotionBatchUpdate) SetEndTime(v int32)`

SetEndTime sets EndTime field to given value.

### HasEndTime

`func (o *PromotionBatchUpdate) HasEndTime() bool`

HasEndTime returns a boolean if a field has been set.

### GetExternalId

`func (o *PromotionBatchUpdate) GetExternalId() string`

GetExternalId returns the ExternalId field if non-nil, zero value otherwise.

### GetExternalIdOk

`func (o *PromotionBatchUpdate) GetExternalIdOk() (*string, bool)`

GetExternalIdOk returns a tuple with the ExternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalId

`func (o *PromotionBatchUpdate) SetExternalId(v string)`

SetExternalId sets ExternalId field to given value.

### HasExternalId

`func (o *PromotionBatchUpdate) HasExternalId() bool`

HasExternalId returns a boolean if a field has been set.

### GetId

`func (o *PromotionBatchUpdate) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *PromotionBatchUpdate) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *PromotionBatchUpdate) SetId(v string)`

SetId sets Id field to given value.


### GetPlatformType

`func (o *PromotionBatchUpdate) GetPlatformType() string`

GetPlatformType returns the PlatformType field if non-nil, zero value otherwise.

### GetPlatformTypeOk

`func (o *PromotionBatchUpdate) GetPlatformTypeOk() (*string, bool)`

GetPlatformTypeOk returns a tuple with the PlatformType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlatformType

`func (o *PromotionBatchUpdate) SetPlatformType(v string)`

SetPlatformType sets PlatformType field to given value.

### HasPlatformType

`func (o *PromotionBatchUpdate) HasPlatformType() bool`

HasPlatformType returns a boolean if a field has been set.

### GetPromotionCode

`func (o *PromotionBatchUpdate) GetPromotionCode() string`

GetPromotionCode returns the PromotionCode field if non-nil, zero value otherwise.

### GetPromotionCodeOk

`func (o *PromotionBatchUpdate) GetPromotionCodeOk() (*string, bool)`

GetPromotionCodeOk returns a tuple with the PromotionCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionCode

`func (o *PromotionBatchUpdate) SetPromotionCode(v string)`

SetPromotionCode sets PromotionCode field to given value.

### HasPromotionCode

`func (o *PromotionBatchUpdate) HasPromotionCode() bool`

HasPromotionCode returns a boolean if a field has been set.

### GetPromotionCustomId

`func (o *PromotionBatchUpdate) GetPromotionCustomId() string`

GetPromotionCustomId returns the PromotionCustomId field if non-nil, zero value otherwise.

### GetPromotionCustomIdOk

`func (o *PromotionBatchUpdate) GetPromotionCustomIdOk() (*string, bool)`

GetPromotionCustomIdOk returns a tuple with the PromotionCustomId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionCustomId

`func (o *PromotionBatchUpdate) SetPromotionCustomId(v string)`

SetPromotionCustomId sets PromotionCustomId field to given value.

### HasPromotionCustomId

`func (o *PromotionBatchUpdate) HasPromotionCustomId() bool`

HasPromotionCustomId returns a boolean if a field has been set.

### GetPromotionTitle

`func (o *PromotionBatchUpdate) GetPromotionTitle() string`

GetPromotionTitle returns the PromotionTitle field if non-nil, zero value otherwise.

### GetPromotionTitleOk

`func (o *PromotionBatchUpdate) GetPromotionTitleOk() (*string, bool)`

GetPromotionTitleOk returns a tuple with the PromotionTitle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionTitle

`func (o *PromotionBatchUpdate) SetPromotionTitle(v string)`

SetPromotionTitle sets PromotionTitle field to given value.

### HasPromotionTitle

`func (o *PromotionBatchUpdate) HasPromotionTitle() bool`

HasPromotionTitle returns a boolean if a field has been set.

### GetPromotionType

`func (o *PromotionBatchUpdate) GetPromotionType() PromotionType`

GetPromotionType returns the PromotionType field if non-nil, zero value otherwise.

### GetPromotionTypeOk

`func (o *PromotionBatchUpdate) GetPromotionTypeOk() (*PromotionType, bool)`

GetPromotionTypeOk returns a tuple with the PromotionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionType

`func (o *PromotionBatchUpdate) SetPromotionType(v PromotionType)`

SetPromotionType sets PromotionType field to given value.

### HasPromotionType

`func (o *PromotionBatchUpdate) HasPromotionType() bool`

HasPromotionType returns a boolean if a field has been set.

### GetStartTime

`func (o *PromotionBatchUpdate) GetStartTime() int32`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *PromotionBatchUpdate) GetStartTimeOk() (*int32, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *PromotionBatchUpdate) SetStartTime(v int32)`

SetStartTime sets StartTime field to given value.

### HasStartTime

`func (o *PromotionBatchUpdate) HasStartTime() bool`

HasStartTime returns a boolean if a field has been set.

### GetTemplateValues

`func (o *PromotionBatchUpdate) GetTemplateValues() []PromotionTemplateValue`

GetTemplateValues returns the TemplateValues field if non-nil, zero value otherwise.

### GetTemplateValuesOk

`func (o *PromotionBatchUpdate) GetTemplateValuesOk() (*[]PromotionTemplateValue, bool)`

GetTemplateValuesOk returns a tuple with the TemplateValues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplateValues

`func (o *PromotionBatchUpdate) SetTemplateValues(v []PromotionTemplateValue)`

SetTemplateValues sets TemplateValues field to given value.

### HasTemplateValues

`func (o *PromotionBatchUpdate) HasTemplateValues() bool`

HasTemplateValues returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


