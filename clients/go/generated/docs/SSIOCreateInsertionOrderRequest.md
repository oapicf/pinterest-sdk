# SSIOCreateInsertionOrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartDate** | **string** | Starting date of time period. Format: YYYY-MM-DD | 
**EndDate** | Pointer to **string** | End date of time period. Format: YYYY-MM-DD | [optional] 
**PoNumber** | **string** | The po number | 
**BudgetAmount** | Pointer to **float32** | If Budget order line, the budget amount. | [optional] 
**BillingContactFirstname** | **string** | The billing contact first name | 
**BillingContactLastname** | **string** | The billing contact last name | 
**BillingContactEmail** | **string** | The billing contact email | 
**MediaContactFirstname** | **string** | The media contact first name | 
**MediaContactLastname** | **string** | The media contact last name | 
**MediaContactEmail** | **string** | The media contact email | 
**AgencyLink** | Pointer to **string** | URL link for agency | [optional] 
**UserEmail** | Pointer to **string** | The email of user submitting the insertion order | [optional] 
**AcceptedTermsTime** | Pointer to **int32** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**PmpId** | **string** | The pmp id | 
**OrderName** | **string** | The order name | 
**OrderLineType** | **string** | Type can be Budget or Perpetual | 
**AcceptedTermsId** | **string** | The SFDC id for the terms | 
**BilltoCompanyId** | **string** | The bill-to company id | 
**BilltoBusinessAddressId** | **string** | The bill-to business address id | 
**BilltoBillingAddressId** | **string** | The bill-to billing address id | 
**EstimatedMonthlySpend** | Pointer to **float32** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 
**CurrencyInfo** | [**Currency**](Currency.md) |  | 

## Methods

### NewSSIOCreateInsertionOrderRequest

`func NewSSIOCreateInsertionOrderRequest(startDate string, poNumber string, billingContactFirstname string, billingContactLastname string, billingContactEmail string, mediaContactFirstname string, mediaContactLastname string, mediaContactEmail string, pmpId string, orderName string, orderLineType string, acceptedTermsId string, billtoCompanyId string, billtoBusinessAddressId string, billtoBillingAddressId string, currencyInfo Currency, ) *SSIOCreateInsertionOrderRequest`

NewSSIOCreateInsertionOrderRequest instantiates a new SSIOCreateInsertionOrderRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSSIOCreateInsertionOrderRequestWithDefaults

`func NewSSIOCreateInsertionOrderRequestWithDefaults() *SSIOCreateInsertionOrderRequest`

NewSSIOCreateInsertionOrderRequestWithDefaults instantiates a new SSIOCreateInsertionOrderRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStartDate

`func (o *SSIOCreateInsertionOrderRequest) GetStartDate() string`

GetStartDate returns the StartDate field if non-nil, zero value otherwise.

### GetStartDateOk

`func (o *SSIOCreateInsertionOrderRequest) GetStartDateOk() (*string, bool)`

GetStartDateOk returns a tuple with the StartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartDate

`func (o *SSIOCreateInsertionOrderRequest) SetStartDate(v string)`

SetStartDate sets StartDate field to given value.


### GetEndDate

`func (o *SSIOCreateInsertionOrderRequest) GetEndDate() string`

GetEndDate returns the EndDate field if non-nil, zero value otherwise.

### GetEndDateOk

`func (o *SSIOCreateInsertionOrderRequest) GetEndDateOk() (*string, bool)`

GetEndDateOk returns a tuple with the EndDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndDate

`func (o *SSIOCreateInsertionOrderRequest) SetEndDate(v string)`

SetEndDate sets EndDate field to given value.

### HasEndDate

`func (o *SSIOCreateInsertionOrderRequest) HasEndDate() bool`

HasEndDate returns a boolean if a field has been set.

### GetPoNumber

`func (o *SSIOCreateInsertionOrderRequest) GetPoNumber() string`

GetPoNumber returns the PoNumber field if non-nil, zero value otherwise.

### GetPoNumberOk

`func (o *SSIOCreateInsertionOrderRequest) GetPoNumberOk() (*string, bool)`

GetPoNumberOk returns a tuple with the PoNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPoNumber

`func (o *SSIOCreateInsertionOrderRequest) SetPoNumber(v string)`

SetPoNumber sets PoNumber field to given value.


