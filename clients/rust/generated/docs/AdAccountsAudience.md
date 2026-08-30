# AdAccountsAudience

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | Option<**String**> | Ad account ID. | [optional]
**audience_type** | Option<[**models::AudienceType**](AudienceType.md)> | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional]
**created_by_company_name** | Option<**String**> | The company that created this audience. | [optional][readonly]
**created_timestamp** | Option<**i32**> | Creation time. Unix timestamp in seconds. | [optional][readonly]
**description** | Option<**String**> | Audience description. | [optional]
**id** | **String** | Audience ID. | 
**is_nca** | Option<**bool**> | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional][readonly]
**name** | Option<**String**> | Audience name. | [optional]
**rule** | Option<[**models::AdAccountsAudienceRule**](AdAccountsAudienceRule.md)> |  | [optional]
**size** | Option<**i32**> | Audience size. | [optional][readonly]
**status** | Option<[**models::AudienceStatus**](AudienceStatus.md)> | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional][readonly]
**r#type** | Option<**String**> | Always \"audience\". | [optional][readonly]
**updated_timestamp** | Option<**i32**> | Last update time. Unix timestamp in seconds. | [optional][readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


