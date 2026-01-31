# QualityComponentDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Coverage** | **float32** | Coverage percentage for this event type. | 
**Issues** | Pointer to [**[]QualityComponentIssue**](QualityComponentIssue.md) | List of issues detected for this event type, if any. | [optional] 
**Overlap** | Pointer to **float32** | Overlap percentage for this event type. Only populated for external_event_id | [optional] 

## Methods

### NewQualityComponentDetails

`func NewQualityComponentDetails(coverage float32, ) *QualityComponentDetails`

NewQualityComponentDetails instantiates a new QualityComponentDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQualityComponentDetailsWithDefaults

`func NewQualityComponentDetailsWithDefaults() *QualityComponentDetails`

NewQualityComponentDetailsWithDefaults instantiates a new QualityComponentDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCoverage

`func (o *QualityComponentDetails) GetCoverage() float32`

GetCoverage returns the Coverage field if non-nil, zero value otherwise.

### GetCoverageOk

`func (o *QualityComponentDetails) GetCoverageOk() (*float32, bool)`

GetCoverageOk returns a tuple with the Coverage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoverage

`func (o *QualityComponentDetails) SetCoverage(v float32)`

SetCoverage sets Coverage field to given value.


### GetIssues

`func (o *QualityComponentDetails) GetIssues() []QualityComponentIssue`

GetIssues returns the Issues field if non-nil, zero value otherwise.

### GetIssuesOk

`func (o *QualityComponentDetails) GetIssuesOk() (*[]QualityComponentIssue, bool)`

GetIssuesOk returns a tuple with the Issues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssues

`func (o *QualityComponentDetails) SetIssues(v []QualityComponentIssue)`

SetIssues sets Issues field to given value.

### HasIssues

`func (o *QualityComponentDetails) HasIssues() bool`

HasIssues returns a boolean if a field has been set.

### GetOverlap

`func (o *QualityComponentDetails) GetOverlap() float32`

GetOverlap returns the Overlap field if non-nil, zero value otherwise.

### GetOverlapOk

`func (o *QualityComponentDetails) GetOverlapOk() (*float32, bool)`

GetOverlapOk returns a tuple with the Overlap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverlap

`func (o *QualityComponentDetails) SetOverlap(v float32)`

SetOverlap sets Overlap field to given value.

### HasOverlap

`func (o *QualityComponentDetails) HasOverlap() bool`

HasOverlap returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


