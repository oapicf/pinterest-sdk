# BulkDownloadRequestCampaignFilter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartTime** | Pointer to **string** | Unix UTC timestamp. | [optional] 
**EndTime** | Pointer to **string** | Unix UTC timestamp. | [optional] 
**Name** | Pointer to **string** | Campaign name | [optional] 
**CampaignStatus** | Pointer to [**[]CampaignSummaryStatus**](CampaignSummaryStatus.md) |  | [optional] 
**ObjectiveType** | Pointer to [**[]ObjectiveType**](ObjectiveType.md) |  | [optional] 

## Methods

### NewBulkDownloadRequestCampaignFilter

`func NewBulkDownloadRequestCampaignFilter() *BulkDownloadRequestCampaignFilter`

NewBulkDownloadRequestCampaignFilter instantiates a new BulkDownloadRequestCampaignFilter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBulkDownloadRequestCampaignFilterWithDefaults

`func NewBulkDownloadRequestCampaignFilterWithDefaults() *BulkDownloadRequestCampaignFilter`

NewBulkDownloadRequestCampaignFilterWithDefaults instantiates a new BulkDownloadRequestCampaignFilter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStartTime

`func (o *BulkDownloadRequestCampaignFilter) GetStartTime() string`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *BulkDownloadRequestCampaignFilter) GetStartTimeOk() (*string, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *BulkDownloadRequestCampaignFilter) SetStartTime(v string)`

SetStartTime sets StartTime field to given value.

### HasStartTime

`func (o *BulkDownloadRequestCampaignFilter) HasStartTime() bool`

HasStartTime returns a boolean if a field has been set.

### GetEndTime

`func (o *BulkDownloadRequestCampaignFilter) GetEndTime() string`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *BulkDownloadRequestCampaignFilter) GetEndTimeOk() (*string, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *BulkDownloadRequestCampaignFilter) SetEndTime(v string)`

SetEndTime sets EndTime field to given value.

### HasEndTime

`func (o *BulkDownloadRequestCampaignFilter) HasEndTime() bool`

HasEndTime returns a boolean if a field has been set.

### GetName

`func (o *BulkDownloadRequestCampaignFilter) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BulkDownloadRequestCampaignFilter) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BulkDownloadRequestCampaignFilter) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *BulkDownloadRequestCampaignFilter) HasName() bool`

HasName returns a boolean if a field has been set.

### GetCampaignStatus

`func (o *BulkDownloadRequestCampaignFilter) GetCampaignStatus() []CampaignSummaryStatus`

GetCampaignStatus returns the CampaignStatus field if non-nil, zero value otherwise.

### GetCampaignStatusOk

`func (o *BulkDownloadRequestCampaignFilter) GetCampaignStatusOk() (*[]CampaignSummaryStatus, bool)`

GetCampaignStatusOk returns a tuple with the CampaignStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignStatus

`func (o *BulkDownloadRequestCampaignFilter) SetCampaignStatus(v []CampaignSummaryStatus)`

SetCampaignStatus sets CampaignStatus field to given value.

### HasCampaignStatus

`func (o *BulkDownloadRequestCampaignFilter) HasCampaignStatus() bool`

HasCampaignStatus returns a boolean if a field has been set.

### GetObjectiveType

`func (o *BulkDownloadRequestCampaignFilter) GetObjectiveType() []ObjectiveType`

GetObjectiveType returns the ObjectiveType field if non-nil, zero value otherwise.

### GetObjectiveTypeOk

`func (o *BulkDownloadRequestCampaignFilter) GetObjectiveTypeOk() (*[]ObjectiveType, bool)`

GetObjectiveTypeOk returns a tuple with the ObjectiveType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObjectiveType

`func (o *BulkDownloadRequestCampaignFilter) SetObjectiveType(v []ObjectiveType)`

SetObjectiveType sets ObjectiveType field to given value.

### HasObjectiveType

`func (o *BulkDownloadRequestCampaignFilter) HasObjectiveType() bool`

HasObjectiveType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


