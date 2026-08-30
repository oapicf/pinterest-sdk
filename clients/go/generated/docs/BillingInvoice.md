# BillingInvoice

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | The ID of the ad account this invoice belongs to | [optional] 
**AdAccountName** | Pointer to **string** | The name of the ad account this invoice belongs to | [optional] 
**AmountBilledMicroCurrency** | Pointer to **int32** | The amount billed in this invoice. Denoted in micro currency | [optional] 
**AmountDiscountMicroCurrency** | Pointer to **NullableInt32** | The discount in this invoice. Denoted in micro currency | [optional] 
**AmountNetMicroCurrency** | Pointer to **NullableInt32** | The net amount in this invoice. Denoted in micro currency | [optional] 
**AmountTaxMicroCurrency** | Pointer to **NullableInt32** | The tax in this invoice. Denoted in micro currency | [optional] 
**BillToCountry** | Pointer to **string** | The country of the bill to address | [optional] 
**BillingPeriodEndDate** | Pointer to **string** | The end date of the billing period. Format: YYYY-MM-DD | [optional] 
**BillingPeriodStartDate** | Pointer to **string** | The start date of the billing period. Format: YYYY-MM-DD | [optional] 
**Currency** | Pointer to [**Currency**](Currency.md) |  | [optional] 
**DocumentType** | Pointer to [**BillingInvoiceDocumentType**](BillingInvoiceDocumentType.md) | The type of the document | [optional] 
**Id** | Pointer to **string** | Unique identifier for the billing invoice | [optional] 
**InvoiceDueDate** | Pointer to **string** | The date the invoice is due. Format: YYYY-MM-DD | [optional] 
**PaymentTerms** | Pointer to **string** | The payment terms of the invoice | [optional] 
**Status** | Pointer to [**BillingInvoiceStatus**](BillingInvoiceStatus.md) | The status of the invoice | [optional] 

## Methods

### NewBillingInvoice

`func NewBillingInvoice() *BillingInvoice`

NewBillingInvoice instantiates a new BillingInvoice object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBillingInvoiceWithDefaults

`func NewBillingInvoiceWithDefaults() *BillingInvoice`

NewBillingInvoiceWithDefaults instantiates a new BillingInvoice object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *BillingInvoice) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *BillingInvoice) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *BillingInvoice) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *BillingInvoice) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetAdAccountName

`func (o *BillingInvoice) GetAdAccountName() string`

GetAdAccountName returns the AdAccountName field if non-nil, zero value otherwise.

### GetAdAccountNameOk

`func (o *BillingInvoice) GetAdAccountNameOk() (*string, bool)`

GetAdAccountNameOk returns a tuple with the AdAccountName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountName

`func (o *BillingInvoice) SetAdAccountName(v string)`

SetAdAccountName sets AdAccountName field to given value.

### HasAdAccountName

`func (o *BillingInvoice) HasAdAccountName() bool`

HasAdAccountName returns a boolean if a field has been set.

### GetAmountBilledMicroCurrency

`func (o *BillingInvoice) GetAmountBilledMicroCurrency() int32`

GetAmountBilledMicroCurrency returns the AmountBilledMicroCurrency field if non-nil, zero value otherwise.

### GetAmountBilledMicroCurrencyOk

`func (o *BillingInvoice) GetAmountBilledMicroCurrencyOk() (*int32, bool)`

GetAmountBilledMicroCurrencyOk returns a tuple with the AmountBilledMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmountBilledMicroCurrency

`func (o *BillingInvoice) SetAmountBilledMicroCurrency(v int32)`

SetAmountBilledMicroCurrency sets AmountBilledMicroCurrency field to given value.

### HasAmountBilledMicroCurrency

`func (o *BillingInvoice) HasAmountBilledMicroCurrency() bool`

HasAmountBilledMicroCurrency returns a boolean if a field has been set.

### GetAmountDiscountMicroCurrency

`func (o *BillingInvoice) GetAmountDiscountMicroCurrency() int32`

GetAmountDiscountMicroCurrency returns the AmountDiscountMicroCurrency field if non-nil, zero value otherwise.

### GetAmountDiscountMicroCurrencyOk

`func (o *BillingInvoice) GetAmountDiscountMicroCurrencyOk() (*int32, bool)`

GetAmountDiscountMicroCurrencyOk returns a tuple with the AmountDiscountMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmountDiscountMicroCurrency

