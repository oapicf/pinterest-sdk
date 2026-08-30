# BrandAccountCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**About** | Pointer to **string** | Brand Account about information | [optional] 
**Country** | [**Country**](Country.md) |  | 
**Name** | **string** | Brand Account name | 
**ProfileImage** | Pointer to [**BrandAccountProfileImage**](BrandAccountProfileImage.md) |  | [optional] 
**Username** | **string** | Brand Account username | 
**Website** | Pointer to **string** | Brand Account website | [optional] 

## Methods

### NewBrandAccountCreate

`func NewBrandAccountCreate(country Country, name string, username string, ) *BrandAccountCreate`

NewBrandAccountCreate instantiates a new BrandAccountCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBrandAccountCreateWithDefaults

`func NewBrandAccountCreateWithDefaults() *BrandAccountCreate`

NewBrandAccountCreateWithDefaults instantiates a new BrandAccountCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAbout

`func (o *BrandAccountCreate) GetAbout() string`

GetAbout returns the About field if non-nil, zero value otherwise.

### GetAboutOk

`func (o *BrandAccountCreate) GetAboutOk() (*string, bool)`

GetAboutOk returns a tuple with the About field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAbout

`func (o *BrandAccountCreate) SetAbout(v string)`

SetAbout sets About field to given value.

### HasAbout

`func (o *BrandAccountCreate) HasAbout() bool`

HasAbout returns a boolean if a field has been set.

### GetCountry

`func (o *BrandAccountCreate) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *BrandAccountCreate) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *BrandAccountCreate) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetName

`func (o *BrandAccountCreate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BrandAccountCreate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BrandAccountCreate) SetName(v string)`

SetName sets Name field to given value.


### GetProfileImage

`func (o *BrandAccountCreate) GetProfileImage() BrandAccountProfileImage`

GetProfileImage returns the ProfileImage field if non-nil, zero value otherwise.

### GetProfileImageOk

`func (o *BrandAccountCreate) GetProfileImageOk() (*BrandAccountProfileImage, bool)`

GetProfileImageOk returns a tuple with the ProfileImage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileImage

`func (o *BrandAccountCreate) SetProfileImage(v BrandAccountProfileImage)`

SetProfileImage sets ProfileImage field to given value.

### HasProfileImage

`func (o *BrandAccountCreate) HasProfileImage() bool`

HasProfileImage returns a boolean if a field has been set.

### GetUsername

`func (o *BrandAccountCreate) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *BrandAccountCreate) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *BrandAccountCreate) SetUsername(v string)`

SetUsername sets Username field to given value.


### GetWebsite

`func (o *BrandAccountCreate) GetWebsite() string`

GetWebsite returns the Website field if non-nil, zero value otherwise.

### GetWebsiteOk

`func (o *BrandAccountCreate) GetWebsiteOk() (*string, bool)`

GetWebsiteOk returns a tuple with the Website field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWebsite

`func (o *BrandAccountCreate) SetWebsite(v string)`

SetWebsite sets Website field to given value.

### HasWebsite

`func (o *BrandAccountCreate) HasWebsite() bool`

HasWebsite returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


