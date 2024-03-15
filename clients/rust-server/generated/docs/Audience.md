# Audience

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **String** | Ad account ID. | [optional] [default to None]
**id** | **String** | Audience ID. | [optional] [default to None]
**name** | **String** | Audience name. | [optional] [default to None]
**audience_type** | **String** | <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] [default to None]
**description** | **String** | Audience description. | [optional] [default to None]
**rule** | [***models::AudienceRule**](AudienceRule.md) |  | [optional] [default to None]
**size** | **i32** | Audience size. | [optional] [default to None]
**status** | **String** | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] [default to None]
**r#type** | **String** | Always \"audience\". | [optional] [default to None]
**created_timestamp** | **i32** | Creation time. Unix timestamp in seconds. | [optional] [default to None]
**updated_timestamp** | **i32** | Last update time. Unix timestamp in seconds. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


