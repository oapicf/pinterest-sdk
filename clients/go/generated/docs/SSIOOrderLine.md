# SSIOOrderLine

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SalesforceOrderLineId** | Pointer to **NullableString** | OrderLineId in SFDC | [optional] 
**AdsManagerOrderLineId** | Pointer to **NullableString** | Ads manager OrderLineId | [optional] 
**PinOrderId** | Pointer to **NullableString** | The pin order id associated with the order line in SFDC | [optional] 
**LastModifiedDateTime** | Pointer to **NullableString** | Last modified date. | [optional] 
**StartDate** | Pointer to **NullableString** | Start date of the order line. | [optional] 
**EndDate** | Pointer to **NullableString** | End date of the order line. | [optional] 
**BillToCompanyName** | Pointer to **NullableString** | Bill To Company name | [optional] 
**BillingContactFirstname** | Pointer to **NullableString** | Billing contact first name | [optional] 
**BillingContactLastname** | Pointer to **NullableString** | Billing contact last name | [optional] 
**BillingContactEmail** | Pointer to **NullableString** | Billing contact email | [optional] 
**MediaContactEmail** | Pointer to **NullableString** | Billing media email | [optional] 
**MediaContactFirstname** | Pointer to **NullableString** | Billing contact first name | [optional] 
**MediaContactLastname** | Pointer to **NullableString** | Billing contact first name | [optional] 
**CurrencyInfo** | Pointer to [**Currency**](Currency.md) |  | [optional] 
**AgencyLink** | Pointer to **NullableString** | Agency link | [optional] 
**PoNumber** | Pointer to **NullableString** | The po number | [optional] 
**OrderName** | Pointer to **NullableString** | The order name | [optional] 
**PmpName** | Pointer to **NullableString** | The Pinterest marketing partner name | [optional] 
**AcceptedTermsId** | Pointer to **NullableString** | The SFDC id for the terms | [optional] 
**AcceptedTermsTime** | Pointer to **NullableString** | The UTC timestamp (to the nearest sec) of when terms were accepted | [optional] 
**BudgetAmount** | Pointer to **NullableFloat32** | If Budget order line, the budget amount. | [optional] 
**EstimatedMonthlySpend** | Pointer to **NullableFloat32** | If Ongoing (perpetual) order line, the estimated monthly spend | [optional] 

## Methods

### NewSSIOOrderLine

`func NewSSIOOrderLine() *SSIOOrderLine`

NewSSIOOrderLine instantiates a new SSIOOrderLine object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSSIOOrderLineWithDefaults

`func NewSSIOOrderLineWithDefaults() *SSIOOrderLine`

NewSSIOOrderLineWithDefaults instantiates a new SSIOOrderLine object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSalesforceOrderLineId

`func (o *SSIOOrderLine) GetSalesforceOrderLineId() string`

GetSalesforceOrderLineId returns the SalesforceOrderLineId field if non-nil, zero value otherwise.

### GetSalesforceOrderLineIdOk

`func (o *SSIOOrderLine) GetSalesforceOrderLineIdOk() (*string, bool)`

GetSalesforceOrderLineIdOk returns a tuple with the SalesforceOrderLineId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSalesforceOrderLineId

`func (o *SSIOOrderLine) SetSalesforceOrderLineId(v string)`

SetSalesforceOrderLineId sets SalesforceOrderLineId field to given value.

### HasSalesforceOrderLineId

`func (o *SSIOOrderLine) HasSalesforceOrderLineId() bool`

HasSalesforceOrderLineId returns a boolean if a field has been set.

### SetSalesforceOrderLineIdNil

`func (o *SSIOOrderLine) SetSalesforceOrderLineIdNil(b bool)`

 SetSalesforceOrderLineIdNil sets the value for SalesforceOrderLineId to be an explicit nil

### UnsetSalesforceOrderLineId
`func (o *SSIOOrderLine) UnsetSalesforceOrderLineId()`

