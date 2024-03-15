# openapi::Audience


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **character** | Ad account ID. | [optional] [Pattern: ^\\d+$] 
**id** | **character** | Audience ID. | [optional] [Pattern: ^\\d+$] 
**name** | **character** | Audience name. | [optional] 
**audience_type** | **character** | &lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**description** | **character** | Audience description. | [optional] 
**rule** | [**AudienceRule**](AudienceRule.md) |  | [optional] 
**size** | **integer** | Audience size. | [optional] 
**status** | **character** | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] 
**type** | **character** | Always \&quot;audience\&quot;. | [optional] 
**created_timestamp** | **integer** | Creation time. Unix timestamp in seconds. | [optional] 
**updated_timestamp** | **integer** | Last update time. Unix timestamp in seconds. | [optional] 


