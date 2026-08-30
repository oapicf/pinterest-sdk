# SSIOInsertionOrderUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdsManagerOrderLineId** | Pointer to **string** | Ads manager OrderLineId | [optional] 
**AgencyLink** | Pointer to **string** | URL link for agency | [optional] 
**BillingContactEmail** | Pointer to **string** | The billing contact email | [optional] 
**BillingContactFirstname** | Pointer to **string** | The billing contact first name | [optional] 
**BillingContactLastname** | Pointer to **string** | The billing contact last name | [optional] 
**BudgetAmount** | Pointer to **float64** | If Budget order line, the budget amount. | [optional] 
**EndDate** | Pointer to **string** | End date of time period. Format: YYYY-MM-DD | [optional] 
**MediaContactEmail** | Pointer to **string** | The media contact email | [optional] 
**MediaContactFirstname** | Pointer to **string** | The media contact first name | [optional] 
**MediaContactLastname** | Pointer to **string** | The media contact last name | [optional] 
**OracleLineId** | Pointer to **string** | LineId in the Oracle DB | [optional] 
**PoNumber** | Pointer to **string** | The po number | [optional] 
**SalesforceOrderId** | Pointer to **string** | OrderId in SFDC | [optional] 
**SalesforceOrderLineId** | Pointer to **string** | OrderLineId in SFDC | [optional] 
**StartDate** | Pointer to **string** | Starting date of time period. Format: YYYY-MM-DD | [optional] 
**UserEmail** | Pointer to **string** | The email of user submitting the insertion order | [optional] 

## Methods

### NewSSIOInsertionOrderUpdate

`func NewSSIOInsertionOrderUpdate() *SSIOInsertionOrderUpdate`

NewSSIOInsertionOrderUpdate instantiates a new SSIOInsertionOrderUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSSIOInsertionOrderUpdateWithDefaults

`func NewSSIOInsertionOrderUpdateWithDefaults() *SSIOInsertionOrderUpdate`

NewSSIOInsertionOrderUpdateWithDefaults instantiates a new SSIOInsertionOrderUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdsManagerOrderLineId

`func (o *SSIOInsertionOrderUpdate) GetAdsManagerOrderLineId() string`

GetAdsManagerOrderLineId returns the AdsManagerOrderLineId field if non-nil, zero value otherwise.

### GetAdsManagerOrderLineIdOk

`func (o *SSIOInsertionOrderUpdate) GetAdsManagerOrderLineIdOk() (*string, bool)`

GetAdsManagerOrderLineIdOk returns a tuple with the AdsManagerOrderLineId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdsManagerOrderLineId

`func (o *SSIOInsertionOrderUpdate) SetAdsManagerOrderLineId(v string)`

SetAdsManagerOrderLineId sets AdsManagerOrderLineId field to given value.

### HasAdsManagerOrderLineId

`func (o *SSIOInsertionOrderUpdate) HasAdsManagerOrderLineId() bool`

HasAdsManagerOrderLineId returns a boolean if a field has been set.

### GetAgencyLink

`func (o *SSIOInsertionOrderUpdate) GetAgencyLink() string`

GetAgencyLink returns the AgencyLink field if non-nil, zero value otherwise.

### GetAgencyLinkOk

`func (o *SSIOInsertionOrderUpdate) GetAgencyLinkOk() (*string, bool)`

GetAgencyLinkOk returns a tuple with the AgencyLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgencyLink

`func (o *SSIOInsertionOrderUpdate) SetAgencyLink(v string)`

SetAgencyLink sets AgencyLink field to given value.

### HasAgencyLink

`func (o *SSIOInsertionOrderUpdate) HasAgencyLink() bool`

HasAgencyLink returns a boolean if a field has been set.

### GetBillingContactEmail

`func (o *SSIOInsertionOrderUpdate) GetBillingContactEmail() string`

GetBillingContactEmail returns the BillingContactEmail field if non-nil, zero value otherwise.

### GetBillingContactEmailOk

`func (o *SSIOInsertionOrderUpdate) GetBillingContactEmailOk() (*string, bool)`

GetBillingContactEmailOk returns a tuple with the BillingContactEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingContactEmail

`func (o *SSIOInsertionOrderUpdate) SetBillingContactEmail(v string)`

SetBillingContactEmail sets BillingContactEmail field to given value.

### HasBillingContactEmail

`func (o *SSIOInsertionOrderUpdate) HasBillingContactEmail() bool`

HasBillingContactEmail returns a boolean if a field has been set.

### GetBillingContactFirstname

`func (o *SSIOInsertionOrderUpdate) GetBillingContactFirstname() string`

GetBillingContactFirstname returns the BillingContactFirstname field if non-nil, zero value otherwise.

### GetBillingContactFirstnameOk

