# AdAccountsAudience

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **string** | Ad account ID. | [optional] 
**audienceType** | [**OpenAPI\Server\Model\AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**createdByCompanyName** | **string** | The company that created this audience. | [optional] [readonly] 
**createdTimestamp** | **int** | Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**description** | **string** | Audience description. | [optional] 
**id** | **string** | Audience ID. | 
**isNca** | **bool** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional] [readonly] 
**name** | **string** | Audience name. | [optional] 
**rule** | [**OpenAPI\Server\Model\AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  | [optional] 
**size** | **int** | Audience size. | [optional] [readonly] 
**status** | [**OpenAPI\Server\Model\AudienceStatus**](AudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] [readonly] 
**type** | **string** | Always \&quot;audience\&quot;. | [optional] [readonly] 
**updatedTimestamp** | **int** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