UnsetSalesforceOrderLineId ensures that no value is present for SalesforceOrderLineId, not even an explicit nil
### GetAdsManagerOrderLineId

`func (o *SSIOOrderLine) GetAdsManagerOrderLineId() string`

GetAdsManagerOrderLineId returns the AdsManagerOrderLineId field if non-nil, zero value otherwise.

### GetAdsManagerOrderLineIdOk

`func (o *SSIOOrderLine) GetAdsManagerOrderLineIdOk() (*string, bool)`

GetAdsManagerOrderLineIdOk returns a tuple with the AdsManagerOrderLineId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdsManagerOrderLineId

`func (o *SSIOOrderLine) SetAdsManagerOrderLineId(v string)`

SetAdsManagerOrderLineId sets AdsManagerOrderLineId field to given value.

### HasAdsManagerOrderLineId

`func (o *SSIOOrderLine) HasAdsManagerOrderLineId() bool`

HasAdsManagerOrderLineId returns a boolean if a field has been set.

### SetAdsManagerOrderLineIdNil

`func (o *SSIOOrderLine) SetAdsManagerOrderLineIdNil(b bool)`

 SetAdsManagerOrderLineIdNil sets the value for AdsManagerOrderLineId to be an explicit nil

### UnsetAdsManagerOrderLineId
`func (o *SSIOOrderLine) UnsetAdsManagerOrderLineId()`

UnsetAdsManagerOrderLineId ensures that no value is present for AdsManagerOrderLineId, not even an explicit nil
### GetPinOrderId

`func (o *SSIOOrderLine) GetPinOrderId() string`

GetPinOrderId returns the PinOrderId field if non-nil, zero value otherwise.

### GetPinOrderIdOk

`func (o *SSIOOrderLine) GetPinOrderIdOk() (*string, bool)`

GetPinOrderIdOk returns a tuple with the PinOrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinOrderId

`func (o *SSIOOrderLine) SetPinOrderId(v string)`

SetPinOrderId sets PinOrderId field to given value.

### HasPinOrderId

`func (o *SSIOOrderLine) HasPinOrderId() bool`

HasPinOrderId returns a boolean if a field has been set.

### SetPinOrderIdNil

`func (o *SSIOOrderLine) SetPinOrderIdNil(b bool)`

 SetPinOrderIdNil sets the value for PinOrderId to be an explicit nil

### UnsetPinOrderId
`func (o *SSIOOrderLine) UnsetPinOrderId()`

UnsetPinOrderId ensures that no value is present for PinOrderId, not even an explicit nil
### GetLastModifiedDateTime

`func (o *SSIOOrderLine) GetLastModifiedDateTime() string`

GetLastModifiedDateTime returns the LastModifiedDateTime field if non-nil, zero value otherwise.

### GetLastModifiedDateTimeOk

`func (o *SSIOOrderLine) GetLastModifiedDateTimeOk() (*string, bool)`

GetLastModifiedDateTimeOk returns a tuple with the LastModifiedDateTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastModifiedDateTime

`func (o *SSIOOrderLine) SetLastModifiedDateTime(v string)`

SetLastModifiedDateTime sets LastModifiedDateTime field to given value.

### HasLastModifiedDateTime

`func (o *SSIOOrderLine) HasLastModifiedDateTime() bool`

HasLastModifiedDateTime returns a boolean if a field has been set.

### SetLastModifiedDateTimeNil

`func (o *SSIOOrderLine) SetLastModifiedDateTimeNil(b bool)`

 SetLastModifiedDateTimeNil sets the value for LastModifiedDateTime to be an explicit nil

### UnsetLastModifiedDateTime
`func (o *SSIOOrderLine) UnsetLastModifiedDateTime()`

UnsetLastModifiedDateTime ensures that no value is present for LastModifiedDateTime, not even an explicit nil
### GetStartDate

`func (o *SSIOOrderLine) GetStartDate() string`