`func (o *SSIOInsertionOrderUpdate) GetBillingContactFirstnameOk() (*string, bool)`

GetBillingContactFirstnameOk returns a tuple with the BillingContactFirstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingContactFirstname

`func (o *SSIOInsertionOrderUpdate) SetBillingContactFirstname(v string)`

SetBillingContactFirstname sets BillingContactFirstname field to given value.

### HasBillingContactFirstname

`func (o *SSIOInsertionOrderUpdate) HasBillingContactFirstname() bool`

HasBillingContactFirstname returns a boolean if a field has been set.

### GetBillingContactLastname

`func (o *SSIOInsertionOrderUpdate) GetBillingContactLastname() string`

GetBillingContactLastname returns the BillingContactLastname field if non-nil, zero value otherwise.

### GetBillingContactLastnameOk

`func (o *SSIOInsertionOrderUpdate) GetBillingContactLastnameOk() (*string, bool)`

GetBillingContactLastnameOk returns a tuple with the BillingContactLastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingContactLastname

`func (o *SSIOInsertionOrderUpdate) SetBillingContactLastname(v string)`

SetBillingContactLastname sets BillingContactLastname field to given value.

### HasBillingContactLastname

`func (o *SSIOInsertionOrderUpdate) HasBillingContactLastname() bool`

HasBillingContactLastname returns a boolean if a field has been set.

### GetBudgetAmount

`func (o *SSIOInsertionOrderUpdate) GetBudgetAmount() float64`

GetBudgetAmount returns the BudgetAmount field if non-nil, zero value otherwise.

### GetBudgetAmountOk

`func (o *SSIOInsertionOrderUpdate) GetBudgetAmountOk() (*float64, bool)`

GetBudgetAmountOk returns a tuple with the BudgetAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetAmount

`func (o *SSIOInsertionOrderUpdate) SetBudgetAmount(v float64)`

SetBudgetAmount sets BudgetAmount field to given value.

### HasBudgetAmount

`func (o *SSIOInsertionOrderUpdate) HasBudgetAmount() bool`

HasBudgetAmount returns a boolean if a field has been set.

### GetEndDate

`func (o *SSIOInsertionOrderUpdate) GetEndDate() string`

GetEndDate returns the EndDate field if non-nil, zero value otherwise.

### GetEndDateOk

`func (o *SSIOInsertionOrderUpdate) GetEndDateOk() (*string, bool)`

GetEndDateOk returns a tuple with the EndDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndDate

`func (o *SSIOInsertionOrderUpdate) SetEndDate(v string)`

SetEndDate sets EndDate field to given value.

### HasEndDate

`func (o *SSIOInsertionOrderUpdate) HasEndDate() bool`

HasEndDate returns a boolean if a field has been set.

### GetMediaContactEmail

`func (o *SSIOInsertionOrderUpdate) GetMediaContactEmail() string`

GetMediaContactEmail returns the MediaContactEmail field if non-nil, zero value otherwise.

### GetMediaContactEmailOk

`func (o *SSIOInsertionOrderUpdate) GetMediaContactEmailOk() (*string, bool)`

GetMediaContactEmailOk returns a tuple with the MediaContactEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaContactEmail

`func (o *SSIOInsertionOrderUpdate) SetMediaContactEmail(v string)`

SetMediaContactEmail sets MediaContactEmail field to given value.

### HasMediaContactEmail

`func (o *SSIOInsertionOrderUpdate) HasMediaContactEmail() bool`

HasMediaContactEmail returns a boolean if a field has been set.

### GetMediaContactFirstname

`func (o *SSIOInsertionOrderUpdate) GetMediaContactFirstname() string`

GetMediaContactFirstname returns the MediaContactFirstname field if non-nil, zero value otherwise.

### GetMediaContactFirstnameOk

`func (o *SSIOInsertionOrderUpdate) GetMediaContactFirstnameOk() (*string, bool)`

GetMediaContactFirstnameOk returns a tuple with the MediaContactFirstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaContactFirstname

`func (o *SSIOInsertionOrderUpdate) SetMediaContactFirstname(v string)`

SetMediaContactFirstname sets MediaContactFirstname field to given value.

### HasMediaContactFirstname

`func (o *SSIOInsertionOrderUpdate) HasMediaContactFirstname() bool`

HasMediaContactFirstname returns a boolean if a field has been set.

### GetMediaContactLastname

`func (o *SSIOInsertionOrderUpdate) GetMediaContactLastname() string`

GetMediaContactLastname returns the MediaContactLastname field if non-nil, zero value otherwise.

### GetMediaContactLastnameOk

`func (o *SSIOInsertionOrderUpdate) GetMediaContactLastnameOk() (*string, bool)`

GetMediaContactLastnameOk returns a tuple with the MediaContactLastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaContactLastname

