# AppsflyerAudienceCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | The name of the audience | 
**Platform** | [**AppsflyerPlatform**](AppsflyerPlatform.md) | The platform of the audience | 

## Methods

### NewAppsflyerAudienceCreate

`func NewAppsflyerAudienceCreate(name string, platform AppsflyerPlatform, ) *AppsflyerAudienceCreate`

NewAppsflyerAudienceCreate instantiates a new AppsflyerAudienceCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAppsflyerAudienceCreateWithDefaults

`func NewAppsflyerAudienceCreateWithDefaults() *AppsflyerAudienceCreate`

NewAppsflyerAudienceCreateWithDefaults instantiates a new AppsflyerAudienceCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *AppsflyerAudienceCreate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AppsflyerAudienceCreate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AppsflyerAudienceCreate) SetName(v string)`

SetName sets Name field to given value.


### GetPlatform

`func (o *AppsflyerAudienceCreate) GetPlatform() AppsflyerPlatform`

GetPlatform returns the Platform field if non-nil, zero value otherwise.

### GetPlatformOk

`func (o *AppsflyerAudienceCreate) GetPlatformOk() (*AppsflyerPlatform, bool)`

GetPlatformOk returns a tuple with the Platform field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlatform

`func (o *AppsflyerAudienceCreate) SetPlatform(v AppsflyerPlatform)`

SetPlatform sets Platform field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


