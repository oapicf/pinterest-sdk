# AudienceRule

JSON object defining targeted audience users. Example rule formats per audience type:  CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}  ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" } (Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10. The targeted audience should be this % size across Pinterest.)  VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}} (Retention days should be 1-540. Retention applies to specific customers.)  ENGAGEMENT: {\"engagement_domain\": [\"www.example.com\"], \"engager_type\": 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | Ad account ID. | [optional] 
**ad_id** | **List[str]** | Ad ID for engagement audience filter. | [optional] 
**campaign_id** | **List[str]** | Campaign ID for engagement audience filter. | [optional] 
**country** | **str** | Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. | [optional] 
**customer_list_id** | **str** | Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;. | [optional] 
**engagement_domain** | **List[str]** | The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;. | [optional] 
**engagement_type** | **str** | Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set. | [optional] 
**engager_type** | **int** | Optional for ENGAGEMENT. Engager type value should be 1-2. | [optional] 
**event** | **str** | A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event. | [optional] 
**event_data** | [**EventData**](EventData.md) |  | [optional] 
**event_source** | **object** | Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline | [optional] 
**ingestion_source** | **object** | Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api | [optional] 
**objective_type** | [**List[ObjectiveType]**](ObjectiveType.md) | Objective for engagement audience filter. | [optional] 
**percentage** | **int** | Percentage should be 1-10. The targeted audience should be this % size across Pinterest. | [optional] 
**pin_id** | **List[str]** | IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;] | [optional] 
**prefill** | **bool** | Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;. | [optional] 
**retention_days** | **int** | Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified. | [optional] 
**seed_id** | **List[str]** | Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;. | [optional] 
**url** | **List[str]** | Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains]. Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot; Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;} | [optional] 
**visitor_source_id** | **str** | The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;. | [optional] 

## Example

```python
from pinterestsdk.models.audience_rule import AudienceRule

# TODO update the JSON string below
json = "{}"
# create an instance of AudienceRule from a JSON string
audience_rule_instance = AudienceRule.from_json(json)
# print the JSON string representation of the object
print(AudienceRule.to_json())

# convert the object into a dict
audience_rule_dict = audience_rule_instance.to_dict()
# create an instance of AudienceRule from a dict
audience_rule_from_dict = AudienceRule.from_dict(audience_rule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