GetStartDate returns the StartDate field if non-nil, zero value otherwise.

### GetStartDateOk

`func (o *SSIOOrderLine) GetStartDateOk() (*string, bool)`

GetStartDateOk returns a tuple with the StartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartDate

`func (o *SSIOOrderLine) SetStartDate(v string)`

SetStartDate sets StartDate field to given value.

### HasStartDate

`func (o *SSIOOrderLine) HasStartDate() bool`

HasStartDate returns a boolean if a field has been set.

### SetStartDateNil

`func (o *SSIOOrderLine) SetStartDateNil(b bool)`

 SetStartDateNil sets the value for StartDate to be an explicit nil

### UnsetStartDate
`func (o *SSIOOrderLine) UnsetStartDate()`

UnsetStartDate ensures that no value is present for StartDate, not even an explicit nil
### GetEndDate

`func (o *SSIOOrderLine) GetEndDate() string`

GetEndDate returns the EndDate field if non-nil, zero value otherwise.

### GetEndDateOk

`func (o *SSIOOrderLine) GetEndDateOk() (*string, bool)`

GetEndDateOk returns a tuple with the EndDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndDate

`func (o *SSIOOrderLine) SetEndDate(v string)`

SetEndDate sets EndDate field to given value.

### HasEndDate

`func (o *SSIOOrderLine) HasEndDate() bool`

HasEndDate returns a boolean if a field has been set.

### SetEndDateNil

`func (o *SSIOOrderLine) SetEndDateNil(b bool)`

 SetEndDateNil sets the value for EndDate to be an explicit nil

### UnsetEndDate
`func (o *SSIOOrderLine) UnsetEndDate()`

UnsetEndDate ensures that no value is present for EndDate, not even an explicit nil
### GetBillToCompanyName

`func (o *SSIOOrderLine) GetBillToCompanyName() string`

GetBillToCompanyName returns the BillToCompanyName field if non-nil, zero value otherwise.

### GetBillToCompanyNameOk

`func (o *SSIOOrderLine) GetBillToCompanyNameOk() (*string, bool)`

GetBillToCompanyNameOk returns a tuple with the BillToCompanyName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillToCompanyName

`func (o *SSIOOrderLine) SetBillToCompanyName(v string)`

SetBillToCompanyName sets BillToCompanyName field to given value.

### HasBillToCompanyName

`func (o *SSIOOrderLine) HasBillToCompanyName() bool`

HasBillToCompanyName returns a boolean if a field has been set.

### SetBillToCompanyNameNil

`func (o *SSIOOrderLine) SetBillToCompanyNameNil(b bool)`

 SetBillToCompanyNameNil sets the value for BillToCompanyName to be an explicit nil

### UnsetBillToCompanyName
`func (o *SSIOOrderLine) UnsetBillToCompanyName()`

UnsetBillToCompanyName ensures that no value is present for BillToCompanyName, not even an explicit nil
### GetBillingContactFirstname

`func (o *SSIOOrderLine) GetBillingContactFirstname() string`

GetBillingContactFirstname returns the BillingContactFirstname field if non-nil, zero value otherwise.

### GetBillingContactFirstnameOk

`func (o *SSIOOrderLine) GetBillingContactFirstnameOk() (*string, bool)`

GetBillingContactFirstnameOk returns a tuple with the BillingContactFirstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingContactFirstname

`func (o *SSIOOrderLine) SetBillingContactFirstname(v string)`

SetBillingContactFirstname sets BillingContactFirstname field to given value.

### HasBillingContactFirstname

`func (o *SSIOOrderLine) HasBillingContactFirstname() bool`

HasBillingContactFirstname returns a boolean if a field has been set.

### SetBillingContactFirstnameNil

`func (o *SSIOOrderLine) SetBillingContactFirstnameNil(b bool)`

 SetBillingContactFirstnameNil sets the value for BillingContactFirstname to be an explicit nil

