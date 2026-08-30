# CatalogsFeedCredentials

This field is **OPTIONAL**. Use this if your feed file requires username and password.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**password** | **str** | The required password for downloading a feed. | 
**username** | **str** | The required username for downloading a feed. | 

## Example

```python
from openapi_client.models.catalogs_feed_credentials import CatalogsFeedCredentials

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsFeedCredentials from a JSON string
catalogs_feed_credentials_instance = CatalogsFeedCredentials.from_json(json)
# print the JSON string representation of the object
print CatalogsFeedCredentials.to_json()

# convert the object into a dict
catalogs_feed_credentials_dict = catalogs_feed_credentials_instance.to_dict()
# create an instance of CatalogsFeedCredentials from a dict
catalogs_feed_credentials_from_dict = CatalogsFeedCredentials.from_dict(catalogs_feed_credentials_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


