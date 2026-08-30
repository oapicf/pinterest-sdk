# BulkUpsertRequest

Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create** | [**BulkUpsertRequestCreate**](BulkUpsertRequestCreate.md) |  | [optional] 
**update** | [**BulkUpsertRequestUpdate**](BulkUpsertRequestUpdate.md) |  | [optional] 

## Example

```python
from openapi_client.models.bulk_upsert_request import BulkUpsertRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BulkUpsertRequest from a JSON string
bulk_upsert_request_instance = BulkUpsertRequest.from_json(json)
# print the JSON string representation of the object
print BulkUpsertRequest.to_json()

# convert the object into a dict
bulk_upsert_request_dict = bulk_upsert_request_instance.to_dict()
# create an instance of BulkUpsertRequest from a dict
bulk_upsert_request_from_dict = BulkUpsertRequest.from_dict(bulk_upsert_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


