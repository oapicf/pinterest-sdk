# BulkCampaignDeliveryEstimatesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**[]BulkCampaignDeliveryEstimatesItem**](BulkCampaignDeliveryEstimatesItem.md) | Per-campaign delivery estimate results, in the same order as the request. | 

## Methods

### NewBulkCampaignDeliveryEstimatesResponse

`func NewBulkCampaignDeliveryEstimatesResponse(data []BulkCampaignDeliveryEstimatesItem, ) *BulkCampaignDeliveryEstimatesResponse`

NewBulkCampaignDeliveryEstimatesResponse instantiates a new BulkCampaignDeliveryEstimatesResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBulkCampaignDeliveryEstimatesResponseWithDefaults

`func NewBulkCampaignDeliveryEstimatesResponseWithDefaults() *BulkCampaignDeliveryEstimatesResponse`

NewBulkCampaignDeliveryEstimatesResponseWithDefaults instantiates a new BulkCampaignDeliveryEstimatesResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *BulkCampaignDeliveryEstimatesResponse) GetData() []BulkCampaignDeliveryEstimatesItem`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *BulkCampaignDeliveryEstimatesResponse) GetDataOk() (*[]BulkCampaignDeliveryEstimatesItem, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *BulkCampaignDeliveryEstimatesResponse) SetData(v []BulkCampaignDeliveryEstimatesItem)`

SetData sets Data field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


