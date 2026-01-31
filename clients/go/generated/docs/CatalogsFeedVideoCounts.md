# CatalogsFeedVideoCounts

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IngestedVideos** | Pointer to **int32** | The number of videos successfully ingested from the feed file. | [optional] 
**NotIngestedVideos** | Pointer to **int32** | The number of videos that were not ingested from the feed file. | [optional] 
**TotalVideos** | Pointer to **int32** | The number of videos in the feed file. | [optional] 

## Methods

### NewCatalogsFeedVideoCounts

`func NewCatalogsFeedVideoCounts() *CatalogsFeedVideoCounts`

NewCatalogsFeedVideoCounts instantiates a new CatalogsFeedVideoCounts object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsFeedVideoCountsWithDefaults

`func NewCatalogsFeedVideoCountsWithDefaults() *CatalogsFeedVideoCounts`

NewCatalogsFeedVideoCountsWithDefaults instantiates a new CatalogsFeedVideoCounts object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIngestedVideos

`func (o *CatalogsFeedVideoCounts) GetIngestedVideos() int32`

GetIngestedVideos returns the IngestedVideos field if non-nil, zero value otherwise.

### GetIngestedVideosOk

`func (o *CatalogsFeedVideoCounts) GetIngestedVideosOk() (*int32, bool)`

GetIngestedVideosOk returns a tuple with the IngestedVideos field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIngestedVideos

`func (o *CatalogsFeedVideoCounts) SetIngestedVideos(v int32)`

SetIngestedVideos sets IngestedVideos field to given value.

### HasIngestedVideos

`func (o *CatalogsFeedVideoCounts) HasIngestedVideos() bool`

HasIngestedVideos returns a boolean if a field has been set.

### GetNotIngestedVideos

`func (o *CatalogsFeedVideoCounts) GetNotIngestedVideos() int32`

GetNotIngestedVideos returns the NotIngestedVideos field if non-nil, zero value otherwise.

### GetNotIngestedVideosOk

`func (o *CatalogsFeedVideoCounts) GetNotIngestedVideosOk() (*int32, bool)`

GetNotIngestedVideosOk returns a tuple with the NotIngestedVideos field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotIngestedVideos

`func (o *CatalogsFeedVideoCounts) SetNotIngestedVideos(v int32)`

SetNotIngestedVideos sets NotIngestedVideos field to given value.

### HasNotIngestedVideos

`func (o *CatalogsFeedVideoCounts) HasNotIngestedVideos() bool`

HasNotIngestedVideos returns a boolean if a field has been set.

### GetTotalVideos

`func (o *CatalogsFeedVideoCounts) GetTotalVideos() int32`

GetTotalVideos returns the TotalVideos field if non-nil, zero value otherwise.

### GetTotalVideosOk

`func (o *CatalogsFeedVideoCounts) GetTotalVideosOk() (*int32, bool)`

GetTotalVideosOk returns a tuple with the TotalVideos field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalVideos

`func (o *CatalogsFeedVideoCounts) SetTotalVideos(v int32)`

SetTotalVideos sets TotalVideos field to given value.

### HasTotalVideos

`func (o *CatalogsFeedVideoCounts) HasTotalVideos() bool`

HasTotalVideos returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


