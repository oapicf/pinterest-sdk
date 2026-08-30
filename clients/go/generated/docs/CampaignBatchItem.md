# CampaignBatchItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**CampaignBatchResponseData**](CampaignBatchResponseData.md) | Campaign data on success. | [optional] 
**Exceptions** | Pointer to [**[]Exception**](Exception.md) | Exceptions on failure. | [optional] 

## Methods

### NewCampaignBatchItem

`func NewCampaignBatchItem() *CampaignBatchItem`

NewCampaignBatchItem instantiates a new CampaignBatchItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignBatchItemWithDefaults

`func NewCampaignBatchItemWithDefaults() *CampaignBatchItem`

NewCampaignBatchItemWithDefaults instantiates a new CampaignBatchItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *CampaignBatchItem) GetData() CampaignBatchResponseData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *CampaignBatchItem) GetDataOk() (*CampaignBatchResponseData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *CampaignBatchItem) SetData(v CampaignBatchResponseData)`

SetData sets Data field to given value.

### HasData

`func (o *CampaignBatchItem) HasData() bool`

HasData returns a boolean if a field has been set.

### GetExceptions

`func (o *CampaignBatchItem) GetExceptions() []Exception`

GetExceptions returns the Exceptions field if non-nil, zero value otherwise.

### GetExceptionsOk

`func (o *CampaignBatchItem) GetExceptionsOk() (*[]Exception, bool)`

GetExceptionsOk returns a tuple with the Exceptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExceptions

`func (o *CampaignBatchItem) SetExceptions(v []Exception)`

SetExceptions sets Exceptions field to given value.

### HasExceptions

`func (o *CampaignBatchItem) HasExceptions() bool`

HasExceptions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


