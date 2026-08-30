# audience_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **char \*** | Ad account ID. | [optional] 
**audience_type** | **pinner_list_type_t \*** | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**created_by_company_name** | **char \*** | The company that created this audience. | [optional] 
**created_timestamp** | **int** | Creation time. Unix timestamp in seconds. | [optional] 
**description** | **char \*** | Audience description. | [optional] 
**id** | **char \*** | Audience ID. | [optional] 
**is_nca** | **int** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional] 
**name** | **char \*** | Audience name. | [optional] 
**rule** | [**audience_rule_t**](audience_rule.md) \* |  | [optional] 
**size** | **int** | Audience size. | [optional] 
**status** | **audience_status_t \*** | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] 
**type** | **char \*** | Always \&quot;audience\&quot;. | [optional] 
**updated_timestamp** | **int** | Last update time. Unix timestamp in seconds. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