### UnsetBillingContactFirstname
`func (o *SSIOOrderLine) UnsetBillingContactFirstname()`

UnsetBillingContactFirstname ensures that no value is present for BillingContactFirstname, not even an explicit nil
### GetBillingContactLastname

`func (o *SSIOOrderLine) GetBillingContactLastname() string`

GetBillingContactLastname returns the BillingContactLastname field if non-nil, zero value otherwise.

### GetBillingContactLastnameOk

`func (o *SSIOOrderLine) GetBillingContactLastnameOk() (*string, bool)`

GetBillingContactLastnameOk returns a tuple with the BillingContactLastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingContactLastname

`func (o *SSIOOrderLine) SetBillingContactLastname(v string)`

SetBillingContactLastname sets BillingContactLastname field to given value.

### HasBillingContactLastname

`func (o *SSIOOrderLine) HasBillingContactLastname() bool`

HasBillingContactLastname returns a boolean if a field has been set.

### SetBillingContactLastnameNil

`func (o *SSIOOrderLine) SetBillingContactLastnameNil(b bool)`

 SetBillingContactLastnameNil sets the value for BillingContactLastname to be an explicit nil

### UnsetBillingContactLastname
`func (o *SSIOOrderLine) UnsetBillingContactLastname()`

UnsetBillingContactLastname ensures that no value is present for BillingContactLastname, not even an explicit nil
### GetBillingContactEmail

`func (o *SSIOOrderLine) GetBillingContactEmail() string`

GetBillingContactEmail returns the BillingContactEmail field if non-nil, zero value otherwise.

### GetBillingContactEmailOk

`func (o *SSIOOrderLine) GetBillingContactEmailOk() (*string, bool)`

GetBillingContactEmailOk returns a tuple with the BillingContactEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingContactEmail

`func (o *SSIOOrderLine) SetBillingContactEmail(v string)`

SetBillingContactEmail sets BillingContactEmail field to given value.

### HasBillingContactEmail

`func (o *SSIOOrderLine) HasBillingContactEmail() bool`

HasBillingContactEmail returns a boolean if a field has been set.

### SetBillingContactEmailNil

`func (o *SSIOOrderLine) SetBillingContactEmailNil(b bool)`

 SetBillingContactEmailNil sets the value for BillingContactEmail to be an explicit nil

### UnsetBillingContactEmail
`func (o *SSIOOrderLine) UnsetBillingContactEmail()`

UnsetBillingContactEmail ensures that no value is present for BillingContactEmail, not even an explicit nil
### GetMediaContactEmail

`func (o *SSIOOrderLine) GetMediaContactEmail() string`

GetMediaContactEmail returns the MediaContactEmail field if non-nil, zero value otherwise.

### GetMediaContactEmailOk

`func (o *SSIOOrderLine) GetMediaContactEmailOk() (*string, bool)`

GetMediaContactEmailOk returns a tuple with the MediaContactEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaContactEmail

`func (o *SSIOOrderLine) SetMediaContactEmail(v string)`

SetMediaContactEmail sets MediaContactEmail field to given value.

### HasMediaContactEmail

`func (o *SSIOOrderLine) HasMediaContactEmail() bool`

HasMediaContactEmail returns a boolean if a field has been set.

### SetMediaContactEmailNil

`func (o *SSIOOrderLine) SetMediaContactEmailNil(b bool)`

 SetMediaContactEmailNil sets the value for MediaContactEmail to be an explicit nil

### UnsetMediaContactEmail
`func (o *SSIOOrderLine) UnsetMediaContactEmail()`

UnsetMediaContactEmail ensures that no value is present for MediaContactEmail, not even an explicit nil
### GetMediaContactFirstname

`func (o *SSIOOrderLine) GetMediaContactFirstname() string`

GetMediaContactFirstname returns the MediaContactFirstname field if non-nil, zero value otherwise.

