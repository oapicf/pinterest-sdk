# AudienceCommon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | Ad account ID. | [optional] 
**Name** | Pointer to **string** | Audience name. | [optional] 
**Rule** | Pointer to [**AudienceRule**](AudienceRule.md) |  | [optional] 

## Methods

### NewAudienceCommon

`func NewAudienceCommon() *AudienceCommon`

NewAudienceCommon instantiates a new AudienceCommon object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAudienceCommonWithDefaults

`func NewAudienceCommonWithDefaults() *AudienceCommon`

NewAudienceCommonWithDefaults instantiates a new AudienceCommon object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *AudienceCommon) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *AudienceCommon) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *AudienceCommon) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *AudienceCommon) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetName

`func (o *AudienceCommon) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AudienceCommon) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AudienceCommon) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AudienceCommon) HasName() bool`

HasName returns a boolean if a field has been set.

### GetRule

`func (o *AudienceCommon) GetRule() AudienceRule`

GetRule returns the Rule field if non-nil, zero value otherwise.

### GetRuleOk

`func (o *AudienceCommon) GetRuleOk() (*AudienceRule, bool)`

GetRuleOk returns a tuple with the Rule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRule

`func (o *AudienceCommon) SetRule(v AudienceRule)`

SetRule sets Rule field to given value.

### HasRule

`func (o *AudienceCommon) HasRule() bool`

HasRule returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


