# SSIOEditInsertionOrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartDate** | Pointer to **string** | Starting date of time period. Format: YYYY-MM-DD | [optional] 
**EndDate** | Pointer to **string** | End date of time period. Format: YYYY-MM-DD | [optional] 
**PoNumber** | Pointer to **string** | The po number | [optional] 
**BudgetAmount** | Pointer to **float32** | If Budget order line, the budget amount. | [optional] 
**BillingContactFirstname** | Pointer to **string** | The billing contact first name | [optional] 
**BillingContactLastname** | Pointer to **string** | The billing contact last name | [optional] 
**BillingContactEmail** | Pointer to **string** | The billing contact email | [optional] 
**MediaContactFirstname** | Pointer to **string** | The media contact first name | [optional] 
**MediaContactLastname** | Pointer to **string** | The media contact last name | [optional] 
**MediaContactEmail** | Pointer to **string** | The media contact email | [optional] 
**AgencyLink** | Pointer to **string** | URL link for agency | [optional] 
**UserEmail** | Pointer to **string** | The email of user submitting the insertion order | [optional] 
**OracleLineId** | Pointer to **string** | LineId in the Oracle DB | [optional] 
**SalesforceOrderId** | Pointer to **string** | OrderId in SFDC | [optional] 
**SalesforceOrderLineId** | Pointer to **string** | OrderLineId in SFDC | [optional] 
**AdsManagerOrderLineId** | Pointer to **string** | Ads manager OrderLineId | [optional] 

## Methods

### NewSSIOEditInsertionOrderRequest

`func NewSSIOEditInsertionOrderRequest() *SSIOEditInsertionOrderRequest`

NewSSIOEditInsertionOrderRequest instantiates a new SSIOEditInsertionOrderRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSSIOEditInsertionOrderRequestWithDefaults

`func NewSSIOEditInsertionOrderRequestWithDefaults() *SSIOEditInsertionOrderRequest`

NewSSIOEditInsertionOrderRequestWithDefaults instantiates a new SSIOEditInsertionOrderRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStartDate

`func (o *SSIOEditInsertionOrderRequest) GetStartDate() string`

GetStartDate returns the StartDate field if non-nil, zero value otherwise.

### GetStartDateOk

`func (o *SSIOEditInsertionOrderRequest) GetStartDateOk() (*string, bool)`

GetStartDateOk returns a tuple with the StartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartDate

`func (o *SSIOEditInsertionOrderRequest) SetStartDate(v string)`

SetStartDate sets StartDate field to given value.

### HasStartDate

`func (o *SSIOEditInsertionOrderRequest) HasStartDate() bool`

HasStartDate returns a boolean if a field has been set.

### GetEndDate

`func (o *SSIOEditInsertionOrderRequest) GetEndDate() string`

GetEndDate returns the EndDate field if non-nil, zero value otherwise.

### GetEndDateOk

`func (o *SSIOEditInsertionOrderRequest) GetEndDateOk() (*string, bool)`

GetEndDateOk returns a tuple with the EndDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndDate

`func (o *SSIOEditInsertionOrderRequest) SetEndDate(v string)`

SetEndDate sets EndDate field to given value.

### HasEndDate

`func (o *SSIOEditInsertionOrderRequest) HasEndDate() bool`

HasEndDate returns a boolean if a field has been set.

### GetPoNumber

`func (o *SSIOEditInsertionOrderRequest) GetPoNumber() string`

GetPoNumber returns the PoNumber field if non-nil, zero value otherwise.

### GetPoNumberOk

`func (o *SSIOEditInsertionOrderRequest) GetPoNumberOk() (*string, bool)`

GetPoNumberOk returns a tuple with the PoNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPoNumber

`func (o *SSIOEditInsertionOrderRequest) SetPoNumber(v string)`

SetPoNumber sets PoNumber field to given value.

### HasPoNumber

`func (o *SSIOEditInsertionOrderRequest) HasPoNumber() bool`

HasPoNumber returns a boolean if a field has been set.

### GetBudgetAmount

`func (o *SSIOEditInsertionOrderRequest) GetBudgetAmount() float32`

GetBudgetAmount returns the BudgetAmount field if non-nil, zero value otherwise.

### GetBudgetAmountOk

`func (o *SSIOEditInsertionOrderRequest) GetBudgetAmountOk() (*float32, bool)`

GetBudgetAmountOk returns a tuple with the BudgetAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetAmount

`func (o *SSIOEditInsertionOrderRequest) SetBudgetAmount(v float32)`

SetBudgetAmount sets BudgetAmount field to given value.

### HasBudgetAmount

`func (o *SSIOEditInsertionOrderRequest) HasBudgetAmount() bool`

HasBudgetAmount returns a boolean if a field has been set.

### GetBillingContactFirstname

