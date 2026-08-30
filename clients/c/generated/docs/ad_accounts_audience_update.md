# ad_accounts_audience_update_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **char \*** | Ad account ID. | [optional] 
**audience_type** | **audience_type_t \*** | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**description** | **char \*** | Audience description. | [optional] 
**name** | **char \*** | Audience name. | [optional] 
**operation_type** | **audience_update_operation_type_t \*** | Audience operation type (update or remove). Only valid in update request body. | [optional] 
**rule** | [**ad_accounts_audience_rule_t**](ad_accounts_audience_rule.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


