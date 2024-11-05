# LeadsExportCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartDate** | **string** | Export leads collected on and after start date (UTC). Format: YYYY-MM-DD | 
**EndDate** | **string** | Export leads collected on and before end date (UTC). Format: YYYY-MM-DD | 
**AdId** | **string** | ID for the ad collecting leads | 

## Methods

### NewLeadsExportCreateRequest

`func NewLeadsExportCreateRequest(startDate string, endDate string, adId string, ) *LeadsExportCreateRequest`

NewLeadsExportCreateRequest instantiates a new LeadsExportCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLeadsExportCreateRequestWithDefaults

`func NewLeadsExportCreateRequestWithDefaults() *LeadsExportCreateRequest`

NewLeadsExportCreateRequestWithDefaults instantiates a new LeadsExportCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStartDate

`func (o *LeadsExportCreateRequest) GetStartDate() string`

GetStartDate returns the StartDate field if non-nil, zero value otherwise.

### GetStartDateOk

`func (o *LeadsExportCreateRequest) GetStartDateOk() (*string, bool)`

GetStartDateOk returns a tuple with the StartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartDate

`func (o *LeadsExportCreateRequest) SetStartDate(v string)`

SetStartDate sets StartDate field to given value.


### GetEndDate

`func (o *LeadsExportCreateRequest) GetEndDate() string`

GetEndDate returns the EndDate field if non-nil, zero value otherwise.

### GetEndDateOk

`func (o *LeadsExportCreateRequest) GetEndDateOk() (*string, bool)`

GetEndDateOk returns a tuple with the EndDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndDate

`func (o *LeadsExportCreateRequest) SetEndDate(v string)`

SetEndDate sets EndDate field to given value.


### GetAdId

`func (o *LeadsExportCreateRequest) GetAdId() string`

GetAdId returns the AdId field if non-nil, zero value otherwise.

### GetAdIdOk

`func (o *LeadsExportCreateRequest) GetAdIdOk() (*string, bool)`

GetAdIdOk returns a tuple with the AdId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdId

`func (o *LeadsExportCreateRequest) SetAdId(v string)`

SetAdId sets AdId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


