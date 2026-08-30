# AdAccountsAudienceRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | Ad account ID. | [optional] 
**AdId** | Pointer to **[]string** | Ad ID for engagement audience filter. | [optional] 
**CampaignId** | Pointer to **[]string** | Campaign ID for engagement audience filter. | [optional] 
**Country** | Pointer to **string** | Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. | [optional] 
**CustomerListId** | Pointer to **string** | Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;. | [optional] 
**EngagementDomain** | Pointer to **[]string** | The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;. | [optional] 
**EngagementType** | Pointer to **string** | Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set. | [optional] 
**EngagerType** | Pointer to **int32** | Optional for ENGAGEMENT. Engager type value should be 1-2. | [optional] 
**Event** | Pointer to **string** | A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event. | [optional] 
**EventData** | Pointer to [**EventData**](EventData.md) |  | [optional] 
**EventSource** | Pointer to **map[string]interface{}** | Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline | [optional] 
**IngestionSource** | Pointer to **map[string]interface{}** | Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api | [optional] 
**ObjectiveType** | Pointer to [**[]AudienceObjectiveType**](AudienceObjectiveType.md) | Objective for engagement audience filter. | [optional] 
**Percentage** | Pointer to **int32** | Percentage should be 1-10. The targeted audience should be this % size across Pinterest. | [optional] 
**PinId** | Pointer to **[]string** | IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;] | [optional] 
**Prefill** | Pointer to **bool** | Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;. | [optional] 
**RetentionDays** | Pointer to **int32** | Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified. | [optional] 
**SeedId** | Pointer to **[]string** | Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;. | [optional] 
**Url** | Pointer to **[]string** | Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains]. Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot; Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;} | [optional] 
**VisitorSourceId** | Pointer to **string** | The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;. | [optional] 

## Methods

### NewAdAccountsAudienceRule

`func NewAdAccountsAudienceRule() *AdAccountsAudienceRule`

NewAdAccountsAudienceRule instantiates a new AdAccountsAudienceRule object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdAccountsAudienceRuleWithDefaults

`func NewAdAccountsAudienceRuleWithDefaults() *AdAccountsAudienceRule`

NewAdAccountsAudienceRuleWithDefaults instantiates a new AdAccountsAudienceRule object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *AdAccountsAudienceRule) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *AdAccountsAudienceRule) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *AdAccountsAudienceRule) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *AdAccountsAudienceRule) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetAdId

`func (o *AdAccountsAudienceRule) GetAdId() []string`

GetAdId returns the AdId field if non-nil, zero value otherwise.

### GetAdIdOk

`func (o *AdAccountsAudienceRule) GetAdIdOk() (*[]string, bool)`

GetAdIdOk returns a tuple with the AdId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdId

`func (o *AdAccountsAudienceRule) SetAdId(v []string)`

SetAdId sets AdId field to given value.

### HasAdId

`func (o *AdAccountsAudienceRule) HasAdId() bool`

HasAdId returns a boolean if a field has been set.

### GetCampaignId

`func (o *AdAccountsAudienceRule) GetCampaignId() []string`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *AdAccountsAudienceRule) GetCampaignIdOk() (*[]string, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *AdAccountsAudienceRule) SetCampaignId(v []string)`

SetCampaignId sets CampaignId field to given value.

### HasCampaignId

`func (o *AdAccountsAudienceRule) HasCampaignId() bool`

HasCampaignId returns a boolean if a field has been set.

### GetCountry

`func (o *AdAccountsAudienceRule) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *AdAccountsAudienceRule) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *AdAccountsAudienceRule) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *AdAccountsAudienceRule) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetCustomerListId

`func (o *AdAccountsAudienceRule) GetCustomerListId() string`

GetCustomerListId returns the CustomerListId field if non-nil, zero value otherwise.

### GetCustomerListIdOk

`func (o *AdAccountsAudienceRule) GetCustomerListIdOk() (*string, bool)`

GetCustomerListIdOk returns a tuple with the CustomerListId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerListId

`func (o *AdAccountsAudienceRule) SetCustomerListId(v string)`

SetCustomerListId sets CustomerListId field to given value.

### HasCustomerListId

`func (o *AdAccountsAudienceRule) HasCustomerListId() bool`

HasCustomerListId returns a boolean if a field has been set.

### GetEngagementDomain

`func (o *AdAccountsAudienceRule) GetEngagementDomain() []string`

GetEngagementDomain returns the EngagementDomain field if non-nil, zero value otherwise.

### GetEngagementDomainOk

`func (o *AdAccountsAudienceRule) GetEngagementDomainOk() (*[]string, bool)`

