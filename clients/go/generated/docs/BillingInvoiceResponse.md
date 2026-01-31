# BillingInvoiceResponse

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
**DocumentType** | Pointer to **string** | The type of the document | [optional] 
**Id** | Pointer to **string** | Unique identifier for the billing invoice | [optional] 
**InvoiceDueDate** | Pointer to **string** | The date the invoice is due. Format: YYYY-MM-DD | [optional] 
**PaymentTerms** | Pointer to **string** | The payment terms of the invoice | [optional] 
**Status** | Pointer to **string** | The status of the invoice | [optional] 

## Methods

### NewBillingInvoiceResponse

`func NewBillingInvoiceResponse() *BillingInvoiceResponse`

NewBillingInvoiceResponse instantiates a new BillingInvoiceResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBillingInvoiceResponseWithDefaults

`func NewBillingInvoiceResponseWithDefaults() *BillingInvoiceResponse`

NewBillingInvoiceResponseWithDefaults instantiates a new BillingInvoiceResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *BillingInvoiceResponse) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *BillingInvoiceResponse) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *BillingInvoiceResponse) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *BillingInvoiceResponse) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetAdAccountName

`func (o *BillingInvoiceResponse) GetAdAccountName() string`

GetAdAccountName returns the AdAccountName field if non-nil, zero value otherwise.

### GetAdAccountNameOk

`func (o *BillingInvoiceResponse) GetAdAccountNameOk() (*string, bool)`

GetAdAccountNameOk returns a tuple with the AdAccountName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountName

`func (o *BillingInvoiceResponse) SetAdAccountName(v string)`

SetAdAccountName sets AdAccountName field to given value.

### HasAdAccountName

`func (o *BillingInvoiceResponse) HasAdAccountName() bool`

HasAdAccountName returns a boolean if a field has been set.

### GetAmountBilledMicroCurrency

`func (o *BillingInvoiceResponse) GetAmountBilledMicroCurrency() int32`

GetAmountBilledMicroCurrency returns the AmountBilledMicroCurrency field if non-nil, zero value otherwise.

### GetAmountBilledMicroCurrencyOk

`func (o *BillingInvoiceResponse) GetAmountBilledMicroCurrencyOk() (*int32, bool)`

GetAmountBilledMicroCurrencyOk returns a tuple with the AmountBilledMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmountBilledMicroCurrency

`func (o *BillingInvoiceResponse) SetAmountBilledMicroCurrency(v int32)`

SetAmountBilledMicroCurrency sets AmountBilledMicroCurrency field to given value.

### HasAmountBilledMicroCurrency

`func (o *BillingInvoiceResponse) HasAmountBilledMicroCurrency() bool`

HasAmountBilledMicroCurrency returns a boolean if a field has been set.

### GetAmountDiscountMicroCurrency

`func (o *BillingInvoiceResponse) GetAmountDiscountMicroCurrency() int32`

GetAmountDiscountMicroCurrency returns the AmountDiscountMicroCurrency field if non-nil, zero value otherwise.

### GetAmountDiscountMicroCurrencyOk

`func (o *BillingInvoiceResponse) GetAmountDiscountMicroCurrencyOk() (*int32, bool)`

GetAmountDiscountMicroCurrencyOk returns a tuple with the AmountDiscountMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmountDiscountMicroCurrency

`func (o *BillingInvoiceResponse) SetAmountDiscountMicroCurrency(v int32)`

SetAmountDiscountMicroCurrency sets AmountDiscountMicroCurrency field to given value.

### HasAmountDiscountMicroCurrency

`func (o *BillingInvoiceResponse) HasAmountDiscountMicroCurrency() bool`

HasAmountDiscountMicroCurrency returns a boolean if a field has been set.

### SetAmountDiscountMicroCurrencyNil

`func (o *BillingInvoiceResponse) SetAmountDiscountMicroCurrencyNil(b bool)`

 SetAmountDiscountMicroCurrencyNil sets the value for AmountDiscountMicroCurrency to be an explicit nil

### UnsetAmountDiscountMicroCurrency
`func (o *BillingInvoiceResponse) UnsetAmountDiscountMicroCurrency()`