### GetMediaContactFirstnameOk

`func (o *SSIOOrderLine) GetMediaContactFirstnameOk() (*string, bool)`

GetMediaContactFirstnameOk returns a tuple with the MediaContactFirstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaContactFirstname

`func (o *SSIOOrderLine) SetMediaContactFirstname(v string)`

SetMediaContactFirstname sets MediaContactFirstname field to given value.

### HasMediaContactFirstname

`func (o *SSIOOrderLine) HasMediaContactFirstname() bool`

HasMediaContactFirstname returns a boolean if a field has been set.

### SetMediaContactFirstnameNil

`func (o *SSIOOrderLine) SetMediaContactFirstnameNil(b bool)`

 SetMediaContactFirstnameNil sets the value for MediaContactFirstname to be an explicit nil

### UnsetMediaContactFirstname
`func (o *SSIOOrderLine) UnsetMediaContactFirstname()`

UnsetMediaContactFirstname ensures that no value is present for MediaContactFirstname, not even an explicit nil
### GetMediaContactLastname

`func (o *SSIOOrderLine) GetMediaContactLastname() string`

GetMediaContactLastname returns the MediaContactLastname field if non-nil, zero value otherwise.

### GetMediaContactLastnameOk

`func (o *SSIOOrderLine) GetMediaContactLastnameOk() (*string, bool)`

GetMediaContactLastnameOk returns a tuple with the MediaContactLastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaContactLastname

`func (o *SSIOOrderLine) SetMediaContactLastname(v string)`

SetMediaContactLastname sets MediaContactLastname field to given value.

### HasMediaContactLastname

`func (o *SSIOOrderLine) HasMediaContactLastname() bool`

HasMediaContactLastname returns a boolean if a field has been set.

### SetMediaContactLastnameNil

`func (o *SSIOOrderLine) SetMediaContactLastnameNil(b bool)`

 SetMediaContactLastnameNil sets the value for MediaContactLastname to be an explicit nil

### UnsetMediaContactLastname
`func (o *SSIOOrderLine) UnsetMediaContactLastname()`

UnsetMediaContactLastname ensures that no value is present for MediaContactLastname, not even an explicit nil
### GetCurrencyInfo

`func (o *SSIOOrderLine) GetCurrencyInfo() Currency`

GetCurrencyInfo returns the CurrencyInfo field if non-nil, zero value otherwise.

### GetCurrencyInfoOk

`func (o *SSIOOrderLine) GetCurrencyInfoOk() (*Currency, bool)`

GetCurrencyInfoOk returns a tuple with the CurrencyInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrencyInfo

`func (o *SSIOOrderLine) SetCurrencyInfo(v Currency)`

SetCurrencyInfo sets CurrencyInfo field to given value.

### HasCurrencyInfo

`func (o *SSIOOrderLine) HasCurrencyInfo() bool`

HasCurrencyInfo returns a boolean if a field has been set.

### GetAgencyLink

`func (o *SSIOOrderLine) GetAgencyLink() string`

GetAgencyLink returns the AgencyLink field if non-nil, zero value otherwise.

### GetAgencyLinkOk

`func (o *SSIOOrderLine) GetAgencyLinkOk() (*string, bool)`

GetAgencyLinkOk returns a tuple with the AgencyLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgencyLink

`func (o *SSIOOrderLine) SetAgencyLink(v string)`

SetAgencyLink sets AgencyLink field to given value.

### HasAgencyLink

`func (o *SSIOOrderLine) HasAgencyLink() bool`

HasAgencyLink returns a boolean if a field has been set.

### SetAgencyLinkNil

`func (o *SSIOOrderLine) SetAgencyLinkNil(b bool)`

 SetAgencyLinkNil sets the value for AgencyLink to be an explicit nil

### UnsetAgencyLink
`func (o *SSIOOrderLine) UnsetAgencyLink()`

UnsetAgencyLink ensures that no value is present for AgencyLink, not even an explicit nil
### GetPoNumber

