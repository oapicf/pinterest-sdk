# AudienceCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | Ad account ID. | [optional] 
**Name** | **string** | Audience name. | 
**Rule** | [**AudienceRule**](AudienceRule.md) |  | 
**Description** | Pointer to **string** | Audience description. | [optional] 
**AudienceType** | [**AudienceCreateRequest1AudienceType**](AudienceCreateRequest1AudienceType.md) |  | 

## Methods

### NewAudienceCreateRequest

`func NewAudienceCreateRequest(name string, rule AudienceRule, audienceType AudienceCreateRequest1AudienceType, ) *AudienceCreateRequest`

NewAudienceCreateRequest instantiates a new AudienceCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAudienceCreateRequestWithDefaults

`func NewAudienceCreateRequestWithDefaults() *AudienceCreateRequest`

NewAudienceCreateRequestWithDefaults instantiates a new AudienceCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *AudienceCreateRequest) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *AudienceCreateRequest) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *AudienceCreateRequest) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *AudienceCreateRequest) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetName

`func (o *AudienceCreateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AudienceCreateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AudienceCreateRequest) SetName(v string)`

SetName sets Name field to given value.


### GetRule

`func (o *AudienceCreateRequest) GetRule() AudienceRule`

GetRule returns the Rule field if non-nil, zero value otherwise.

### GetRuleOk

`func (o *AudienceCreateRequest) GetRuleOk() (*AudienceRule, bool)`

GetRuleOk returns a tuple with the Rule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRule

`func (o *AudienceCreateRequest) SetRule(v AudienceRule)`

SetRule sets Rule field to given value.


### GetDescription

`func (o *AudienceCreateRequest) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *AudienceCreateRequest) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *AudienceCreateRequest) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *AudienceCreateRequest) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetAudienceType

`func (o *AudienceCreateRequest) GetAudienceType() AudienceCreateRequest1AudienceType`

GetAudienceType returns the AudienceType field if non-nil, zero value otherwise.

### GetAudienceTypeOk

`func (o *AudienceCreateRequest) GetAudienceTypeOk() (*AudienceCreateRequest1AudienceType, bool)`

GetAudienceTypeOk returns a tuple with the AudienceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceType

`func (o *AudienceCreateRequest) SetAudienceType(v AudienceCreateRequest1AudienceType)`

SetAudienceType sets AudienceType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


