# AudienceInsightsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categories** | Pointer to [**[]AudienceCategory**](AudienceCategory.md) | Category interest distribution | [optional] 
**Demographics** | Pointer to [**AudienceDemographics**](AudienceDemographics.md) |  | [optional] 
**Type** | Pointer to [**AudienceInsightType**](AudienceInsightType.md) |  | [optional] [default to YOUR_TOTAL_AUDIENCE]
**Date** | Pointer to **NullableString** | Generation date | [optional] 
**Size** | Pointer to **int32** | Population count. | [optional] 
**SizeIsUpperBound** | Pointer to **bool** | Indicates whether the audience size has been rounded up to the next highest upper boundary. | [optional] 

## Methods

### NewAudienceInsightsResponse

`func NewAudienceInsightsResponse() *AudienceInsightsResponse`

NewAudienceInsightsResponse instantiates a new AudienceInsightsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAudienceInsightsResponseWithDefaults

`func NewAudienceInsightsResponseWithDefaults() *AudienceInsightsResponse`

NewAudienceInsightsResponseWithDefaults instantiates a new AudienceInsightsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategories

`func (o *AudienceInsightsResponse) GetCategories() []AudienceCategory`

GetCategories returns the Categories field if non-nil, zero value otherwise.

### GetCategoriesOk

`func (o *AudienceInsightsResponse) GetCategoriesOk() (*[]AudienceCategory, bool)`

GetCategoriesOk returns a tuple with the Categories field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategories

`func (o *AudienceInsightsResponse) SetCategories(v []AudienceCategory)`

SetCategories sets Categories field to given value.

### HasCategories

`func (o *AudienceInsightsResponse) HasCategories() bool`

HasCategories returns a boolean if a field has been set.

### GetDemographics

`func (o *AudienceInsightsResponse) GetDemographics() AudienceDemographics`

GetDemographics returns the Demographics field if non-nil, zero value otherwise.

### GetDemographicsOk

`func (o *AudienceInsightsResponse) GetDemographicsOk() (*AudienceDemographics, bool)`

GetDemographicsOk returns a tuple with the Demographics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDemographics

`func (o *AudienceInsightsResponse) SetDemographics(v AudienceDemographics)`

SetDemographics sets Demographics field to given value.

### HasDemographics

`func (o *AudienceInsightsResponse) HasDemographics() bool`

HasDemographics returns a boolean if a field has been set.

### GetType

`func (o *AudienceInsightsResponse) GetType() AudienceInsightType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *AudienceInsightsResponse) GetTypeOk() (*AudienceInsightType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *AudienceInsightsResponse) SetType(v AudienceInsightType)`

SetType sets Type field to given value.

### HasType

`func (o *AudienceInsightsResponse) HasType() bool`

HasType returns a boolean if a field has been set.

### GetDate

`func (o *AudienceInsightsResponse) GetDate() string`

GetDate returns the Date field if non-nil, zero value otherwise.

### GetDateOk

`func (o *AudienceInsightsResponse) GetDateOk() (*string, bool)`

GetDateOk returns a tuple with the Date field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDate

`func (o *AudienceInsightsResponse) SetDate(v string)`

SetDate sets Date field to given value.

### HasDate

`func (o *AudienceInsightsResponse) HasDate() bool`

HasDate returns a boolean if a field has been set.

### SetDateNil

`func (o *AudienceInsightsResponse) SetDateNil(b bool)`

 SetDateNil sets the value for Date to be an explicit nil

### UnsetDate
`func (o *AudienceInsightsResponse) UnsetDate()`

UnsetDate ensures that no value is present for Date, not even an explicit nil
### GetSize

`func (o *AudienceInsightsResponse) GetSize() int32`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *AudienceInsightsResponse) GetSizeOk() (*int32, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *AudienceInsightsResponse) SetSize(v int32)`

SetSize sets Size field to given value.

### HasSize

`func (o *AudienceInsightsResponse) HasSize() bool`

HasSize returns a boolean if a field has been set.

### GetSizeIsUpperBound

`func (o *AudienceInsightsResponse) GetSizeIsUpperBound() bool`

GetSizeIsUpperBound returns the SizeIsUpperBound field if non-nil, zero value otherwise.

### GetSizeIsUpperBoundOk

`func (o *AudienceInsightsResponse) GetSizeIsUpperBoundOk() (*bool, bool)`

GetSizeIsUpperBoundOk returns a tuple with the SizeIsUpperBound field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSizeIsUpperBound

`func (o *AudienceInsightsResponse) SetSizeIsUpperBound(v bool)`

SetSizeIsUpperBound sets SizeIsUpperBound field to given value.

### HasSizeIsUpperBound

`func (o *AudienceInsightsResponse) HasSizeIsUpperBound() bool`

HasSizeIsUpperBound returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


