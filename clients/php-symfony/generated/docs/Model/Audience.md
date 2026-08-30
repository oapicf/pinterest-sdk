# Audience

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **string** | Ad account ID. | [optional] 
**audienceType** | [**OpenAPI\Server\Model\PinnerListType**](PinnerListType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**createdByCompanyName** | **string** | The company that created this audience. | [optional] 
**createdTimestamp** | **int** | Creation time. Unix timestamp in seconds. | [optional] 
**description** | **string** | Audience description. | [optional] 
**id** | **string** | Audience ID. | [optional] 
**isNca** | **bool** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional] 
**name** | **string** | Audience name. | [optional] 
**rule** | [**OpenAPI\Server\Model\AudienceRule**](AudienceRule.md) |  | [optional] 
**size** | **int** | Audience size. | [optional] 
**status** | [**OpenAPI\Server\Model\AudienceStatus**](AudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] 
**type** | **string** | Always \&quot;audience\&quot;. | [optional] 
**updatedTimestamp** | **int** | Last update time. Unix timestamp in seconds. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