`func (o *SSIOEditInsertionOrderRequest) GetBillingContactFirstname() string`

GetBillingContactFirstname returns the BillingContactFirstname field if non-nil, zero value otherwise.

### GetBillingContactFirstnameOk

`func (o *SSIOEditInsertionOrderRequest) GetBillingContactFirstnameOk() (*string, bool)`

GetBillingContactFirstnameOk returns a tuple with the BillingContactFirstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingContactFirstname

`func (o *SSIOEditInsertionOrderRequest) SetBillingContactFirstname(v string)`

SetBillingContactFirstname sets BillingContactFirstname field to given value.

### HasBillingContactFirstname

`func (o *SSIOEditInsertionOrderRequest) HasBillingContactFirstname() bool`

HasBillingContactFirstname returns a boolean if a field has been set.

### GetBillingContactLastname

`func (o *SSIOEditInsertionOrderRequest) GetBillingContactLastname() string`

GetBillingContactLastname returns the BillingContactLastname field if non-nil, zero value otherwise.

### GetBillingContactLastnameOk

`func (o *SSIOEditInsertionOrderRequest) GetBillingContactLastnameOk() (*string, bool)`

GetBillingContactLastnameOk returns a tuple with the BillingContactLastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingContactLastname

`func (o *SSIOEditInsertionOrderRequest) SetBillingContactLastname(v string)`

SetBillingContactLastname sets BillingContactLastname field to given value.

### HasBillingContactLastname

`func (o *SSIOEditInsertionOrderRequest) HasBillingContactLastname() bool`

HasBillingContactLastname returns a boolean if a field has been set.

### GetBillingContactEmail

`func (o *SSIOEditInsertionOrderRequest) GetBillingContactEmail() string`

GetBillingContactEmail returns the BillingContactEmail field if non-nil, zero value otherwise.

### GetBillingContactEmailOk

`func (o *SSIOEditInsertionOrderRequest) GetBillingContactEmailOk() (*string, bool)`

GetBillingContactEmailOk returns a tuple with the BillingContactEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingContactEmail

`func (o *SSIOEditInsertionOrderRequest) SetBillingContactEmail(v string)`

SetBillingContactEmail sets BillingContactEmail field to given value.

### HasBillingContactEmail

`func (o *SSIOEditInsertionOrderRequest) HasBillingContactEmail() bool`

HasBillingContactEmail returns a boolean if a field has been set.

### GetMediaContactFirstname

`func (o *SSIOEditInsertionOrderRequest) GetMediaContactFirstname() string`

GetMediaContactFirstname returns the MediaContactFirstname field if non-nil, zero value otherwise.

### GetMediaContactFirstnameOk

`func (o *SSIOEditInsertionOrderRequest) GetMediaContactFirstnameOk() (*string, bool)`

GetMediaContactFirstnameOk returns a tuple with the MediaContactFirstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaContactFirstname

`func (o *SSIOEditInsertionOrderRequest) SetMediaContactFirstname(v string)`

SetMediaContactFirstname sets MediaContactFirstname field to given value.

### HasMediaContactFirstname

`func (o *SSIOEditInsertionOrderRequest) HasMediaContactFirstname() bool`

HasMediaContactFirstname returns a boolean if a field has been set.

### GetMediaContactLastname

`func (o *SSIOEditInsertionOrderRequest) GetMediaContactLastname() string`

GetMediaContactLastname returns the MediaContactLastname field if non-nil, zero value otherwise.

### GetMediaContactLastnameOk

`func (o *SSIOEditInsertionOrderRequest) GetMediaContactLastnameOk() (*string, bool)`

GetMediaContactLastnameOk returns a tuple with the MediaContactLastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaContactLastname

`func (o *SSIOEditInsertionOrderRequest) SetMediaContactLastname(v string)`

SetMediaContactLastname sets MediaContactLastname field to given value.

### HasMediaContactLastname

`func (o *SSIOEditInsertionOrderRequest) HasMediaContactLastname() bool`

HasMediaContactLastname returns a boolean if a field has been set.

### GetMediaContactEmail

`func (o *SSIOEditInsertionOrderRequest) GetMediaContactEmail() string`

GetMediaContactEmail returns the MediaContactEmail field if non-nil, zero value otherwise.

### GetMediaContactEmailOk

`func (o *SSIOEditInsertionOrderRequest) GetMediaContactEmailOk() (*string, bool)`

GetMediaContactEmailOk returns a tuple with the MediaContactEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaContactEmail

`func (o *SSIOEditInsertionOrderRequest) SetMediaContactEmail(v string)`

SetMediaContactEmail sets MediaContactEmail field to given value.

### HasMediaContactEmail

`func (o *SSIOEditInsertionOrderRequest) HasMediaContactEmail() bool`

HasMediaContactEmail returns a boolean if a field has been set.

