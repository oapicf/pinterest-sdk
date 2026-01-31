# S3FilePart


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**part_number** | **int** | Part number for upload. | 
**presigned_url** | **str** | Pre-signed URL. | 

## Example

```python
from pinterestsdk.models.s3_file_part import S3FilePart

# TODO update the JSON string below
json = "{}"
# create an instance of S3FilePart from a JSON string
s3_file_part_instance = S3FilePart.from_json(json)
# print the JSON string representation of the object
print(S3FilePart.to_json())

# convert the object into a dict
s3_file_part_dict = s3_file_part_instance.to_dict()
# create an instance of S3FilePart from a dict
s3_file_part_from_dict = S3FilePart.from_dict(s3_file_part_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


