# BulkDownloadCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignFilter** | Pointer to [**BulkDownloadCampaignFilter**](BulkDownloadCampaignFilter.md) |  | [optional] 
**EntityIds** | Pointer to **[]string** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] 
**EntityTypes** | Pointer to [**[]BulkEntityType**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] 
**OutputFormat** | Pointer to [**BulkOutputFormat**](BulkOutputFormat.md) |  | [optional] [default to JSON]
**UpdatedSince** | Pointer to **string** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] 

## Methods

### NewBulkDownloadCreate

`func NewBulkDownloadCreate() *BulkDownloadCreate`

NewBulkDownloadCreate instantiates a new BulkDownloadCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBulkDownloadCreateWithDefaults

`func NewBulkDownloadCreateWithDefaults() *BulkDownloadCreate`

NewBulkDownloadCreateWithDefaults instantiates a new BulkDownloadCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCampaignFilter

`func (o *BulkDownloadCreate) GetCampaignFilter() BulkDownloadCampaignFilter`

GetCampaignFilter returns the CampaignFilter field if non-nil, zero value otherwise.

### GetCampaignFilterOk

`func (o *BulkDownloadCreate) GetCampaignFilterOk() (*BulkDownloadCampaignFilter, bool)`

GetCampaignFilterOk returns a tuple with the CampaignFilter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignFilter

`func (o *BulkDownloadCreate) SetCampaignFilter(v BulkDownloadCampaignFilter)`

SetCampaignFilter sets CampaignFilter field to given value.

### HasCampaignFilter

`func (o *BulkDownloadCreate) HasCampaignFilter() bool`

HasCampaignFilter returns a boolean if a field has been set.

### GetEntityIds

`func (o *BulkDownloadCreate) GetEntityIds() []string`

GetEntityIds returns the EntityIds field if non-nil, zero value otherwise.

### GetEntityIdsOk

`func (o *BulkDownloadCreate) GetEntityIdsOk() (*[]string, bool)`

GetEntityIdsOk returns a tuple with the EntityIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntityIds

`func (o *BulkDownloadCreate) SetEntityIds(v []string)`

SetEntityIds sets EntityIds field to given value.

### HasEntityIds

`func (o *BulkDownloadCreate) HasEntityIds() bool`

HasEntityIds returns a boolean if a field has been set.

### GetEntityTypes

`func (o *BulkDownloadCreate) GetEntityTypes() []BulkEntityType`

GetEntityTypes returns the EntityTypes field if non-nil, zero value otherwise.

### GetEntityTypesOk

`func (o *BulkDownloadCreate) GetEntityTypesOk() (*[]BulkEntityType, bool)`

GetEntityTypesOk returns a tuple with the EntityTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntityTypes

`func (o *BulkDownloadCreate) SetEntityTypes(v []BulkEntityType)`

SetEntityTypes sets EntityTypes field to given value.

### HasEntityTypes

`func (o *BulkDownloadCreate) HasEntityTypes() bool`

HasEntityTypes returns a boolean if a field has been set.

### GetOutputFormat

`func (o *BulkDownloadCreate) GetOutputFormat() BulkOutputFormat`

GetOutputFormat returns the OutputFormat field if non-nil, zero value otherwise.

### GetOutputFormatOk

`func (o *BulkDownloadCreate) GetOutputFormatOk() (*BulkOutputFormat, bool)`

GetOutputFormatOk returns a tuple with the OutputFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputFormat

`func (o *BulkDownloadCreate) SetOutputFormat(v BulkOutputFormat)`

SetOutputFormat sets OutputFormat field to given value.

### HasOutputFormat

`func (o *BulkDownloadCreate) HasOutputFormat() bool`

HasOutputFormat returns a boolean if a field has been set.

### GetUpdatedSince

`func (o *BulkDownloadCreate) GetUpdatedSince() string`

GetUpdatedSince returns the UpdatedSince field if non-nil, zero value otherwise.

### GetUpdatedSinceOk

`func (o *BulkDownloadCreate) GetUpdatedSinceOk() (*string, bool)`

GetUpdatedSinceOk returns a tuple with the UpdatedSince field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedSince

`func (o *BulkDownloadCreate) SetUpdatedSince(v string)`

SetUpdatedSince sets UpdatedSince field to given value.

### HasUpdatedSince

`func (o *BulkDownloadCreate) HasUpdatedSince() bool`

HasUpdatedSince returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


