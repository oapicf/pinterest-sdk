# targeting_template_response_data_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **int** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true]
**keywords** | [**list_t**](targeting_template_keyword.md) \* |  | [optional] 
**name** | **char \*** | targeting template name | [optional] 
**placement_group** | **placement_group_type_t \*** |  | [optional] 
**targeting_attributes** | [**targeting_spec_t**](targeting_spec.md) \* |  | [optional] 
**tracking_urls** | [**tracking_urls_t**](tracking_urls.md) \* |  | [optional] 
**ad_account_id** | **char \*** | The ID of the advertiser that this targeting template belongs to. | [optional] 
**created_time** | **int** | Targeting template created time. Unix timestamp in seconds. | [optional] 
**id** | **char \*** | Targeting template ID. | [optional] 
**sizing** | [**targeting_template_audience_sizing_t**](targeting_template_audience_sizing.md) \* |  | [optional] 
**status** | **pinterest_rest_api_targeting_template_response_data_STATUS_e** | Indicate targeting template is active or Deleted | [optional] [default to 'ACTIVE']
**updated_time** | **int** | Targeting template updated time.Unix timestamp in seconds. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


