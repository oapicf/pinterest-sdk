# ConversionDeletionRequestCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DeletionTargets** | [**ConversionDeletionRequestTargets**](ConversionDeletionRequestTargets.md) | Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request. | 

## Methods

### NewConversionDeletionRequestCreate

`func NewConversionDeletionRequestCreate(deletionTargets ConversionDeletionRequestTargets, ) *ConversionDeletionRequestCreate`

NewConversionDeletionRequestCreate instantiates a new ConversionDeletionRequestCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionDeletionRequestCreateWithDefaults

`func NewConversionDeletionRequestCreateWithDefaults() *ConversionDeletionRequestCreate`

NewConversionDeletionRequestCreateWithDefaults instantiates a new ConversionDeletionRequestCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDeletionTargets

`func (o *ConversionDeletionRequestCreate) GetDeletionTargets() ConversionDeletionRequestTargets`

GetDeletionTargets returns the DeletionTargets field if non-nil, zero value otherwise.

### GetDeletionTargetsOk

`func (o *ConversionDeletionRequestCreate) GetDeletionTargetsOk() (*ConversionDeletionRequestTargets, bool)`

GetDeletionTargetsOk returns a tuple with the DeletionTargets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeletionTargets

`func (o *ConversionDeletionRequestCreate) SetDeletionTargets(v ConversionDeletionRequestTargets)`

SetDeletionTargets sets DeletionTargets field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


