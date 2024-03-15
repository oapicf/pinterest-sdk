# AudienceRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | Pointer to **string** | Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. | [optional] 
**CustomerListId** | Pointer to **string** | Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;. | [optional] 
**EngagementDomain** | Pointer to **[]string** | The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;. | [optional] 
**EngagementType** | Pointer to **string** | Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set.  | [optional] 
**Event** | Pointer to **string** | A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event. | [optional] 
**EventData** | Pointer to [**PinterestTagEventData**](PinterestTagEventData.md) |  | [optional] 
**Percentage** | Pointer to **int32** | Percentage should be 1-10. The targeted audience should be this % size across Pinterest. | [optional] 
**PinId** | Pointer to **[]string** | IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;] | [optional] 
**Prefill** | Pointer to **bool** | Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;. | [optional] 
**RetentionDays** | Pointer to **int32** | Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified. | [optional] 
**SeedId** | Pointer to **[]string** | Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;.  | [optional] 
**Url** | Pointer to **[]string** | Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains].&lt;br&gt;Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot;&lt;br&gt;Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;} | [optional] 
**VisitorSourceId** | Pointer to **string** | The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;. | [optional] 
**EventSource** | Pointer to **map[string]interface{}** | Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline | [optional] 
**IngestionSource** | Pointer to **map[string]interface{}** | Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api | [optional] 
**EngagerType** | Pointer to **int32** | Optional for ENGAGEMENT. Engager type value should be 1-2. | [optional] 
**CampaignId** | Pointer to **[]string** | Campaign ID for engagement audience filter. | [optional] 
**AdId** | Pointer to **[]string** | Ad ID for engagement audience filter. | [optional] 
**ObjectiveType** | Pointer to [**[]ObjectiveType**](ObjectiveType.md) | Objective for engagement audience filter. | [optional] 
**AdAccountId** | Pointer to **string** | Ad account ID. | [optional] 

## Methods

### NewAudienceRule

`func NewAudienceRule() *AudienceRule`

NewAudienceRule instantiates a new AudienceRule object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAudienceRuleWithDefaults

`func NewAudienceRuleWithDefaults() *AudienceRule`

NewAudienceRuleWithDefaults instantiates a new AudienceRule object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCountry

