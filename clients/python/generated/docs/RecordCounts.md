# RecordCounts

Record processing counts

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invalid** | **int** | Number of invalid records processed | 
**processed** | **int** | Number of records processed | 
**valid** | **int** | Number of valid records processed | 

## Example

```python
from pinterestsdk.models.record_counts import RecordCounts

# TODO update the JSON string below
json = "{}"
# create an instance of RecordCounts from a JSON string
record_counts_instance = RecordCounts.from_json(json)
# print the JSON string representation of the object
print(RecordCounts.to_json())

# convert the object into a dict
record_counts_dict = record_counts_instance.to_dict()
# create an instance of RecordCounts from a dict
record_counts_from_dict = RecordCounts.from_dict(record_counts_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


