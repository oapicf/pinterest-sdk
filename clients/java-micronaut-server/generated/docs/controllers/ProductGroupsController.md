# ProductGroupsController

All URIs are relative to `"/v5"`

The controller class is defined in **[ProductGroupsController.java](../../src/main/java/org/openapitools/controller/ProductGroupsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsCatalogsProductGroupsList**](#adAccountsCatalogsProductGroupsList) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups

<a id="adAccountsCatalogsProductGroupsList"></a>
# **adAccountsCatalogsProductGroupsList**
```java
Mono<AdAccountsCatalogsProductGroupsList200Response> ProductGroupsController.adAccountsCatalogsProductGroupsList(adAccountIdfeedProfileId)
```

Get catalog product groups

This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**feedProfileId** | `String` | The feed profile id whose catalog product groups we want to return. | [optional parameter]

### Return type
[**AdAccountsCatalogsProductGroupsList200Response**](../../docs/models/AdAccountsCatalogsProductGroupsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

