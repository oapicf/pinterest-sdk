# AudienceInsights

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categories** | Pointer to [**[]AudienceCategory**](AudienceCategory.md) | Category interest distribution | [optional] 
**Date** | Pointer to **NullableString** | Generation date | [optional] 
**Demographics** | Pointer to [**AudienceDemographics**](AudienceDemographics.md) |  | [optional] 
**Size** | Pointer to **int32** | Population count. | [optional] 
**SizeIsUpperBound** | Pointer to **bool** | Indicates whether the audience size has been rounded up to the next highest upper boundary. | [optional] 
**Type** | Pointer to [**AudienceInsightType**](AudienceInsightType.md) |  | [optional] 

## Methods

### NewAudienceInsights

`func NewAudienceInsights() *AudienceInsights`

NewAudienceInsights instantiates a new AudienceInsights object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAudienceInsightsWithDefaults

`func NewAudienceInsightsWithDefaults() *AudienceInsights`

NewAudienceInsightsWithDefaults instantiates a new AudienceInsights object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategories

`func (o *AudienceInsights) GetCategories() []AudienceCategory`

GetCategories returns the Categories field if non-nil, zero value otherwise.

### GetCategoriesOk

`func (o *AudienceInsights) GetCategoriesOk() (*[]AudienceCategory, bool)`

GetCategoriesOk returns a tuple with the Categories field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategories

`func (o *AudienceInsights) SetCategories(v []AudienceCategory)`

SetCategories sets Categories field to given value.

### HasCategories

`func (o *AudienceInsights) HasCategories() bool`

HasCategories returns a boolean if a field has been set.

### GetDate

`func (o *AudienceInsights) GetDate() string`

GetDate returns the Date field if non-nil, zero value otherwise.

### GetDateOk

`func (o *AudienceInsights) GetDateOk() (*string, bool)`

GetDateOk returns a tuple with the Date field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDate

`func (o *AudienceInsights) SetDate(v string)`

SetDate sets Date field to given value.

### HasDate

`func (o *AudienceInsights) HasDate() bool`

HasDate returns a boolean if a field has been set.

### SetDateNil

`func (o *AudienceInsights) SetDateNil(b bool)`

 SetDateNil sets the value for Date to be an explicit nil

### UnsetDate
`func (o *AudienceInsights) UnsetDate()`

UnsetDate ensures that no value is present for Date, not even an explicit nil
### GetDemographics

`func (o *AudienceInsights) GetDemographics() AudienceDemographics`

GetDemographics returns the Demographics field if non-nil, zero value otherwise.

### GetDemographicsOk

`func (o *AudienceInsights) GetDemographicsOk() (*AudienceDemographics, bool)`

GetDemographicsOk returns a tuple with the Demographics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDemographics

`func (o *AudienceInsights) SetDemographics(v AudienceDemographics)`

SetDemographics sets Demographics field to given value.

### HasDemographics

`func (o *AudienceInsights) HasDemographics() bool`

HasDemographics returns a boolean if a field has been set.

### GetSize

`func (o *AudienceInsights) GetSize() int32`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *AudienceInsights) GetSizeOk() (*int32, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *AudienceInsights) SetSize(v int32)`

SetSize sets Size field to given value.

### HasSize

`func (o *AudienceInsights) HasSize() bool`

HasSize returns a boolean if a field has been set.

### GetSizeIsUpperBound

`func (o *AudienceInsights) GetSizeIsUpperBound() bool`

GetSizeIsUpperBound returns the SizeIsUpperBound field if non-nil, zero value otherwise.

### GetSizeIsUpperBoundOk

`func (o *AudienceInsights) GetSizeIsUpperBoundOk() (*bool, bool)`

GetSizeIsUpperBoundOk returns a tuple with the SizeIsUpperBound field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSizeIsUpperBound

`func (o *AudienceInsights) SetSizeIsUpperBound(v bool)`

SetSizeIsUpperBound sets SizeIsUpperBound field to given value.

### HasSizeIsUpperBound

`func (o *AudienceInsights) HasSizeIsUpperBound() bool`

HasSizeIsUpperBound returns a boolean if a field has been set.

### GetType

`func (o *AudienceInsights) GetType() AudienceInsightType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *AudienceInsights) GetTypeOk() (*AudienceInsightType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *AudienceInsights) SetType(v AudienceInsightType)`

SetType sets Type field to given value.

### HasType

`func (o *AudienceInsights) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


