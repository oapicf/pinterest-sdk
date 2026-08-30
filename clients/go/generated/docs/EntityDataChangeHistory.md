# EntityDataChangeHistory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChangedFieldId** | Pointer to **string** | A string identifier representing the changed field on the entity | [optional] 
**ChangedFieldName** | Pointer to **string** | The human readable name of the changed field on the entity | [optional] 
**DataType** | Pointer to [**ChangeHistoryDataType**](ChangeHistoryDataType.md) | Specifies the type of the field&#39;s data values | [optional] 
**NewDataValue** | Pointer to **string** | A string representation of the value of the changed field, after the change | [optional] 
**OldDataValue** | Pointer to **string** | A string representation of the value of the changed field, before the change | [optional] 

## Methods

### NewEntityDataChangeHistory

`func NewEntityDataChangeHistory() *EntityDataChangeHistory`

NewEntityDataChangeHistory instantiates a new EntityDataChangeHistory object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEntityDataChangeHistoryWithDefaults

`func NewEntityDataChangeHistoryWithDefaults() *EntityDataChangeHistory`

NewEntityDataChangeHistoryWithDefaults instantiates a new EntityDataChangeHistory object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChangedFieldId

`func (o *EntityDataChangeHistory) GetChangedFieldId() string`

GetChangedFieldId returns the ChangedFieldId field if non-nil, zero value otherwise.

### GetChangedFieldIdOk

`func (o *EntityDataChangeHistory) GetChangedFieldIdOk() (*string, bool)`

GetChangedFieldIdOk returns a tuple with the ChangedFieldId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChangedFieldId

`func (o *EntityDataChangeHistory) SetChangedFieldId(v string)`

SetChangedFieldId sets ChangedFieldId field to given value.

### HasChangedFieldId

`func (o *EntityDataChangeHistory) HasChangedFieldId() bool`

HasChangedFieldId returns a boolean if a field has been set.

### GetChangedFieldName

`func (o *EntityDataChangeHistory) GetChangedFieldName() string`

GetChangedFieldName returns the ChangedFieldName field if non-nil, zero value otherwise.

### GetChangedFieldNameOk

`func (o *EntityDataChangeHistory) GetChangedFieldNameOk() (*string, bool)`

GetChangedFieldNameOk returns a tuple with the ChangedFieldName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChangedFieldName

`func (o *EntityDataChangeHistory) SetChangedFieldName(v string)`

SetChangedFieldName sets ChangedFieldName field to given value.

### HasChangedFieldName

`func (o *EntityDataChangeHistory) HasChangedFieldName() bool`

HasChangedFieldName returns a boolean if a field has been set.

### GetDataType

`func (o *EntityDataChangeHistory) GetDataType() ChangeHistoryDataType`

GetDataType returns the DataType field if non-nil, zero value otherwise.

### GetDataTypeOk

`func (o *EntityDataChangeHistory) GetDataTypeOk() (*ChangeHistoryDataType, bool)`

GetDataTypeOk returns a tuple with the DataType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataType

`func (o *EntityDataChangeHistory) SetDataType(v ChangeHistoryDataType)`

SetDataType sets DataType field to given value.

### HasDataType

`func (o *EntityDataChangeHistory) HasDataType() bool`

HasDataType returns a boolean if a field has been set.

### GetNewDataValue

`func (o *EntityDataChangeHistory) GetNewDataValue() string`

GetNewDataValue returns the NewDataValue field if non-nil, zero value otherwise.

### GetNewDataValueOk

`func (o *EntityDataChangeHistory) GetNewDataValueOk() (*string, bool)`

GetNewDataValueOk returns a tuple with the NewDataValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewDataValue

`func (o *EntityDataChangeHistory) SetNewDataValue(v string)`

SetNewDataValue sets NewDataValue field to given value.

### HasNewDataValue

`func (o *EntityDataChangeHistory) HasNewDataValue() bool`

HasNewDataValue returns a boolean if a field has been set.

### GetOldDataValue

`func (o *EntityDataChangeHistory) GetOldDataValue() string`

GetOldDataValue returns the OldDataValue field if non-nil, zero value otherwise.

### GetOldDataValueOk

`func (o *EntityDataChangeHistory) GetOldDataValueOk() (*string, bool)`

GetOldDataValueOk returns a tuple with the OldDataValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOldDataValue

`func (o *EntityDataChangeHistory) SetOldDataValue(v string)`

SetOldDataValue sets OldDataValue field to given value.

### HasOldDataValue

`func (o *EntityDataChangeHistory) HasOldDataValue() bool`

HasOldDataValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