`func (o *SSIOOrderLine) GetPoNumber() string`

GetPoNumber returns the PoNumber field if non-nil, zero value otherwise.

### GetPoNumberOk

`func (o *SSIOOrderLine) GetPoNumberOk() (*string, bool)`

GetPoNumberOk returns a tuple with the PoNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPoNumber

`func (o *SSIOOrderLine) SetPoNumber(v string)`

SetPoNumber sets PoNumber field to given value.

### HasPoNumber

`func (o *SSIOOrderLine) HasPoNumber() bool`

HasPoNumber returns a boolean if a field has been set.

### SetPoNumberNil

`func (o *SSIOOrderLine) SetPoNumberNil(b bool)`

 SetPoNumberNil sets the value for PoNumber to be an explicit nil

### UnsetPoNumber
`func (o *SSIOOrderLine) UnsetPoNumber()`

UnsetPoNumber ensures that no value is present for PoNumber, not even an explicit nil
### GetOrderName

`func (o *SSIOOrderLine) GetOrderName() string`

GetOrderName returns the OrderName field if non-nil, zero value otherwise.

### GetOrderNameOk

`func (o *SSIOOrderLine) GetOrderNameOk() (*string, bool)`

GetOrderNameOk returns a tuple with the OrderName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderName

`func (o *SSIOOrderLine) SetOrderName(v string)`

SetOrderName sets OrderName field to given value.

### HasOrderName

`func (o *SSIOOrderLine) HasOrderName() bool`

HasOrderName returns a boolean if a field has been set.

### SetOrderNameNil

`func (o *SSIOOrderLine) SetOrderNameNil(b bool)`

 SetOrderNameNil sets the value for OrderName to be an explicit nil

### UnsetOrderName
`func (o *SSIOOrderLine) UnsetOrderName()`

UnsetOrderName ensures that no value is present for OrderName, not even an explicit nil
### GetPmpName

`func (o *SSIOOrderLine) GetPmpName() string`

GetPmpName returns the PmpName field if non-nil, zero value otherwise.

### GetPmpNameOk

`func (o *SSIOOrderLine) GetPmpNameOk() (*string, bool)`

GetPmpNameOk returns a tuple with the PmpName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPmpName

`func (o *SSIOOrderLine) SetPmpName(v string)`

SetPmpName sets PmpName field to given value.

### HasPmpName

`func (o *SSIOOrderLine) HasPmpName() bool`

HasPmpName returns a boolean if a field has been set.

### SetPmpNameNil

`func (o *SSIOOrderLine) SetPmpNameNil(b bool)`

 SetPmpNameNil sets the value for PmpName to be an explicit nil

### UnsetPmpName
`func (o *SSIOOrderLine) UnsetPmpName()`

UnsetPmpName ensures that no value is present for PmpName, not even an explicit nil
### GetAcceptedTermsId

`func (o *SSIOOrderLine) GetAcceptedTermsId() string`

GetAcceptedTermsId returns the AcceptedTermsId field if non-nil, zero value otherwise.

### GetAcceptedTermsIdOk

`func (o *SSIOOrderLine) GetAcceptedTermsIdOk() (*string, bool)`

GetAcceptedTermsIdOk returns a tuple with the AcceptedTermsId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcceptedTermsId

`func (o *SSIOOrderLine) SetAcceptedTermsId(v string)`

SetAcceptedTermsId sets AcceptedTermsId field to given value.

### HasAcceptedTermsId

`func (o *SSIOOrderLine) HasAcceptedTermsId() bool`

HasAcceptedTermsId returns a boolean if a field has been set.

### SetAcceptedTermsIdNil

`func (o *SSIOOrderLine) SetAcceptedTermsIdNil(b bool)`

 SetAcceptedTermsIdNil sets the value for AcceptedTermsId to be an explicit nil

