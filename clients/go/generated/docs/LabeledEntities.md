# LabeledEntities

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntitiesLabels** | Pointer to [**[]EntityLabel**](EntityLabel.md) |  | [optional] [readonly] 
**Errors** | Pointer to [**[]EntityLabelError**](EntityLabelError.md) | Labels that were not successfully applied. | [optional] [readonly] 

## Methods

### NewLabeledEntities

`func NewLabeledEntities() *LabeledEntities`

NewLabeledEntities instantiates a new LabeledEntities object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLabeledEntitiesWithDefaults

`func NewLabeledEntitiesWithDefaults() *LabeledEntities`

NewLabeledEntitiesWithDefaults instantiates a new LabeledEntities object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntitiesLabels

`func (o *LabeledEntities) GetEntitiesLabels() []EntityLabel`

GetEntitiesLabels returns the EntitiesLabels field if non-nil, zero value otherwise.

### GetEntitiesLabelsOk

`func (o *LabeledEntities) GetEntitiesLabelsOk() (*[]EntityLabel, bool)`

GetEntitiesLabelsOk returns a tuple with the EntitiesLabels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntitiesLabels

`func (o *LabeledEntities) SetEntitiesLabels(v []EntityLabel)`

SetEntitiesLabels sets EntitiesLabels field to given value.

### HasEntitiesLabels

`func (o *LabeledEntities) HasEntitiesLabels() bool`

HasEntitiesLabels returns a boolean if a field has been set.

### GetErrors

`func (o *LabeledEntities) GetErrors() []EntityLabelError`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *LabeledEntities) GetErrorsOk() (*[]EntityLabelError, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *LabeledEntities) SetErrors(v []EntityLabelError)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *LabeledEntities) HasErrors() bool`

HasErrors returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


