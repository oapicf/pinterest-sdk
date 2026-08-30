

# Audience

The class is defined in **[Audience.java](../../src/main/java/org/openapitools/model/Audience.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | `String` | Ad account ID. |  [optional property]
**audienceType** | `PinnerListType` | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR |  [optional property]
**createdByCompanyName** | `String` | The company that created this audience. |  [optional property]
**createdTimestamp** | `Integer` | Creation time. Unix timestamp in seconds. |  [optional property]
**description** | `String` | Audience description. |  [optional property]
**id** | `String` | Audience ID. |  [optional property]
**isNca** | `Boolean` | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. |  [optional property]
**name** | `String` | Audience name. |  [optional property]
**rule** | [`AudienceRule`](AudienceRule.md) |  |  [optional property]
**size** | `Integer` | Audience size. |  [optional property]
**status** | `AudienceStatus` | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. |  [optional property]
**type** | `String` | Always \&quot;audience\&quot;. |  [optional property]
**updatedTimestamp** | `Integer` | Last update time. Unix timestamp in seconds. |  [optional property]