### UnsetAcceptedTermsId
`func (o *SSIOOrderLine) UnsetAcceptedTermsId()`

UnsetAcceptedTermsId ensures that no value is present for AcceptedTermsId, not even an explicit nil
### GetAcceptedTermsTime

`func (o *SSIOOrderLine) GetAcceptedTermsTime() string`

GetAcceptedTermsTime returns the AcceptedTermsTime field if non-nil, zero value otherwise.

### GetAcceptedTermsTimeOk

`func (o *SSIOOrderLine) GetAcceptedTermsTimeOk() (*string, bool)`

GetAcceptedTermsTimeOk returns a tuple with the AcceptedTermsTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcceptedTermsTime

`func (o *SSIOOrderLine) SetAcceptedTermsTime(v string)`

SetAcceptedTermsTime sets AcceptedTermsTime field to given value.

### HasAcceptedTermsTime

`func (o *SSIOOrderLine) HasAcceptedTermsTime() bool`

HasAcceptedTermsTime returns a boolean if a field has been set.

### SetAcceptedTermsTimeNil

`func (o *SSIOOrderLine) SetAcceptedTermsTimeNil(b bool)`

 SetAcceptedTermsTimeNil sets the value for AcceptedTermsTime to be an explicit nil

### UnsetAcceptedTermsTime
`func (o *SSIOOrderLine) UnsetAcceptedTermsTime()`

UnsetAcceptedTermsTime ensures that no value is present for AcceptedTermsTime, not even an explicit nil
### GetBudgetAmount

`func (o *SSIOOrderLine) GetBudgetAmount() float32`

GetBudgetAmount returns the BudgetAmount field if non-nil, zero value otherwise.

### GetBudgetAmountOk

`func (o *SSIOOrderLine) GetBudgetAmountOk() (*float32, bool)`

GetBudgetAmountOk returns a tuple with the BudgetAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetAmount

`func (o *SSIOOrderLine) SetBudgetAmount(v float32)`

SetBudgetAmount sets BudgetAmount field to given value.

### HasBudgetAmount

`func (o *SSIOOrderLine) HasBudgetAmount() bool`

HasBudgetAmount returns a boolean if a field has been set.

### SetBudgetAmountNil

`func (o *SSIOOrderLine) SetBudgetAmountNil(b bool)`

 SetBudgetAmountNil sets the value for BudgetAmount to be an explicit nil

### UnsetBudgetAmount
`func (o *SSIOOrderLine) UnsetBudgetAmount()`

UnsetBudgetAmount ensures that no value is present for BudgetAmount, not even an explicit nil
### GetEstimatedMonthlySpend

`func (o *SSIOOrderLine) GetEstimatedMonthlySpend() float32`

GetEstimatedMonthlySpend returns the EstimatedMonthlySpend field if non-nil, zero value otherwise.

### GetEstimatedMonthlySpendOk

`func (o *SSIOOrderLine) GetEstimatedMonthlySpendOk() (*float32, bool)`

GetEstimatedMonthlySpendOk returns a tuple with the EstimatedMonthlySpend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEstimatedMonthlySpend

`func (o *SSIOOrderLine) SetEstimatedMonthlySpend(v float32)`

SetEstimatedMonthlySpend sets EstimatedMonthlySpend field to given value.

### HasEstimatedMonthlySpend

`func (o *SSIOOrderLine) HasEstimatedMonthlySpend() bool`

HasEstimatedMonthlySpend returns a boolean if a field has been set.

### SetEstimatedMonthlySpendNil

`func (o *SSIOOrderLine) SetEstimatedMonthlySpendNil(b bool)`

 SetEstimatedMonthlySpendNil sets the value for EstimatedMonthlySpend to be an explicit nil

### UnsetEstimatedMonthlySpend
`func (o *SSIOOrderLine) UnsetEstimatedMonthlySpend()`

UnsetEstimatedMonthlySpend ensures that no value is present for EstimatedMonthlySpend, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


