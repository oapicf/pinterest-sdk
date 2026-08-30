# AdPreviewSourceImage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ImageUrl** | **string** | Image URL. | 
**PromotionId** | Pointer to **string** | Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion. | [optional] 
**Title** | **string** | Title displayed below ad. | 

## Methods

### NewAdPreviewSourceImage

`func NewAdPreviewSourceImage(imageUrl string, title string, ) *AdPreviewSourceImage`

NewAdPreviewSourceImage instantiates a new AdPreviewSourceImage object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdPreviewSourceImageWithDefaults

`func NewAdPreviewSourceImageWithDefaults() *AdPreviewSourceImage`

NewAdPreviewSourceImageWithDefaults instantiates a new AdPreviewSourceImage object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetImageUrl

`func (o *AdPreviewSourceImage) GetImageUrl() string`

GetImageUrl returns the ImageUrl field if non-nil, zero value otherwise.

### GetImageUrlOk

`func (o *AdPreviewSourceImage) GetImageUrlOk() (*string, bool)`

GetImageUrlOk returns a tuple with the ImageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageUrl

`func (o *AdPreviewSourceImage) SetImageUrl(v string)`

SetImageUrl sets ImageUrl field to given value.


### GetPromotionId

`func (o *AdPreviewSourceImage) GetPromotionId() string`

GetPromotionId returns the PromotionId field if non-nil, zero value otherwise.

### GetPromotionIdOk

`func (o *AdPreviewSourceImage) GetPromotionIdOk() (*string, bool)`

GetPromotionIdOk returns a tuple with the PromotionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionId

`func (o *AdPreviewSourceImage) SetPromotionId(v string)`

SetPromotionId sets PromotionId field to given value.

### HasPromotionId

`func (o *AdPreviewSourceImage) HasPromotionId() bool`

HasPromotionId returns a boolean if a field has been set.

### GetTitle

`func (o *AdPreviewSourceImage) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *AdPreviewSourceImage) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *AdPreviewSourceImage) SetTitle(v string)`

SetTitle sets Title field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


