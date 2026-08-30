# AppsflyerAudience

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ContainerId** | **string** | The ID of the audience container | [readonly] 
**Name** | **string** | The name of the audience | 
**Platform** | [**AppsflyerPlatform**](AppsflyerPlatform.md) | The platform of the audience | 

## Methods

### NewAppsflyerAudience

`func NewAppsflyerAudience(containerId string, name string, platform AppsflyerPlatform, ) *AppsflyerAudience`

NewAppsflyerAudience instantiates a new AppsflyerAudience object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAppsflyerAudienceWithDefaults

`func NewAppsflyerAudienceWithDefaults() *AppsflyerAudience`

NewAppsflyerAudienceWithDefaults instantiates a new AppsflyerAudience object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContainerId

`func (o *AppsflyerAudience) GetContainerId() string`

GetContainerId returns the ContainerId field if non-nil, zero value otherwise.

### GetContainerIdOk

`func (o *AppsflyerAudience) GetContainerIdOk() (*string, bool)`

GetContainerIdOk returns a tuple with the ContainerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContainerId

`func (o *AppsflyerAudience) SetContainerId(v string)`

SetContainerId sets ContainerId field to given value.


### GetName

`func (o *AppsflyerAudience) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AppsflyerAudience) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AppsflyerAudience) SetName(v string)`

SetName sets Name field to given value.


### GetPlatform

`func (o *AppsflyerAudience) GetPlatform() AppsflyerPlatform`

GetPlatform returns the Platform field if non-nil, zero value otherwise.

### GetPlatformOk

`func (o *AppsflyerAudience) GetPlatformOk() (*AppsflyerPlatform, bool)`

GetPlatformOk returns a tuple with the Platform field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlatform

`func (o *AppsflyerAudience) SetPlatform(v AppsflyerPlatform)`

SetPlatform sets Platform field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


