# AdAccountsAudience

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | Ad account ID. | [optional] 
**AudienceType** | Pointer to [**AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**CreatedByCompanyName** | Pointer to **NullableString** | The company that created this audience. | [optional] [readonly] 
**CreatedTimestamp** | Pointer to **NullableInt32** | Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**Description** | Pointer to **NullableString** | Audience description. | [optional] 
**Id** | **string** | Audience ID. | 
**IsNca** | Pointer to **bool** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional] [readonly] 
**Name** | Pointer to **string** | Audience name. | [optional] 
**Rule** | Pointer to [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  | [optional] 
**Size** | Pointer to **NullableInt32** | Audience size. | [optional] [readonly] 
**Status** | Pointer to [**AudienceStatus**](AudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] [readonly] 
**Type** | Pointer to **string** | Always \&quot;audience\&quot;. | [optional] [readonly] 
**UpdatedTimestamp** | Pointer to **NullableInt32** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 

## Methods

### NewAdAccountsAudience

`func NewAdAccountsAudience(id string, ) *AdAccountsAudience`

NewAdAccountsAudience instantiates a new AdAccountsAudience object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdAccountsAudienceWithDefaults

`func NewAdAccountsAudienceWithDefaults() *AdAccountsAudience`

NewAdAccountsAudienceWithDefaults instantiates a new AdAccountsAudience object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *AdAccountsAudience) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *AdAccountsAudience) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *AdAccountsAudience) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *AdAccountsAudience) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetAudienceType

`func (o *AdAccountsAudience) GetAudienceType() AudienceType`

GetAudienceType returns the AudienceType field if non-nil, zero value otherwise.

### GetAudienceTypeOk

`func (o *AdAccountsAudience) GetAudienceTypeOk() (*AudienceType, bool)`

GetAudienceTypeOk returns a tuple with the AudienceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceType

`func (o *AdAccountsAudience) SetAudienceType(v AudienceType)`

SetAudienceType sets AudienceType field to given value.

### HasAudienceType

`func (o *AdAccountsAudience) HasAudienceType() bool`

HasAudienceType returns a boolean if a field has been set.

### GetCreatedByCompanyName

`func (o *AdAccountsAudience) GetCreatedByCompanyName() string`

GetCreatedByCompanyName returns the CreatedByCompanyName field if non-nil, zero value otherwise.

### GetCreatedByCompanyNameOk

`func (o *AdAccountsAudience) GetCreatedByCompanyNameOk() (*string, bool)`

GetCreatedByCompanyNameOk returns a tuple with the CreatedByCompanyName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedByCompanyName

`func (o *AdAccountsAudience) SetCreatedByCompanyName(v string)`

SetCreatedByCompanyName sets CreatedByCompanyName field to given value.

### HasCreatedByCompanyName

`func (o *AdAccountsAudience) HasCreatedByCompanyName() bool`

HasCreatedByCompanyName returns a boolean if a field has been set.

### SetCreatedByCompanyNameNil

`func (o *AdAccountsAudience) SetCreatedByCompanyNameNil(b bool)`

 SetCreatedByCompanyNameNil sets the value for CreatedByCompanyName to be an explicit nil

### UnsetCreatedByCompanyName
`func (o *AdAccountsAudience) UnsetCreatedByCompanyName()`

UnsetCreatedByCompanyName ensures that no value is present for CreatedByCompanyName, not even an explicit nil
### GetCreatedTimestamp

`func (o *AdAccountsAudience) GetCreatedTimestamp() int32`

GetCreatedTimestamp returns the CreatedTimestamp field if non-nil, zero value otherwise.

### GetCreatedTimestampOk

`func (o *AdAccountsAudience) GetCreatedTimestampOk() (*int32, bool)`

GetCreatedTimestampOk returns a tuple with the CreatedTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTimestamp

`func (o *AdAccountsAudience) SetCreatedTimestamp(v int32)`

SetCreatedTimestamp sets CreatedTimestamp field to given value.

### HasCreatedTimestamp

`func (o *AdAccountsAudience) HasCreatedTimestamp() bool`

HasCreatedTimestamp returns a boolean if a field has been set.

### SetCreatedTimestampNil

`func (o *AdAccountsAudience) SetCreatedTimestampNil(b bool)`

 SetCreatedTimestampNil sets the value for CreatedTimestamp to be an explicit nil

