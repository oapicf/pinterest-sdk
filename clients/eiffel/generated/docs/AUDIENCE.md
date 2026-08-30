# AUDIENCE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | [**STRING_32**](STRING_32.md) | Ad account ID. | [optional] [default to null]
**audience_type** | [**PINNER_LIST_TYPE**](PinnerListType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] [default to null]
**created_by_company_name** | [**STRING_32**](STRING_32.md) | The company that created this audience. | [optional] [default to null]
**created_timestamp** | **INTEGER_32** | Creation time. Unix timestamp in seconds. | [optional] [default to null]
**description** | [**STRING_32**](STRING_32.md) | Audience description. | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | Audience ID. | [optional] [default to null]
**is_nca** | **BOOLEAN** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | Audience name. | [optional] [default to null]
**rule** | [**AUDIENCE_RULE**](AudienceRule.md) |  | [optional] [default to null]
**size** | **INTEGER_32** | Audience size. | [optional] [default to null]
**status** | [**AUDIENCE_STATUS**](AudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] [default to null]
**type** | [**STRING_32**](STRING_32.md) | Always \&quot;audience\&quot;. | [optional] [default to null]
**updated_timestamp** | **INTEGER_32** | Last update time. Unix timestamp in seconds. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


