# AudienceCreateCustomRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | Ad account ID. | [optional] 
**Name** | **string** | Audience name. | 
**Rule** | [**AudienceRule**](AudienceRule.md) |  | 
**SharingType** | [**AudienceSharingType**](AudienceSharingType.md) |  | 
**DataParty** | [**AudienceDataParty**](AudienceDataParty.md) |  | 
**Category** | Pointer to **string** |  | [optional] 

## Methods

### NewAudienceCreateCustomRequest

`func NewAudienceCreateCustomRequest(name string, rule AudienceRule, sharingType AudienceSharingType, dataParty AudienceDataParty, ) *AudienceCreateCustomRequest`

NewAudienceCreateCustomRequest instantiates a new AudienceCreateCustomRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAudienceCreateCustomRequestWithDefaults

`func NewAudienceCreateCustomRequestWithDefaults() *AudienceCreateCustomRequest`

NewAudienceCreateCustomRequestWithDefaults instantiates a new AudienceCreateCustomRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *AudienceCreateCustomRequest) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *AudienceCreateCustomRequest) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *AudienceCreateCustomRequest) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *AudienceCreateCustomRequest) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetName

`func (o *AudienceCreateCustomRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AudienceCreateCustomRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AudienceCreateCustomRequest) SetName(v string)`

SetName sets Name field to given value.


### GetRule

`func (o *AudienceCreateCustomRequest) GetRule() AudienceRule`

GetRule returns the Rule field if non-nil, zero value otherwise.

### GetRuleOk

`func (o *AudienceCreateCustomRequest) GetRuleOk() (*AudienceRule, bool)`

GetRuleOk returns a tuple with the Rule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRule

`func (o *AudienceCreateCustomRequest) SetRule(v AudienceRule)`

SetRule sets Rule field to given value.


### GetSharingType

`func (o *AudienceCreateCustomRequest) GetSharingType() AudienceSharingType`

GetSharingType returns the SharingType field if non-nil, zero value otherwise.

### GetSharingTypeOk

`func (o *AudienceCreateCustomRequest) GetSharingTypeOk() (*AudienceSharingType, bool)`

GetSharingTypeOk returns a tuple with the SharingType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSharingType

`func (o *AudienceCreateCustomRequest) SetSharingType(v AudienceSharingType)`

SetSharingType sets SharingType field to given value.


### GetDataParty

`func (o *AudienceCreateCustomRequest) GetDataParty() AudienceDataParty`

GetDataParty returns the DataParty field if non-nil, zero value otherwise.

### GetDataPartyOk

`func (o *AudienceCreateCustomRequest) GetDataPartyOk() (*AudienceDataParty, bool)`

GetDataPartyOk returns a tuple with the DataParty field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataParty

`func (o *AudienceCreateCustomRequest) SetDataParty(v AudienceDataParty)`

SetDataParty sets DataParty field to given value.


### GetCategory

`func (o *AudienceCreateCustomRequest) GetCategory() string`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *AudienceCreateCustomRequest) GetCategoryOk() (*string, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *AudienceCreateCustomRequest) SetCategory(v string)`

SetCategory sets Category field to given value.

### HasCategory

`func (o *AudienceCreateCustomRequest) HasCategory() bool`

HasCategory returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