`func (o *AudienceRule) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *AudienceRule) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *AudienceRule) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *AudienceRule) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetCustomerListId

`func (o *AudienceRule) GetCustomerListId() string`

GetCustomerListId returns the CustomerListId field if non-nil, zero value otherwise.

### GetCustomerListIdOk

`func (o *AudienceRule) GetCustomerListIdOk() (*string, bool)`

GetCustomerListIdOk returns a tuple with the CustomerListId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerListId

`func (o *AudienceRule) SetCustomerListId(v string)`

SetCustomerListId sets CustomerListId field to given value.

### HasCustomerListId

`func (o *AudienceRule) HasCustomerListId() bool`

HasCustomerListId returns a boolean if a field has been set.

### GetEngagementDomain

`func (o *AudienceRule) GetEngagementDomain() []string`

GetEngagementDomain returns the EngagementDomain field if non-nil, zero value otherwise.

### GetEngagementDomainOk

`func (o *AudienceRule) GetEngagementDomainOk() (*[]string, bool)`

GetEngagementDomainOk returns a tuple with the EngagementDomain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEngagementDomain

`func (o *AudienceRule) SetEngagementDomain(v []string)`

SetEngagementDomain sets EngagementDomain field to given value.

### HasEngagementDomain

`func (o *AudienceRule) HasEngagementDomain() bool`

HasEngagementDomain returns a boolean if a field has been set.

### GetEngagementType

`func (o *AudienceRule) GetEngagementType() string`

GetEngagementType returns the EngagementType field if non-nil, zero value otherwise.

### GetEngagementTypeOk

`func (o *AudienceRule) GetEngagementTypeOk() (*string, bool)`

GetEngagementTypeOk returns a tuple with the EngagementType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEngagementType

`func (o *AudienceRule) SetEngagementType(v string)`

SetEngagementType sets EngagementType field to given value.

### HasEngagementType

`func (o *AudienceRule) HasEngagementType() bool`

HasEngagementType returns a boolean if a field has been set.

### GetEvent

`func (o *AudienceRule) GetEvent() string`

GetEvent returns the Event field if non-nil, zero value otherwise.

### GetEventOk

`func (o *AudienceRule) GetEventOk() (*string, bool)`

GetEventOk returns a tuple with the Event field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvent

`func (o *AudienceRule) SetEvent(v string)`

SetEvent sets Event field to given value.

### HasEvent

`func (o *AudienceRule) HasEvent() bool`

HasEvent returns a boolean if a field has been set.

### GetEventData

`func (o *AudienceRule) GetEventData() PinterestTagEventData`

GetEventData returns the EventData field if non-nil, zero value otherwise.

### GetEventDataOk

`func (o *AudienceRule) GetEventDataOk() (*PinterestTagEventData, bool)`

GetEventDataOk returns a tuple with the EventData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventData

`func (o *AudienceRule) SetEventData(v PinterestTagEventData)`

SetEventData sets EventData field to given value.

### HasEventData

`func (o *AudienceRule) HasEventData() bool`

HasEventData returns a boolean if a field has been set.

### GetPercentage

`func (o *AudienceRule) GetPercentage() int32`

GetPercentage returns the Percentage field if non-nil, zero value otherwise.

### GetPercentageOk

`func (o *AudienceRule) GetPercentageOk() (*int32, bool)`

GetPercentageOk returns a tuple with the Percentage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPercentage

`func (o *AudienceRule) SetPercentage(v int32)`

SetPercentage sets Percentage field to given value.

### HasPercentage

`func (o *AudienceRule) HasPercentage() bool`

HasPercentage returns a boolean if a field has been set.

### GetPinId

`func (o *AudienceRule) GetPinId() []string`

GetPinId returns the PinId field if non-nil, zero value otherwise.

### GetPinIdOk

`func (o *AudienceRule) GetPinIdOk() (*[]string, bool)`

GetPinIdOk returns a tuple with the PinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinId

`func (o *AudienceRule) SetPinId(v []string)`

SetPinId sets PinId field to given value.

### HasPinId

`func (o *AudienceRule) HasPinId() bool`

HasPinId returns a boolean if a field has been set.

### GetPrefill

`func (o *AudienceRule) GetPrefill() bool`

GetPrefill returns the Prefill field if non-nil, zero value otherwise.

### GetPrefillOk

`func (o *AudienceRule) GetPrefillOk() (*bool, bool)`

GetPrefillOk returns a tuple with the Prefill field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrefill

`func (o *AudienceRule) SetPrefill(v bool)`

SetPrefill sets Prefill field to given value.

### HasPrefill

`func (o *AudienceRule) HasPrefill() bool`

HasPrefill returns a boolean if a field has been set.

### GetRetentionDays

`func (o *AudienceRule) GetRetentionDays() int32`

GetRetentionDays returns the RetentionDays field if non-nil, zero value otherwise.

### GetRetentionDaysOk

`func (o *AudienceRule) GetRetentionDaysOk() (*int32, bool)`

GetRetentionDaysOk returns a tuple with the RetentionDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRetentionDays

`func (o *AudienceRule) SetRetentionDays(v int32)`

SetRetentionDays sets RetentionDays field to given value.

### HasRetentionDays

`func (o *AudienceRule) HasRetentionDays() bool`

HasRetentionDays returns a boolean if a field has been set.

### GetSeedId

`func (o *AudienceRule) GetSeedId() []string`

GetSeedId returns the SeedId field if non-nil, zero value otherwise.

### GetSeedIdOk

`func (o *AudienceRule) GetSeedIdOk() (*[]string, bool)`

GetSeedIdOk returns a tuple with the SeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSeedId

`func (o *AudienceRule) SetSeedId(v []string)`

SetSeedId sets SeedId field to given value.

### HasSeedId

`func (o *AudienceRule) HasSeedId() bool`

HasSeedId returns a boolean if a field has been set.

### GetUrl

`func (o *AudienceRule) GetUrl() []string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *AudienceRule) GetUrlOk() (*[]string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *AudienceRule) SetUrl(v []string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *AudienceRule) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### GetVisitorSourceId

`func (o *AudienceRule) GetVisitorSourceId() string`

