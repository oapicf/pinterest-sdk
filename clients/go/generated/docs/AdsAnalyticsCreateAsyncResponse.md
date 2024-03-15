# AdsAnalyticsCreateAsyncResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportStatus** | Pointer to [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | [optional] 
**Token** | Pointer to **string** |  | [optional] 
**Message** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewAdsAnalyticsCreateAsyncResponse

`func NewAdsAnalyticsCreateAsyncResponse() *AdsAnalyticsCreateAsyncResponse`

NewAdsAnalyticsCreateAsyncResponse instantiates a new AdsAnalyticsCreateAsyncResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdsAnalyticsCreateAsyncResponseWithDefaults

`func NewAdsAnalyticsCreateAsyncResponseWithDefaults() *AdsAnalyticsCreateAsyncResponse`

NewAdsAnalyticsCreateAsyncResponseWithDefaults instantiates a new AdsAnalyticsCreateAsyncResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReportStatus

`func (o *AdsAnalyticsCreateAsyncResponse) GetReportStatus() BulkReportingJobStatus`

GetReportStatus returns the ReportStatus field if non-nil, zero value otherwise.

### GetReportStatusOk

`func (o *AdsAnalyticsCreateAsyncResponse) GetReportStatusOk() (*BulkReportingJobStatus, bool)`

GetReportStatusOk returns a tuple with the ReportStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportStatus

`func (o *AdsAnalyticsCreateAsyncResponse) SetReportStatus(v BulkReportingJobStatus)`

SetReportStatus sets ReportStatus field to given value.

### HasReportStatus

`func (o *AdsAnalyticsCreateAsyncResponse) HasReportStatus() bool`

HasReportStatus returns a boolean if a field has been set.

### GetToken

`func (o *AdsAnalyticsCreateAsyncResponse) GetToken() string`

GetToken returns the Token field if non-nil, zero value otherwise.

### GetTokenOk

`func (o *AdsAnalyticsCreateAsyncResponse) GetTokenOk() (*string, bool)`

GetTokenOk returns a tuple with the Token field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToken

`func (o *AdsAnalyticsCreateAsyncResponse) SetToken(v string)`

SetToken sets Token field to given value.

### HasToken

`func (o *AdsAnalyticsCreateAsyncResponse) HasToken() bool`

HasToken returns a boolean if a field has been set.

### GetMessage

`func (o *AdsAnalyticsCreateAsyncResponse) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *AdsAnalyticsCreateAsyncResponse) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *AdsAnalyticsCreateAsyncResponse) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *AdsAnalyticsCreateAsyncResponse) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### SetMessageNil

`func (o *AdsAnalyticsCreateAsyncResponse) SetMessageNil(b bool)`

 SetMessageNil sets the value for Message to be an explicit nil

### UnsetMessage
`func (o *AdsAnalyticsCreateAsyncResponse) UnsetMessage()`

UnsetMessage ensures that no value is present for Message, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


