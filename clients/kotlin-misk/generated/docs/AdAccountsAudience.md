
# AdAccountsAudience

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | Audience ID. | 
**adAccountId** | **kotlin.String** | Ad account ID. |  [optional]
**audienceType** | [**AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR |  [optional]
**createdByCompanyName** | **kotlin.String** | The company that created this audience. |  [optional] [readonly]
**createdTimestamp** | **kotlin.Int** | Creation time. Unix timestamp in seconds. |  [optional] [readonly]
**description** | **kotlin.String** | Audience description. |  [optional]
**isNca** | **kotlin.Boolean** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. |  [optional] [readonly]
**name** | **kotlin.String** | Audience name. |  [optional]
**rule** | [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  |  [optional]
**propertySize** | **kotlin.Int** | Audience size. |  [optional] [readonly]
**status** | [**AudienceStatus**](AudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. |  [optional] [readonly]
**type** | **kotlin.String** | Always \&quot;audience\&quot;. |  [optional] [readonly]
**updatedTimestamp** | **kotlin.Int** | Last update time. Unix timestamp in seconds. |  [optional] [readonly]



