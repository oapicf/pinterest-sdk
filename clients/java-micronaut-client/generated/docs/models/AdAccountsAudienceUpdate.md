

# AdAccountsAudienceUpdate

Resource create or update operation model.

The class is defined in **[AdAccountsAudienceUpdate.java](../../src/main/java/org/openapitools/model/AdAccountsAudienceUpdate.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | `String` | Ad account ID. |  [optional property]
**audienceType** | `AudienceType` | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR |  [optional property]
**description** | `String` | Audience description. |  [optional property]
**name** | `String` | Audience name. |  [optional property]
**operationType** | `AudienceUpdateOperationType` | Audience operation type (update or remove). Only valid in update request body. |  [optional property]
**rule** | [`AdAccountsAudienceRule`](AdAccountsAudienceRule.md) |  |  [optional property]








