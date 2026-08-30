# openapi::Audience


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **character** | Ad account ID. | [optional] [Pattern: ^\\d+$] 
**audience_type** | [**PinnerListType**](PinnerListType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] [Enum: ] 
**created_by_company_name** | **character** | The company that created this audience. | [optional] 
**created_timestamp** | **integer** | Creation time. Unix timestamp in seconds. | [optional] 
**description** | **character** | Audience description. | [optional] 
**id** | **character** | Audience ID. | [optional] [Pattern: ^\\d+$] 
**is_nca** | **character** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional] 
**name** | **character** | Audience name. | [optional] 
**rule** | [**AudienceRule**](AudienceRule.md) |  | [optional] 
**size** | **integer** | Audience size. | [optional] 
**status** | [**AudienceStatus**](AudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] [Enum: ] 
**type** | **character** | Always \&quot;audience\&quot;. | [optional] 
**updated_timestamp** | **integer** | Last update time. Unix timestamp in seconds. | [optional] 


