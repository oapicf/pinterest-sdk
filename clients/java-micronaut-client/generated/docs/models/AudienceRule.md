

# AudienceRule

JSON object defining targeted audience users. Example rule formats per audience type:<br>CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}<br>ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" }<br>(Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10.<br>The targeted audience should be this % size across Pinterest.)<br>VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}}<br>(Retention days should be 1-540. Retention applies to specific customers.)<br>ENGAGEMENT: {\"engagement_domain\": [\"www.entomi.com\"], \"engager_type\": 1}<br>For more details on engagement audiences, see <a href=\"https://developers.pinterest.com/docs/redoc/adtech_ads_v4/#section/November-2021\" target=\"_blank\">November 2021 changelog</a>.

The class is defined in **[AudienceRule.java](../../src/main/java/org/openapitools/model/AudienceRule.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | `String` | Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. |  [optional property]
**customerListId** | `String` | Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;. |  [optional property]
**engagementDomain** | `List&lt;String&gt;` | The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;. |  [optional property]
**engagementType** | `String` | Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set.  |  [optional property]
**event** | `String` | A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event. |  [optional property]
**eventData** | [`PinterestTagEventData`](PinterestTagEventData.md) |  |  [optional property]
**percentage** | `Integer` | Percentage should be 1-10. The targeted audience should be this % size across Pinterest. |  [optional property]
**pinId** | `List&lt;String&gt;` | IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;] |  [optional property]
**prefill** | `Boolean` | Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;. |  [optional property]
**retentionDays** | `Integer` | Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified. |  [optional property]
**seedId** | `List&lt;String&gt;` | Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;.  |  [optional property]
**url** | `List&lt;String&gt;` | Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains].&lt;br&gt;Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot;&lt;br&gt;Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;} |  [optional property]
**visitorSourceId** | `String` | The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;. |  [optional property]
**eventSource** | `Object` | Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline |  [optional property]
**ingestionSource** | `Object` | Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api |  [optional property]
**engagerType** | `Integer` | Optional for ENGAGEMENT. Engager type value should be 1-2. |  [optional property]
**campaignId** | `List&lt;String&gt;` | Campaign ID for engagement audience filter. |  [optional property]
**adId** | `List&lt;String&gt;` | Ad ID for engagement audience filter. |  [optional property]
**objectiveType** | `List&lt;ObjectiveType&gt;` | Objective for engagement audience filter. |  [optional property]
**adAccountId** | `String` | Ad account ID. |  [optional property]






















