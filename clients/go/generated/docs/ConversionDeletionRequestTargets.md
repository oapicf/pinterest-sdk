# ConversionDeletionRequestTargets

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UserEmails** | **[]string** | Array of plain text user emails. | 
**Epiks** | **[]string** | Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie). | 

## Methods

### NewConversionDeletionRequestTargets

`func NewConversionDeletionRequestTargets(userEmails []string, epiks []string, ) *ConversionDeletionRequestTargets`

NewConversionDeletionRequestTargets instantiates a new ConversionDeletionRequestTargets object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionDeletionRequestTargetsWithDefaults

`func NewConversionDeletionRequestTargetsWithDefaults() *ConversionDeletionRequestTargets`

NewConversionDeletionRequestTargetsWithDefaults instantiates a new ConversionDeletionRequestTargets object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUserEmails

`func (o *ConversionDeletionRequestTargets) GetUserEmails() []string`

GetUserEmails returns the UserEmails field if non-nil, zero value otherwise.

### GetUserEmailsOk

`func (o *ConversionDeletionRequestTargets) GetUserEmailsOk() (*[]string, bool)`

GetUserEmailsOk returns a tuple with the UserEmails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserEmails

`func (o *ConversionDeletionRequestTargets) SetUserEmails(v []string)`

SetUserEmails sets UserEmails field to given value.


### GetEpiks

`func (o *ConversionDeletionRequestTargets) GetEpiks() []string`

GetEpiks returns the Epiks field if non-nil, zero value otherwise.

### GetEpiksOk

`func (o *ConversionDeletionRequestTargets) GetEpiksOk() (*[]string, bool)`

GetEpiksOk returns a tuple with the Epiks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEpiks

`func (o *ConversionDeletionRequestTargets) SetEpiks(v []string)`

SetEpiks sets Epiks field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


