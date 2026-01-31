# BrandAccountsCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Brand Account name | 
**Username** | **string** | Brand Account username | 
**Country** | [**Country**](Country.md) |  | 
**About** | Pointer to **string** | Brand Account about information | [optional] 
**Website** | Pointer to **string** | Brand Account website | [optional] 
**ProfileImage** | Pointer to [**ImageBase64**](ImageBase64.md) |  | [optional] 

## Methods

### NewBrandAccountsCreateRequest

`func NewBrandAccountsCreateRequest(name string, username string, country Country, ) *BrandAccountsCreateRequest`

NewBrandAccountsCreateRequest instantiates a new BrandAccountsCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBrandAccountsCreateRequestWithDefaults

`func NewBrandAccountsCreateRequestWithDefaults() *BrandAccountsCreateRequest`

NewBrandAccountsCreateRequestWithDefaults instantiates a new BrandAccountsCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *BrandAccountsCreateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BrandAccountsCreateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BrandAccountsCreateRequest) SetName(v string)`

SetName sets Name field to given value.


### GetUsername

`func (o *BrandAccountsCreateRequest) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *BrandAccountsCreateRequest) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *BrandAccountsCreateRequest) SetUsername(v string)`

SetUsername sets Username field to given value.


### GetCountry

`func (o *BrandAccountsCreateRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *BrandAccountsCreateRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *BrandAccountsCreateRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetAbout

`func (o *BrandAccountsCreateRequest) GetAbout() string`

GetAbout returns the About field if non-nil, zero value otherwise.

### GetAboutOk

`func (o *BrandAccountsCreateRequest) GetAboutOk() (*string, bool)`

GetAboutOk returns a tuple with the About field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAbout

`func (o *BrandAccountsCreateRequest) SetAbout(v string)`

SetAbout sets About field to given value.

### HasAbout

`func (o *BrandAccountsCreateRequest) HasAbout() bool`

HasAbout returns a boolean if a field has been set.

### GetWebsite

`func (o *BrandAccountsCreateRequest) GetWebsite() string`

GetWebsite returns the Website field if non-nil, zero value otherwise.

### GetWebsiteOk

`func (o *BrandAccountsCreateRequest) GetWebsiteOk() (*string, bool)`

GetWebsiteOk returns a tuple with the Website field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWebsite

`func (o *BrandAccountsCreateRequest) SetWebsite(v string)`

SetWebsite sets Website field to given value.

### HasWebsite

`func (o *BrandAccountsCreateRequest) HasWebsite() bool`

HasWebsite returns a boolean if a field has been set.

### GetProfileImage

`func (o *BrandAccountsCreateRequest) GetProfileImage() ImageBase64`

GetProfileImage returns the ProfileImage field if non-nil, zero value otherwise.

### GetProfileImageOk

`func (o *BrandAccountsCreateRequest) GetProfileImageOk() (*ImageBase64, bool)`

GetProfileImageOk returns a tuple with the ProfileImage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileImage

`func (o *BrandAccountsCreateRequest) SetProfileImage(v ImageBase64)`

SetProfileImage sets ProfileImage field to given value.

### HasProfileImage

`func (o *BrandAccountsCreateRequest) HasProfileImage() bool`

HasProfileImage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


