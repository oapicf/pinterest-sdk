# BusinessMemberAssetsGetResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | Pointer to **NullableString** |  | [optional] 
**Items** | [**[]AssetIdPermissions**](AssetIdPermissions.md) |  | 
**TotalDataCount** | **int32** | Total number of assets matching the query | 
**TotalDataCountByStatus** | Pointer to [**TotalCountByEntityStatus**](TotalCountByEntityStatus.md) | Breakdown of asset counts by entity status (ad accounts only) | [optional] 

## Methods

### NewBusinessMemberAssetsGetResponse

`func NewBusinessMemberAssetsGetResponse(items []AssetIdPermissions, totalDataCount int32, ) *BusinessMemberAssetsGetResponse`

NewBusinessMemberAssetsGetResponse instantiates a new BusinessMemberAssetsGetResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBusinessMemberAssetsGetResponseWithDefaults

`func NewBusinessMemberAssetsGetResponseWithDefaults() *BusinessMemberAssetsGetResponse`

NewBusinessMemberAssetsGetResponseWithDefaults instantiates a new BusinessMemberAssetsGetResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBookmark

`func (o *BusinessMemberAssetsGetResponse) GetBookmark() string`

GetBookmark returns the Bookmark field if non-nil, zero value otherwise.

### GetBookmarkOk

`func (o *BusinessMemberAssetsGetResponse) GetBookmarkOk() (*string, bool)`

GetBookmarkOk returns a tuple with the Bookmark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBookmark

`func (o *BusinessMemberAssetsGetResponse) SetBookmark(v string)`

SetBookmark sets Bookmark field to given value.

### HasBookmark

`func (o *BusinessMemberAssetsGetResponse) HasBookmark() bool`

HasBookmark returns a boolean if a field has been set.

### SetBookmarkNil

`func (o *BusinessMemberAssetsGetResponse) SetBookmarkNil(b bool)`

 SetBookmarkNil sets the value for Bookmark to be an explicit nil

### UnsetBookmark
`func (o *BusinessMemberAssetsGetResponse) UnsetBookmark()`

UnsetBookmark ensures that no value is present for Bookmark, not even an explicit nil
### GetItems

`func (o *BusinessMemberAssetsGetResponse) GetItems() []AssetIdPermissions`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *BusinessMemberAssetsGetResponse) GetItemsOk() (*[]AssetIdPermissions, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *BusinessMemberAssetsGetResponse) SetItems(v []AssetIdPermissions)`

SetItems sets Items field to given value.


### GetTotalDataCount

`func (o *BusinessMemberAssetsGetResponse) GetTotalDataCount() int32`

GetTotalDataCount returns the TotalDataCount field if non-nil, zero value otherwise.

### GetTotalDataCountOk

`func (o *BusinessMemberAssetsGetResponse) GetTotalDataCountOk() (*int32, bool)`

GetTotalDataCountOk returns a tuple with the TotalDataCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalDataCount

`func (o *BusinessMemberAssetsGetResponse) SetTotalDataCount(v int32)`

SetTotalDataCount sets TotalDataCount field to given value.


### GetTotalDataCountByStatus

`func (o *BusinessMemberAssetsGetResponse) GetTotalDataCountByStatus() TotalCountByEntityStatus`

GetTotalDataCountByStatus returns the TotalDataCountByStatus field if non-nil, zero value otherwise.

### GetTotalDataCountByStatusOk

`func (o *BusinessMemberAssetsGetResponse) GetTotalDataCountByStatusOk() (*TotalCountByEntityStatus, bool)`

GetTotalDataCountByStatusOk returns a tuple with the TotalDataCountByStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalDataCountByStatus

`func (o *BusinessMemberAssetsGetResponse) SetTotalDataCountByStatus(v TotalCountByEntityStatus)`

SetTotalDataCountByStatus sets TotalDataCountByStatus field to given value.

### HasTotalDataCountByStatus

`func (o *BusinessMemberAssetsGetResponse) HasTotalDataCountByStatus() bool`

HasTotalDataCountByStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


