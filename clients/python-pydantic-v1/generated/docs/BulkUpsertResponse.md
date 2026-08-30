# BulkUpsertResponse

ID of the bulk request.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.bulk_upsert_response import BulkUpsertResponse

# TODO update the JSON string below
json = "{}"
# create an instance of BulkUpsertResponse from a JSON string
bulk_upsert_response_instance = BulkUpsertResponse.from_json(json)
# print the JSON string representation of the object
print BulkUpsertResponse.to_json()

# convert the object into a dict
bulk_upsert_response_dict = bulk_upsert_response_instance.to_dict()
# create an instance of BulkUpsertResponse from a dict
bulk_upsert_response_from_dict = BulkUpsertResponse.from_dict(bulk_upsert_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


