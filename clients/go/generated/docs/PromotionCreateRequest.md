# PromotionCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DiscountStatus** | Pointer to **string** | Discount status based on the current time and start and end time of discount | [optional] 
**EndTime** | Pointer to **int32** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] 
**ExternalId** | Pointer to **string** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] 
**PlatformType** | Pointer to **string** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. | [optional] 
**PromotionCode** | Pointer to **string** | Code that can be used to redeem a promotion. | [optional] 
**PromotionCustomId** | Pointer to **string** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] 
**PromotionTitle** | **string** | Internal name for the promotion. | 
**PromotionType** | [**PromotionType**](PromotionType.md) |  | 
**StartTime** | Pointer to **int32** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] 
**TemplateValues** | Pointer to [**[]PromotionTemplateValue**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional] 

## Methods

### NewPromotionCreateRequest

`func NewPromotionCreateRequest(promotionTitle string, promotionType PromotionType, ) *PromotionCreateRequest`

NewPromotionCreateRequest instantiates a new PromotionCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPromotionCreateRequestWithDefaults

`func NewPromotionCreateRequestWithDefaults() *PromotionCreateRequest`

NewPromotionCreateRequestWithDefaults instantiates a new PromotionCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDiscountStatus

`func (o *PromotionCreateRequest) GetDiscountStatus() string`

GetDiscountStatus returns the DiscountStatus field if non-nil, zero value otherwise.

### GetDiscountStatusOk

`func (o *PromotionCreateRequest) GetDiscountStatusOk() (*string, bool)`

GetDiscountStatusOk returns a tuple with the DiscountStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscountStatus

`func (o *PromotionCreateRequest) SetDiscountStatus(v string)`

SetDiscountStatus sets DiscountStatus field to given value.

### HasDiscountStatus

`func (o *PromotionCreateRequest) HasDiscountStatus() bool`

HasDiscountStatus returns a boolean if a field has been set.

### GetEndTime

`func (o *PromotionCreateRequest) GetEndTime() int32`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *PromotionCreateRequest) GetEndTimeOk() (*int32, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *PromotionCreateRequest) SetEndTime(v int32)`

SetEndTime sets EndTime field to given value.

### HasEndTime

`func (o *PromotionCreateRequest) HasEndTime() bool`

HasEndTime returns a boolean if a field has been set.

### GetExternalId

`func (o *PromotionCreateRequest) GetExternalId() string`

GetExternalId returns the ExternalId field if non-nil, zero value otherwise.

### GetExternalIdOk

`func (o *PromotionCreateRequest) GetExternalIdOk() (*string, bool)`

GetExternalIdOk returns a tuple with the ExternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalId

`func (o *PromotionCreateRequest) SetExternalId(v string)`

SetExternalId sets ExternalId field to given value.

### HasExternalId

`func (o *PromotionCreateRequest) HasExternalId() bool`

HasExternalId returns a boolean if a field has been set.

### GetPlatformType

`func (o *PromotionCreateRequest) GetPlatformType() string`

GetPlatformType returns the PlatformType field if non-nil, zero value otherwise.

### GetPlatformTypeOk

`func (o *PromotionCreateRequest) GetPlatformTypeOk() (*string, bool)`

GetPlatformTypeOk returns a tuple with the PlatformType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlatformType

`func (o *PromotionCreateRequest) SetPlatformType(v string)`

SetPlatformType sets PlatformType field to given value.

### HasPlatformType

`func (o *PromotionCreateRequest) HasPlatformType() bool`

HasPlatformType returns a boolean if a field has been set.

### GetPromotionCode

`func (o *PromotionCreateRequest) GetPromotionCode() string`

GetPromotionCode returns the PromotionCode field if non-nil, zero value otherwise.

### GetPromotionCodeOk

`func (o *PromotionCreateRequest) GetPromotionCodeOk() (*string, bool)`

GetPromotionCodeOk returns a tuple with the PromotionCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionCode

`func (o *PromotionCreateRequest) SetPromotionCode(v string)`

SetPromotionCode sets PromotionCode field to given value.

### HasPromotionCode

`func (o *PromotionCreateRequest) HasPromotionCode() bool`

HasPromotionCode returns a boolean if a field has been set.

### GetPromotionCustomId

`func (o *PromotionCreateRequest) GetPromotionCustomId() string`

GetPromotionCustomId returns the PromotionCustomId field if non-nil, zero value otherwise.

### GetPromotionCustomIdOk

`func (o *PromotionCreateRequest) GetPromotionCustomIdOk() (*string, bool)`

GetPromotionCustomIdOk returns a tuple with the PromotionCustomId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionCustomId

`func (o *PromotionCreateRequest) SetPromotionCustomId(v string)`

SetPromotionCustomId sets PromotionCustomId field to given value.

### HasPromotionCustomId

`func (o *PromotionCreateRequest) HasPromotionCustomId() bool`

HasPromotionCustomId returns a boolean if a field has been set.

### GetPromotionTitle

`func (o *PromotionCreateRequest) GetPromotionTitle() string`

GetPromotionTitle returns the PromotionTitle field if non-nil, zero value otherwise.

### GetPromotionTitleOk

`func (o *PromotionCreateRequest) GetPromotionTitleOk() (*string, bool)`

GetPromotionTitleOk returns a tuple with the PromotionTitle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionTitle

`func (o *PromotionCreateRequest) SetPromotionTitle(v string)`

SetPromotionTitle sets PromotionTitle field to given value.


### GetPromotionType

`func (o *PromotionCreateRequest) GetPromotionType() PromotionType`

GetPromotionType returns the PromotionType field if non-nil, zero value otherwise.

### GetPromotionTypeOk

`func (o *PromotionCreateRequest) GetPromotionTypeOk() (*PromotionType, bool)`

GetPromotionTypeOk returns a tuple with the PromotionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionType

`func (o *PromotionCreateRequest) SetPromotionType(v PromotionType)`

SetPromotionType sets PromotionType field to given value.


### GetStartTime

`func (o *PromotionCreateRequest) GetStartTime() int32`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *PromotionCreateRequest) GetStartTimeOk() (*int32, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *PromotionCreateRequest) SetStartTime(v int32)`

SetStartTime sets StartTime field to given value.

### HasStartTime

`func (o *PromotionCreateRequest) HasStartTime() bool`

HasStartTime returns a boolean if a field has been set.

### GetTemplateValues

`func (o *PromotionCreateRequest) GetTemplateValues() []PromotionTemplateValue`

GetTemplateValues returns the TemplateValues field if non-nil, zero value otherwise.

### GetTemplateValuesOk

`func (o *PromotionCreateRequest) GetTemplateValuesOk() (*[]PromotionTemplateValue, bool)`

GetTemplateValuesOk returns a tuple with the TemplateValues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplateValues

`func (o *PromotionCreateRequest) SetTemplateValues(v []PromotionTemplateValue)`

SetTemplateValues sets TemplateValues field to given value.

### HasTemplateValues

`func (o *PromotionCreateRequest) HasTemplateValues() bool`

HasTemplateValues returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


