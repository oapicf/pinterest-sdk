# Org.OpenAPITools.Model.AdAccountsAudienceUpdate
Resource create or update operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **string** | Ad account ID. | [optional] 
**AudienceType** | **AudienceType** | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**Description** | **string** | Audience description. | [optional] 
**Name** | **string** | Audience name. | [optional] 
**OperationType** | **AudienceUpdateOperationType** | Audience operation type (update or remove). Only valid in update request body. | [optional] 
**Rule** | [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

