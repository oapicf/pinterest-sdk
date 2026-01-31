# ConversionTag

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CodeSnippet** | Pointer to **string** | Tag code snippet. | [optional] [readonly] 
**Configs** | Pointer to [**ConversionTagConfigs**](ConversionTagConfigs.md) |  | [optional] [readonly] 
**EnhancedMatchStatus** | Pointer to [**NullableEnhancedMatchStatusType**](EnhancedMatchStatusType.md) | The enhanced match status of the tag | [optional] [readonly] 
**Id** | Pointer to **string** | Tag ID. | [optional] [readonly] 
**LastFiredTimeMs** | Pointer to **NullableFloat32** | Time for the last event fired. | [optional] [readonly] 
**Name** | **string** | Conversion tag name. | 
**Version** | Pointer to **string** | Version number. | [optional] [readonly] 
**AdAccountId** | **string** | Ad account ID. | [readonly] 
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) |  | [optional] [readonly] 

## Methods

### NewConversionTag

`func NewConversionTag(name string, adAccountId string, ) *ConversionTag`

NewConversionTag instantiates a new ConversionTag object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionTagWithDefaults

`func NewConversionTagWithDefaults() *ConversionTag`

NewConversionTagWithDefaults instantiates a new ConversionTag object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCodeSnippet

`func (o *ConversionTag) GetCodeSnippet() string`

GetCodeSnippet returns the CodeSnippet field if non-nil, zero value otherwise.

### GetCodeSnippetOk

`func (o *ConversionTag) GetCodeSnippetOk() (*string, bool)`

GetCodeSnippetOk returns a tuple with the CodeSnippet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCodeSnippet

`func (o *ConversionTag) SetCodeSnippet(v string)`

SetCodeSnippet sets CodeSnippet field to given value.

### HasCodeSnippet

`func (o *ConversionTag) HasCodeSnippet() bool`

HasCodeSnippet returns a boolean if a field has been set.

### GetConfigs

`func (o *ConversionTag) GetConfigs() ConversionTagConfigs`

GetConfigs returns the Configs field if non-nil, zero value otherwise.

### GetConfigsOk

`func (o *ConversionTag) GetConfigsOk() (*ConversionTagConfigs, bool)`

GetConfigsOk returns a tuple with the Configs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConfigs

`func (o *ConversionTag) SetConfigs(v ConversionTagConfigs)`

SetConfigs sets Configs field to given value.

### HasConfigs

`func (o *ConversionTag) HasConfigs() bool`

HasConfigs returns a boolean if a field has been set.

### GetEnhancedMatchStatus

`func (o *ConversionTag) GetEnhancedMatchStatus() EnhancedMatchStatusType`

GetEnhancedMatchStatus returns the EnhancedMatchStatus field if non-nil, zero value otherwise.

### GetEnhancedMatchStatusOk

`func (o *ConversionTag) GetEnhancedMatchStatusOk() (*EnhancedMatchStatusType, bool)`

GetEnhancedMatchStatusOk returns a tuple with the EnhancedMatchStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnhancedMatchStatus

`func (o *ConversionTag) SetEnhancedMatchStatus(v EnhancedMatchStatusType)`

SetEnhancedMatchStatus sets EnhancedMatchStatus field to given value.

### HasEnhancedMatchStatus

`func (o *ConversionTag) HasEnhancedMatchStatus() bool`

HasEnhancedMatchStatus returns a boolean if a field has been set.

### SetEnhancedMatchStatusNil

`func (o *ConversionTag) SetEnhancedMatchStatusNil(b bool)`

 SetEnhancedMatchStatusNil sets the value for EnhancedMatchStatus to be an explicit nil

### UnsetEnhancedMatchStatus
`func (o *ConversionTag) UnsetEnhancedMatchStatus()`

UnsetEnhancedMatchStatus ensures that no value is present for EnhancedMatchStatus, not even an explicit nil
### GetId

`func (o *ConversionTag) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ConversionTag) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ConversionTag) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *ConversionTag) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLastFiredTimeMs

`func (o *ConversionTag) GetLastFiredTimeMs() float32`

GetLastFiredTimeMs returns the LastFiredTimeMs field if non-nil, zero value otherwise.

### GetLastFiredTimeMsOk

`func (o *ConversionTag) GetLastFiredTimeMsOk() (*float32, bool)`

GetLastFiredTimeMsOk returns a tuple with the LastFiredTimeMs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastFiredTimeMs

`func (o *ConversionTag) SetLastFiredTimeMs(v float32)`

SetLastFiredTimeMs sets LastFiredTimeMs field to given value.

### HasLastFiredTimeMs

`func (o *ConversionTag) HasLastFiredTimeMs() bool`

HasLastFiredTimeMs returns a boolean if a field has been set.

### SetLastFiredTimeMsNil

`func (o *ConversionTag) SetLastFiredTimeMsNil(b bool)`

 SetLastFiredTimeMsNil sets the value for LastFiredTimeMs to be an explicit nil

### UnsetLastFiredTimeMs
`func (o *ConversionTag) UnsetLastFiredTimeMs()`

UnsetLastFiredTimeMs ensures that no value is present for LastFiredTimeMs, not even an explicit nil
### GetName

`func (o *ConversionTag) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ConversionTag) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ConversionTag) SetName(v string)`

SetName sets Name field to given value.


### GetVersion

`func (o *ConversionTag) GetVersion() string`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *ConversionTag) GetVersionOk() (*string, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *ConversionTag) SetVersion(v string)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *ConversionTag) HasVersion() bool`

HasVersion returns a boolean if a field has been set.

### GetAdAccountId

`func (o *ConversionTag) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *ConversionTag) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *ConversionTag) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.


### GetStatus

`func (o *ConversionTag) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ConversionTag) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ConversionTag) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *ConversionTag) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


