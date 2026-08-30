# CatalogsAiContentDisclosure

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Disclosure** | [**[]CatalogsAiContentDisclosureLabel**](CatalogsAiContentDisclosureLabel.md) | Disclosure labels that apply to this asset. | 
**Url** | **string** | URL of the asset. Must match one of image_link, additional_image_link, or video_link. | 

## Methods

### NewCatalogsAiContentDisclosure

`func NewCatalogsAiContentDisclosure(disclosure []CatalogsAiContentDisclosureLabel, url string, ) *CatalogsAiContentDisclosure`

NewCatalogsAiContentDisclosure instantiates a new CatalogsAiContentDisclosure object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsAiContentDisclosureWithDefaults

`func NewCatalogsAiContentDisclosureWithDefaults() *CatalogsAiContentDisclosure`

NewCatalogsAiContentDisclosureWithDefaults instantiates a new CatalogsAiContentDisclosure object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDisclosure

`func (o *CatalogsAiContentDisclosure) GetDisclosure() []CatalogsAiContentDisclosureLabel`

GetDisclosure returns the Disclosure field if non-nil, zero value otherwise.

### GetDisclosureOk

`func (o *CatalogsAiContentDisclosure) GetDisclosureOk() (*[]CatalogsAiContentDisclosureLabel, bool)`

GetDisclosureOk returns a tuple with the Disclosure field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisclosure

`func (o *CatalogsAiContentDisclosure) SetDisclosure(v []CatalogsAiContentDisclosureLabel)`

SetDisclosure sets Disclosure field to given value.


### GetUrl

`func (o *CatalogsAiContentDisclosure) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *CatalogsAiContentDisclosure) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *CatalogsAiContentDisclosure) SetUrl(v string)`

SetUrl sets Url field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


