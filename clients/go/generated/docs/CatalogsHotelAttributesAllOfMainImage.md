# CatalogsHotelAttributesAllOfMainImage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Link** | Pointer to **string** | &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.&lt;/p&gt; | [optional] 
**Tag** | Pointer to **[]string** | Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image | [optional] 

## Methods

### NewCatalogsHotelAttributesAllOfMainImage

`func NewCatalogsHotelAttributesAllOfMainImage() *CatalogsHotelAttributesAllOfMainImage`

NewCatalogsHotelAttributesAllOfMainImage instantiates a new CatalogsHotelAttributesAllOfMainImage object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsHotelAttributesAllOfMainImageWithDefaults

`func NewCatalogsHotelAttributesAllOfMainImageWithDefaults() *CatalogsHotelAttributesAllOfMainImage`

NewCatalogsHotelAttributesAllOfMainImageWithDefaults instantiates a new CatalogsHotelAttributesAllOfMainImage object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLink

`func (o *CatalogsHotelAttributesAllOfMainImage) GetLink() string`

GetLink returns the Link field if non-nil, zero value otherwise.

### GetLinkOk

`func (o *CatalogsHotelAttributesAllOfMainImage) GetLinkOk() (*string, bool)`

GetLinkOk returns a tuple with the Link field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLink

`func (o *CatalogsHotelAttributesAllOfMainImage) SetLink(v string)`

SetLink sets Link field to given value.

### HasLink

`func (o *CatalogsHotelAttributesAllOfMainImage) HasLink() bool`

HasLink returns a boolean if a field has been set.

### GetTag

`func (o *CatalogsHotelAttributesAllOfMainImage) GetTag() []string`

GetTag returns the Tag field if non-nil, zero value otherwise.

### GetTagOk

`func (o *CatalogsHotelAttributesAllOfMainImage) GetTagOk() (*[]string, bool)`

GetTagOk returns a tuple with the Tag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTag

`func (o *CatalogsHotelAttributesAllOfMainImage) SetTag(v []string)`

SetTag sets Tag field to given value.

### HasTag

`func (o *CatalogsHotelAttributesAllOfMainImage) HasTag() bool`

HasTag returns a boolean if a field has been set.

### SetTagNil

`func (o *CatalogsHotelAttributesAllOfMainImage) SetTagNil(b bool)`

 SetTagNil sets the value for Tag to be an explicit nil

### UnsetTag
`func (o *CatalogsHotelAttributesAllOfMainImage) UnsetTag()`

UnsetTag ensures that no value is present for Tag, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


