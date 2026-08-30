# PinterestSdk.AdAccountsAudience

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String** | Ad account ID. | [optional] 
**audienceType** | [**AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**createdByCompanyName** | **String** | The company that created this audience. | [optional] [readonly] 
**createdTimestamp** | **Number** | Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**description** | **String** | Audience description. | [optional] 
**id** | **String** | Audience ID. | 
**isNca** | **Boolean** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional] [readonly] 
**name** | **String** | Audience name. | [optional] 
**rule** | [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  | [optional] 
**size** | **Number** | Audience size. | [optional] [readonly] 
**status** | [**AudienceStatus**](AudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] [readonly] 
**type** | **String** | Always \&quot;audience\&quot;. | [optional] [readonly] 
**updatedTimestamp** | **Number** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 


