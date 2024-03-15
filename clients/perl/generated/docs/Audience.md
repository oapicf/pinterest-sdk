# WWW::OpenAPIClient::Object::Audience

## Load the model package
```perl
use WWW::OpenAPIClient::Object::Audience;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Ad account ID. | [optional] 
**id** | **string** | Audience ID. | [optional] 
**name** | **string** | Audience name. | [optional] 
**audience_type** | **string** | &lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**description** | **string** | Audience description. | [optional] 
**rule** | [**AudienceRule**](AudienceRule.md) |  | [optional] 
**size** | **int** | Audience size. | [optional] 
**status** | **string** | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] 
**type** | **string** | Always \&quot;audience\&quot;. | [optional] 
**created_timestamp** | **int** | Creation time. Unix timestamp in seconds. | [optional] 
**updated_timestamp** | **int** | Last update time. Unix timestamp in seconds. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


