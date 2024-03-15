# CampaignCreateResponseItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**CampaignCreateResponseData**](CampaignCreateResponseData.md) |  | [optional] 
**Exceptions** | Pointer to [**[]Exception**](Exception.md) |  | [optional] 

## Methods

### NewCampaignCreateResponseItem

`func NewCampaignCreateResponseItem() *CampaignCreateResponseItem`

NewCampaignCreateResponseItem instantiates a new CampaignCreateResponseItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignCreateResponseItemWithDefaults

`func NewCampaignCreateResponseItemWithDefaults() *CampaignCreateResponseItem`

NewCampaignCreateResponseItemWithDefaults instantiates a new CampaignCreateResponseItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *CampaignCreateResponseItem) GetData() CampaignCreateResponseData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *CampaignCreateResponseItem) GetDataOk() (*CampaignCreateResponseData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *CampaignCreateResponseItem) SetData(v CampaignCreateResponseData)`

SetData sets Data field to given value.

### HasData

`func (o *CampaignCreateResponseItem) HasData() bool`

HasData returns a boolean if a field has been set.

### GetExceptions

`func (o *CampaignCreateResponseItem) GetExceptions() []Exception`

GetExceptions returns the Exceptions field if non-nil, zero value otherwise.

### GetExceptionsOk

`func (o *CampaignCreateResponseItem) GetExceptionsOk() (*[]Exception, bool)`

GetExceptionsOk returns a tuple with the Exceptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExceptions

`func (o *CampaignCreateResponseItem) SetExceptions(v []Exception)`

SetExceptions sets Exceptions field to given value.

### HasExceptions

`func (o *CampaignCreateResponseItem) HasExceptions() bool`

HasExceptions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


