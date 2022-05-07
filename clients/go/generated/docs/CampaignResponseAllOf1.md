# CampaignResponseAllOf1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ObjectiveType** | Pointer to [**ObjectiveType**](ObjectiveType.md) |  | [optional] 
**CreatedTime** | Pointer to **int32** | Campaign creation time. Unix timestamp in seconds. | [optional] 
**UpdatedTime** | Pointer to **int32** | UTC timestamp. Last update time. | [optional] 
**Type** | Pointer to **string** | Always \&quot;campaign\&quot;. | [optional] 

## Methods

### NewCampaignResponseAllOf1

`func NewCampaignResponseAllOf1() *CampaignResponseAllOf1`

NewCampaignResponseAllOf1 instantiates a new CampaignResponseAllOf1 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignResponseAllOf1WithDefaults

`func NewCampaignResponseAllOf1WithDefaults() *CampaignResponseAllOf1`

NewCampaignResponseAllOf1WithDefaults instantiates a new CampaignResponseAllOf1 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObjectiveType

`func (o *CampaignResponseAllOf1) GetObjectiveType() ObjectiveType`

GetObjectiveType returns the ObjectiveType field if non-nil, zero value otherwise.

### GetObjectiveTypeOk

`func (o *CampaignResponseAllOf1) GetObjectiveTypeOk() (*ObjectiveType, bool)`

GetObjectiveTypeOk returns a tuple with the ObjectiveType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObjectiveType

`func (o *CampaignResponseAllOf1) SetObjectiveType(v ObjectiveType)`

SetObjectiveType sets ObjectiveType field to given value.

### HasObjectiveType

`func (o *CampaignResponseAllOf1) HasObjectiveType() bool`

HasObjectiveType returns a boolean if a field has been set.

### GetCreatedTime

`func (o *CampaignResponseAllOf1) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *CampaignResponseAllOf1) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *CampaignResponseAllOf1) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *CampaignResponseAllOf1) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetUpdatedTime

`func (o *CampaignResponseAllOf1) GetUpdatedTime() int32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *CampaignResponseAllOf1) GetUpdatedTimeOk() (*int32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *CampaignResponseAllOf1) SetUpdatedTime(v int32)`

SetUpdatedTime sets UpdatedTime field to given value.

### HasUpdatedTime

`func (o *CampaignResponseAllOf1) HasUpdatedTime() bool`

HasUpdatedTime returns a boolean if a field has been set.

### GetType

`func (o *CampaignResponseAllOf1) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CampaignResponseAllOf1) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CampaignResponseAllOf1) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *CampaignResponseAllOf1) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