UnsetAmountDiscountMicroCurrency ensures that no value is present for AmountDiscountMicroCurrency, not even an explicit nil
### GetAmountNetMicroCurrency

`func (o *BillingInvoiceResponse) GetAmountNetMicroCurrency() int32`

GetAmountNetMicroCurrency returns the AmountNetMicroCurrency field if non-nil, zero value otherwise.

### GetAmountNetMicroCurrencyOk

`func (o *BillingInvoiceResponse) GetAmountNetMicroCurrencyOk() (*int32, bool)`

GetAmountNetMicroCurrencyOk returns a tuple with the AmountNetMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmountNetMicroCurrency

`func (o *BillingInvoiceResponse) SetAmountNetMicroCurrency(v int32)`

SetAmountNetMicroCurrency sets AmountNetMicroCurrency field to given value.

### HasAmountNetMicroCurrency

`func (o *BillingInvoiceResponse) HasAmountNetMicroCurrency() bool`

HasAmountNetMicroCurrency returns a boolean if a field has been set.

### SetAmountNetMicroCurrencyNil

`func (o *BillingInvoiceResponse) SetAmountNetMicroCurrencyNil(b bool)`

 SetAmountNetMicroCurrencyNil sets the value for AmountNetMicroCurrency to be an explicit nil

### UnsetAmountNetMicroCurrency
`func (o *BillingInvoiceResponse) UnsetAmountNetMicroCurrency()`

UnsetAmountNetMicroCurrency ensures that no value is present for AmountNetMicroCurrency, not even an explicit nil
### GetAmountTaxMicroCurrency

`func (o *BillingInvoiceResponse) GetAmountTaxMicroCurrency() int32`

GetAmountTaxMicroCurrency returns the AmountTaxMicroCurrency field if non-nil, zero value otherwise.

### GetAmountTaxMicroCurrencyOk

`func (o *BillingInvoiceResponse) GetAmountTaxMicroCurrencyOk() (*int32, bool)`

GetAmountTaxMicroCurrencyOk returns a tuple with the AmountTaxMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmountTaxMicroCurrency

`func (o *BillingInvoiceResponse) SetAmountTaxMicroCurrency(v int32)`

SetAmountTaxMicroCurrency sets AmountTaxMicroCurrency field to given value.

### HasAmountTaxMicroCurrency

`func (o *BillingInvoiceResponse) HasAmountTaxMicroCurrency() bool`

HasAmountTaxMicroCurrency returns a boolean if a field has been set.

### SetAmountTaxMicroCurrencyNil

`func (o *BillingInvoiceResponse) SetAmountTaxMicroCurrencyNil(b bool)`

 SetAmountTaxMicroCurrencyNil sets the value for AmountTaxMicroCurrency to be an explicit nil

### UnsetAmountTaxMicroCurrency
`func (o *BillingInvoiceResponse) UnsetAmountTaxMicroCurrency()`

UnsetAmountTaxMicroCurrency ensures that no value is present for AmountTaxMicroCurrency, not even an explicit nil
### GetBillToCountry

`func (o *BillingInvoiceResponse) GetBillToCountry() string`

GetBillToCountry returns the BillToCountry field if non-nil, zero value otherwise.

### GetBillToCountryOk

`func (o *BillingInvoiceResponse) GetBillToCountryOk() (*string, bool)`

GetBillToCountryOk returns a tuple with the BillToCountry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillToCountry

`func (o *BillingInvoiceResponse) SetBillToCountry(v string)`

SetBillToCountry sets BillToCountry field to given value.

### HasBillToCountry

`func (o *BillingInvoiceResponse) HasBillToCountry() bool`

HasBillToCountry returns a boolean if a field has been set.

### GetBillingPeriodEndDate

`func (o *BillingInvoiceResponse) GetBillingPeriodEndDate() string`

GetBillingPeriodEndDate returns the BillingPeriodEndDate field if non-nil, zero value otherwise.

### GetBillingPeriodEndDateOk

`func (o *BillingInvoiceResponse) GetBillingPeriodEndDateOk() (*string, bool)`

