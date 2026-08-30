# AudienceRule


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`ad_account_id`** | **`String`** | Ad account ID. | [optional] [default to nothing]
**`ad_id`** | **`Vector{String}`** | Ad ID for engagement audience filter. | [optional] [default to nothing]
**`campaign_id`** | **`Vector{String}`** | Campaign ID for engagement audience filter. | [optional] [default to nothing]
**`country`** | **`String`** | Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. | [optional] [default to nothing]
**`customer_list_id`** | **`String`** | Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;. | [optional] [default to nothing]
**`engagement_domain`** | **`Vector{String}`** | The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;. | [optional] [default to nothing]
**`engagement_type`** | **`String`** | Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set. | [optional] [default to nothing]
**`engager_type`** | **`Int64`** | Optional for ENGAGEMENT. Engager type value should be 1-2. | [optional] [default to nothing]
**`event`** | **`String`** | A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event. | [optional] [default to nothing]
**`event_data`** | [**`*EventData`**](EventData.md) |  | [optional] [default to nothing]
**`event_source`** | **`Any`** | Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline | [optional] [default to nothing]
**`ingestion_source`** | **`Any`** | Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api | [optional] [default to nothing]
**`objective_type`** | [**`Vector{ObjectiveType}`**](ObjectiveType.md) | Objective for engagement audience filter. | [optional] [default to nothing]
**`percentage`** | **`Int64`** | Percentage should be 1-10. The targeted audience should be this % size across Pinterest. | [optional] [default to nothing]
**`pin_id`** | **`Vector{String}`** | IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;] | [optional] [default to nothing]
**`prefill`** | **`Bool`** | Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;. | [optional] [default to nothing]
**`retention_days`** | **`Int64`** | Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified. | [optional] [default to nothing]
**`seed_id`** | **`Vector{String}`** | Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;. | [optional] [default to nothing]
**`url`** | **`Vector{String}`** | Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains]. Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot; Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;} | [optional] [default to nothing]
**`visitor_source_id`** | **`String`** | The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


