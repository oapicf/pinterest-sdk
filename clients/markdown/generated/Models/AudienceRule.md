# AudienceRule
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **country** | **String** | Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. | [optional] [default to null] |
| **customer\_list\_id** | **String** | Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;. | [optional] [default to null] |
| **engagement\_domain** | **List** | The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;. | [optional] [default to null] |
| **engagement\_type** | **String** | Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set.  | [optional] [default to null] |
| **event** | **String** | A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event. | [optional] [default to null] |
| **event\_data** | [**PinterestTagEventData**](PinterestTagEventData.md) |  | [optional] [default to null] |
| **percentage** | **Integer** | Percentage should be 1-10. The targeted audience should be this % size across Pinterest. | [optional] [default to null] |
| **pin\_id** | **List** | IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;] | [optional] [default to null] |
| **prefill** | **Boolean** | Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;. | [optional] [default to null] |
| **retention\_days** | **Integer** | Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified. | [optional] [default to null] |
| **seed\_id** | **List** | Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;.  | [optional] [default to null] |
| **url** | **List** | Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains].&lt;br&gt;Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot;&lt;br&gt;Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;} | [optional] [default to null] |
| **visitor\_source\_id** | **String** | The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;. | [optional] [default to null] |
| **event\_source** | [**Object**](.md) | Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline | [optional] [default to null] |
| **ingestion\_source** | [**Object**](.md) | Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api | [optional] [default to null] |
| **engager\_type** | **Integer** | Optional for ENGAGEMENT. Engager type value should be 1-2. | [optional] [default to null] |
| **campaign\_id** | **List** | Campaign ID for engagement audience filter. | [optional] [default to null] |
| **ad\_id** | **List** | Ad ID for engagement audience filter. | [optional] [default to null] |
| **objective\_type** | [**List**](ObjectiveType.md) | Objective for engagement audience filter. | [optional] [default to null] |
| **ad\_account\_id** | **String** | Ad account ID. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

