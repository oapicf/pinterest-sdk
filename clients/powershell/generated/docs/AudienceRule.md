# AudienceRule
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | **String** | Valid countries include: &quot;&quot;US&quot;&quot;, &quot;&quot;CA&quot;&quot;, and &quot;&quot;GB&quot;&quot;. | [optional] 
**CustomerListId** | **String** | Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;. | [optional] 
**EngagementDomain** | **String[]** | The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;. | [optional] 
**EngagementType** | **String** | Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set.  | [optional] 
**VarEvent** | **String** | A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event. | [optional] 
**EventData** | [**PinterestTagEventData**](PinterestTagEventData.md) |  | [optional] 
**Percentage** | **Int32** | Percentage should be 1-10. The targeted audience should be this % size across Pinterest. | [optional] 
**PinId** | **String[]** | IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, &quot;&quot;pin_id:&quot;&quot;: [&quot;&quot;34567&quot;&quot;] | [optional] 
**Prefill** | **Boolean** | Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;. | [optional] 
**RetentionDays** | **Int32** | Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified. | [optional] 
**SeedId** | **String[]** | Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;.  | [optional] 
**Url** | **String[]** | Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains].&lt;br&gt;Example 1:  &quot;&quot;url&quot;&quot;: &quot;&quot;http://www.myonlinestore123.com/view_item/shoe&quot;&quot;&lt;br&gt;Example 2: &quot;&quot;url&quot;&quot;: {&quot;&quot;contains&quot;&quot;: &quot;&quot;/view_item/shoe&quot;&quot;} | [optional] 
**VisitorSourceId** | **String** | The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;. | [optional] 
**EventSource** | [**SystemCollectionsHashtable**](.md) | Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline | [optional] 
**IngestionSource** | [**SystemCollectionsHashtable**](.md) | Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api | [optional] 
**EngagerType** | **Int32** | Optional for ENGAGEMENT. Engager type value should be 1-2. | [optional] 
**CampaignId** | **String[]** | Campaign ID for engagement audience filter. | [optional] 
**AdId** | **String[]** | Ad ID for engagement audience filter. | [optional] 
**ObjectiveType** | [**ObjectiveType[]**](ObjectiveType.md) | Objective for engagement audience filter. | [optional] 
**AdAccountId** | **String** | Ad account ID. | [optional] 

## Examples

- Prepare the resource
```powershell
$AudienceRule = Initialize-PSOpenAPIToolsAudienceRule  -Country US `
 -CustomerListId 5497558859876 `
 -EngagementDomain [&quot;www.somedomain.com&quot;] `
 -EngagementType click `
 -VarEvent checkout `
 -EventData null `
 -Percentage 3 `
 -PinId [&quot;34567&quot;] `
 -Prefill true `
 -RetentionDays 30 `
 -SeedId [&quot;2542620639259&quot;,&quot;2542620639261&quot;] `
 -Url null `
 -VisitorSourceId 549755885175 `
 -EventSource {&quot;&#x3D;&quot;:[&quot;web&quot;,&quot;mobile&quot;]} `
 -IngestionSource {&quot;&#x3D;&quot;:[&quot;tag&quot;]} `
 -EngagerType 1 `
 -CampaignId [&quot;626744528398&quot;] `
 -AdId [&quot;687201361754&quot;] `
 -ObjectiveType [&quot;AWARENESS&quot;] `
 -AdAccountId 549755885175
```

- Convert the resource to JSON
```powershell
$AudienceRule | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

