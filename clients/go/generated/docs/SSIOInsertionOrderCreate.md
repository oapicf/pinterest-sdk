# SSIOInsertionOrderCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AcceptedTermsId** | **string** | The SFDC id for the terms | 
**AcceptedTermsTime** | Pointer to **int32** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**AgencyLink** | Pointer to **string** | URL link for agency | [optional] 
**BillingContactEmail** | **string** | The billing contact email | 
**BillingContactFirstname** | **string** | The billing contact first name | 
**BillingContactLastname** | **string** | The billing contact last name | 
**BilltoBillingAddressId** | **string** | The bill-to billing address id | 
**BilltoBusinessAddressId** | **string** | The bill-to business address id | 
**BilltoCompanyId** | **string** | The bill-to company id | 
**BudgetAmount** | Pointer to **float64** | If Budget order line, the budget amount. | [optional] 
**CurrencyInfo** | [**Currency**](Currency.md) |  | 
**EndDate** | Pointer to **string** | End date of time period. Format: YYYY-MM-DD | [optional] 
**EstimatedMonthlySpend** | Pointer to **float64** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 
**MediaContactEmail** | **string** | The media contact email | 
**MediaContactFirstname** | **string** | The media contact first name | 
**MediaContactLastname** | **string** | The media contact last name | 
**OrderLineType** | [**SSIOOrderLineType**](SSIOOrderLineType.md) | Type can be Budget or Perpetual | 
**OrderName** | **string** | The order name | 
**PmpId** | **string** | The pmp id | 
**PoNumber** | **string** | The po number | 
**StartDate** | **string** | Starting date of time period. Format: YYYY-MM-DD | 
**UserEmail** | Pointer to **string** | The email of user submitting the insertion order | [optional] 

## Methods

### NewSSIOInsertionOrderCreate

`func NewSSIOInsertionOrderCreate(acceptedTermsId string, billingContactEmail string, billingContactFirstname string, billingContactLastname string, billtoBillingAddressId string, billtoBusinessAddressId string, billtoCompanyId string, currencyInfo Currency, mediaContactEmail string, mediaContactFirstname string, mediaContactLastname string, orderLineType SSIOOrderLineType, orderName string, pmpId string, poNumber string, startDate string, ) *SSIOInsertionOrderCreate`

NewSSIOInsertionOrderCreate instantiates a new SSIOInsertionOrderCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSSIOInsertionOrderCreateWithDefaults

`func NewSSIOInsertionOrderCreateWithDefaults() *SSIOInsertionOrderCreate`

NewSSIOInsertionOrderCreateWithDefaults instantiates a new SSIOInsertionOrderCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAcceptedTermsId

`func (o *SSIOInsertionOrderCreate) GetAcceptedTermsId() string`

GetAcceptedTermsId returns the AcceptedTermsId field if non-nil, zero value otherwise.

### GetAcceptedTermsIdOk

`func (o *SSIOInsertionOrderCreate) GetAcceptedTermsIdOk() (*string, bool)`

GetAcceptedTermsIdOk returns a tuple with the AcceptedTermsId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcceptedTermsId

`func (o *SSIOInsertionOrderCreate) SetAcceptedTermsId(v string)`

SetAcceptedTermsId sets AcceptedTermsId field to given value.


### GetAcceptedTermsTime

`func (o *SSIOInsertionOrderCreate) GetAcceptedTermsTime() int32`

GetAcceptedTermsTime returns the AcceptedTermsTime field if non-nil, zero value otherwise.

### GetAcceptedTermsTimeOk

`func (o *SSIOInsertionOrderCreate) GetAcceptedTermsTimeOk() (*int32, bool)`

GetAcceptedTermsTimeOk returns a tuple with the AcceptedTermsTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcceptedTermsTime

`func (o *SSIOInsertionOrderCreate) SetAcceptedTermsTime(v int32)`

SetAcceptedTermsTime sets AcceptedTermsTime field to given value.

### HasAcceptedTermsTime

`func (o *SSIOInsertionOrderCreate) HasAcceptedTermsTime() bool`

HasAcceptedTermsTime returns a boolean if a field has been set.

### GetAgencyLink

