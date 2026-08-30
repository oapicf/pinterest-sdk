
# Audience

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String** | Ad account ID. |  [optional] |
| **audienceType** | [**PinnerListType**](PinnerListType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR |  [optional] |
| **createdByCompanyName** | **kotlin.String** | The company that created this audience. |  [optional] |
| **createdTimestamp** | **kotlin.Int** | Creation time. Unix timestamp in seconds. |  [optional] |
| **description** | **kotlin.String** | Audience description. |  [optional] |
| **id** | **kotlin.String** | Audience ID. |  [optional] |
| **isNca** | **kotlin.Boolean** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. |  [optional] |
| **name** | **kotlin.String** | Audience name. |  [optional] |
| **rule** | [**AudienceRule**](AudienceRule.md) |  |  [optional] |
| **propertySize** | **kotlin.Int** | Audience size. |  [optional] |
| **status** | [**AudienceStatus**](AudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. |  [optional] |
| **type** | **kotlin.String** | Always \&quot;audience\&quot;. |  [optional] |
| **updatedTimestamp** | **kotlin.Int** | Last update time. Unix timestamp in seconds. |  [optional] |