`func (o *BillingInvoice) SetAmountDiscountMicroCurrency(v int32)`

SetAmountDiscountMicroCurrency sets AmountDiscountMicroCurrency field to given value.

### HasAmountDiscountMicroCurrency

`func (o *BillingInvoice) HasAmountDiscountMicroCurrency() bool`

HasAmountDiscountMicroCurrency returns a boolean if a field has been set.

### SetAmountDiscountMicroCurrencyNil

`func (o *BillingInvoice) SetAmountDiscountMicroCurrencyNil(b bool)`

 SetAmountDiscountMicroCurrencyNil sets the value for AmountDiscountMicroCurrency to be an explicit nil

### UnsetAmountDiscountMicroCurrency
`func (o *BillingInvoice) UnsetAmountDiscountMicroCurrency()`

UnsetAmountDiscountMicroCurrency ensures that no value is present for AmountDiscountMicroCurrency, not even an explicit nil
### GetAmountNetMicroCurrency

`func (o *BillingInvoice) GetAmountNetMicroCurrency() int32`

GetAmountNetMicroCurrency returns the AmountNetMicroCurrency field if non-nil, zero value otherwise.

### GetAmountNetMicroCurrencyOk

`func (o *BillingInvoice) GetAmountNetMicroCurrencyOk() (*int32, bool)`

GetAmountNetMicroCurrencyOk returns a tuple with the AmountNetMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmountNetMicroCurrency

`func (o *BillingInvoice) SetAmountNetMicroCurrency(v int32)`

SetAmountNetMicroCurrency sets AmountNetMicroCurrency field to given value.

### HasAmountNetMicroCurrency

`func (o *BillingInvoice) HasAmountNetMicroCurrency() bool`

HasAmountNetMicroCurrency returns a boolean if a field has been set.

### SetAmountNetMicroCurrencyNil

`func (o *BillingInvoice) SetAmountNetMicroCurrencyNil(b bool)`

 SetAmountNetMicroCurrencyNil sets the value for AmountNetMicroCurrency to be an explicit nil

### UnsetAmountNetMicroCurrency
`func (o *BillingInvoice) UnsetAmountNetMicroCurrency()`

UnsetAmountNetMicroCurrency ensures that no value is present for AmountNetMicroCurrency, not even an explicit nil
### GetAmountTaxMicroCurrency

`func (o *BillingInvoice) GetAmountTaxMicroCurrency() int32`

GetAmountTaxMicroCurrency returns the AmountTaxMicroCurrency field if non-nil, zero value otherwise.

### GetAmountTaxMicroCurrencyOk

`func (o *BillingInvoice) GetAmountTaxMicroCurrencyOk() (*int32, bool)`

GetAmountTaxMicroCurrencyOk returns a tuple with the AmountTaxMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmountTaxMicroCurrency

`func (o *BillingInvoice) SetAmountTaxMicroCurrency(v int32)`

SetAmountTaxMicroCurrency sets AmountTaxMicroCurrency field to given value.

### HasAmountTaxMicroCurrency

`func (o *BillingInvoice) HasAmountTaxMicroCurrency() bool`

HasAmountTaxMicroCurrency returns a boolean if a field has been set.

### SetAmountTaxMicroCurrencyNil

`func (o *BillingInvoice) SetAmountTaxMicroCurrencyNil(b bool)`

 SetAmountTaxMicroCurrencyNil sets the value for AmountTaxMicroCurrency to be an explicit nil

### UnsetAmountTaxMicroCurrency
`func (o *BillingInvoice) UnsetAmountTaxMicroCurrency()`

UnsetAmountTaxMicroCurrency ensures that no value is present for AmountTaxMicroCurrency, not even an explicit nil
### GetBillToCountry

`func (o *BillingInvoice) GetBillToCountry() string`

GetBillToCountry returns the BillToCountry field if non-nil, zero value otherwise.

### GetBillToCountryOk

`func (o *BillingInvoice) GetBillToCountryOk() (*string, bool)`

GetBillToCountryOk returns a tuple with the BillToCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillToCountry

`func (o *BillingInvoice) SetBillToCountry(v string)`

SetBillToCountry sets BillToCountry field to given value.

### HasBillToCountry

`func (o *BillingInvoice) HasBillToCountry() bool`

HasBillToCountry returns a boolean if a field has been set.

### GetBillingPeriodEndDate

