# BrandAccountUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**About** | Pointer to **string** | Brand Account about information | [optional] 
**Country** | Pointer to [**Country**](Country.md) |  | [optional] 
**Name** | Pointer to **string** | Brand Account name | [optional] 
**ProfileImage** | Pointer to [**BrandAccountProfileImageUpdate**](BrandAccountProfileImageUpdate.md) |  | [optional] 
**Username** | Pointer to **string** | Brand Account username | [optional] 
**Website** | Pointer to **string** | Brand Account website | [optional] 

## Methods

### NewBrandAccountUpdate

`func NewBrandAccountUpdate() *BrandAccountUpdate`

NewBrandAccountUpdate instantiates a new BrandAccountUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBrandAccountUpdateWithDefaults

`func NewBrandAccountUpdateWithDefaults() *BrandAccountUpdate`

NewBrandAccountUpdateWithDefaults instantiates a new BrandAccountUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAbout

`func (o *BrandAccountUpdate) GetAbout() string`

GetAbout returns the About field if non-nil, zero value otherwise.

### GetAboutOk

`func (o *BrandAccountUpdate) GetAboutOk() (*string, bool)`

GetAboutOk returns a tuple with the About field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAbout

`func (o *BrandAccountUpdate) SetAbout(v string)`

SetAbout sets About field to given value.

### HasAbout

`func (o *BrandAccountUpdate) HasAbout() bool`

HasAbout returns a boolean if a field has been set.

### GetCountry

`func (o *BrandAccountUpdate) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *BrandAccountUpdate) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *BrandAccountUpdate) SetCountry(v Country)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *BrandAccountUpdate) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetName

`func (o *BrandAccountUpdate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BrandAccountUpdate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BrandAccountUpdate) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *BrandAccountUpdate) HasName() bool`

HasName returns a boolean if a field has been set.

### GetProfileImage

`func (o *BrandAccountUpdate) GetProfileImage() BrandAccountProfileImageUpdate`

GetProfileImage returns the ProfileImage field if non-nil, zero value otherwise.

### GetProfileImageOk

`func (o *BrandAccountUpdate) GetProfileImageOk() (*BrandAccountProfileImageUpdate, bool)`

GetProfileImageOk returns a tuple with the ProfileImage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileImage

`func (o *BrandAccountUpdate) SetProfileImage(v BrandAccountProfileImageUpdate)`

SetProfileImage sets ProfileImage field to given value.

### HasProfileImage

`func (o *BrandAccountUpdate) HasProfileImage() bool`

HasProfileImage returns a boolean if a field has been set.

### GetUsername

`func (o *BrandAccountUpdate) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *BrandAccountUpdate) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *BrandAccountUpdate) SetUsername(v string)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *BrandAccountUpdate) HasUsername() bool`

HasUsername returns a boolean if a field has been set.

### GetWebsite

`func (o *BrandAccountUpdate) GetWebsite() string`

GetWebsite returns the Website field if non-nil, zero value otherwise.

### GetWebsiteOk

`func (o *BrandAccountUpdate) GetWebsiteOk() (*string, bool)`

GetWebsiteOk returns a tuple with the Website field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWebsite

`func (o *BrandAccountUpdate) SetWebsite(v string)`

SetWebsite sets Website field to given value.

### HasWebsite

`func (o *BrandAccountUpdate) HasWebsite() bool`

HasWebsite returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


