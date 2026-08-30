

# AdAccountsAudienceUpdate

Resource create or update operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String** | Ad account ID. |  [optional]
**audienceType** | **AudienceType** | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR |  [optional]
**description** | **String** | Audience description. |  [optional]
**name** | **String** | Audience name. |  [optional]
**operationType** | **AudienceUpdateOperationType** | Audience operation type (update or remove). Only valid in update request body. |  [optional]
**rule** | [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  |  [optional]



