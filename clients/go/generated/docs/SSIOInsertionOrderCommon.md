# SSIOInsertionOrderCommon

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

## Methods

### NewSSIOInsertionOrderCommon

`func NewSSIOInsertionOrderCommon() *SSIOInsertionOrderCommon`

NewSSIOInsertionOrderCommon instantiates a new SSIOInsertionOrderCommon object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSSIOInsertionOrderCommonWithDefaults

`func NewSSIOInsertionOrderCommonWithDefaults() *SSIOInsertionOrderCommon`

NewSSIOInsertionOrderCommonWithDefaults instantiates a new SSIOInsertionOrderCommon object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStartDate

`func (o *SSIOInsertionOrderCommon) GetStartDate() string`

GetStartDate returns the StartDate field if non-nil, zero value otherwise.

### GetStartDateOk

`func (o *SSIOInsertionOrderCommon) GetStartDateOk() (*string, bool)`

GetStartDateOk returns a tuple with the StartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartDate

`func (o *SSIOInsertionOrderCommon) SetStartDate(v string)`

SetStartDate sets StartDate field to given value.

### HasStartDate

`func (o *SSIOInsertionOrderCommon) HasStartDate() bool`

HasStartDate returns a boolean if a field has been set.

### GetEndDate

`func (o *SSIOInsertionOrderCommon) GetEndDate() string`

GetEndDate returns the EndDate field if non-nil, zero value otherwise.

### GetEndDateOk

`func (o *SSIOInsertionOrderCommon) GetEndDateOk() (*string, bool)`

GetEndDateOk returns a tuple with the EndDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndDate

`func (o *SSIOInsertionOrderCommon) SetEndDate(v string)`

SetEndDate sets EndDate field to given value.

### HasEndDate

`func (o *SSIOInsertionOrderCommon) HasEndDate() bool`

HasEndDate returns a boolean if a field has been set.

### GetPoNumber

`func (o *SSIOInsertionOrderCommon) GetPoNumber() string`

GetPoNumber returns the PoNumber field if non-nil, zero value otherwise.

### GetPoNumberOk

`func (o *SSIOInsertionOrderCommon) GetPoNumberOk() (*string, bool)`

GetPoNumberOk returns a tuple with the PoNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPoNumber

`func (o *SSIOInsertionOrderCommon) SetPoNumber(v string)`

SetPoNumber sets PoNumber field to given value.

### HasPoNumber

`func (o *SSIOInsertionOrderCommon) HasPoNumber() bool`

HasPoNumber returns a boolean if a field has been set.

### GetBudgetAmount

`func (o *SSIOInsertionOrderCommon) GetBudgetAmount() float32`

GetBudgetAmount returns the BudgetAmount field if non-nil, zero value otherwise.

### GetBudgetAmountOk

`func (o *SSIOInsertionOrderCommon) GetBudgetAmountOk() (*float32, bool)`

GetBudgetAmountOk returns a tuple with the BudgetAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetAmount

`func (o *SSIOInsertionOrderCommon) SetBudgetAmount(v float32)`

SetBudgetAmount sets BudgetAmount field to given value.

### HasBudgetAmount

`func (o *SSIOInsertionOrderCommon) HasBudgetAmount() bool`

HasBudgetAmount returns a boolean if a field has been set.

### GetBillingContactFirstname

`func (o *SSIOInsertionOrderCommon) GetBillingContactFirstname() string`

GetBillingContactFirstname returns the BillingContactFirstname field if non-nil, zero value otherwise.

### GetBillingContactFirstnameOk

`func (o *SSIOInsertionOrderCommon) GetBillingContactFirstnameOk() (*string, bool)`

GetBillingContactFirstnameOk returns a tuple with the BillingContactFirstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingContactFirstname

`func (o *SSIOInsertionOrderCommon) SetBillingContactFirstname(v string)`

SetBillingContactFirstname sets BillingContactFirstname field to given value.

### HasBillingContactFirstname

`func (o *SSIOInsertionOrderCommon) HasBillingContactFirstname() bool`

HasBillingContactFirstname returns a boolean if a field has been set.

### GetBillingContactLastname

`func (o *SSIOInsertionOrderCommon) GetBillingContactLastname() string`

GetBillingContactLastname returns the BillingContactLastname field if non-nil, zero value otherwise.

### GetBillingContactLastnameOk

`func (o *SSIOInsertionOrderCommon) GetBillingContactLastnameOk() (*string, bool)`

GetBillingContactLastnameOk returns a tuple with the BillingContactLastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingContactLastname

`func (o *SSIOInsertionOrderCommon) SetBillingContactLastname(v string)`

SetBillingContactLastname sets BillingContactLastname field to given value.

