# AudienceDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Date** | Pointer to **NullableString** | Generation date | [optional] 
**Type** | Pointer to **string** | Generated audience type to request. | [optional] 
**Scope** | Pointer to **string** | Generated audience scope to request. | [optional] 

## Methods

### NewAudienceDefinition

`func NewAudienceDefinition() *AudienceDefinition`

NewAudienceDefinition instantiates a new AudienceDefinition object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAudienceDefinitionWithDefaults

`func NewAudienceDefinitionWithDefaults() *AudienceDefinition`

NewAudienceDefinitionWithDefaults instantiates a new AudienceDefinition object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDate

`func (o *AudienceDefinition) GetDate() string`

GetDate returns the Date field if non-nil, zero value otherwise.

### GetDateOk

`func (o *AudienceDefinition) GetDateOk() (*string, bool)`

GetDateOk returns a tuple with the Date field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDate

`func (o *AudienceDefinition) SetDate(v string)`

SetDate sets Date field to given value.

### HasDate

`func (o *AudienceDefinition) HasDate() bool`

HasDate returns a boolean if a field has been set.

### SetDateNil

`func (o *AudienceDefinition) SetDateNil(b bool)`

 SetDateNil sets the value for Date to be an explicit nil

### UnsetDate
`func (o *AudienceDefinition) UnsetDate()`

UnsetDate ensures that no value is present for Date, not even an explicit nil
### GetType

`func (o *AudienceDefinition) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *AudienceDefinition) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *AudienceDefinition) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *AudienceDefinition) HasType() bool`

HasType returns a boolean if a field has been set.

### GetScope

`func (o *AudienceDefinition) GetScope() string`

GetScope returns the Scope field if non-nil, zero value otherwise.

### GetScopeOk

`func (o *AudienceDefinition) GetScopeOk() (*string, bool)`

GetScopeOk returns a tuple with the Scope field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScope

`func (o *AudienceDefinition) SetScope(v string)`

SetScope sets Scope field to given value.

### HasScope

`func (o *AudienceDefinition) HasScope() bool`

HasScope returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


