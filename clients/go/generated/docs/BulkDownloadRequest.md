# BulkDownloadRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntityTypes** | Pointer to [**[]BulkEntityType**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] 
**EntityIds** | Pointer to **[]string** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] 
**UpdatedSince** | Pointer to **string** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] 
**CampaignFilter** | Pointer to [**BulkDownloadRequestCampaignFilter**](BulkDownloadRequestCampaignFilter.md) |  | [optional] 
**OutputFormat** | Pointer to [**BulkOutputFormat**](BulkOutputFormat.md) |  | [optional] [default to JSON]

## Methods

### NewBulkDownloadRequest

`func NewBulkDownloadRequest() *BulkDownloadRequest`

NewBulkDownloadRequest instantiates a new BulkDownloadRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBulkDownloadRequestWithDefaults

`func NewBulkDownloadRequestWithDefaults() *BulkDownloadRequest`

NewBulkDownloadRequestWithDefaults instantiates a new BulkDownloadRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntityTypes

`func (o *BulkDownloadRequest) GetEntityTypes() []BulkEntityType`

GetEntityTypes returns the EntityTypes field if non-nil, zero value otherwise.

### GetEntityTypesOk

`func (o *BulkDownloadRequest) GetEntityTypesOk() (*[]BulkEntityType, bool)`

GetEntityTypesOk returns a tuple with the EntityTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntityTypes

`func (o *BulkDownloadRequest) SetEntityTypes(v []BulkEntityType)`

SetEntityTypes sets EntityTypes field to given value.

### HasEntityTypes

`func (o *BulkDownloadRequest) HasEntityTypes() bool`

HasEntityTypes returns a boolean if a field has been set.

### GetEntityIds

`func (o *BulkDownloadRequest) GetEntityIds() []string`

GetEntityIds returns the EntityIds field if non-nil, zero value otherwise.

### GetEntityIdsOk

`func (o *BulkDownloadRequest) GetEntityIdsOk() (*[]string, bool)`

GetEntityIdsOk returns a tuple with the EntityIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntityIds

`func (o *BulkDownloadRequest) SetEntityIds(v []string)`

SetEntityIds sets EntityIds field to given value.

### HasEntityIds

`func (o *BulkDownloadRequest) HasEntityIds() bool`

HasEntityIds returns a boolean if a field has been set.

### GetUpdatedSince

`func (o *BulkDownloadRequest) GetUpdatedSince() string`

GetUpdatedSince returns the UpdatedSince field if non-nil, zero value otherwise.

### GetUpdatedSinceOk

`func (o *BulkDownloadRequest) GetUpdatedSinceOk() (*string, bool)`

GetUpdatedSinceOk returns a tuple with the UpdatedSince field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedSince

`func (o *BulkDownloadRequest) SetUpdatedSince(v string)`

SetUpdatedSince sets UpdatedSince field to given value.

### HasUpdatedSince

`func (o *BulkDownloadRequest) HasUpdatedSince() bool`

HasUpdatedSince returns a boolean if a field has been set.

### GetCampaignFilter

`func (o *BulkDownloadRequest) GetCampaignFilter() BulkDownloadRequestCampaignFilter`

GetCampaignFilter returns the CampaignFilter field if non-nil, zero value otherwise.

### GetCampaignFilterOk

`func (o *BulkDownloadRequest) GetCampaignFilterOk() (*BulkDownloadRequestCampaignFilter, bool)`

GetCampaignFilterOk returns a tuple with the CampaignFilter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignFilter

`func (o *BulkDownloadRequest) SetCampaignFilter(v BulkDownloadRequestCampaignFilter)`

SetCampaignFilter sets CampaignFilter field to given value.

### HasCampaignFilter

`func (o *BulkDownloadRequest) HasCampaignFilter() bool`

HasCampaignFilter returns a boolean if a field has been set.

### GetOutputFormat

`func (o *BulkDownloadRequest) GetOutputFormat() BulkOutputFormat`

GetOutputFormat returns the OutputFormat field if non-nil, zero value otherwise.

### GetOutputFormatOk

`func (o *BulkDownloadRequest) GetOutputFormatOk() (*BulkOutputFormat, bool)`

GetOutputFormatOk returns a tuple with the OutputFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputFormat

`func (o *BulkDownloadRequest) SetOutputFormat(v BulkOutputFormat)`

SetOutputFormat sets OutputFormat field to given value.

### HasOutputFormat

`func (o *BulkDownloadRequest) HasOutputFormat() bool`

HasOutputFormat returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