### UnsetCreatedTimestamp
`func (o *AdAccountsAudience) UnsetCreatedTimestamp()`

UnsetCreatedTimestamp ensures that no value is present for CreatedTimestamp, not even an explicit nil
### GetDescription

`func (o *AdAccountsAudience) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *AdAccountsAudience) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *AdAccountsAudience) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *AdAccountsAudience) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *AdAccountsAudience) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *AdAccountsAudience) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetId

`func (o *AdAccountsAudience) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AdAccountsAudience) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AdAccountsAudience) SetId(v string)`

SetId sets Id field to given value.


### GetIsNca

`func (o *AdAccountsAudience) GetIsNca() bool`

GetIsNca returns the IsNca field if non-nil, zero value otherwise.

### GetIsNcaOk

`func (o *AdAccountsAudience) GetIsNcaOk() (*bool, bool)`

GetIsNcaOk returns a tuple with the IsNca field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsNca

`func (o *AdAccountsAudience) SetIsNca(v bool)`

SetIsNca sets IsNca field to given value.

### HasIsNca

`func (o *AdAccountsAudience) HasIsNca() bool`

HasIsNca returns a boolean if a field has been set.

### GetName

`func (o *AdAccountsAudience) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AdAccountsAudience) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AdAccountsAudience) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AdAccountsAudience) HasName() bool`

HasName returns a boolean if a field has been set.

### GetRule

`func (o *AdAccountsAudience) GetRule() AdAccountsAudienceRule`

GetRule returns the Rule field if non-nil, zero value otherwise.

### GetRuleOk

`func (o *AdAccountsAudience) GetRuleOk() (*AdAccountsAudienceRule, bool)`

GetRuleOk returns a tuple with the Rule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRule

`func (o *AdAccountsAudience) SetRule(v AdAccountsAudienceRule)`

SetRule sets Rule field to given value.

### HasRule

`func (o *AdAccountsAudience) HasRule() bool`

HasRule returns a boolean if a field has been set.

### GetSize

`func (o *AdAccountsAudience) GetSize() int32`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *AdAccountsAudience) GetSizeOk() (*int32, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *AdAccountsAudience) SetSize(v int32)`

SetSize sets Size field to given value.

### HasSize

`func (o *AdAccountsAudience) HasSize() bool`

HasSize returns a boolean if a field has been set.

### SetSizeNil

`func (o *AdAccountsAudience) SetSizeNil(b bool)`

 SetSizeNil sets the value for Size to be an explicit nil

### UnsetSize
`func (o *AdAccountsAudience) UnsetSize()`

UnsetSize ensures that no value is present for Size, not even an explicit nil
### GetStatus

`func (o *AdAccountsAudience) GetStatus() AudienceStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *AdAccountsAudience) GetStatusOk() (*AudienceStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *AdAccountsAudience) SetStatus(v AudienceStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *AdAccountsAudience) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetType

`func (o *AdAccountsAudience) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *AdAccountsAudience) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *AdAccountsAudience) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *AdAccountsAudience) HasType() bool`

HasType returns a boolean if a field has been set.

### GetUpdatedTimestamp

`func (o *AdAccountsAudience) GetUpdatedTimestamp() int32`

GetUpdatedTimestamp returns the UpdatedTimestamp field if non-nil, zero value otherwise.

### GetUpdatedTimestampOk

`func (o *AdAccountsAudience) GetUpdatedTimestampOk() (*int32, bool)`

GetUpdatedTimestampOk returns a tuple with the UpdatedTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTimestamp

`func (o *AdAccountsAudience) SetUpdatedTimestamp(v int32)`

SetUpdatedTimestamp sets UpdatedTimestamp field to given value.

### HasUpdatedTimestamp

`func (o *AdAccountsAudience) HasUpdatedTimestamp() bool`

HasUpdatedTimestamp returns a boolean if a field has been set.

### SetUpdatedTimestampNil

`func (o *AdAccountsAudience) SetUpdatedTimestampNil(b bool)`

 SetUpdatedTimestampNil sets the value for UpdatedTimestamp to be an explicit nil

### UnsetUpdatedTimestamp
`func (o *AdAccountsAudience) UnsetUpdatedTimestamp()`

UnsetUpdatedTimestamp ensures that no value is present for UpdatedTimestamp, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


