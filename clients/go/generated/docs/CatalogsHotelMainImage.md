# CatalogsHotelMainImage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Link** | Pointer to **string** | &lt;&#x3D; 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://. | [optional] 
**Tag** | Pointer to **[]string** | Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image | [optional] 

## Methods

### NewCatalogsHotelMainImage

`func NewCatalogsHotelMainImage() *CatalogsHotelMainImage`

NewCatalogsHotelMainImage instantiates a new CatalogsHotelMainImage object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsHotelMainImageWithDefaults

`func NewCatalogsHotelMainImageWithDefaults() *CatalogsHotelMainImage`

NewCatalogsHotelMainImageWithDefaults instantiates a new CatalogsHotelMainImage object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLink

`func (o *CatalogsHotelMainImage) GetLink() string`

GetLink returns the Link field if non-nil, zero value otherwise.

### GetLinkOk

`func (o *CatalogsHotelMainImage) GetLinkOk() (*string, bool)`

GetLinkOk returns a tuple with the Link field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLink

`func (o *CatalogsHotelMainImage) SetLink(v string)`

SetLink sets Link field to given value.

### HasLink

`func (o *CatalogsHotelMainImage) HasLink() bool`

HasLink returns a boolean if a field has been set.

### GetTag

`func (o *CatalogsHotelMainImage) GetTag() []string`

GetTag returns the Tag field if non-nil, zero value otherwise.

### GetTagOk

`func (o *CatalogsHotelMainImage) GetTagOk() (*[]string, bool)`

GetTagOk returns a tuple with the Tag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTag

`func (o *CatalogsHotelMainImage) SetTag(v []string)`

SetTag sets Tag field to given value.

### HasTag

`func (o *CatalogsHotelMainImage) HasTag() bool`

HasTag returns a boolean if a field has been set.

### SetTagNil

`func (o *CatalogsHotelMainImage) SetTagNil(b bool)`

 SetTagNil sets the value for Tag to be an explicit nil

### UnsetTag
`func (o *CatalogsHotelMainImage) UnsetTag()`

UnsetTag ensures that no value is present for Tag, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


