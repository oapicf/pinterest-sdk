# ImageMetadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemType** | Pointer to **string** |  | [optional] 
**Title** | Pointer to **NullableString** |  | [optional] 
**Description** | Pointer to **NullableString** |  | [optional] 
**Link** | Pointer to **NullableString** |  | [optional] 
**Images** | Pointer to [**ImageMetadataImages**](ImageMetadataImages.md) |  | [optional] 

## Methods

### NewImageMetadata

`func NewImageMetadata() *ImageMetadata`

NewImageMetadata instantiates a new ImageMetadata object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewImageMetadataWithDefaults

`func NewImageMetadataWithDefaults() *ImageMetadata`

NewImageMetadataWithDefaults instantiates a new ImageMetadata object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemType

`func (o *ImageMetadata) GetItemType() string`

GetItemType returns the ItemType field if non-nil, zero value otherwise.

### GetItemTypeOk

`func (o *ImageMetadata) GetItemTypeOk() (*string, bool)`

GetItemTypeOk returns a tuple with the ItemType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemType

`func (o *ImageMetadata) SetItemType(v string)`

SetItemType sets ItemType field to given value.

### HasItemType

`func (o *ImageMetadata) HasItemType() bool`

HasItemType returns a boolean if a field has been set.

### GetTitle

`func (o *ImageMetadata) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *ImageMetadata) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *ImageMetadata) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *ImageMetadata) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### SetTitleNil

`func (o *ImageMetadata) SetTitleNil(b bool)`

 SetTitleNil sets the value for Title to be an explicit nil

### UnsetTitle
`func (o *ImageMetadata) UnsetTitle()`

UnsetTitle ensures that no value is present for Title, not even an explicit nil
### GetDescription

`func (o *ImageMetadata) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ImageMetadata) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ImageMetadata) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ImageMetadata) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *ImageMetadata) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *ImageMetadata) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetLink

`func (o *ImageMetadata) GetLink() string`

GetLink returns the Link field if non-nil, zero value otherwise.

### GetLinkOk

`func (o *ImageMetadata) GetLinkOk() (*string, bool)`

GetLinkOk returns a tuple with the Link field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLink

`func (o *ImageMetadata) SetLink(v string)`

SetLink sets Link field to given value.

### HasLink

`func (o *ImageMetadata) HasLink() bool`

HasLink returns a boolean if a field has been set.

### SetLinkNil

`func (o *ImageMetadata) SetLinkNil(b bool)`

 SetLinkNil sets the value for Link to be an explicit nil

### UnsetLink
`func (o *ImageMetadata) UnsetLink()`

UnsetLink ensures that no value is present for Link, not even an explicit nil
### GetImages

`func (o *ImageMetadata) GetImages() ImageMetadataImages`

GetImages returns the Images field if non-nil, zero value otherwise.

### GetImagesOk

`func (o *ImageMetadata) GetImagesOk() (*ImageMetadataImages, bool)`

GetImagesOk returns a tuple with the Images field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImages

`func (o *ImageMetadata) SetImages(v ImageMetadataImages)`

SetImages sets Images field to given value.

### HasImages

`func (o *ImageMetadata) HasImages() bool`

HasImages returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