`func (o *SSIOInsertionOrderCreate) GetAgencyLink() string`

GetAgencyLink returns the AgencyLink field if non-nil, zero value otherwise.

### GetAgencyLinkOk

`func (o *SSIOInsertionOrderCreate) GetAgencyLinkOk() (*string, bool)`

GetAgencyLinkOk returns a tuple with the AgencyLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgencyLink

`func (o *SSIOInsertionOrderCreate) SetAgencyLink(v string)`

SetAgencyLink sets AgencyLink field to given value.

### HasAgencyLink

`func (o *SSIOInsertionOrderCreate) HasAgencyLink() bool`

HasAgencyLink returns a boolean if a field has been set.

### GetBillingContactEmail

`func (o *SSIOInsertionOrderCreate) GetBillingContactEmail() string`

GetBillingContactEmail returns the BillingContactEmail field if non-nil, zero value otherwise.

### GetBillingContactEmailOk

`func (o *SSIOInsertionOrderCreate) GetBillingContactEmailOk() (*string, bool)`

GetBillingContactEmailOk returns a tuple with the BillingContactEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingContactEmail

`func (o *SSIOInsertionOrderCreate) SetBillingContactEmail(v string)`

SetBillingContactEmail sets BillingContactEmail field to given value.


### GetBillingContactFirstname

`func (o *SSIOInsertionOrderCreate) GetBillingContactFirstname() string`

GetBillingContactFirstname returns the BillingContactFirstname field if non-nil, zero value otherwise.

### GetBillingContactFirstnameOk

`func (o *SSIOInsertionOrderCreate) GetBillingContactFirstnameOk() (*string, bool)`

GetBillingContactFirstnameOk returns a tuple with the BillingContactFirstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingContactFirstname

`func (o *SSIOInsertionOrderCreate) SetBillingContactFirstname(v string)`

SetBillingContactFirstname sets BillingContactFirstname field to given value.


### GetBillingContactLastname

`func (o *SSIOInsertionOrderCreate) GetBillingContactLastname() string`

GetBillingContactLastname returns the BillingContactLastname field if non-nil, zero value otherwise.

### GetBillingContactLastnameOk

`func (o *SSIOInsertionOrderCreate) GetBillingContactLastnameOk() (*string, bool)`

GetBillingContactLastnameOk returns a tuple with the BillingContactLastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingContactLastname

`func (o *SSIOInsertionOrderCreate) SetBillingContactLastname(v string)`

SetBillingContactLastname sets BillingContactLastname field to given value.


### GetBilltoBillingAddressId

`func (o *SSIOInsertionOrderCreate) GetBilltoBillingAddressId() string`

GetBilltoBillingAddressId returns the BilltoBillingAddressId field if non-nil, zero value otherwise.

### GetBilltoBillingAddressIdOk

`func (o *SSIOInsertionOrderCreate) GetBilltoBillingAddressIdOk() (*string, bool)`

GetBilltoBillingAddressIdOk returns a tuple with the BilltoBillingAddressId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBilltoBillingAddressId

`func (o *SSIOInsertionOrderCreate) SetBilltoBillingAddressId(v string)`

SetBilltoBillingAddressId sets BilltoBillingAddressId field to given value.


### GetBilltoBusinessAddressId

`func (o *SSIOInsertionOrderCreate) GetBilltoBusinessAddressId() string`

GetBilltoBusinessAddressId returns the BilltoBusinessAddressId field if non-nil, zero value otherwise.

### GetBilltoBusinessAddressIdOk

`func (o *SSIOInsertionOrderCreate) GetBilltoBusinessAddressIdOk() (*string, bool)`

GetBilltoBusinessAddressIdOk returns a tuple with the BilltoBusinessAddressId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBilltoBusinessAddressId

`func (o *SSIOInsertionOrderCreate) SetBilltoBusinessAddressId(v string)`

SetBilltoBusinessAddressId sets BilltoBusinessAddressId field to given value.


### GetBilltoCompanyId

`func (o *SSIOInsertionOrderCreate) GetBilltoCompanyId() string`

GetBilltoCompanyId returns the BilltoCompanyId field if non-nil, zero value otherwise.

### GetBilltoCompanyIdOk

