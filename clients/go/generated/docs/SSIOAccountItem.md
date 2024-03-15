# SSIOAccountItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | Salesforce id for billto_info | [optional] 
**IoTermsId** | Pointer to **string** | Salesforce id for IO Terms and Conditions | [optional] 
**IoTerms** | Pointer to **string** | Salesforce text for IO Terms and Conditions | [optional] 
**UsTermsId** | Pointer to **string** | Salesforce id for US Terms and Conditions | [optional] 
**UsTerms** | Pointer to **string** | Salesforce text for US Terms and Conditions | [optional] 
**RowTermsId** | Pointer to **string** | Salesforce id for Rest of the World Terms and Conditions | [optional] 
**RowTerms** | Pointer to **string** | Salesforce text for Rest of the World Terms and Conditions | [optional] 
**IoType** | Pointer to **string** | Insertion Order Type - Pinterest Paper or Agency Paper | [optional] 
**Addresses** | Pointer to [**[]SSIOAccountAddress**](SSIOAccountAddress.md) | Address information that is associated with this account. | [optional] 

## Methods

### NewSSIOAccountItem

`func NewSSIOAccountItem() *SSIOAccountItem`

NewSSIOAccountItem instantiates a new SSIOAccountItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSSIOAccountItemWithDefaults

`func NewSSIOAccountItemWithDefaults() *SSIOAccountItem`

NewSSIOAccountItemWithDefaults instantiates a new SSIOAccountItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *SSIOAccountItem) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *SSIOAccountItem) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *SSIOAccountItem) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *SSIOAccountItem) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIoTermsId

`func (o *SSIOAccountItem) GetIoTermsId() string`

GetIoTermsId returns the IoTermsId field if non-nil, zero value otherwise.

### GetIoTermsIdOk

`func (o *SSIOAccountItem) GetIoTermsIdOk() (*string, bool)`

GetIoTermsIdOk returns a tuple with the IoTermsId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIoTermsId

`func (o *SSIOAccountItem) SetIoTermsId(v string)`

SetIoTermsId sets IoTermsId field to given value.

### HasIoTermsId

`func (o *SSIOAccountItem) HasIoTermsId() bool`

HasIoTermsId returns a boolean if a field has been set.

### GetIoTerms

`func (o *SSIOAccountItem) GetIoTerms() string`

GetIoTerms returns the IoTerms field if non-nil, zero value otherwise.

### GetIoTermsOk

`func (o *SSIOAccountItem) GetIoTermsOk() (*string, bool)`

GetIoTermsOk returns a tuple with the IoTerms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIoTerms

`func (o *SSIOAccountItem) SetIoTerms(v string)`

SetIoTerms sets IoTerms field to given value.

### HasIoTerms

`func (o *SSIOAccountItem) HasIoTerms() bool`

HasIoTerms returns a boolean if a field has been set.

### GetUsTermsId

`func (o *SSIOAccountItem) GetUsTermsId() string`

GetUsTermsId returns the UsTermsId field if non-nil, zero value otherwise.

### GetUsTermsIdOk

`func (o *SSIOAccountItem) GetUsTermsIdOk() (*string, bool)`

GetUsTermsIdOk returns a tuple with the UsTermsId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsTermsId

`func (o *SSIOAccountItem) SetUsTermsId(v string)`

SetUsTermsId sets UsTermsId field to given value.

### HasUsTermsId

`func (o *SSIOAccountItem) HasUsTermsId() bool`

HasUsTermsId returns a boolean if a field has been set.

### GetUsTerms

`func (o *SSIOAccountItem) GetUsTerms() string`

GetUsTerms returns the UsTerms field if non-nil, zero value otherwise.

### GetUsTermsOk

`func (o *SSIOAccountItem) GetUsTermsOk() (*string, bool)`

GetUsTermsOk returns a tuple with the UsTerms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsTerms

`func (o *SSIOAccountItem) SetUsTerms(v string)`

SetUsTerms sets UsTerms field to given value.

### HasUsTerms

`func (o *SSIOAccountItem) HasUsTerms() bool`

HasUsTerms returns a boolean if a field has been set.

### GetRowTermsId

`func (o *SSIOAccountItem) GetRowTermsId() string`

GetRowTermsId returns the RowTermsId field if non-nil, zero value otherwise.

### GetRowTermsIdOk

`func (o *SSIOAccountItem) GetRowTermsIdOk() (*string, bool)`

GetRowTermsIdOk returns a tuple with the RowTermsId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRowTermsId

`func (o *SSIOAccountItem) SetRowTermsId(v string)`

SetRowTermsId sets RowTermsId field to given value.

### HasRowTermsId

`func (o *SSIOAccountItem) HasRowTermsId() bool`

HasRowTermsId returns a boolean if a field has been set.

### GetRowTerms

`func (o *SSIOAccountItem) GetRowTerms() string`

GetRowTerms returns the RowTerms field if non-nil, zero value otherwise.

### GetRowTermsOk

`func (o *SSIOAccountItem) GetRowTermsOk() (*string, bool)`

GetRowTermsOk returns a tuple with the RowTerms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRowTerms

`func (o *SSIOAccountItem) SetRowTerms(v string)`

SetRowTerms sets RowTerms field to given value.

### HasRowTerms

`func (o *SSIOAccountItem) HasRowTerms() bool`

HasRowTerms returns a boolean if a field has been set.

### GetIoType

`func (o *SSIOAccountItem) GetIoType() string`

GetIoType returns the IoType field if non-nil, zero value otherwise.

### GetIoTypeOk

`func (o *SSIOAccountItem) GetIoTypeOk() (*string, bool)`

GetIoTypeOk returns a tuple with the IoType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIoType

`func (o *SSIOAccountItem) SetIoType(v string)`

SetIoType sets IoType field to given value.

### HasIoType

`func (o *SSIOAccountItem) HasIoType() bool`

HasIoType returns a boolean if a field has been set.

### GetAddresses

`func (o *SSIOAccountItem) GetAddresses() []SSIOAccountAddress`

GetAddresses returns the Addresses field if non-nil, zero value otherwise.

### GetAddressesOk

`func (o *SSIOAccountItem) GetAddressesOk() (*[]SSIOAccountAddress, bool)`

GetAddressesOk returns a tuple with the Addresses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddresses

`func (o *SSIOAccountItem) SetAddresses(v []SSIOAccountAddress)`

SetAddresses sets Addresses field to given value.

### HasAddresses

`func (o *SSIOAccountItem) HasAddresses() bool`

HasAddresses returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


