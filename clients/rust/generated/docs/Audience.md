# Audience

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | Option<**String**> | Ad account ID. | [optional]
**audience_type** | Option<**String**> | <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional]
**created_by_company_name** | Option<**String**> | The company that created this audience. | [optional]
**created_timestamp** | Option<**i32**> | Creation time. Unix timestamp in seconds. | [optional]
**description** | Option<**String**> | Audience description. | [optional]
**id** | Option<**String**> | Audience ID. | [optional]
**name** | Option<**String**> | Audience name. | [optional]
**rule** | Option<[**models::AudienceRule**](AudienceRule.md)> |  | [optional]
**size** | Option<**i32**> | Audience size. | [optional]
**status** | Option<**String**> | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional]
**r#type** | Option<**String**> | Always \"audience\". | [optional]
**updated_timestamp** | Option<**i32**> | Last update time. Unix timestamp in seconds. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


