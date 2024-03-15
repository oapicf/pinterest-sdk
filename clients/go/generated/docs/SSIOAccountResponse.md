# SSIOAccountResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Eligible** | Pointer to **bool** | Advertiser eligible to create order lines | [optional] 
**CanEdit** | Pointer to **bool** | Advertiser eligible to update order lines | [optional] 
**BilltoInfos** | Pointer to [**[]SSIOAccountItem**](SSIOAccountItem.md) | An array of Salesforce account information that includes address, io terms, etc. | [optional] 
**Currency** | Pointer to **string** |  | [optional] 
**PmpNames** | Pointer to [**[]SSIOAccountPMPName**](SSIOAccountPMPName.md) |  | [optional] 
**Error** | Pointer to **string** | Error indicator from Salesforce which could be \&quot;No Error\&quot; | [optional] 

## Methods

### NewSSIOAccountResponse

`func NewSSIOAccountResponse() *SSIOAccountResponse`

NewSSIOAccountResponse instantiates a new SSIOAccountResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSSIOAccountResponseWithDefaults

`func NewSSIOAccountResponseWithDefaults() *SSIOAccountResponse`

NewSSIOAccountResponseWithDefaults instantiates a new SSIOAccountResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEligible

`func (o *SSIOAccountResponse) GetEligible() bool`

GetEligible returns the Eligible field if non-nil, zero value otherwise.

### GetEligibleOk

`func (o *SSIOAccountResponse) GetEligibleOk() (*bool, bool)`

GetEligibleOk returns a tuple with the Eligible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEligible

`func (o *SSIOAccountResponse) SetEligible(v bool)`

SetEligible sets Eligible field to given value.

### HasEligible

`func (o *SSIOAccountResponse) HasEligible() bool`

HasEligible returns a boolean if a field has been set.

### GetCanEdit

`func (o *SSIOAccountResponse) GetCanEdit() bool`

GetCanEdit returns the CanEdit field if non-nil, zero value otherwise.

### GetCanEditOk

`func (o *SSIOAccountResponse) GetCanEditOk() (*bool, bool)`

GetCanEditOk returns a tuple with the CanEdit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanEdit

`func (o *SSIOAccountResponse) SetCanEdit(v bool)`

SetCanEdit sets CanEdit field to given value.

### HasCanEdit

`func (o *SSIOAccountResponse) HasCanEdit() bool`

HasCanEdit returns a boolean if a field has been set.

### GetBilltoInfos

`func (o *SSIOAccountResponse) GetBilltoInfos() []SSIOAccountItem`

GetBilltoInfos returns the BilltoInfos field if non-nil, zero value otherwise.

### GetBilltoInfosOk

`func (o *SSIOAccountResponse) GetBilltoInfosOk() (*[]SSIOAccountItem, bool)`

GetBilltoInfosOk returns a tuple with the BilltoInfos field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBilltoInfos

`func (o *SSIOAccountResponse) SetBilltoInfos(v []SSIOAccountItem)`

SetBilltoInfos sets BilltoInfos field to given value.

### HasBilltoInfos

`func (o *SSIOAccountResponse) HasBilltoInfos() bool`

HasBilltoInfos returns a boolean if a field has been set.

### GetCurrency

`func (o *SSIOAccountResponse) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *SSIOAccountResponse) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *SSIOAccountResponse) SetCurrency(v string)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *SSIOAccountResponse) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetPmpNames

`func (o *SSIOAccountResponse) GetPmpNames() []SSIOAccountPMPName`

GetPmpNames returns the PmpNames field if non-nil, zero value otherwise.

### GetPmpNamesOk

`func (o *SSIOAccountResponse) GetPmpNamesOk() (*[]SSIOAccountPMPName, bool)`

GetPmpNamesOk returns a tuple with the PmpNames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPmpNames

`func (o *SSIOAccountResponse) SetPmpNames(v []SSIOAccountPMPName)`

SetPmpNames sets PmpNames field to given value.

### HasPmpNames

`func (o *SSIOAccountResponse) HasPmpNames() bool`

HasPmpNames returns a boolean if a field has been set.

### GetError

`func (o *SSIOAccountResponse) GetError() string`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *SSIOAccountResponse) GetErrorOk() (*string, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *SSIOAccountResponse) SetError(v string)`

SetError sets Error field to given value.

### HasError

`func (o *SSIOAccountResponse) HasError() bool`

HasError returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