### GetBudgetAmount

`func (o *SSIOCreateInsertionOrderRequest) GetBudgetAmount() float32`

GetBudgetAmount returns the BudgetAmount field if non-nil, zero value otherwise.

### GetBudgetAmountOk

`func (o *SSIOCreateInsertionOrderRequest) GetBudgetAmountOk() (*float32, bool)`

GetBudgetAmountOk returns a tuple with the BudgetAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetAmount

`func (o *SSIOCreateInsertionOrderRequest) SetBudgetAmount(v float32)`

SetBudgetAmount sets BudgetAmount field to given value.

### HasBudgetAmount

`func (o *SSIOCreateInsertionOrderRequest) HasBudgetAmount() bool`

HasBudgetAmount returns a boolean if a field has been set.

### GetBillingContactFirstname

`func (o *SSIOCreateInsertionOrderRequest) GetBillingContactFirstname() string`

GetBillingContactFirstname returns the BillingContactFirstname field if non-nil, zero value otherwise.

### GetBillingContactFirstnameOk

`func (o *SSIOCreateInsertionOrderRequest) GetBillingContactFirstnameOk() (*string, bool)`

GetBillingContactFirstnameOk returns a tuple with the BillingContactFirstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingContactFirstname

`func (o *SSIOCreateInsertionOrderRequest) SetBillingContactFirstname(v string)`

SetBillingContactFirstname sets BillingContactFirstname field to given value.


### GetBillingContactLastname

`func (o *SSIOCreateInsertionOrderRequest) GetBillingContactLastname() string`

GetBillingContactLastname returns the BillingContactLastname field if non-nil, zero value otherwise.

### GetBillingContactLastnameOk

`func (o *SSIOCreateInsertionOrderRequest) GetBillingContactLastnameOk() (*string, bool)`

GetBillingContactLastnameOk returns a tuple with the BillingContactLastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingContactLastname

`func (o *SSIOCreateInsertionOrderRequest) SetBillingContactLastname(v string)`

SetBillingContactLastname sets BillingContactLastname field to given value.


### GetBillingContactEmail

`func (o *SSIOCreateInsertionOrderRequest) GetBillingContactEmail() string`

GetBillingContactEmail returns the BillingContactEmail field if non-nil, zero value otherwise.

### GetBillingContactEmailOk

`func (o *SSIOCreateInsertionOrderRequest) GetBillingContactEmailOk() (*string, bool)`

GetBillingContactEmailOk returns a tuple with the BillingContactEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingContactEmail

`func (o *SSIOCreateInsertionOrderRequest) SetBillingContactEmail(v string)`

SetBillingContactEmail sets BillingContactEmail field to given value.


### GetMediaContactFirstname

`func (o *SSIOCreateInsertionOrderRequest) GetMediaContactFirstname() string`

GetMediaContactFirstname returns the MediaContactFirstname field if non-nil, zero value otherwise.

### GetMediaContactFirstnameOk

`func (o *SSIOCreateInsertionOrderRequest) GetMediaContactFirstnameOk() (*string, bool)`

GetMediaContactFirstnameOk returns a tuple with the MediaContactFirstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaContactFirstname

`func (o *SSIOCreateInsertionOrderRequest) SetMediaContactFirstname(v string)`

SetMediaContactFirstname sets MediaContactFirstname field to given value.


### GetMediaContactLastname

`func (o *SSIOCreateInsertionOrderRequest) GetMediaContactLastname() string`

GetMediaContactLastname returns the MediaContactLastname field if non-nil, zero value otherwise.

### GetMediaContactLastnameOk

`func (o *SSIOCreateInsertionOrderRequest) GetMediaContactLastnameOk() (*string, bool)`

GetMediaContactLastnameOk returns a tuple with the MediaContactLastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaContactLastname

`func (o *SSIOCreateInsertionOrderRequest) SetMediaContactLastname(v string)`

SetMediaContactLastname sets MediaContactLastname field to given value.


### GetMediaContactEmail

`func (o *SSIOCreateInsertionOrderRequest) GetMediaContactEmail() string`

GetMediaContactEmail returns the MediaContactEmail field if non-nil, zero value otherwise.

### GetMediaContactEmailOk

`func (o *SSIOCreateInsertionOrderRequest) GetMediaContactEmailOk() (*string, bool)`