`func (o *SSIOInsertionOrderCreate) GetBilltoCompanyIdOk() (*string, bool)`

GetBilltoCompanyIdOk returns a tuple with the BilltoCompanyId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBilltoCompanyId

`func (o *SSIOInsertionOrderCreate) SetBilltoCompanyId(v string)`

SetBilltoCompanyId sets BilltoCompanyId field to given value.


### GetBudgetAmount

`func (o *SSIOInsertionOrderCreate) GetBudgetAmount() float64`

GetBudgetAmount returns the BudgetAmount field if non-nil, zero value otherwise.

### GetBudgetAmountOk

`func (o *SSIOInsertionOrderCreate) GetBudgetAmountOk() (*float64, bool)`

GetBudgetAmountOk returns a tuple with the BudgetAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetAmount

`func (o *SSIOInsertionOrderCreate) SetBudgetAmount(v float64)`

SetBudgetAmount sets BudgetAmount field to given value.

### HasBudgetAmount

`func (o *SSIOInsertionOrderCreate) HasBudgetAmount() bool`

HasBudgetAmount returns a boolean if a field has been set.

### GetCurrencyInfo

`func (o *SSIOInsertionOrderCreate) GetCurrencyInfo() Currency`

GetCurrencyInfo returns the CurrencyInfo field if non-nil, zero value otherwise.

### GetCurrencyInfoOk

`func (o *SSIOInsertionOrderCreate) GetCurrencyInfoOk() (*Currency, bool)`

GetCurrencyInfoOk returns a tuple with the CurrencyInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrencyInfo

`func (o *SSIOInsertionOrderCreate) SetCurrencyInfo(v Currency)`

SetCurrencyInfo sets CurrencyInfo field to given value.


### GetEndDate

`func (o *SSIOInsertionOrderCreate) GetEndDate() string`

GetEndDate returns the EndDate field if non-nil, zero value otherwise.

### GetEndDateOk

`func (o *SSIOInsertionOrderCreate) GetEndDateOk() (*string, bool)`

GetEndDateOk returns a tuple with the EndDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndDate

`func (o *SSIOInsertionOrderCreate) SetEndDate(v string)`

SetEndDate sets EndDate field to given value.

### HasEndDate

`func (o *SSIOInsertionOrderCreate) HasEndDate() bool`

HasEndDate returns a boolean if a field has been set.

### GetEstimatedMonthlySpend

`func (o *SSIOInsertionOrderCreate) GetEstimatedMonthlySpend() float64`

GetEstimatedMonthlySpend returns the EstimatedMonthlySpend field if non-nil, zero value otherwise.

### GetEstimatedMonthlySpendOk

`func (o *SSIOInsertionOrderCreate) GetEstimatedMonthlySpendOk() (*float64, bool)`

GetEstimatedMonthlySpendOk returns a tuple with the EstimatedMonthlySpend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEstimatedMonthlySpend

`func (o *SSIOInsertionOrderCreate) SetEstimatedMonthlySpend(v float64)`

SetEstimatedMonthlySpend sets EstimatedMonthlySpend field to given value.

### HasEstimatedMonthlySpend

`func (o *SSIOInsertionOrderCreate) HasEstimatedMonthlySpend() bool`

HasEstimatedMonthlySpend returns a boolean if a field has been set.

### GetMediaContactEmail

`func (o *SSIOInsertionOrderCreate) GetMediaContactEmail() string`

GetMediaContactEmail returns the MediaContactEmail field if non-nil, zero value otherwise.

### GetMediaContactEmailOk

`func (o *SSIOInsertionOrderCreate) GetMediaContactEmailOk() (*string, bool)`

GetMediaContactEmailOk returns a tuple with the MediaContactEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaContactEmail

`func (o *SSIOInsertionOrderCreate) SetMediaContactEmail(v string)`

SetMediaContactEmail sets MediaContactEmail field to given value.


### GetMediaContactFirstname

`func (o *SSIOInsertionOrderCreate) GetMediaContactFirstname() string`

GetMediaContactFirstname returns the MediaContactFirstname field if non-nil, zero value otherwise.

### GetMediaContactFirstnameOk