`func (o *SSIOInsertionOrderUpdate) SetMediaContactLastname(v string)`

SetMediaContactLastname sets MediaContactLastname field to given value.

### HasMediaContactLastname

`func (o *SSIOInsertionOrderUpdate) HasMediaContactLastname() bool`

HasMediaContactLastname returns a boolean if a field has been set.

### GetOracleLineId

`func (o *SSIOInsertionOrderUpdate) GetOracleLineId() string`

GetOracleLineId returns the OracleLineId field if non-nil, zero value otherwise.

### GetOracleLineIdOk

`func (o *SSIOInsertionOrderUpdate) GetOracleLineIdOk() (*string, bool)`

GetOracleLineIdOk returns a tuple with the OracleLineId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOracleLineId

`func (o *SSIOInsertionOrderUpdate) SetOracleLineId(v string)`

SetOracleLineId sets OracleLineId field to given value.

### HasOracleLineId

`func (o *SSIOInsertionOrderUpdate) HasOracleLineId() bool`

HasOracleLineId returns a boolean if a field has been set.

### GetPoNumber

`func (o *SSIOInsertionOrderUpdate) GetPoNumber() string`

GetPoNumber returns the PoNumber field if non-nil, zero value otherwise.

### GetPoNumberOk

`func (o *SSIOInsertionOrderUpdate) GetPoNumberOk() (*string, bool)`

GetPoNumberOk returns a tuple with the PoNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPoNumber

`func (o *SSIOInsertionOrderUpdate) SetPoNumber(v string)`

SetPoNumber sets PoNumber field to given value.

### HasPoNumber

`func (o *SSIOInsertionOrderUpdate) HasPoNumber() bool`

HasPoNumber returns a boolean if a field has been set.

### GetSalesforceOrderId

`func (o *SSIOInsertionOrderUpdate) GetSalesforceOrderId() string`

GetSalesforceOrderId returns the SalesforceOrderId field if non-nil, zero value otherwise.

### GetSalesforceOrderIdOk

`func (o *SSIOInsertionOrderUpdate) GetSalesforceOrderIdOk() (*string, bool)`

GetSalesforceOrderIdOk returns a tuple with the SalesforceOrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSalesforceOrderId

`func (o *SSIOInsertionOrderUpdate) SetSalesforceOrderId(v string)`

SetSalesforceOrderId sets SalesforceOrderId field to given value.

### HasSalesforceOrderId

`func (o *SSIOInsertionOrderUpdate) HasSalesforceOrderId() bool`

HasSalesforceOrderId returns a boolean if a field has been set.

### GetSalesforceOrderLineId

`func (o *SSIOInsertionOrderUpdate) GetSalesforceOrderLineId() string`

GetSalesforceOrderLineId returns the SalesforceOrderLineId field if non-nil, zero value otherwise.

### GetSalesforceOrderLineIdOk

`func (o *SSIOInsertionOrderUpdate) GetSalesforceOrderLineIdOk() (*string, bool)`

GetSalesforceOrderLineIdOk returns a tuple with the SalesforceOrderLineId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSalesforceOrderLineId

`func (o *SSIOInsertionOrderUpdate) SetSalesforceOrderLineId(v string)`

SetSalesforceOrderLineId sets SalesforceOrderLineId field to given value.

### HasSalesforceOrderLineId

`func (o *SSIOInsertionOrderUpdate) HasSalesforceOrderLineId() bool`

HasSalesforceOrderLineId returns a boolean if a field has been set.

### GetStartDate

`func (o *SSIOInsertionOrderUpdate) GetStartDate() string`

GetStartDate returns the StartDate field if non-nil, zero value otherwise.

### GetStartDateOk

`func (o *SSIOInsertionOrderUpdate) GetStartDateOk() (*string, bool)`

GetStartDateOk returns a tuple with the StartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartDate

`func (o *SSIOInsertionOrderUpdate) SetStartDate(v string)`

SetStartDate sets StartDate field to given value.

### HasStartDate

`func (o *SSIOInsertionOrderUpdate) HasStartDate() bool`

HasStartDate returns a boolean if a field has been set.

### GetUserEmail

`func (o *SSIOInsertionOrderUpdate) GetUserEmail() string`

GetUserEmail returns the UserEmail field if non-nil, zero value otherwise.

### GetUserEmailOk

`func (o *SSIOInsertionOrderUpdate) GetUserEmailOk() (*string, bool)`

GetUserEmailOk returns a tuple with the UserEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserEmail

`func (o *SSIOInsertionOrderUpdate) SetUserEmail(v string)`

SetUserEmail sets UserEmail field to given value.

### HasUserEmail

`func (o *SSIOInsertionOrderUpdate) HasUserEmail() bool`

HasUserEmail returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


