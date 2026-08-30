# targeting_template_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **char \*** | The ID of the advertiser that this targeting template belongs to. | [optional] [readonly] 
**auto_targeting_enabled** | **int** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to true]
**created_time** | **int** | Targeting template created time. Unix timestamp in seconds. | [optional] [readonly] 
**id** | **char \*** | Targeting template ID. | [optional] [readonly] 
**keywords** | [**list_t**](targeting_template_keyword.md) \* |  | [optional] 
**name** | **char \*** | targeting template name | 
**placement_group** | **placement_group_type_t \*** |  | [optional] 
**sizing** | [**targeting_template_audience_sizing_t**](targeting_template_audience_sizing.md) \* |  | [optional] [readonly] 
**status** | **targeting_template_status_t \*** | Indicate targeting template is active or Deleted | [optional] [readonly] 
**targeting_attributes** | [**targeting_spec_optimal_t**](targeting_spec_optimal.md) \* | targeting profile attributes | 
**tracking_urls** | [**tracking_urls_t**](tracking_urls.md) \* |  | [optional] 
**updated_time** | **int** | Targeting template updated time.Unix timestamp in seconds. | [optional] [readonly] 
**valid** | **int** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


