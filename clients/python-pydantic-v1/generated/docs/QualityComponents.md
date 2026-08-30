# QualityComponents

Set of quality components, with each component containing a event coverage and details.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_external_id** | [**Dict[str, QualityComponentDetails]**](QualityComponentDetails.md) |  | [optional] 
**click_id_epik** | [**Dict[str, QualityComponentDetails]**](QualityComponentDetails.md) |  | [optional] 
**external_event_id** | [**Dict[str, QualityComponentDetails]**](QualityComponentDetails.md) | Dedup components. | [optional] 
**hashed_email** | [**Dict[str, QualityComponentDetails]**](QualityComponentDetails.md) | User matching identifiers. | [optional] 
**hashed_maid** | [**Dict[str, QualityComponentDetails]**](QualityComponentDetails.md) |  | [optional] 
**ip_address** | [**Dict[str, QualityComponentDetails]**](QualityComponentDetails.md) |  | [optional] 
**order_id** | [**Dict[str, QualityComponentDetails]**](QualityComponentDetails.md) |  | [optional] 
**order_value** | [**Dict[str, QualityComponentDetails]**](QualityComponentDetails.md) |  | [optional] 
**product_id** | [**Dict[str, QualityComponentDetails]**](QualityComponentDetails.md) | Product/event metadata. | [optional] 
**source_url** | [**Dict[str, QualityComponentDetails]**](QualityComponentDetails.md) |  | [optional] 
**user_agent** | [**Dict[str, QualityComponentDetails]**](QualityComponentDetails.md) |  | [optional] 

## Example

```python
from openapi_client.models.quality_components import QualityComponents

# TODO update the JSON string below
json = "{}"
# create an instance of QualityComponents from a JSON string
quality_components_instance = QualityComponents.from_json(json)
# print the JSON string representation of the object
print QualityComponents.to_json()

# convert the object into a dict
quality_components_dict = quality_components_instance.to_dict()
# create an instance of QualityComponents from a dict
quality_components_from_dict = QualityComponents.from_dict(quality_components_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


