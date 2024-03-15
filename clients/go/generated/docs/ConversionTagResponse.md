# ConversionTagResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | Ad account ID. | [optional] 
**CodeSnippet** | Pointer to **string** | Tag code snippet. | [optional] 
**EnhancedMatchStatus** | Pointer to [**NullableEnhancedMatchStatusType**](EnhancedMatchStatusType.md) |  | [optional] 
**Id** | Pointer to **string** | Tag ID. | [optional] 
**LastFiredTimeMs** | Pointer to **NullableFloat32** | Time for the last event fired. | [optional] 
**Name** | Pointer to **string** | Conversion tag name. | [optional] 
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) |  | [optional] 
**Version** | Pointer to **string** | Version number. | [optional] 
**Configs** | Pointer to [**ConversionTagConfigs**](ConversionTagConfigs.md) |  | [optional] 

## Methods

### NewConversionTagResponse

`func NewConversionTagResponse() *ConversionTagResponse`

NewConversionTagResponse instantiates a new ConversionTagResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionTagResponseWithDefaults

`func NewConversionTagResponseWithDefaults() *ConversionTagResponse`

NewConversionTagResponseWithDefaults instantiates a new ConversionTagResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *ConversionTagResponse) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *ConversionTagResponse) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *ConversionTagResponse) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *ConversionTagResponse) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetCodeSnippet

`func (o *ConversionTagResponse) GetCodeSnippet() string`

GetCodeSnippet returns the CodeSnippet field if non-nil, zero value otherwise.

### GetCodeSnippetOk

`func (o *ConversionTagResponse) GetCodeSnippetOk() (*string, bool)`

GetCodeSnippetOk returns a tuple with the CodeSnippet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCodeSnippet

`func (o *ConversionTagResponse) SetCodeSnippet(v string)`

SetCodeSnippet sets CodeSnippet field to given value.

### HasCodeSnippet

`func (o *ConversionTagResponse) HasCodeSnippet() bool`

HasCodeSnippet returns a boolean if a field has been set.

### GetEnhancedMatchStatus

`func (o *ConversionTagResponse) GetEnhancedMatchStatus() EnhancedMatchStatusType`

GetEnhancedMatchStatus returns the EnhancedMatchStatus field if non-nil, zero value otherwise.

### GetEnhancedMatchStatusOk

`func (o *ConversionTagResponse) GetEnhancedMatchStatusOk() (*EnhancedMatchStatusType, bool)`

GetEnhancedMatchStatusOk returns a tuple with the EnhancedMatchStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnhancedMatchStatus

`func (o *ConversionTagResponse) SetEnhancedMatchStatus(v EnhancedMatchStatusType)`

SetEnhancedMatchStatus sets EnhancedMatchStatus field to given value.

### HasEnhancedMatchStatus

`func (o *ConversionTagResponse) HasEnhancedMatchStatus() bool`

HasEnhancedMatchStatus returns a boolean if a field has been set.

### SetEnhancedMatchStatusNil

`func (o *ConversionTagResponse) SetEnhancedMatchStatusNil(b bool)`

 SetEnhancedMatchStatusNil sets the value for EnhancedMatchStatus to be an explicit nil

### UnsetEnhancedMatchStatus
`func (o *ConversionTagResponse) UnsetEnhancedMatchStatus()`

UnsetEnhancedMatchStatus ensures that no value is present for EnhancedMatchStatus, not even an explicit nil
### GetId

`func (o *ConversionTagResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ConversionTagResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ConversionTagResponse) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *ConversionTagResponse) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLastFiredTimeMs

`func (o *ConversionTagResponse) GetLastFiredTimeMs() float32`

GetLastFiredTimeMs returns the LastFiredTimeMs field if non-nil, zero value otherwise.

### GetLastFiredTimeMsOk

`func (o *ConversionTagResponse) GetLastFiredTimeMsOk() (*float32, bool)`

GetLastFiredTimeMsOk returns a tuple with the LastFiredTimeMs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastFiredTimeMs

`func (o *ConversionTagResponse) SetLastFiredTimeMs(v float32)`

SetLastFiredTimeMs sets LastFiredTimeMs field to given value.

### HasLastFiredTimeMs

`func (o *ConversionTagResponse) HasLastFiredTimeMs() bool`

HasLastFiredTimeMs returns a boolean if a field has been set.

### SetLastFiredTimeMsNil

`func (o *ConversionTagResponse) SetLastFiredTimeMsNil(b bool)`

 SetLastFiredTimeMsNil sets the value for LastFiredTimeMs to be an explicit nil

### UnsetLastFiredTimeMs
`func (o *ConversionTagResponse) UnsetLastFiredTimeMs()`

UnsetLastFiredTimeMs ensures that no value is present for LastFiredTimeMs, not even an explicit nil
### GetName

`func (o *ConversionTagResponse) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ConversionTagResponse) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ConversionTagResponse) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ConversionTagResponse) HasName() bool`

HasName returns a boolean if a field has been set.

### GetStatus

`func (o *ConversionTagResponse) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ConversionTagResponse) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ConversionTagResponse) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *ConversionTagResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetVersion

`func (o *ConversionTagResponse) GetVersion() string`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *ConversionTagResponse) GetVersionOk() (*string, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *ConversionTagResponse) SetVersion(v string)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *ConversionTagResponse) HasVersion() bool`

HasVersion returns a boolean if a field has been set.

### GetConfigs

`func (o *ConversionTagResponse) GetConfigs() ConversionTagConfigs`

GetConfigs returns the Configs field if non-nil, zero value otherwise.

### GetConfigsOk

`func (o *ConversionTagResponse) GetConfigsOk() (*ConversionTagConfigs, bool)`

GetConfigsOk returns a tuple with the Configs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConfigs

`func (o *ConversionTagResponse) SetConfigs(v ConversionTagConfigs)`

SetConfigs sets Configs field to given value.

### HasConfigs

`func (o *ConversionTagResponse) HasConfigs() bool`

HasConfigs returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


