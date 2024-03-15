# audience_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **char \*** | Ad account ID. | [optional] 
**id** | **char \*** | Audience ID. | [optional] 
**name** | **char \*** | Audience name. | [optional] 
**audience_type** | **char \*** | &lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**description** | **char \*** | Audience description. | [optional] 
**rule** | [**audience_rule_t**](audience_rule.md) \* |  | [optional] 
**size** | **int** | Audience size. | [optional] 
**status** | **char \*** | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] 
**type** | **char \*** | Always \&quot;audience\&quot;. | [optional] 
**created_timestamp** | **int** | Creation time. Unix timestamp in seconds. | [optional] 
**updated_timestamp** | **int** | Last update time. Unix timestamp in seconds. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