GetBillingPeriodEndDateOk returns a tuple with the BillingPeriodEndDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingPeriodEndDate

`func (o *BillingInvoiceResponse) SetBillingPeriodEndDate(v string)`

SetBillingPeriodEndDate sets BillingPeriodEndDate field to given value.

### HasBillingPeriodEndDate

`func (o *BillingInvoiceResponse) HasBillingPeriodEndDate() bool`

HasBillingPeriodEndDate returns a boolean if a field has been set.

### GetBillingPeriodStartDate

`func (o *BillingInvoiceResponse) GetBillingPeriodStartDate() string`

GetBillingPeriodStartDate returns the BillingPeriodStartDate field if non-nil, zero value otherwise.

### GetBillingPeriodStartDateOk

`func (o *BillingInvoiceResponse) GetBillingPeriodStartDateOk() (*string, bool)`

GetBillingPeriodStartDateOk returns a tuple with the BillingPeriodStartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingPeriodStartDate

`func (o *BillingInvoiceResponse) SetBillingPeriodStartDate(v string)`

SetBillingPeriodStartDate sets BillingPeriodStartDate field to given value.

### HasBillingPeriodStartDate

`func (o *BillingInvoiceResponse) HasBillingPeriodStartDate() bool`

HasBillingPeriodStartDate returns a boolean if a field has been set.

### GetCurrency

`func (o *BillingInvoiceResponse) GetCurrency() Currency`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *BillingInvoiceResponse) GetCurrencyOk() (*Currency, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *BillingInvoiceResponse) SetCurrency(v Currency)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *BillingInvoiceResponse) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetDocumentType

`func (o *BillingInvoiceResponse) GetDocumentType() string`

GetDocumentType returns the DocumentType field if non-nil, zero value otherwise.

### GetDocumentTypeOk

`func (o *BillingInvoiceResponse) GetDocumentTypeOk() (*string, bool)`

GetDocumentTypeOk returns a tuple with the DocumentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDocumentType

`func (o *BillingInvoiceResponse) SetDocumentType(v string)`

SetDocumentType sets DocumentType field to given value.

### HasDocumentType

`func (o *BillingInvoiceResponse) HasDocumentType() bool`

HasDocumentType returns a boolean if a field has been set.

### GetId

`func (o *BillingInvoiceResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *BillingInvoiceResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *BillingInvoiceResponse) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *BillingInvoiceResponse) HasId() bool`

HasId returns a boolean if a field has been set.

### GetInvoiceDueDate

`func (o *BillingInvoiceResponse) GetInvoiceDueDate() string`

GetInvoiceDueDate returns the InvoiceDueDate field if non-nil, zero value otherwise.

### GetInvoiceDueDateOk

`func (o *BillingInvoiceResponse) GetInvoiceDueDateOk() (*string, bool)`

GetInvoiceDueDateOk returns a tuple with the InvoiceDueDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInvoiceDueDate

`func (o *BillingInvoiceResponse) SetInvoiceDueDate(v string)`

SetInvoiceDueDate sets InvoiceDueDate field to given value.

### HasInvoiceDueDate

`func (o *BillingInvoiceResponse) HasInvoiceDueDate() bool`

HasInvoiceDueDate returns a boolean if a field has been set.

### GetPaymentTerms

`func (o *BillingInvoiceResponse) GetPaymentTerms() string`

GetPaymentTerms returns the PaymentTerms field if non-nil, zero value otherwise.

### GetPaymentTermsOk

`func (o *BillingInvoiceResponse) GetPaymentTermsOk() (*string, bool)`

GetPaymentTermsOk returns a tuple with the PaymentTerms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentTerms

`func (o *BillingInvoiceResponse) SetPaymentTerms(v string)`

SetPaymentTerms sets PaymentTerms field to given value.

### HasPaymentTerms

`func (o *BillingInvoiceResponse) HasPaymentTerms() bool`

HasPaymentTerms returns a boolean if a field has been set.

### GetStatus

`func (o *BillingInvoiceResponse) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *BillingInvoiceResponse) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *BillingInvoiceResponse) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *BillingInvoiceResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


