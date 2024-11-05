# CatalogsFeedIngestion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | 
**FeedId** | **string** |  | 
**CreatedAt** | **time.Time** |  | 
**Status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  | 

## Methods

### NewCatalogsFeedIngestion

`func NewCatalogsFeedIngestion(id string, feedId string, createdAt time.Time, status CatalogsFeedProcessingStatus, ) *CatalogsFeedIngestion`

NewCatalogsFeedIngestion instantiates a new CatalogsFeedIngestion object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsFeedIngestionWithDefaults

`func NewCatalogsFeedIngestionWithDefaults() *CatalogsFeedIngestion`

NewCatalogsFeedIngestionWithDefaults instantiates a new CatalogsFeedIngestion object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CatalogsFeedIngestion) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CatalogsFeedIngestion) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CatalogsFeedIngestion) SetId(v string)`

SetId sets Id field to given value.


### GetFeedId

`func (o *CatalogsFeedIngestion) GetFeedId() string`

GetFeedId returns the FeedId field if non-nil, zero value otherwise.

### GetFeedIdOk

`func (o *CatalogsFeedIngestion) GetFeedIdOk() (*string, bool)`

GetFeedIdOk returns a tuple with the FeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedId

`func (o *CatalogsFeedIngestion) SetFeedId(v string)`

SetFeedId sets FeedId field to given value.


### GetCreatedAt

`func (o *CatalogsFeedIngestion) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *CatalogsFeedIngestion) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *CatalogsFeedIngestion) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.


### GetStatus

`func (o *CatalogsFeedIngestion) GetStatus() CatalogsFeedProcessingStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CatalogsFeedIngestion) GetStatusOk() (*CatalogsFeedProcessingStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CatalogsFeedIngestion) SetStatus(v CatalogsFeedProcessingStatus)`

SetStatus sets Status field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


