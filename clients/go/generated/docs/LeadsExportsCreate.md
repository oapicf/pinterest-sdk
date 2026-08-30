# LeadsExportsCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdId** | **string** | ID for the ad collecting leads. | 
**EndDate** | **string** | Export leads collected on and before end date (UTC). Format: YYYY-MM-DD. | 
**StartDate** | **string** | Export leads collected on and after start date (UTC). Format: YYYY-MM-DD. | 

## Methods

### NewLeadsExportsCreate

`func NewLeadsExportsCreate(adId string, endDate string, startDate string, ) *LeadsExportsCreate`

NewLeadsExportsCreate instantiates a new LeadsExportsCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLeadsExportsCreateWithDefaults

`func NewLeadsExportsCreateWithDefaults() *LeadsExportsCreate`

NewLeadsExportsCreateWithDefaults instantiates a new LeadsExportsCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdId

`func (o *LeadsExportsCreate) GetAdId() string`

GetAdId returns the AdId field if non-nil, zero value otherwise.

### GetAdIdOk

`func (o *LeadsExportsCreate) GetAdIdOk() (*string, bool)`

GetAdIdOk returns a tuple with the AdId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdId

`func (o *LeadsExportsCreate) SetAdId(v string)`

SetAdId sets AdId field to given value.


### GetEndDate

`func (o *LeadsExportsCreate) GetEndDate() string`

GetEndDate returns the EndDate field if non-nil, zero value otherwise.

### GetEndDateOk

`func (o *LeadsExportsCreate) GetEndDateOk() (*string, bool)`

GetEndDateOk returns a tuple with the EndDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndDate

`func (o *LeadsExportsCreate) SetEndDate(v string)`

SetEndDate sets EndDate field to given value.


### GetStartDate

`func (o *LeadsExportsCreate) GetStartDate() string`

GetStartDate returns the StartDate field if non-nil, zero value otherwise.

### GetStartDateOk

`func (o *LeadsExportsCreate) GetStartDateOk() (*string, bool)`

GetStartDateOk returns a tuple with the StartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartDate

`func (o *LeadsExportsCreate) SetStartDate(v string)`

SetStartDate sets StartDate field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


