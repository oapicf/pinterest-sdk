# S3MultipartUploadData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_parts** | [**List[S3FilePart]**](S3FilePart.md) | Array of file parts with pre-signed URLs. | [optional] 

## Example

```python
from openapi_client.models.s3_multipart_upload_data import S3MultipartUploadData

# TODO update the JSON string below
json = "{}"
# create an instance of S3MultipartUploadData from a JSON string
s3_multipart_upload_data_instance = S3MultipartUploadData.from_json(json)
# print the JSON string representation of the object
print S3MultipartUploadData.to_json()

# convert the object into a dict
s3_multipart_upload_data_dict = s3_multipart_upload_data_instance.to_dict()
# create an instance of S3MultipartUploadData from a dict
s3_multipart_upload_data_from_dict = S3MultipartUploadData.from_dict(s3_multipart_upload_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