### HasBillingContactLastname

`func (o *SSIOInsertionOrderCommon) HasBillingContactLastname() bool`

HasBillingContactLastname returns a boolean if a field has been set.

### GetBillingContactEmail

`func (o *SSIOInsertionOrderCommon) GetBillingContactEmail() string`

GetBillingContactEmail returns the BillingContactEmail field if non-nil, zero value otherwise.

### GetBillingContactEmailOk

`func (o *SSIOInsertionOrderCommon) GetBillingContactEmailOk() (*string, bool)`

GetBillingContactEmailOk returns a tuple with the BillingContactEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingContactEmail

`func (o *SSIOInsertionOrderCommon) SetBillingContactEmail(v string)`

SetBillingContactEmail sets BillingContactEmail field to given value.

### HasBillingContactEmail

`func (o *SSIOInsertionOrderCommon) HasBillingContactEmail() bool`

HasBillingContactEmail returns a boolean if a field has been set.

### GetMediaContactFirstname

`func (o *SSIOInsertionOrderCommon) GetMediaContactFirstname() string`

GetMediaContactFirstname returns the MediaContactFirstname field if non-nil, zero value otherwise.

### GetMediaContactFirstnameOk

`func (o *SSIOInsertionOrderCommon) GetMediaContactFirstnameOk() (*string, bool)`

GetMediaContactFirstnameOk returns a tuple with the MediaContactFirstname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaContactFirstname

`func (o *SSIOInsertionOrderCommon) SetMediaContactFirstname(v string)`

SetMediaContactFirstname sets MediaContactFirstname field to given value.

### HasMediaContactFirstname

`func (o *SSIOInsertionOrderCommon) HasMediaContactFirstname() bool`

HasMediaContactFirstname returns a boolean if a field has been set.

### GetMediaContactLastname

`func (o *SSIOInsertionOrderCommon) GetMediaContactLastname() string`

GetMediaContactLastname returns the MediaContactLastname field if non-nil, zero value otherwise.

### GetMediaContactLastnameOk

`func (o *SSIOInsertionOrderCommon) GetMediaContactLastnameOk() (*string, bool)`

GetMediaContactLastnameOk returns a tuple with the MediaContactLastname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaContactLastname

`func (o *SSIOInsertionOrderCommon) SetMediaContactLastname(v string)`

SetMediaContactLastname sets MediaContactLastname field to given value.

### HasMediaContactLastname

`func (o *SSIOInsertionOrderCommon) HasMediaContactLastname() bool`

HasMediaContactLastname returns a boolean if a field has been set.

### GetMediaContactEmail

`func (o *SSIOInsertionOrderCommon) GetMediaContactEmail() string`

GetMediaContactEmail returns the MediaContactEmail field if non-nil, zero value otherwise.

### GetMediaContactEmailOk

`func (o *SSIOInsertionOrderCommon) GetMediaContactEmailOk() (*string, bool)`

GetMediaContactEmailOk returns a tuple with the MediaContactEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaContactEmail

`func (o *SSIOInsertionOrderCommon) SetMediaContactEmail(v string)`

SetMediaContactEmail sets MediaContactEmail field to given value.

### HasMediaContactEmail

`func (o *SSIOInsertionOrderCommon) HasMediaContactEmail() bool`

HasMediaContactEmail returns a boolean if a field has been set.

### GetAgencyLink

`func (o *SSIOInsertionOrderCommon) GetAgencyLink() string`

GetAgencyLink returns the AgencyLink field if non-nil, zero value otherwise.

### GetAgencyLinkOk

`func (o *SSIOInsertionOrderCommon) GetAgencyLinkOk() (*string, bool)`

GetAgencyLinkOk returns a tuple with the AgencyLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgencyLink

`func (o *SSIOInsertionOrderCommon) SetAgencyLink(v string)`

SetAgencyLink sets AgencyLink field to given value.

### HasAgencyLink

`func (o *SSIOInsertionOrderCommon) HasAgencyLink() bool`

HasAgencyLink returns a boolean if a field has been set.

### GetUserEmail

`func (o *SSIOInsertionOrderCommon) GetUserEmail() string`

GetUserEmail returns the UserEmail field if non-nil, zero value otherwise.

### GetUserEmailOk

`func (o *SSIOInsertionOrderCommon) GetUserEmailOk() (*string, bool)`

GetUserEmailOk returns a tuple with the UserEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserEmail

`func (o *SSIOInsertionOrderCommon) SetUserEmail(v string)`

SetUserEmail sets UserEmail field to given value.

### HasUserEmail

`func (o *SSIOInsertionOrderCommon) HasUserEmail() bool`

HasUserEmail returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


