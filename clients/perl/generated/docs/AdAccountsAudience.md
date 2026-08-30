# WWW::OpenAPIClient::Object::AdAccountsAudience

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AdAccountsAudience;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Ad account ID. | [optional] 
**audience_type** | [**AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**created_by_company_name** | **string** | The company that created this audience. | [optional] [readonly] 
**created_timestamp** | **int** | Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**description** | **string** | Audience description. | [optional] 
**id** | **string** | Audience ID. | 
**is_nca** | **boolean** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional] [readonly] 
**name** | **string** | Audience name. | [optional] 
**rule** | [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  | [optional] 
**size** | **int** | Audience size. | [optional] [readonly] 
**status** | [**AudienceStatus**](AudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] [readonly] 
**type** | **string** | Always \&quot;audience\&quot;. | [optional] [readonly] 
**updated_timestamp** | **int** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


