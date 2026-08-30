# OAIAudience

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **NSString*** | Ad account ID. | [optional] 
**audienceType** | [**OAIPinnerListType***](OAIPinnerListType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**createdByCompanyName** | **NSString*** | The company that created this audience. | [optional] 
**createdTimestamp** | **NSNumber*** | Creation time. Unix timestamp in seconds. | [optional] 
**_description** | **NSString*** | Audience description. | [optional] 
**_id** | **NSString*** | Audience ID. | [optional] 
**isNca** | **NSNumber*** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional] 
**name** | **NSString*** | Audience name. | [optional] 
**rule** | [**OAIAudienceRule***](OAIAudienceRule.md) |  | [optional] 
**size** | **NSNumber*** | Audience size. | [optional] 
**status** | [**OAIAudienceStatus***](OAIAudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] 
**type** | **NSString*** | Always \&quot;audience\&quot;. | [optional] 
**updatedTimestamp** | **NSNumber*** | Last update time. Unix timestamp in seconds. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


