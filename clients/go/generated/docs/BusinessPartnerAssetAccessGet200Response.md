# BusinessPartnerAssetAccessGet200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]GetPartnerAssetsResponse**](GetPartnerAssetsResponse.md) | List assets on which you granted access to your partner or assets on which your partner has granted you access. | 
**Bookmark** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewBusinessPartnerAssetAccessGet200Response

`func NewBusinessPartnerAssetAccessGet200Response(items []GetPartnerAssetsResponse, ) *BusinessPartnerAssetAccessGet200Response`

NewBusinessPartnerAssetAccessGet200Response instantiates a new BusinessPartnerAssetAccessGet200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBusinessPartnerAssetAccessGet200ResponseWithDefaults

`func NewBusinessPartnerAssetAccessGet200ResponseWithDefaults() *BusinessPartnerAssetAccessGet200Response`

NewBusinessPartnerAssetAccessGet200ResponseWithDefaults instantiates a new BusinessPartnerAssetAccessGet200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *BusinessPartnerAssetAccessGet200Response) GetItems() []GetPartnerAssetsResponse`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *BusinessPartnerAssetAccessGet200Response) GetItemsOk() (*[]GetPartnerAssetsResponse, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *BusinessPartnerAssetAccessGet200Response) SetItems(v []GetPartnerAssetsResponse)`

SetItems sets Items field to given value.


### GetBookmark

`func (o *BusinessPartnerAssetAccessGet200Response) GetBookmark() string`

GetBookmark returns the Bookmark field if non-nil, zero value otherwise.

### GetBookmarkOk

`func (o *BusinessPartnerAssetAccessGet200Response) GetBookmarkOk() (*string, bool)`

GetBookmarkOk returns a tuple with the Bookmark field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBookmark

`func (o *BusinessPartnerAssetAccessGet200Response) SetBookmark(v string)`

SetBookmark sets Bookmark field to given value.

### HasBookmark

`func (o *BusinessPartnerAssetAccessGet200Response) HasBookmark() bool`

HasBookmark returns a boolean if a field has been set.

### SetBookmarkNil

`func (o *BusinessPartnerAssetAccessGet200Response) SetBookmarkNil(b bool)`

 SetBookmarkNil sets the value for Bookmark to be an explicit nil

### UnsetBookmark
`func (o *BusinessPartnerAssetAccessGet200Response) UnsetBookmark()`

UnsetBookmark ensures that no value is present for Bookmark, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


