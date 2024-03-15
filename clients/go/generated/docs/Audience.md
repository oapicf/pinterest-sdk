# Audience

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | Ad account ID. | [optional] 
**Id** | Pointer to **string** | Audience ID. | [optional] 
**Name** | Pointer to **string** | Audience name. | [optional] 
**AudienceType** | Pointer to **string** | &lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**Description** | Pointer to **NullableString** | Audience description. | [optional] 
**Rule** | Pointer to [**AudienceRule**](AudienceRule.md) |  | [optional] 
**Size** | Pointer to **NullableInt32** | Audience size. | [optional] 
**Status** | Pointer to **string** | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] 
**Type** | Pointer to **string** | Always \&quot;audience\&quot;. | [optional] 
**CreatedTimestamp** | Pointer to **NullableInt32** | Creation time. Unix timestamp in seconds. | [optional] 
**UpdatedTimestamp** | Pointer to **NullableInt32** | Last update time. Unix timestamp in seconds. | [optional] 

## Methods

### NewAudience

`func NewAudience() *Audience`

NewAudience instantiates a new Audience object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAudienceWithDefaults

`func NewAudienceWithDefaults() *Audience`

NewAudienceWithDefaults instantiates a new Audience object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *Audience) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *Audience) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *Audience) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *Audience) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetId

`func (o *Audience) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Audience) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Audience) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *Audience) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *Audience) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Audience) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Audience) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *Audience) HasName() bool`

HasName returns a boolean if a field has been set.

### GetAudienceType

`func (o *Audience) GetAudienceType() string`

GetAudienceType returns the AudienceType field if non-nil, zero value otherwise.

### GetAudienceTypeOk

`func (o *Audience) GetAudienceTypeOk() (*string, bool)`

GetAudienceTypeOk returns a tuple with the AudienceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceType

`func (o *Audience) SetAudienceType(v string)`

SetAudienceType sets AudienceType field to given value.

### HasAudienceType

`func (o *Audience) HasAudienceType() bool`

HasAudienceType returns a boolean if a field has been set.

### GetDescription

`func (o *Audience) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *Audience) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *Audience) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *Audience) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *Audience) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *Audience) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetRule

`func (o *Audience) GetRule() AudienceRule`

GetRule returns the Rule field if non-nil, zero value otherwise.

### GetRuleOk

`func (o *Audience) GetRuleOk() (*AudienceRule, bool)`

GetRuleOk returns a tuple with the Rule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRule

`func (o *Audience) SetRule(v AudienceRule)`

SetRule sets Rule field to given value.

### HasRule

`func (o *Audience) HasRule() bool`

HasRule returns a boolean if a field has been set.

### GetSize

`func (o *Audience) GetSize() int32`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *Audience) GetSizeOk() (*int32, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *Audience) SetSize(v int32)`

SetSize sets Size field to given value.

### HasSize

`func (o *Audience) HasSize() bool`

HasSize returns a boolean if a field has been set.

### SetSizeNil

`func (o *Audience) SetSizeNil(b bool)`

 SetSizeNil sets the value for Size to be an explicit nil

### UnsetSize
`func (o *Audience) UnsetSize()`

UnsetSize ensures that no value is present for Size, not even an explicit nil
### GetStatus

`func (o *Audience) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Audience) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Audience) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *Audience) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetType

`func (o *Audience) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *Audience) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *Audience) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *Audience) HasType() bool`

HasType returns a boolean if a field has been set.

### GetCreatedTimestamp

`func (o *Audience) GetCreatedTimestamp() int32`

GetCreatedTimestamp returns the CreatedTimestamp field if non-nil, zero value otherwise.

### GetCreatedTimestampOk

`func (o *Audience) GetCreatedTimestampOk() (*int32, bool)`

GetCreatedTimestampOk returns a tuple with the CreatedTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTimestamp

`func (o *Audience) SetCreatedTimestamp(v int32)`

SetCreatedTimestamp sets CreatedTimestamp field to given value.

### HasCreatedTimestamp

`func (o *Audience) HasCreatedTimestamp() bool`

HasCreatedTimestamp returns a boolean if a field has been set.

### SetCreatedTimestampNil

`func (o *Audience) SetCreatedTimestampNil(b bool)`

 SetCreatedTimestampNil sets the value for CreatedTimestamp to be an explicit nil

### UnsetCreatedTimestamp
`func (o *Audience) UnsetCreatedTimestamp()`

UnsetCreatedTimestamp ensures that no value is present for CreatedTimestamp, not even an explicit nil
### GetUpdatedTimestamp

`func (o *Audience) GetUpdatedTimestamp() int32`

GetUpdatedTimestamp returns the UpdatedTimestamp field if non-nil, zero value otherwise.

### GetUpdatedTimestampOk

`func (o *Audience) GetUpdatedTimestampOk() (*int32, bool)`

GetUpdatedTimestampOk returns a tuple with the UpdatedTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTimestamp

`func (o *Audience) SetUpdatedTimestamp(v int32)`

SetUpdatedTimestamp sets UpdatedTimestamp field to given value.

### HasUpdatedTimestamp

`func (o *Audience) HasUpdatedTimestamp() bool`

HasUpdatedTimestamp returns a boolean if a field has been set.

### SetUpdatedTimestampNil

`func (o *Audience) SetUpdatedTimestampNil(b bool)`

 SetUpdatedTimestampNil sets the value for UpdatedTimestamp to be an explicit nil

### UnsetUpdatedTimestamp
`func (o *Audience) UnsetUpdatedTimestamp()`

UnsetUpdatedTimestamp ensures that no value is present for UpdatedTimestamp, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


