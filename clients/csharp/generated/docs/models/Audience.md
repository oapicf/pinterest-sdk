# Org.OpenAPITools.Model.Audience

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **string** | Ad account ID. | [optional] 
**AudienceType** | **PinnerListType** | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**CreatedByCompanyName** | **string** | The company that created this audience. | [optional] 
**CreatedTimestamp** | **int** | Creation time. Unix timestamp in seconds. | [optional] 
**Description** | **string** | Audience description. | [optional] 
**Id** | **string** | Audience ID. | [optional] 
**IsNca** | **bool** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional] 
**Name** | **string** | Audience name. | [optional] 
**Rule** | [**AudienceRule**](AudienceRule.md) |  | [optional] 
**Size** | **int** | Audience size. | [optional] 
**Status** | **AudienceStatus** | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] 
**Type** | **string** | Always \&quot;audience\&quot;. | [optional] 
**UpdatedTimestamp** | **int** | Last update time. Unix timestamp in seconds. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

