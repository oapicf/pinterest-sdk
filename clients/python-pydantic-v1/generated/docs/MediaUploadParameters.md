# MediaUploadParameters


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | **str** |  | [optional] 
**key** | **str** |  | [optional] 
**policy** | **str** |  | [optional] 
**x_amz_algorithm** | **str** |  | [optional] 
**x_amz_credential** | **str** |  | [optional] 
**x_amz_date** | **str** |  | [optional] 
**x_amz_security_token** | **str** |  | [optional] 
**x_amz_signature** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.media_upload_parameters import MediaUploadParameters

# TODO update the JSON string below
json = "{}"
# create an instance of MediaUploadParameters from a JSON string
media_upload_parameters_instance = MediaUploadParameters.from_json(json)
# print the JSON string representation of the object
print MediaUploadParameters.to_json()

# convert the object into a dict
media_upload_parameters_dict = media_upload_parameters_instance.to_dict()
# create an instance of MediaUploadParameters from a dict
media_upload_parameters_from_dict = MediaUploadParameters.from_dict(media_upload_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


