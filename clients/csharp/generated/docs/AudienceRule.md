# Org.OpenAPITools.Model.AudienceRule
JSON object defining targeted audience users. Example rule formats per audience type:<br>CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}<br>ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" }<br>(Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10.<br>The targeted audience should be this % size across Pinterest.)<br>VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}}<br>(Retention days should be 1-540. Retention applies to specific customers.)<br>ENGAGEMENT: {\"engagement_domain\": [\"www.entomi.com\"], \"engager_type\": 1}<br>For more details on engagement audiences, see <a href=\"https://developers.pinterest.com/docs/redoc/adtech_ads_v4/#section/November-2021\" target=\"_blank\">November 2021 changelog</a>.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | **string** | Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. | [optional] 
**CustomerListId** | **string** | Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;. | [optional] 
**EngagementDomain** | **List&lt;string&gt;** | The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;. | [optional] 
**EngagementType** | **string** | Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set.  | [optional] 
**VarEvent** | **string** | A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event. | [optional] 
**EventData** | [**PinterestTagEventData**](PinterestTagEventData.md) |  | [optional] 
**Percentage** | **int** | Percentage should be 1-10. The targeted audience should be this % size across Pinterest. | [optional] 
**PinId** | **List&lt;string&gt;** | IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;] | [optional] 
**Prefill** | **bool** | Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;. | [optional] 
**RetentionDays** | **int** | Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified. | [optional] 
**SeedId** | **List&lt;string&gt;** | Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;.  | [optional] 
**Url** | **List&lt;string&gt;** | Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains].&lt;br&gt;Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot;&lt;br&gt;Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;} | [optional] 
**VisitorSourceId** | **string** | The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;. | [optional] 
**EventSource** | **Object** | Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline | [optional] 
**IngestionSource** | **Object** | Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api | [optional] 
**EngagerType** | **int** | Optional for ENGAGEMENT. Engager type value should be 1-2. | [optional] 
**CampaignId** | **List&lt;string&gt;** | Campaign ID for engagement audience filter. | [optional] 
**AdId** | **List&lt;string&gt;** | Ad ID for engagement audience filter. | [optional] 
**ObjectiveType** | [**List&lt;ObjectiveType&gt;**](ObjectiveType.md) | Objective for engagement audience filter. | [optional] 
**AdAccountId** | **string** | Ad account ID. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

