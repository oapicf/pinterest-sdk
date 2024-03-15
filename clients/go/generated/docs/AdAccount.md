# AdAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** |  | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**Owner** | Pointer to [**AdAccountOwner**](AdAccountOwner.md) |  | [optional] 
**Country** | Pointer to [**Country**](Country.md) |  | [optional] 
**Currency** | Pointer to [**Currency**](Currency.md) |  | [optional] 
**Permissions** | Pointer to [**[]BusinessAccessRole**](BusinessAccessRole.md) |  | [optional] 
**CreatedTime** | Pointer to **NullableInt32** | Creation time. Unix timestamp in seconds. | [optional] 
**UpdatedTime** | Pointer to **NullableInt32** | Last update time. Unix timestamp in seconds. | [optional] 

## Methods

### NewAdAccount

`func NewAdAccount() *AdAccount`

NewAdAccount instantiates a new AdAccount object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdAccountWithDefaults

`func NewAdAccountWithDefaults() *AdAccount`

NewAdAccountWithDefaults instantiates a new AdAccount object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *AdAccount) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AdAccount) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AdAccount) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *AdAccount) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *AdAccount) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AdAccount) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AdAccount) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AdAccount) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOwner

`func (o *AdAccount) GetOwner() AdAccountOwner`

GetOwner returns the Owner field if non-nil, zero value otherwise.

### GetOwnerOk

`func (o *AdAccount) GetOwnerOk() (*AdAccountOwner, bool)`

GetOwnerOk returns a tuple with the Owner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOwner

`func (o *AdAccount) SetOwner(v AdAccountOwner)`

SetOwner sets Owner field to given value.

### HasOwner

`func (o *AdAccount) HasOwner() bool`

HasOwner returns a boolean if a field has been set.

### GetCountry

`func (o *AdAccount) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *AdAccount) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *AdAccount) SetCountry(v Country)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *AdAccount) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetCurrency

`func (o *AdAccount) GetCurrency() Currency`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *AdAccount) GetCurrencyOk() (*Currency, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *AdAccount) SetCurrency(v Currency)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *AdAccount) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetPermissions

`func (o *AdAccount) GetPermissions() []BusinessAccessRole`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *AdAccount) GetPermissionsOk() (*[]BusinessAccessRole, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *AdAccount) SetPermissions(v []BusinessAccessRole)`

SetPermissions sets Permissions field to given value.

### HasPermissions

`func (o *AdAccount) HasPermissions() bool`

HasPermissions returns a boolean if a field has been set.

### GetCreatedTime

`func (o *AdAccount) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *AdAccount) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *AdAccount) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *AdAccount) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### SetCreatedTimeNil

`func (o *AdAccount) SetCreatedTimeNil(b bool)`

 SetCreatedTimeNil sets the value for CreatedTime to be an explicit nil

### UnsetCreatedTime
`func (o *AdAccount) UnsetCreatedTime()`

UnsetCreatedTime ensures that no value is present for CreatedTime, not even an explicit nil
### GetUpdatedTime

`func (o *AdAccount) GetUpdatedTime() int32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *AdAccount) GetUpdatedTimeOk() (*int32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *AdAccount) SetUpdatedTime(v int32)`

SetUpdatedTime sets UpdatedTime field to given value.

### HasUpdatedTime

`func (o *AdAccount) HasUpdatedTime() bool`

HasUpdatedTime returns a boolean if a field has been set.

### SetUpdatedTimeNil

`func (o *AdAccount) SetUpdatedTimeNil(b bool)`

 SetUpdatedTimeNil sets the value for UpdatedTime to be an explicit nil

### UnsetUpdatedTime
`func (o *AdAccount) UnsetUpdatedTime()`

UnsetUpdatedTime ensures that no value is present for UpdatedTime, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


