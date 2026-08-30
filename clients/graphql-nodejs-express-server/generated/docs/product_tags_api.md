# product_tags_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ProductTagsBulkAdd**](product_tags_api.md#ProductTagsBulkAdd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin
[**ProductTagsBulkDelete**](product_tags_api.md#ProductTagsBulkDelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
[**ProductTagsList**](product_tags_api.md#ProductTagsList) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin


<a name="ProductTagsBulkAdd"></a>
# **ProductTagsBulkAdd**
> ProductTagsResponse ProductTagsBulkAdd(pinId, productTagsBulkAddRequest)

Add product tags to pin

Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
<a name="ProductTagsBulkDelete"></a>
# **ProductTagsBulkDelete**
> ProductTagsBulkDelete(pinId, productTagsBulkDeleteRequest)

Delete product tags from pin

Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
<a name="ProductTagsList"></a>
# **ProductTagsList**
> ProductTagsResponse ProductTagsList(pinId)

Get product tags for pin

Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
