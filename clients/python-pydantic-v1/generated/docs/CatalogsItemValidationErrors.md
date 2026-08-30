# CatalogsItemValidationErrors


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adult_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has an invalid adult value. | [optional] 
**adwords_format_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Adword link contains too many characters. | [optional] 
**availability_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing availability value in its product metadata, this item will not be published. | [optional] 
**blocklisted_image_signature** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] 
**description_missing** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing description in its product metadata, this item will not be published. | [optional] 
**duplicate_products** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | This product is duplicated. The duplicate entry will not be published. | [optional] 
**image_link_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Image link is invalid. | [optional] 
**image_link_length_too_long** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has image_link URL that contains too many characters, so the item will not be published. | [optional] 
**image_link_missing** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing an image link URL in its product metadata, this item will not be published. | [optional] 
**invalid_domain** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product link value doesn&#39;t match the verified domain associated with this account. | [optional] 
**item_main_image_download_failure** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Main image can&#39;t be found. | [optional] 
**itemid_missing** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing item id in its product metadata, this item will not be published. | [optional] 
**link_format_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Link is invalid. | [optional] 
**link_length_too_long** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product link contains too many characters, this item will not be published. | [optional] 
**list_price_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has a list price formatting error, this item will not be published. | [optional] 
**max_items_per_item_group_exceeded** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item exceed the maximum number of items per item group, this item will not be published. | [optional] 
**parse_line_error** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item contains formating errors. | [optional] 
**pinjoin_content_unsafe** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] 
**price_cannot_be_determined** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item price cannot be determined because the price, list price, and sale price are all different. | [optional] 
**price_missing** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product is missing a price, this item will not be published. | [optional] 
**product_link_missing** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing a link URL in its product metadata, this item will not be published. | [optional] 
**product_price_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has a price formatting error in its product metadata, this item will not be published. | [optional] 
**title_missing** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing title in its product metadata, this item will not be published. | [optional] 

## Example

```python
from openapi_client.models.catalogs_item_validation_errors import CatalogsItemValidationErrors

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsItemValidationErrors from a JSON string
catalogs_item_validation_errors_instance = CatalogsItemValidationErrors.from_json(json)
# print the JSON string representation of the object
print CatalogsItemValidationErrors.to_json()

# convert the object into a dict
catalogs_item_validation_errors_dict = catalogs_item_validation_errors_instance.to_dict()
# create an instance of CatalogsItemValidationErrors from a dict
catalogs_item_validation_errors_from_dict = CatalogsItemValidationErrors.from_dict(catalogs_item_validation_errors_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