GetMediaContactEmailOk returns a tuple with the MediaContactEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaContactEmail

`func (o *SSIOCreateInsertionOrderRequest) SetMediaContactEmail(v string)`

SetMediaContactEmail sets MediaContactEmail field to given value.


### GetAgencyLink

`func (o *SSIOCreateInsertionOrderRequest) GetAgencyLink() string`

GetAgencyLink returns the AgencyLink field if non-nil, zero value otherwise.

### GetAgencyLinkOk

`func (o *SSIOCreateInsertionOrderRequest) GetAgencyLinkOk() (*string, bool)`

GetAgencyLinkOk returns a tuple with the AgencyLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgencyLink

`func (o *SSIOCreateInsertionOrderRequest) SetAgencyLink(v string)`

SetAgencyLink sets AgencyLink field to given value.

### HasAgencyLink

`func (o *SSIOCreateInsertionOrderRequest) HasAgencyLink() bool`

HasAgencyLink returns a boolean if a field has been set.

### GetUserEmail

`func (o *SSIOCreateInsertionOrderRequest) GetUserEmail() string`

GetUserEmail returns the UserEmail field if non-nil, zero value otherwise.

### GetUserEmailOk

`func (o *SSIOCreateInsertionOrderRequest) GetUserEmailOk() (*string, bool)`

GetUserEmailOk returns a tuple with the UserEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserEmail

`func (o *SSIOCreateInsertionOrderRequest) SetUserEmail(v string)`

SetUserEmail sets UserEmail field to given value.

### HasUserEmail

`func (o *SSIOCreateInsertionOrderRequest) HasUserEmail() bool`

HasUserEmail returns a boolean if a field has been set.

### GetAcceptedTermsTime

`func (o *SSIOCreateInsertionOrderRequest) GetAcceptedTermsTime() int32`

GetAcceptedTermsTime returns the AcceptedTermsTime field if non-nil, zero value otherwise.

### GetAcceptedTermsTimeOk

`func (o *SSIOCreateInsertionOrderRequest) GetAcceptedTermsTimeOk() (*int32, bool)`

GetAcceptedTermsTimeOk returns a tuple with the AcceptedTermsTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcceptedTermsTime

`func (o *SSIOCreateInsertionOrderRequest) SetAcceptedTermsTime(v int32)`

SetAcceptedTermsTime sets AcceptedTermsTime field to given value.

### HasAcceptedTermsTime

`func (o *SSIOCreateInsertionOrderRequest) HasAcceptedTermsTime() bool`

HasAcceptedTermsTime returns a boolean if a field has been set.

### GetPmpId

`func (o *SSIOCreateInsertionOrderRequest) GetPmpId() string`

GetPmpId returns the PmpId field if non-nil, zero value otherwise.

### GetPmpIdOk

`func (o *SSIOCreateInsertionOrderRequest) GetPmpIdOk() (*string, bool)`

GetPmpIdOk returns a tuple with the PmpId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPmpId

`func (o *SSIOCreateInsertionOrderRequest) SetPmpId(v string)`

SetPmpId sets PmpId field to given value.


### GetOrderName

`func (o *SSIOCreateInsertionOrderRequest) GetOrderName() string`

GetOrderName returns the OrderName field if non-nil, zero value otherwise.

### GetOrderNameOk

`func (o *SSIOCreateInsertionOrderRequest) GetOrderNameOk() (*string, bool)`

GetOrderNameOk returns a tuple with the OrderName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderName

`func (o *SSIOCreateInsertionOrderRequest) SetOrderName(v string)`

SetOrderName sets OrderName field to given value.


### GetOrderLineType

`func (o *SSIOCreateInsertionOrderRequest) GetOrderLineType() string`

GetOrderLineType returns the OrderLineType field if non-nil, zero value otherwise.

### GetOrderLineTypeOk

`func (o *SSIOCreateInsertionOrderRequest) GetOrderLineTypeOk() (*string, bool)`

GetOrderLineTypeOk returns a tuple with the OrderLineType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderLineType

`func (o *SSIOCreateInsertionOrderRequest) SetOrderLineType(v string)`

SetOrderLineType sets OrderLineType field to given value.


### GetAcceptedTermsId

`func (o *SSIOCreateInsertionOrderRequest) GetAcceptedTermsId() string`