GetEngagementDomainOk returns a tuple with the EngagementDomain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEngagementDomain

`func (o *AdAccountsAudienceRule) SetEngagementDomain(v []string)`

SetEngagementDomain sets EngagementDomain field to given value.

### HasEngagementDomain

`func (o *AdAccountsAudienceRule) HasEngagementDomain() bool`

HasEngagementDomain returns a boolean if a field has been set.

### GetEngagementType

`func (o *AdAccountsAudienceRule) GetEngagementType() string`

GetEngagementType returns the EngagementType field if non-nil, zero value otherwise.

### GetEngagementTypeOk

`func (o *AdAccountsAudienceRule) GetEngagementTypeOk() (*string, bool)`

GetEngagementTypeOk returns a tuple with the EngagementType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEngagementType

`func (o *AdAccountsAudienceRule) SetEngagementType(v string)`

SetEngagementType sets EngagementType field to given value.

### HasEngagementType

`func (o *AdAccountsAudienceRule) HasEngagementType() bool`

HasEngagementType returns a boolean if a field has been set.

### GetEngagerType

`func (o *AdAccountsAudienceRule) GetEngagerType() int32`

GetEngagerType returns the EngagerType field if non-nil, zero value otherwise.

### GetEngagerTypeOk

`func (o *AdAccountsAudienceRule) GetEngagerTypeOk() (*int32, bool)`

GetEngagerTypeOk returns a tuple with the EngagerType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEngagerType

`func (o *AdAccountsAudienceRule) SetEngagerType(v int32)`

SetEngagerType sets EngagerType field to given value.

### HasEngagerType

`func (o *AdAccountsAudienceRule) HasEngagerType() bool`

HasEngagerType returns a boolean if a field has been set.

### GetEvent

`func (o *AdAccountsAudienceRule) GetEvent() string`

GetEvent returns the Event field if non-nil, zero value otherwise.

### GetEventOk

`func (o *AdAccountsAudienceRule) GetEventOk() (*string, bool)`

GetEventOk returns a tuple with the Event field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvent

`func (o *AdAccountsAudienceRule) SetEvent(v string)`

SetEvent sets Event field to given value.

### HasEvent

`func (o *AdAccountsAudienceRule) HasEvent() bool`

HasEvent returns a boolean if a field has been set.

### GetEventData

`func (o *AdAccountsAudienceRule) GetEventData() EventData`

GetEventData returns the EventData field if non-nil, zero value otherwise.

### GetEventDataOk

`func (o *AdAccountsAudienceRule) GetEventDataOk() (*EventData, bool)`

GetEventDataOk returns a tuple with the EventData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventData

`func (o *AdAccountsAudienceRule) SetEventData(v EventData)`

SetEventData sets EventData field to given value.

### HasEventData

`func (o *AdAccountsAudienceRule) HasEventData() bool`

HasEventData returns a boolean if a field has been set.

### GetEventSource

`func (o *AdAccountsAudienceRule) GetEventSource() map[string]interface{}`

GetEventSource returns the EventSource field if non-nil, zero value otherwise.

### GetEventSourceOk

`func (o *AdAccountsAudienceRule) GetEventSourceOk() (*map[string]interface{}, bool)`

GetEventSourceOk returns a tuple with the EventSource field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventSource

`func (o *AdAccountsAudienceRule) SetEventSource(v map[string]interface{})`

SetEventSource sets EventSource field to given value.

### HasEventSource

`func (o *AdAccountsAudienceRule) HasEventSource() bool`

HasEventSource returns a boolean if a field has been set.

### GetIngestionSource

`func (o *AdAccountsAudienceRule) GetIngestionSource() map[string]interface{}`

GetIngestionSource returns the IngestionSource field if non-nil, zero value otherwise.

### GetIngestionSourceOk

`func (o *AdAccountsAudienceRule) GetIngestionSourceOk() (*map[string]interface{}, bool)`

GetIngestionSourceOk returns a tuple with the IngestionSource field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIngestionSource

`func (o *AdAccountsAudienceRule) SetIngestionSource(v map[string]interface{})`

SetIngestionSource sets IngestionSource field to given value.

### HasIngestionSource

`func (o *AdAccountsAudienceRule) HasIngestionSource() bool`

HasIngestionSource returns a boolean if a field has been set.

### GetObjectiveType

`func (o *AdAccountsAudienceRule) GetObjectiveType() []AudienceObjectiveType`

GetObjectiveType returns the ObjectiveType field if non-nil, zero value otherwise.

### GetObjectiveTypeOk

