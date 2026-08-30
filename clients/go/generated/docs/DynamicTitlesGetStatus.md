# DynamicTitlesGetStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**GeneratedCount** | Pointer to **int32** | The count of generated titles. | [optional] 
**IsReady** | Pointer to **bool** | Whether dynamic titles have been generated and are ready to be reviewed for the ad group. | [optional] 
**ReviewedCount** | Pointer to **int32** | The count of advertiser reviewed titles. | [optional] 

## Methods

### NewDynamicTitlesGetStatus

`func NewDynamicTitlesGetStatus() *DynamicTitlesGetStatus`

NewDynamicTitlesGetStatus instantiates a new DynamicTitlesGetStatus object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDynamicTitlesGetStatusWithDefaults

`func NewDynamicTitlesGetStatusWithDefaults() *DynamicTitlesGetStatus`

NewDynamicTitlesGetStatusWithDefaults instantiates a new DynamicTitlesGetStatus object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGeneratedCount

`func (o *DynamicTitlesGetStatus) GetGeneratedCount() int32`

GetGeneratedCount returns the GeneratedCount field if non-nil, zero value otherwise.

### GetGeneratedCountOk

`func (o *DynamicTitlesGetStatus) GetGeneratedCountOk() (*int32, bool)`

GetGeneratedCountOk returns a tuple with the GeneratedCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneratedCount

`func (o *DynamicTitlesGetStatus) SetGeneratedCount(v int32)`

SetGeneratedCount sets GeneratedCount field to given value.

### HasGeneratedCount

`func (o *DynamicTitlesGetStatus) HasGeneratedCount() bool`

HasGeneratedCount returns a boolean if a field has been set.

### GetIsReady

`func (o *DynamicTitlesGetStatus) GetIsReady() bool`

GetIsReady returns the IsReady field if non-nil, zero value otherwise.

### GetIsReadyOk

`func (o *DynamicTitlesGetStatus) GetIsReadyOk() (*bool, bool)`

GetIsReadyOk returns a tuple with the IsReady field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsReady

`func (o *DynamicTitlesGetStatus) SetIsReady(v bool)`

SetIsReady sets IsReady field to given value.

### HasIsReady

`func (o *DynamicTitlesGetStatus) HasIsReady() bool`

HasIsReady returns a boolean if a field has been set.

### GetReviewedCount

`func (o *DynamicTitlesGetStatus) GetReviewedCount() int32`

GetReviewedCount returns the ReviewedCount field if non-nil, zero value otherwise.

### GetReviewedCountOk

`func (o *DynamicTitlesGetStatus) GetReviewedCountOk() (*int32, bool)`

GetReviewedCountOk returns a tuple with the ReviewedCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewedCount

`func (o *DynamicTitlesGetStatus) SetReviewedCount(v int32)`

SetReviewedCount sets ReviewedCount field to given value.

### HasReviewedCount

`func (o *DynamicTitlesGetStatus) HasReviewedCount() bool`

HasReviewedCount returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


