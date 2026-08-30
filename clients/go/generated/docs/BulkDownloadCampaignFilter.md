# BulkDownloadCampaignFilter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignStatus** | Pointer to [**[]SummaryStatus**](SummaryStatus.md) |  | [optional] 
**EndTime** | Pointer to **string** | Unix UTC timestamp. | [optional] 
**Name** | Pointer to **string** | Campaign name | [optional] 
**ObjectiveType** | Pointer to [**[]ConversionObjectiveType**](ConversionObjectiveType.md) |  | [optional] 
**StartTime** | Pointer to **string** | Unix UTC timestamp. | [optional] 

## Methods

### NewBulkDownloadCampaignFilter

`func NewBulkDownloadCampaignFilter() *BulkDownloadCampaignFilter`

NewBulkDownloadCampaignFilter instantiates a new BulkDownloadCampaignFilter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBulkDownloadCampaignFilterWithDefaults

`func NewBulkDownloadCampaignFilterWithDefaults() *BulkDownloadCampaignFilter`

NewBulkDownloadCampaignFilterWithDefaults instantiates a new BulkDownloadCampaignFilter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCampaignStatus

`func (o *BulkDownloadCampaignFilter) GetCampaignStatus() []SummaryStatus`

GetCampaignStatus returns the CampaignStatus field if non-nil, zero value otherwise.

### GetCampaignStatusOk

`func (o *BulkDownloadCampaignFilter) GetCampaignStatusOk() (*[]SummaryStatus, bool)`

GetCampaignStatusOk returns a tuple with the CampaignStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignStatus

`func (o *BulkDownloadCampaignFilter) SetCampaignStatus(v []SummaryStatus)`

SetCampaignStatus sets CampaignStatus field to given value.

### HasCampaignStatus

`func (o *BulkDownloadCampaignFilter) HasCampaignStatus() bool`

HasCampaignStatus returns a boolean if a field has been set.

### GetEndTime

`func (o *BulkDownloadCampaignFilter) GetEndTime() string`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *BulkDownloadCampaignFilter) GetEndTimeOk() (*string, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *BulkDownloadCampaignFilter) SetEndTime(v string)`

SetEndTime sets EndTime field to given value.

### HasEndTime

`func (o *BulkDownloadCampaignFilter) HasEndTime() bool`

HasEndTime returns a boolean if a field has been set.

### GetName

`func (o *BulkDownloadCampaignFilter) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BulkDownloadCampaignFilter) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BulkDownloadCampaignFilter) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *BulkDownloadCampaignFilter) HasName() bool`

HasName returns a boolean if a field has been set.

### GetObjectiveType

`func (o *BulkDownloadCampaignFilter) GetObjectiveType() []ConversionObjectiveType`

GetObjectiveType returns the ObjectiveType field if non-nil, zero value otherwise.

### GetObjectiveTypeOk

`func (o *BulkDownloadCampaignFilter) GetObjectiveTypeOk() (*[]ConversionObjectiveType, bool)`

GetObjectiveTypeOk returns a tuple with the ObjectiveType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObjectiveType

`func (o *BulkDownloadCampaignFilter) SetObjectiveType(v []ConversionObjectiveType)`

SetObjectiveType sets ObjectiveType field to given value.

### HasObjectiveType

`func (o *BulkDownloadCampaignFilter) HasObjectiveType() bool`

HasObjectiveType returns a boolean if a field has been set.

### GetStartTime

`func (o *BulkDownloadCampaignFilter) GetStartTime() string`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *BulkDownloadCampaignFilter) GetStartTimeOk() (*string, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *BulkDownloadCampaignFilter) SetStartTime(v string)`

SetStartTime sets StartTime field to given value.

### HasStartTime

`func (o *BulkDownloadCampaignFilter) HasStartTime() bool`

HasStartTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