### GetAgencyLink

`func (o *SSIOEditInsertionOrderRequest) GetAgencyLink() string`

GetAgencyLink returns the AgencyLink field if non-nil, zero value otherwise.

### GetAgencyLinkOk

`func (o *SSIOEditInsertionOrderRequest) GetAgencyLinkOk() (*string, bool)`

GetAgencyLinkOk returns a tuple with the AgencyLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgencyLink

`func (o *SSIOEditInsertionOrderRequest) SetAgencyLink(v string)`

SetAgencyLink sets AgencyLink field to given value.

### HasAgencyLink

`func (o *SSIOEditInsertionOrderRequest) HasAgencyLink() bool`

HasAgencyLink returns a boolean if a field has been set.

### GetUserEmail

`func (o *SSIOEditInsertionOrderRequest) GetUserEmail() string`

GetUserEmail returns the UserEmail field if non-nil, zero value otherwise.

### GetUserEmailOk

`func (o *SSIOEditInsertionOrderRequest) GetUserEmailOk() (*string, bool)`

GetUserEmailOk returns a tuple with the UserEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserEmail

`func (o *SSIOEditInsertionOrderRequest) SetUserEmail(v string)`

SetUserEmail sets UserEmail field to given value.

### HasUserEmail

`func (o *SSIOEditInsertionOrderRequest) HasUserEmail() bool`

HasUserEmail returns a boolean if a field has been set.

### GetOracleLineId

`func (o *SSIOEditInsertionOrderRequest) GetOracleLineId() string`

GetOracleLineId returns the OracleLineId field if non-nil, zero value otherwise.

### GetOracleLineIdOk

`func (o *SSIOEditInsertionOrderRequest) GetOracleLineIdOk() (*string, bool)`

GetOracleLineIdOk returns a tuple with the OracleLineId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOracleLineId

`func (o *SSIOEditInsertionOrderRequest) SetOracleLineId(v string)`

SetOracleLineId sets OracleLineId field to given value.

### HasOracleLineId

`func (o *SSIOEditInsertionOrderRequest) HasOracleLineId() bool`

HasOracleLineId returns a boolean if a field has been set.

### GetSalesforceOrderId

`func (o *SSIOEditInsertionOrderRequest) GetSalesforceOrderId() string`

GetSalesforceOrderId returns the SalesforceOrderId field if non-nil, zero value otherwise.

### GetSalesforceOrderIdOk

`func (o *SSIOEditInsertionOrderRequest) GetSalesforceOrderIdOk() (*string, bool)`

GetSalesforceOrderIdOk returns a tuple with the SalesforceOrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSalesforceOrderId

`func (o *SSIOEditInsertionOrderRequest) SetSalesforceOrderId(v string)`

SetSalesforceOrderId sets SalesforceOrderId field to given value.

### HasSalesforceOrderId

`func (o *SSIOEditInsertionOrderRequest) HasSalesforceOrderId() bool`

HasSalesforceOrderId returns a boolean if a field has been set.

### GetSalesforceOrderLineId

`func (o *SSIOEditInsertionOrderRequest) GetSalesforceOrderLineId() string`

GetSalesforceOrderLineId returns the SalesforceOrderLineId field if non-nil, zero value otherwise.

### GetSalesforceOrderLineIdOk

`func (o *SSIOEditInsertionOrderRequest) GetSalesforceOrderLineIdOk() (*string, bool)`

GetSalesforceOrderLineIdOk returns a tuple with the SalesforceOrderLineId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSalesforceOrderLineId

`func (o *SSIOEditInsertionOrderRequest) SetSalesforceOrderLineId(v string)`

SetSalesforceOrderLineId sets SalesforceOrderLineId field to given value.

### HasSalesforceOrderLineId

`func (o *SSIOEditInsertionOrderRequest) HasSalesforceOrderLineId() bool`

HasSalesforceOrderLineId returns a boolean if a field has been set.

### GetAdsManagerOrderLineId

`func (o *SSIOEditInsertionOrderRequest) GetAdsManagerOrderLineId() string`

GetAdsManagerOrderLineId returns the AdsManagerOrderLineId field if non-nil, zero value otherwise.

### GetAdsManagerOrderLineIdOk

`func (o *SSIOEditInsertionOrderRequest) GetAdsManagerOrderLineIdOk() (*string, bool)`

GetAdsManagerOrderLineIdOk returns a tuple with the AdsManagerOrderLineId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdsManagerOrderLineId

`func (o *SSIOEditInsertionOrderRequest) SetAdsManagerOrderLineId(v string)`

SetAdsManagerOrderLineId sets AdsManagerOrderLineId field to given value.

### HasAdsManagerOrderLineId

`func (o *SSIOEditInsertionOrderRequest) HasAdsManagerOrderLineId() bool`

HasAdsManagerOrderLineId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