GetVisitorSourceId returns the VisitorSourceId field if non-nil, zero value otherwise.

### GetVisitorSourceIdOk

`func (o *AudienceRule) GetVisitorSourceIdOk() (*string, bool)`

GetVisitorSourceIdOk returns a tuple with the VisitorSourceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisitorSourceId

`func (o *AudienceRule) SetVisitorSourceId(v string)`

SetVisitorSourceId sets VisitorSourceId field to given value.

### HasVisitorSourceId

`func (o *AudienceRule) HasVisitorSourceId() bool`

HasVisitorSourceId returns a boolean if a field has been set.

### GetEventSource

`func (o *AudienceRule) GetEventSource() map[string]interface{}`

GetEventSource returns the EventSource field if non-nil, zero value otherwise.

### GetEventSourceOk

`func (o *AudienceRule) GetEventSourceOk() (*map[string]interface{}, bool)`

GetEventSourceOk returns a tuple with the EventSource field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventSource

`func (o *AudienceRule) SetEventSource(v map[string]interface{})`

SetEventSource sets EventSource field to given value.

### HasEventSource

`func (o *AudienceRule) HasEventSource() bool`

HasEventSource returns a boolean if a field has been set.

### GetIngestionSource

`func (o *AudienceRule) GetIngestionSource() map[string]interface{}`

GetIngestionSource returns the IngestionSource field if non-nil, zero value otherwise.

### GetIngestionSourceOk

`func (o *AudienceRule) GetIngestionSourceOk() (*map[string]interface{}, bool)`

GetIngestionSourceOk returns a tuple with the IngestionSource field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIngestionSource

`func (o *AudienceRule) SetIngestionSource(v map[string]interface{})`

SetIngestionSource sets IngestionSource field to given value.

### HasIngestionSource

`func (o *AudienceRule) HasIngestionSource() bool`

HasIngestionSource returns a boolean if a field has been set.

### GetEngagerType

`func (o *AudienceRule) GetEngagerType() int32`

GetEngagerType returns the EngagerType field if non-nil, zero value otherwise.

### GetEngagerTypeOk

`func (o *AudienceRule) GetEngagerTypeOk() (*int32, bool)`

GetEngagerTypeOk returns a tuple with the EngagerType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEngagerType

`func (o *AudienceRule) SetEngagerType(v int32)`

SetEngagerType sets EngagerType field to given value.

### HasEngagerType

`func (o *AudienceRule) HasEngagerType() bool`

HasEngagerType returns a boolean if a field has been set.

### GetCampaignId

`func (o *AudienceRule) GetCampaignId() []string`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *AudienceRule) GetCampaignIdOk() (*[]string, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *AudienceRule) SetCampaignId(v []string)`

SetCampaignId sets CampaignId field to given value.

### HasCampaignId

`func (o *AudienceRule) HasCampaignId() bool`

HasCampaignId returns a boolean if a field has been set.

### GetAdId

`func (o *AudienceRule) GetAdId() []string`

GetAdId returns the AdId field if non-nil, zero value otherwise.

### GetAdIdOk

`func (o *AudienceRule) GetAdIdOk() (*[]string, bool)`

GetAdIdOk returns a tuple with the AdId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdId

`func (o *AudienceRule) SetAdId(v []string)`

SetAdId sets AdId field to given value.

### HasAdId

`func (o *AudienceRule) HasAdId() bool`

HasAdId returns a boolean if a field has been set.

### GetObjectiveType

`func (o *AudienceRule) GetObjectiveType() []ObjectiveType`

GetObjectiveType returns the ObjectiveType field if non-nil, zero value otherwise.

### GetObjectiveTypeOk

`func (o *AudienceRule) GetObjectiveTypeOk() (*[]ObjectiveType, bool)`

GetObjectiveTypeOk returns a tuple with the ObjectiveType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObjectiveType

`func (o *AudienceRule) SetObjectiveType(v []ObjectiveType)`

SetObjectiveType sets ObjectiveType field to given value.

### HasObjectiveType

`func (o *AudienceRule) HasObjectiveType() bool`

HasObjectiveType returns a boolean if a field has been set.

### GetAdAccountId

`func (o *AudienceRule) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *AudienceRule) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *AudienceRule) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *AudienceRule) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


