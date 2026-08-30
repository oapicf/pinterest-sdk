# AdAccountsAudience

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **String** | Ad account ID. | [optional] [default to None]
**audience_type** | [***models::AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] [default to None]
**created_by_company_name** | **swagger::Nullable<String>** | The company that created this audience. | [optional] [readonly] [default to None]
**created_timestamp** | **i32** | Creation time. Unix timestamp in seconds. | [optional] [readonly] [default to None]
**description** | **swagger::Nullable<String>** | Audience description. | [optional] [default to None]
**id** | **String** | Audience ID. | 
**is_nca** | **bool** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional] [readonly] [default to None]
**name** | **String** | Audience name. | [optional] [default to None]
**rule** | [***models::AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  | [optional] [default to None]
**size** | **i32** | Audience size. | [optional] [readonly] [default to None]
**status** | [***models::AudienceStatus**](AudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] [readonly] [default to None]
**r#type** | **String** | Always \"audience\". | [optional] [readonly] [default to None]
**updated_timestamp** | **i32** | Last update time. Unix timestamp in seconds. | [optional] [readonly] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


