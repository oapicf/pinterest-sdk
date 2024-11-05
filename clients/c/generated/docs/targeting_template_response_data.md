# targeting_template_response_data_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **char \*** | targeting template name | [optional] 
**auto_targeting_enabled** | **int** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true]
**targeting_attributes** | [**targeting_spec_t**](targeting_spec.md) \* |  | [optional] 
**placement_group** | **placement_group_type_t \*** |  | [optional] 
**keywords** | [**list_t**](targeting_template_keyword.md) \* |  | [optional] 
**tracking_urls** | [**tracking_urls_t**](tracking_urls.md) \* |  | [optional] 
**id** | **char \*** | Targeting template ID. | [optional] 
**created_time** | **int** | Targeting template created time. Unix timestamp in seconds. | [optional] 
**updated_time** | **int** | Targeting template updated time.Unix timestamp in seconds. | [optional] 
**ad_account_id** | **char \*** | The ID of the advertiser that this targeting template belongs to. | [optional] 
**status** | **pinterest_rest_api_targeting_template_response_data_STATUS_e** | Indicate targeting template is active or Deleted | [optional] [default to 'ACTIVE']
**sizing** | [**targeting_template_audience_sizing_t**](targeting_template_audience_sizing.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


