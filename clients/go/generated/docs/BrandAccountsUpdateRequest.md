# BrandAccountsUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | Brand Account name | [optional] 
**Username** | Pointer to **string** | Brand Account username | [optional] 
**Country** | Pointer to [**Country**](Country.md) |  | [optional] 
**About** | Pointer to **string** | Brand Account about information | [optional] 
**Website** | Pointer to **string** | Brand Account website | [optional] 
**ProfileImage** | Pointer to [**ImageBase64**](ImageBase64.md) |  | [optional] 

## Methods

### NewBrandAccountsUpdateRequest

`func NewBrandAccountsUpdateRequest() *BrandAccountsUpdateRequest`

NewBrandAccountsUpdateRequest instantiates a new BrandAccountsUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBrandAccountsUpdateRequestWithDefaults

`func NewBrandAccountsUpdateRequestWithDefaults() *BrandAccountsUpdateRequest`

NewBrandAccountsUpdateRequestWithDefaults instantiates a new BrandAccountsUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *BrandAccountsUpdateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BrandAccountsUpdateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BrandAccountsUpdateRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *BrandAccountsUpdateRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### GetUsername

`func (o *BrandAccountsUpdateRequest) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *BrandAccountsUpdateRequest) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *BrandAccountsUpdateRequest) SetUsername(v string)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *BrandAccountsUpdateRequest) HasUsername() bool`

HasUsername returns a boolean if a field has been set.

### GetCountry

`func (o *BrandAccountsUpdateRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *BrandAccountsUpdateRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *BrandAccountsUpdateRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *BrandAccountsUpdateRequest) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetAbout

`func (o *BrandAccountsUpdateRequest) GetAbout() string`

GetAbout returns the About field if non-nil, zero value otherwise.

### GetAboutOk

`func (o *BrandAccountsUpdateRequest) GetAboutOk() (*string, bool)`

GetAboutOk returns a tuple with the About field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAbout

`func (o *BrandAccountsUpdateRequest) SetAbout(v string)`

SetAbout sets About field to given value.

### HasAbout

`func (o *BrandAccountsUpdateRequest) HasAbout() bool`

HasAbout returns a boolean if a field has been set.

### GetWebsite

`func (o *BrandAccountsUpdateRequest) GetWebsite() string`

GetWebsite returns the Website field if non-nil, zero value otherwise.

### GetWebsiteOk

`func (o *BrandAccountsUpdateRequest) GetWebsiteOk() (*string, bool)`

GetWebsiteOk returns a tuple with the Website field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWebsite

`func (o *BrandAccountsUpdateRequest) SetWebsite(v string)`

SetWebsite sets Website field to given value.

### HasWebsite

`func (o *BrandAccountsUpdateRequest) HasWebsite() bool`

HasWebsite returns a boolean if a field has been set.

### GetProfileImage

`func (o *BrandAccountsUpdateRequest) GetProfileImage() ImageBase64`

GetProfileImage returns the ProfileImage field if non-nil, zero value otherwise.

### GetProfileImageOk

`func (o *BrandAccountsUpdateRequest) GetProfileImageOk() (*ImageBase64, bool)`

GetProfileImageOk returns a tuple with the ProfileImage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileImage

`func (o *BrandAccountsUpdateRequest) SetProfileImage(v ImageBase64)`

SetProfileImage sets ProfileImage field to given value.

### HasProfileImage

`func (o *BrandAccountsUpdateRequest) HasProfileImage() bool`

HasProfileImage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


