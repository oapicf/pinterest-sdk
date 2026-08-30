# Promotion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **string** | The Ad Account ID that this promotion belongs to. | [readonly] 
**DiscountStatus** | Pointer to [**DiscountStatus**](DiscountStatus.md) |  | [optional] 
**EndTime** | Pointer to **int32** | Promotion end time. Unix timestamp in seconds. Independent of campaign end time. | [optional] 
**ExternalId** | Pointer to **string** | Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. | [optional] 
**Id** | **string** | Promotion ID | 
**PlatformType** | Pointer to **string** | The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. | [optional] 
**PromotionCode** | Pointer to **string** | Code that can be used to redeem a promotion. | [optional] 
**PromotionCustomId** | Pointer to **string** | An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. | [optional] 
**PromotionTitle** | **string** | Internal name for the promotion. | 
**PromotionType** | [**PromotionType**](PromotionType.md) |  | 
**StartTime** | Pointer to **int32** | Promotion start time. Unix timestamp in seconds. Independent of campaign start time. | [optional] 
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) |  | [optional] [readonly] 
**TemplateValues** | Pointer to [**[]PromotionTemplateValue**](PromotionTemplateValue.md) | List of values to be inserted in the promotion type-specific template. | [optional] 

## Methods

### NewPromotion

`func NewPromotion(adAccountId string, id string, promotionTitle string, promotionType PromotionType, ) *Promotion`

NewPromotion instantiates a new Promotion object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPromotionWithDefaults

`func NewPromotionWithDefaults() *Promotion`

NewPromotionWithDefaults instantiates a new Promotion object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *Promotion) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *Promotion) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *Promotion) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.


### GetDiscountStatus

`func (o *Promotion) GetDiscountStatus() DiscountStatus`

GetDiscountStatus returns the DiscountStatus field if non-nil, zero value otherwise.

### GetDiscountStatusOk

`func (o *Promotion) GetDiscountStatusOk() (*DiscountStatus, bool)`

GetDiscountStatusOk returns a tuple with the DiscountStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscountStatus

`func (o *Promotion) SetDiscountStatus(v DiscountStatus)`

SetDiscountStatus sets DiscountStatus field to given value.

### HasDiscountStatus

`func (o *Promotion) HasDiscountStatus() bool`

HasDiscountStatus returns a boolean if a field has been set.

### GetEndTime

`func (o *Promotion) GetEndTime() int32`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *Promotion) GetEndTimeOk() (*int32, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *Promotion) SetEndTime(v int32)`

SetEndTime sets EndTime field to given value.

### HasEndTime

`func (o *Promotion) HasEndTime() bool`

HasEndTime returns a boolean if a field has been set.

### GetExternalId

`func (o *Promotion) GetExternalId() string`

GetExternalId returns the ExternalId field if non-nil, zero value otherwise.

### GetExternalIdOk

`func (o *Promotion) GetExternalIdOk() (*string, bool)`

GetExternalIdOk returns a tuple with the ExternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalId

`func (o *Promotion) SetExternalId(v string)`

SetExternalId sets ExternalId field to given value.

### HasExternalId

`func (o *Promotion) HasExternalId() bool`

HasExternalId returns a boolean if a field has been set.

### GetId

`func (o *Promotion) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Promotion) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Promotion) SetId(v string)`

SetId sets Id field to given value.


### GetPlatformType

`func (o *Promotion) GetPlatformType() string`

GetPlatformType returns the PlatformType field if non-nil, zero value otherwise.

### GetPlatformTypeOk

`func (o *Promotion) GetPlatformTypeOk() (*string, bool)`

GetPlatformTypeOk returns a tuple with the PlatformType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlatformType

`func (o *Promotion) SetPlatformType(v string)`

SetPlatformType sets PlatformType field to given value.

### HasPlatformType

`func (o *Promotion) HasPlatformType() bool`

HasPlatformType returns a boolean if a field has been set.

### GetPromotionCode

`func (o *Promotion) GetPromotionCode() string`

GetPromotionCode returns the PromotionCode field if non-nil, zero value otherwise.

### GetPromotionCodeOk

`func (o *Promotion) GetPromotionCodeOk() (*string, bool)`

GetPromotionCodeOk returns a tuple with the PromotionCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionCode

`func (o *Promotion) SetPromotionCode(v string)`

SetPromotionCode sets PromotionCode field to given value.

### HasPromotionCode

`func (o *Promotion) HasPromotionCode() bool`

HasPromotionCode returns a boolean if a field has been set.

### GetPromotionCustomId

`func (o *Promotion) GetPromotionCustomId() string`

GetPromotionCustomId returns the PromotionCustomId field if non-nil, zero value otherwise.

### GetPromotionCustomIdOk

`func (o *Promotion) GetPromotionCustomIdOk() (*string, bool)`

GetPromotionCustomIdOk returns a tuple with the PromotionCustomId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionCustomId

`func (o *Promotion) SetPromotionCustomId(v string)`

SetPromotionCustomId sets PromotionCustomId field to given value.

### HasPromotionCustomId

`func (o *Promotion) HasPromotionCustomId() bool`

HasPromotionCustomId returns a boolean if a field has been set.

### GetPromotionTitle

`func (o *Promotion) GetPromotionTitle() string`

GetPromotionTitle returns the PromotionTitle field if non-nil, zero value otherwise.

### GetPromotionTitleOk

`func (o *Promotion) GetPromotionTitleOk() (*string, bool)`

GetPromotionTitleOk returns a tuple with the PromotionTitle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionTitle

`func (o *Promotion) SetPromotionTitle(v string)`

SetPromotionTitle sets PromotionTitle field to given value.


### GetPromotionType

`func (o *Promotion) GetPromotionType() PromotionType`

GetPromotionType returns the PromotionType field if non-nil, zero value otherwise.

### GetPromotionTypeOk

`func (o *Promotion) GetPromotionTypeOk() (*PromotionType, bool)`

GetPromotionTypeOk returns a tuple with the PromotionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionType

`func (o *Promotion) SetPromotionType(v PromotionType)`

SetPromotionType sets PromotionType field to given value.


### GetStartTime

`func (o *Promotion) GetStartTime() int32`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *Promotion) GetStartTimeOk() (*int32, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *Promotion) SetStartTime(v int32)`

SetStartTime sets StartTime field to given value.

### HasStartTime

`func (o *Promotion) HasStartTime() bool`

HasStartTime returns a boolean if a field has been set.

### GetStatus

`func (o *Promotion) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Promotion) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Promotion) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *Promotion) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTemplateValues

`func (o *Promotion) GetTemplateValues() []PromotionTemplateValue`

GetTemplateValues returns the TemplateValues field if non-nil, zero value otherwise.

### GetTemplateValuesOk

`func (o *Promotion) GetTemplateValuesOk() (*[]PromotionTemplateValue, bool)`

GetTemplateValuesOk returns a tuple with the TemplateValues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplateValues

`func (o *Promotion) SetTemplateValues(v []PromotionTemplateValue)`

SetTemplateValues sets TemplateValues field to given value.

### HasTemplateValues

`func (o *Promotion) HasTemplateValues() bool`

HasTemplateValues returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


