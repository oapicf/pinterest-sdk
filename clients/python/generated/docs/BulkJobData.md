# BulkJobData

Bulk request result data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result_url** | **str** | Presigned s3 file url for the bulk request result. | [optional] 
**status** | [**BulkRequestStatus**](BulkRequestStatus.md) |  | 
**workload_id** | **int** | Bulk Workload Id. | [optional] 

## Example

```python
from pinterestsdk.models.bulk_job_data import BulkJobData

# TODO update the JSON string below
json = "{}"
# create an instance of BulkJobData from a JSON string
bulk_job_data_instance = BulkJobData.from_json(json)
# print the JSON string representation of the object
print(BulkJobData.to_json())

# convert the object into a dict
bulk_job_data_dict = bulk_job_data_instance.to_dict()
# create an instance of BulkJobData from a dict
bulk_job_data_from_dict = BulkJobData.from_dict(bulk_job_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