`func (o *AdAccountsAudienceRule) GetObjectiveTypeOk() (*[]AudienceObjectiveType, bool)`

GetObjectiveTypeOk returns a tuple with the ObjectiveType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObjectiveType

`func (o *AdAccountsAudienceRule) SetObjectiveType(v []AudienceObjectiveType)`

SetObjectiveType sets ObjectiveType field to given value.

### HasObjectiveType

`func (o *AdAccountsAudienceRule) HasObjectiveType() bool`

HasObjectiveType returns a boolean if a field has been set.

### GetPercentage

`func (o *AdAccountsAudienceRule) GetPercentage() int32`

GetPercentage returns the Percentage field if non-nil, zero value otherwise.

### GetPercentageOk

`func (o *AdAccountsAudienceRule) GetPercentageOk() (*int32, bool)`

GetPercentageOk returns a tuple with the Percentage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPercentage

`func (o *AdAccountsAudienceRule) SetPercentage(v int32)`

SetPercentage sets Percentage field to given value.

### HasPercentage

`func (o *AdAccountsAudienceRule) HasPercentage() bool`

HasPercentage returns a boolean if a field has been set.

### GetPinId

`func (o *AdAccountsAudienceRule) GetPinId() []string`

GetPinId returns the PinId field if non-nil, zero value otherwise.

### GetPinIdOk

`func (o *AdAccountsAudienceRule) GetPinIdOk() (*[]string, bool)`

GetPinIdOk returns a tuple with the PinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinId

`func (o *AdAccountsAudienceRule) SetPinId(v []string)`

SetPinId sets PinId field to given value.

### HasPinId

`func (o *AdAccountsAudienceRule) HasPinId() bool`

HasPinId returns a boolean if a field has been set.

### GetPrefill

`func (o *AdAccountsAudienceRule) GetPrefill() bool`

GetPrefill returns the Prefill field if non-nil, zero value otherwise.

### GetPrefillOk

`func (o *AdAccountsAudienceRule) GetPrefillOk() (*bool, bool)`

GetPrefillOk returns a tuple with the Prefill field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrefill

`func (o *AdAccountsAudienceRule) SetPrefill(v bool)`

SetPrefill sets Prefill field to given value.

### HasPrefill

`func (o *AdAccountsAudienceRule) HasPrefill() bool`

HasPrefill returns a boolean if a field has been set.

### GetRetentionDays

`func (o *AdAccountsAudienceRule) GetRetentionDays() int32`

GetRetentionDays returns the RetentionDays field if non-nil, zero value otherwise.

### GetRetentionDaysOk

`func (o *AdAccountsAudienceRule) GetRetentionDaysOk() (*int32, bool)`

GetRetentionDaysOk returns a tuple with the RetentionDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRetentionDays

`func (o *AdAccountsAudienceRule) SetRetentionDays(v int32)`

SetRetentionDays sets RetentionDays field to given value.

### HasRetentionDays

`func (o *AdAccountsAudienceRule) HasRetentionDays() bool`

HasRetentionDays returns a boolean if a field has been set.

### GetSeedId

`func (o *AdAccountsAudienceRule) GetSeedId() []string`

GetSeedId returns the SeedId field if non-nil, zero value otherwise.

### GetSeedIdOk

`func (o *AdAccountsAudienceRule) GetSeedIdOk() (*[]string, bool)`

GetSeedIdOk returns a tuple with the SeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSeedId

`func (o *AdAccountsAudienceRule) SetSeedId(v []string)`

SetSeedId sets SeedId field to given value.

### HasSeedId

`func (o *AdAccountsAudienceRule) HasSeedId() bool`

HasSeedId returns a boolean if a field has been set.

### GetUrl

`func (o *AdAccountsAudienceRule) GetUrl() []string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *AdAccountsAudienceRule) GetUrlOk() (*[]string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *AdAccountsAudienceRule) SetUrl(v []string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *AdAccountsAudienceRule) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### GetVisitorSourceId

`func (o *AdAccountsAudienceRule) GetVisitorSourceId() string`

GetVisitorSourceId returns the VisitorSourceId field if non-nil, zero value otherwise.

### GetVisitorSourceIdOk

`func (o *AdAccountsAudienceRule) GetVisitorSourceIdOk() (*string, bool)`

GetVisitorSourceIdOk returns a tuple with the VisitorSourceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisitorSourceId

`func (o *AdAccountsAudienceRule) SetVisitorSourceId(v string)`

SetVisitorSourceId sets VisitorSourceId field to given value.

### HasVisitorSourceId

`func (o *AdAccountsAudienceRule) HasVisitorSourceId() bool`

HasVisitorSourceId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


