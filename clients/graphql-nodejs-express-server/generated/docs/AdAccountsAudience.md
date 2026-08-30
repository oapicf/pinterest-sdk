# AdAccountsAudience

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String!** | Ad account ID. | [optional] [default to null]
**audienceType** | [***AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] [default to null]
**createdByCompanyName** | **String** | The company that created this audience. | [optional] [readonly] [default to null]
**createdTimestamp** | **Int** | Creation time. Unix timestamp in seconds. | [optional] [readonly] [default to null]
**description** | **String** | Audience description. | [optional] [default to null]
**Id_** | **String!** | Audience ID. | [default to null]
**isNca** | **Boolean!** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional] [readonly] [default to null]
**name** | **String!** | Audience name. | [optional] [default to null]
**rule** | [***AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  | [optional] [default to null]
**size** | **Int** | Audience size. | [optional] [readonly] [default to null]
**status** | [***AudienceStatus**](AudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] [readonly] [default to null]
**Type_** | **String!** | Always \&quot;audience\&quot;. | [optional] [readonly] [default to null]
**updatedTimestamp** | **Int** | Last update time. Unix timestamp in seconds. | [optional] [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