`func (o *BillingInvoice) GetBillingPeriodEndDate() string`

GetBillingPeriodEndDate returns the BillingPeriodEndDate field if non-nil, zero value otherwise.

### GetBillingPeriodEndDateOk

`func (o *BillingInvoice) GetBillingPeriodEndDateOk() (*string, bool)`

GetBillingPeriodEndDateOk returns a tuple with the BillingPeriodEndDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingPeriodEndDate

`func (o *BillingInvoice) SetBillingPeriodEndDate(v string)`

SetBillingPeriodEndDate sets BillingPeriodEndDate field to given value.

### HasBillingPeriodEndDate

`func (o *BillingInvoice) HasBillingPeriodEndDate() bool`

HasBillingPeriodEndDate returns a boolean if a field has been set.

### GetBillingPeriodStartDate

`func (o *BillingInvoice) GetBillingPeriodStartDate() string`

GetBillingPeriodStartDate returns the BillingPeriodStartDate field if non-nil, zero value otherwise.

### GetBillingPeriodStartDateOk

`func (o *BillingInvoice) GetBillingPeriodStartDateOk() (*string, bool)`

GetBillingPeriodStartDateOk returns a tuple with the BillingPeriodStartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingPeriodStartDate

`func (o *BillingInvoice) SetBillingPeriodStartDate(v string)`

SetBillingPeriodStartDate sets BillingPeriodStartDate field to given value.

### HasBillingPeriodStartDate

`func (o *BillingInvoice) HasBillingPeriodStartDate() bool`

HasBillingPeriodStartDate returns a boolean if a field has been set.

### GetCurrency

`func (o *BillingInvoice) GetCurrency() Currency`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *BillingInvoice) GetCurrencyOk() (*Currency, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *BillingInvoice) SetCurrency(v Currency)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *BillingInvoice) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetDocumentType

`func (o *BillingInvoice) GetDocumentType() BillingInvoiceDocumentType`

GetDocumentType returns the DocumentType field if non-nil, zero value otherwise.

### GetDocumentTypeOk

`func (o *BillingInvoice) GetDocumentTypeOk() (*BillingInvoiceDocumentType, bool)`

GetDocumentTypeOk returns a tuple with the DocumentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDocumentType

`func (o *BillingInvoice) SetDocumentType(v BillingInvoiceDocumentType)`

SetDocumentType sets DocumentType field to given value.

### HasDocumentType

`func (o *BillingInvoice) HasDocumentType() bool`

HasDocumentType returns a boolean if a field has been set.

### GetId

`func (o *BillingInvoice) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *BillingInvoice) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *BillingInvoice) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *BillingInvoice) HasId() bool`

HasId returns a boolean if a field has been set.

### GetInvoiceDueDate

`func (o *BillingInvoice) GetInvoiceDueDate() string`

GetInvoiceDueDate returns the InvoiceDueDate field if non-nil, zero value otherwise.

### GetInvoiceDueDateOk

`func (o *BillingInvoice) GetInvoiceDueDateOk() (*string, bool)`

GetInvoiceDueDateOk returns a tuple with the InvoiceDueDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInvoiceDueDate

`func (o *BillingInvoice) SetInvoiceDueDate(v string)`

SetInvoiceDueDate sets InvoiceDueDate field to given value.

### HasInvoiceDueDate

`func (o *BillingInvoice) HasInvoiceDueDate() bool`

HasInvoiceDueDate returns a boolean if a field has been set.

### GetPaymentTerms

`func (o *BillingInvoice) GetPaymentTerms() string`

GetPaymentTerms returns the PaymentTerms field if non-nil, zero value otherwise.

### GetPaymentTermsOk

`func (o *BillingInvoice) GetPaymentTermsOk() (*string, bool)`

GetPaymentTermsOk returns a tuple with the PaymentTerms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentTerms

`func (o *BillingInvoice) SetPaymentTerms(v string)`

SetPaymentTerms sets PaymentTerms field to given value.

### HasPaymentTerms

`func (o *BillingInvoice) HasPaymentTerms() bool`

HasPaymentTerms returns a boolean if a field has been set.

### GetStatus

`func (o *BillingInvoice) GetStatus() BillingInvoiceStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *BillingInvoice) GetStatusOk() (*BillingInvoiceStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *BillingInvoice) SetStatus(v BillingInvoiceStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *BillingInvoice) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


