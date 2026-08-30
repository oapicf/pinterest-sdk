# Org.OpenAPITools.Model.AdAccountsAudience

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Audience ID. | 
**AdAccountId** | **string** | Ad account ID. | [optional] 
**AudienceType** | **AudienceType** | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**CreatedByCompanyName** | **string** | The company that created this audience. | [optional] [readonly] 
**CreatedTimestamp** | **int** | Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**Description** | **string** | Audience description. | [optional] 
**IsNca** | **bool** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional] [readonly] 
**Name** | **string** | Audience name. | [optional] 
**Rule** | [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  | [optional] 
**Size** | **int** | Audience size. | [optional] [readonly] 
**Status** | **AudienceStatus** | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] [readonly] 
**Type** | **string** | Always \&quot;audience\&quot;. | [optional] [readonly] 
**UpdatedTimestamp** | **int** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

