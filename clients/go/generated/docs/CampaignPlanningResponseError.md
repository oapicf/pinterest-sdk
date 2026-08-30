# CampaignPlanningResponseError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | Pointer to [**CampaignPlanningResponseErrorCode**](CampaignPlanningResponseErrorCode.md) |  | [optional] 
**Message** | Pointer to **string** | Human-readable error message. | [optional] 

## Methods

### NewCampaignPlanningResponseError

`func NewCampaignPlanningResponseError() *CampaignPlanningResponseError`

NewCampaignPlanningResponseError instantiates a new CampaignPlanningResponseError object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignPlanningResponseErrorWithDefaults

`func NewCampaignPlanningResponseErrorWithDefaults() *CampaignPlanningResponseError`

NewCampaignPlanningResponseErrorWithDefaults instantiates a new CampaignPlanningResponseError object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *CampaignPlanningResponseError) GetCode() CampaignPlanningResponseErrorCode`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *CampaignPlanningResponseError) GetCodeOk() (*CampaignPlanningResponseErrorCode, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *CampaignPlanningResponseError) SetCode(v CampaignPlanningResponseErrorCode)`

SetCode sets Code field to given value.

### HasCode

`func (o *CampaignPlanningResponseError) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetMessage

`func (o *CampaignPlanningResponseError) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *CampaignPlanningResponseError) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *CampaignPlanningResponseError) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *CampaignPlanningResponseError) HasMessage() bool`

HasMessage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