`func (o *SSIOInsertionOrderCreate) GetMediaContactFirstnameOk() (*string, bool)`

GetMediaContactFirstnameOk returns a tuple with the MediaContactFirstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaContactFirstname

`func (o *SSIOInsertionOrderCreate) SetMediaContactFirstname(v string)`

SetMediaContactFirstname sets MediaContactFirstname field to given value.


### GetMediaContactLastname

`func (o *SSIOInsertionOrderCreate) GetMediaContactLastname() string`

GetMediaContactLastname returns the MediaContactLastname field if non-nil, zero value otherwise.

### GetMediaContactLastnameOk

`func (o *SSIOInsertionOrderCreate) GetMediaContactLastnameOk() (*string, bool)`

GetMediaContactLastnameOk returns a tuple with the MediaContactLastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaContactLastname

`func (o *SSIOInsertionOrderCreate) SetMediaContactLastname(v string)`

SetMediaContactLastname sets MediaContactLastname field to given value.


### GetOrderLineType

`func (o *SSIOInsertionOrderCreate) GetOrderLineType() SSIOOrderLineType`

GetOrderLineType returns the OrderLineType field if non-nil, zero value otherwise.

### GetOrderLineTypeOk

`func (o *SSIOInsertionOrderCreate) GetOrderLineTypeOk() (*SSIOOrderLineType, bool)`

GetOrderLineTypeOk returns a tuple with the OrderLineType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderLineType

`func (o *SSIOInsertionOrderCreate) SetOrderLineType(v SSIOOrderLineType)`

SetOrderLineType sets OrderLineType field to given value.


### GetOrderName

`func (o *SSIOInsertionOrderCreate) GetOrderName() string`

GetOrderName returns the OrderName field if non-nil, zero value otherwise.

### GetOrderNameOk

`func (o *SSIOInsertionOrderCreate) GetOrderNameOk() (*string, bool)`

GetOrderNameOk returns a tuple with the OrderName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderName

`func (o *SSIOInsertionOrderCreate) SetOrderName(v string)`

SetOrderName sets OrderName field to given value.


### GetPmpId

`func (o *SSIOInsertionOrderCreate) GetPmpId() string`

GetPmpId returns the PmpId field if non-nil, zero value otherwise.

### GetPmpIdOk

`func (o *SSIOInsertionOrderCreate) GetPmpIdOk() (*string, bool)`

GetPmpIdOk returns a tuple with the PmpId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPmpId

`func (o *SSIOInsertionOrderCreate) SetPmpId(v string)`

SetPmpId sets PmpId field to given value.


### GetPoNumber

`func (o *SSIOInsertionOrderCreate) GetPoNumber() string`

GetPoNumber returns the PoNumber field if non-nil, zero value otherwise.

### GetPoNumberOk

`func (o *SSIOInsertionOrderCreate) GetPoNumberOk() (*string, bool)`

GetPoNumberOk returns a tuple with the PoNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPoNumber

`func (o *SSIOInsertionOrderCreate) SetPoNumber(v string)`

SetPoNumber sets PoNumber field to given value.


### GetStartDate

`func (o *SSIOInsertionOrderCreate) GetStartDate() string`

GetStartDate returns the StartDate field if non-nil, zero value otherwise.

### GetStartDateOk

`func (o *SSIOInsertionOrderCreate) GetStartDateOk() (*string, bool)`

GetStartDateOk returns a tuple with the StartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartDate

`func (o *SSIOInsertionOrderCreate) SetStartDate(v string)`

SetStartDate sets StartDate field to given value.


### GetUserEmail

`func (o *SSIOInsertionOrderCreate) GetUserEmail() string`

GetUserEmail returns the UserEmail field if non-nil, zero value otherwise.

### GetUserEmailOk

`func (o *SSIOInsertionOrderCreate) GetUserEmailOk() (*string, bool)`

GetUserEmailOk returns a tuple with the UserEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserEmail

`func (o *SSIOInsertionOrderCreate) SetUserEmail(v string)`

SetUserEmail sets UserEmail field to given value.

### HasUserEmail

`func (o *SSIOInsertionOrderCreate) HasUserEmail() bool`

HasUserEmail returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


