# EntityHistory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChangeTimestamp** | Pointer to **int32** | A Unix timestamp representing the time of the change in seconds | [optional] 
**DataChanges** | Pointer to [**[]EntityDataChangeHistory**](EntityDataChangeHistory.md) | Properties associated with a particular change to an entity&#39;s data | [optional] 
**EntityId** | Pointer to **string** | The id of the entity that was changed | [optional] 
**EntityName** | Pointer to **string** | The name of the entity that was changed | [optional] 
**Ldap** | Pointer to **string** | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users | [optional] 
**Operation** | Pointer to [**ChangeHistoryOperationType**](ChangeHistoryOperationType.md) | The type of operation that caused the change | [optional] 
**UserId** | Pointer to **string** | The id of the user who initiated the change | [optional] 

## Methods

### NewEntityHistory

`func NewEntityHistory() *EntityHistory`

NewEntityHistory instantiates a new EntityHistory object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEntityHistoryWithDefaults

`func NewEntityHistoryWithDefaults() *EntityHistory`

NewEntityHistoryWithDefaults instantiates a new EntityHistory object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChangeTimestamp

`func (o *EntityHistory) GetChangeTimestamp() int32`

GetChangeTimestamp returns the ChangeTimestamp field if non-nil, zero value otherwise.

### GetChangeTimestampOk

`func (o *EntityHistory) GetChangeTimestampOk() (*int32, bool)`

GetChangeTimestampOk returns a tuple with the ChangeTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChangeTimestamp

`func (o *EntityHistory) SetChangeTimestamp(v int32)`

SetChangeTimestamp sets ChangeTimestamp field to given value.

### HasChangeTimestamp

`func (o *EntityHistory) HasChangeTimestamp() bool`

HasChangeTimestamp returns a boolean if a field has been set.

### GetDataChanges

`func (o *EntityHistory) GetDataChanges() []EntityDataChangeHistory`

GetDataChanges returns the DataChanges field if non-nil, zero value otherwise.

### GetDataChangesOk

`func (o *EntityHistory) GetDataChangesOk() (*[]EntityDataChangeHistory, bool)`

GetDataChangesOk returns a tuple with the DataChanges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataChanges

`func (o *EntityHistory) SetDataChanges(v []EntityDataChangeHistory)`

SetDataChanges sets DataChanges field to given value.

### HasDataChanges

`func (o *EntityHistory) HasDataChanges() bool`

HasDataChanges returns a boolean if a field has been set.

### GetEntityId

`func (o *EntityHistory) GetEntityId() string`

GetEntityId returns the EntityId field if non-nil, zero value otherwise.

### GetEntityIdOk

`func (o *EntityHistory) GetEntityIdOk() (*string, bool)`

GetEntityIdOk returns a tuple with the EntityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntityId

`func (o *EntityHistory) SetEntityId(v string)`

SetEntityId sets EntityId field to given value.

### HasEntityId

`func (o *EntityHistory) HasEntityId() bool`

HasEntityId returns a boolean if a field has been set.

### GetEntityName

`func (o *EntityHistory) GetEntityName() string`

GetEntityName returns the EntityName field if non-nil, zero value otherwise.

### GetEntityNameOk

`func (o *EntityHistory) GetEntityNameOk() (*string, bool)`

GetEntityNameOk returns a tuple with the EntityName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntityName

`func (o *EntityHistory) SetEntityName(v string)`

SetEntityName sets EntityName field to given value.

### HasEntityName

`func (o *EntityHistory) HasEntityName() bool`

HasEntityName returns a boolean if a field has been set.

### GetLdap

`func (o *EntityHistory) GetLdap() string`

GetLdap returns the Ldap field if non-nil, zero value otherwise.

### GetLdapOk

`func (o *EntityHistory) GetLdapOk() (*string, bool)`

GetLdapOk returns a tuple with the Ldap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLdap

`func (o *EntityHistory) SetLdap(v string)`

SetLdap sets Ldap field to given value.

### HasLdap

`func (o *EntityHistory) HasLdap() bool`

HasLdap returns a boolean if a field has been set.

### GetOperation

`func (o *EntityHistory) GetOperation() ChangeHistoryOperationType`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *EntityHistory) GetOperationOk() (*ChangeHistoryOperationType, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *EntityHistory) SetOperation(v ChangeHistoryOperationType)`

SetOperation sets Operation field to given value.

### HasOperation

`func (o *EntityHistory) HasOperation() bool`

HasOperation returns a boolean if a field has been set.

### GetUserId

`func (o *EntityHistory) GetUserId() string`

GetUserId returns the UserId field if non-nil, zero value otherwise.

### GetUserIdOk

`func (o *EntityHistory) GetUserIdOk() (*string, bool)`

GetUserIdOk returns a tuple with the UserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserId

`func (o *EntityHistory) SetUserId(v string)`

SetUserId sets UserId field to given value.

### HasUserId

`func (o *EntityHistory) HasUserId() bool`

HasUserId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