GetAcceptedTermsId returns the AcceptedTermsId field if non-nil, zero value otherwise.

### GetAcceptedTermsIdOk

`func (o *SSIOCreateInsertionOrderRequest) GetAcceptedTermsIdOk() (*string, bool)`

GetAcceptedTermsIdOk returns a tuple with the AcceptedTermsId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcceptedTermsId

`func (o *SSIOCreateInsertionOrderRequest) SetAcceptedTermsId(v string)`

SetAcceptedTermsId sets AcceptedTermsId field to given value.


### GetBilltoCompanyId

`func (o *SSIOCreateInsertionOrderRequest) GetBilltoCompanyId() string`

GetBilltoCompanyId returns the BilltoCompanyId field if non-nil, zero value otherwise.

### GetBilltoCompanyIdOk

`func (o *SSIOCreateInsertionOrderRequest) GetBilltoCompanyIdOk() (*string, bool)`

GetBilltoCompanyIdOk returns a tuple with the BilltoCompanyId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBilltoCompanyId

`func (o *SSIOCreateInsertionOrderRequest) SetBilltoCompanyId(v string)`

SetBilltoCompanyId sets BilltoCompanyId field to given value.


### GetBilltoBusinessAddressId

`func (o *SSIOCreateInsertionOrderRequest) GetBilltoBusinessAddressId() string`

GetBilltoBusinessAddressId returns the BilltoBusinessAddressId field if non-nil, zero value otherwise.

### GetBilltoBusinessAddressIdOk

`func (o *SSIOCreateInsertionOrderRequest) GetBilltoBusinessAddressIdOk() (*string, bool)`

GetBilltoBusinessAddressIdOk returns a tuple with the BilltoBusinessAddressId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBilltoBusinessAddressId

`func (o *SSIOCreateInsertionOrderRequest) SetBilltoBusinessAddressId(v string)`

SetBilltoBusinessAddressId sets BilltoBusinessAddressId field to given value.


### GetBilltoBillingAddressId

`func (o *SSIOCreateInsertionOrderRequest) GetBilltoBillingAddressId() string`

GetBilltoBillingAddressId returns the BilltoBillingAddressId field if non-nil, zero value otherwise.

### GetBilltoBillingAddressIdOk

`func (o *SSIOCreateInsertionOrderRequest) GetBilltoBillingAddressIdOk() (*string, bool)`

GetBilltoBillingAddressIdOk returns a tuple with the BilltoBillingAddressId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBilltoBillingAddressId

`func (o *SSIOCreateInsertionOrderRequest) SetBilltoBillingAddressId(v string)`

SetBilltoBillingAddressId sets BilltoBillingAddressId field to given value.


### GetEstimatedMonthlySpend

`func (o *SSIOCreateInsertionOrderRequest) GetEstimatedMonthlySpend() float32`

GetEstimatedMonthlySpend returns the EstimatedMonthlySpend field if non-nil, zero value otherwise.

### GetEstimatedMonthlySpendOk

`func (o *SSIOCreateInsertionOrderRequest) GetEstimatedMonthlySpendOk() (*float32, bool)`

GetEstimatedMonthlySpendOk returns a tuple with the EstimatedMonthlySpend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEstimatedMonthlySpend

`func (o *SSIOCreateInsertionOrderRequest) SetEstimatedMonthlySpend(v float32)`

SetEstimatedMonthlySpend sets EstimatedMonthlySpend field to given value.

### HasEstimatedMonthlySpend

`func (o *SSIOCreateInsertionOrderRequest) HasEstimatedMonthlySpend() bool`

HasEstimatedMonthlySpend returns a boolean if a field has been set.

### GetCurrencyInfo

`func (o *SSIOCreateInsertionOrderRequest) GetCurrencyInfo() Currency`

GetCurrencyInfo returns the CurrencyInfo field if non-nil, zero value otherwise.

### GetCurrencyInfoOk

`func (o *SSIOCreateInsertionOrderRequest) GetCurrencyInfoOk() (*Currency, bool)`

GetCurrencyInfoOk returns a tuple with the CurrencyInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrencyInfo

`func (o *SSIOCreateInsertionOrderRequest) SetCurrencyInfo(v Currency)`

SetCurrencyInfo sets CurrencyInfo field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


