# CustomerListUploadCreateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_list_upload** | [**CustomerListUpload**](CustomerListUpload.md) | The Customer List Upload created. | 
**s3_multipart_upload_data** | [**S3MultipartUploadData**](S3MultipartUploadData.md) | Pre-signed upload URLs corresponding to each part of the upload. | 

## Example

```python
from pinterestsdk.models.customer_list_upload_create_response import CustomerListUploadCreateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CustomerListUploadCreateResponse from a JSON string
customer_list_upload_create_response_instance = CustomerListUploadCreateResponse.from_json(json)
# print the JSON string representation of the object
print(CustomerListUploadCreateResponse.to_json())

# convert the object into a dict
customer_list_upload_create_response_dict = customer_list_upload_create_response_instance.to_dict()
# create an instance of CustomerListUploadCreateResponse from a dict
customer_list_upload_create_response_from_dict = CustomerListUploadCreateResponse.from_dict(customer_list_upload_create_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


