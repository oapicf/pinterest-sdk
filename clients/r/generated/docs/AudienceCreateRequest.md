# openapi::AudienceCreateRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **character** | Ad account ID. | [optional] [Pattern: ^\\d+$] 
**name** | **character** | Audience name. | 
**rule** | [**AudienceRule**](AudienceRule.md) |  | 
**audience_type** | [**AudienceType**](AudienceType.md) | &lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR. Values are case-sensitive. | [Enum: ] 
**description** | **character** | Audience description. | [optional] 


