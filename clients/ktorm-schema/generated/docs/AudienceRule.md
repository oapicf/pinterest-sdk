
# Table `AudienceRule`
(mapped from: AudienceRule)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**country** | country | text |  | **kotlin.String** | Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. |  [optional]
**customerListId** | customer_list_id | text |  | **kotlin.String** | Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;. |  [optional]
**engagementDomain** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;. |  [optional]
**engagementType** | engagement_type | text |  | **kotlin.String** | Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set.  |  [optional]
**event** | event | text |  | **kotlin.String** | A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event. |  [optional]
**eventData** | event_data | long |  | [**PinterestTagEventData**](PinterestTagEventData.md) |  |  [optional] [foreignkey]
**percentage** | percentage | int |  | **kotlin.Int** | Percentage should be 1-10. The targeted audience should be this % size across Pinterest. |  [optional]
**pinId** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;] |  [optional]
**prefill** | prefill | boolean |  | **kotlin.Boolean** | Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;. |  [optional]
**retentionDays** | retention_days | int |  | **kotlin.Int** | Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified. |  [optional]
**seedId** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;.  |  [optional]
**url** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains].&lt;br&gt;Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot;&lt;br&gt;Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;} |  [optional]
**visitorSourceId** | visitor_source_id | text |  | **kotlin.String** | The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;. |  [optional]
**eventSource** | event_source | blob |  | [**kotlin.Any**](.md) | Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline |  [optional]
**ingestionSource** | ingestion_source | blob |  | [**kotlin.Any**](.md) | Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api |  [optional]
**engagerType** | engager_type | int |  | **kotlin.Int** | Optional for ENGAGEMENT. Engager type value should be 1-2. |  [optional]
**campaignId** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Campaign ID for engagement audience filter. |  [optional]
**adId** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Ad ID for engagement audience filter. |  [optional]
**objectiveType** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ObjectiveType&gt;**](ObjectiveType.md) | Objective for engagement audience filter. |  [optional]
**adAccountId** | ad_account_id | text |  | **kotlin.String** | Ad account ID. |  [optional]




# **Table `AudienceRuleEngagementDomain`**
(mapped from: AudienceRuleEngagementDomain)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
audienceRule | audienceRule | long | | kotlin.Long | Primary Key | *one*
engagementDomain | engagementDomain | text | | kotlin.String | Foreign Key | *many*







# **Table `AudienceRulePinId`**
(mapped from: AudienceRulePinId)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
audienceRule | audienceRule | long | | kotlin.Long | Primary Key | *one*
pinId | pinId | text | | kotlin.String | Foreign Key | *many*





# **Table `AudienceRuleSeedId`**
(mapped from: AudienceRuleSeedId)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
audienceRule | audienceRule | long | | kotlin.Long | Primary Key | *one*
seedId | seedId | text | | kotlin.String | Foreign Key | *many*



# **Table `AudienceRuleUrl`**
(mapped from: AudienceRuleUrl)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
audienceRule | audienceRule | long | | kotlin.Long | Primary Key | *one*
url | url | text | | kotlin.String | Foreign Key | *many*







# **Table `AudienceRuleCampaignId`**
(mapped from: AudienceRuleCampaignId)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
audienceRule | audienceRule | long | | kotlin.Long | Primary Key | *one*
campaignId | campaignId | text | | kotlin.String | Foreign Key | *many*



# **Table `AudienceRuleAdId`**
(mapped from: AudienceRuleAdId)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
audienceRule | audienceRule | long | | kotlin.Long | Primary Key | *one*
adId | adId | text | | kotlin.String | Foreign Key | *many*



# **Table `AudienceRuleObjectiveType`**
(mapped from: AudienceRuleObjectiveType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
audienceRule | audienceRule | long | | kotlin.Long | Primary Key | *one*
objectiveType | objectiveType | long | | kotlin.Long | Foreign Key | *many*




