# IntegrationsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**integrationsCommerceDel**](IntegrationsAPI.md#integrationscommercedel) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
[**integrationsCommerceGet**](IntegrationsAPI.md#integrationscommerceget) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
[**integrationsCommercePatch**](IntegrationsAPI.md#integrationscommercepatch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
[**integrationsCommercePost**](IntegrationsAPI.md#integrationscommercepost) | **POST** /integrations/commerce | Create commerce integration
[**integrationsGetById**](IntegrationsAPI.md#integrationsgetbyid) | **GET** /integrations/{id} | Get integration metadata
[**integrationsGetList**](IntegrationsAPI.md#integrationsgetlist) | **GET** /integrations | Get integration metadata list
[**integrationsLogsPost**](IntegrationsAPI.md#integrationslogspost) | **POST** /integrations/logs | Receives batched logs from integration applications.


# **integrationsCommerceDel**
```swift
    open class func integrationsCommerceDel(externalBusinessId: String, completion: @escaping (_ data: IntegrationMetadata?, _ error: Error?) -> Void)
```

Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let externalBusinessId = "externalBusinessId_example" // String | External business ID for the integration.

// Delete commerce integration
IntegrationsAPI.integrationsCommerceDel(externalBusinessId: externalBusinessId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalBusinessId** | **String** | External business ID for the integration. | 

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrationsCommerceGet**
```swift
    open class func integrationsCommerceGet(externalBusinessId: String, completion: @escaping (_ data: IntegrationMetadata?, _ error: Error?) -> Void)
```

Get commerce integration

Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let externalBusinessId = "externalBusinessId_example" // String | External business ID for the integration.

// Get commerce integration
IntegrationsAPI.integrationsCommerceGet(externalBusinessId: externalBusinessId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalBusinessId** | **String** | External business ID for the integration. | 

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrationsCommercePatch**
```swift
    open class func integrationsCommercePatch(externalBusinessId: String, integrationMetadataUpdate: IntegrationMetadataUpdate, completion: @escaping (_ data: IntegrationMetadata?, _ error: Error?) -> Void)
```

Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let externalBusinessId = "externalBusinessId_example" // String | External business ID for the integration.
let integrationMetadataUpdate = IntegrationMetadataUpdate(additionalId1: "additionalId1_example", connectedAdvertiserId: "connectedAdvertiserId_example", connectedLbaId: "connectedLbaId_example", connectedMerchantId: "connectedMerchantId_example", connectedTagId: "connectedTagId_example", partnerAccessToken: "partnerAccessToken_example", partnerAccessTokenExpiry: 123, partnerMetadata: "partnerMetadata_example", partnerPrimaryEmail: "partnerPrimaryEmail_example", partnerRefreshToken: "partnerRefreshToken_example", partnerRefreshTokenExpiry: 123, scopes: "scopes_example") // IntegrationMetadataUpdate | 

// Update commerce integration
IntegrationsAPI.integrationsCommercePatch(externalBusinessId: externalBusinessId, integrationMetadataUpdate: integrationMetadataUpdate) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalBusinessId** | **String** | External business ID for the integration. | 
 **integrationMetadataUpdate** | [**IntegrationMetadataUpdate**](IntegrationMetadataUpdate.md) |  | 

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrationsCommercePost**
```swift
    open class func integrationsCommercePost(integrationMetadataCreate: IntegrationMetadataCreate, completion: @escaping (_ data: IntegrationMetadata?, _ error: Error?) -> Void)
```

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let integrationMetadataCreate = IntegrationMetadataCreate(additionalId1: "additionalId1_example", connectedAdvertiserId: "connectedAdvertiserId_example", connectedLbaId: "connectedLbaId_example", connectedMerchantId: "connectedMerchantId_example", connectedTagId: "connectedTagId_example", externalBusinessId: "externalBusinessId_example", partnerAccessToken: "partnerAccessToken_example", partnerAccessTokenExpiry: 123, partnerMetadata: "partnerMetadata_example", partnerPrimaryEmail: "partnerPrimaryEmail_example", partnerRefreshToken: "partnerRefreshToken_example", partnerRefreshTokenExpiry: 123, scopes: "scopes_example") // IntegrationMetadataCreate | 

// Create commerce integration
IntegrationsAPI.integrationsCommercePost(integrationMetadataCreate: integrationMetadataCreate) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationMetadataCreate** | [**IntegrationMetadataCreate**](IntegrationMetadataCreate.md) |  | 

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrationsGetById**
```swift
    open class func integrationsGetById(id: String, completion: @escaping (_ data: IntegrationRecord?, _ error: Error?) -> Void)
```

Get integration metadata

Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let id = "id_example" // String | Integration record ID.

// Get integration metadata
IntegrationsAPI.integrationsGetById(id: id) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String** | Integration record ID. | 

### Return type

[**IntegrationRecord**](IntegrationRecord.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrationsGetList**
```swift
    open class func integrationsGetList(bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: IntegrationsGetList200Response?, _ error: Error?) -> Void)
```

Get integration metadata list

Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// Get integration metadata list
IntegrationsAPI.integrationsGetList(bookmark: bookmark, pageSize: pageSize) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**IntegrationsGetList200Response**](IntegrationsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrationsLogsPost**
```swift
    open class func integrationsLogsPost(integrationLogsRequestCreate: IntegrationLogsRequestCreate, completion: @escaping (_ data: IntegrationLogsSuccessResponse?, _ error: Error?) -> Void)
```

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let integrationLogsRequestCreate = IntegrationLogsRequestCreate(logs: [IntegrationLog(advertiserId: "advertiserId_example", appVersionNumber: "appVersionNumber_example", clientTimestamp: 123, error: IntegrationLogClientError(cause: "cause_example", columnNumber: 123, fileName: "fileName_example", lineNumber: 123, message: "message_example", messageDetail: "messageDetail_example", name: "name_example", number: 123, stackTrace: "stackTrace_example"), eventType: IntegrationLogEventType(), externalBusinessId: "externalBusinessId_example", feedProfileId: "feedProfileId_example", logLevel: IntegrationLogLevel(), merchantId: "merchantId_example", message: "message_example", platformVersionNumber: "platformVersionNumber_example", request: IntegrationLogClientRequest(host: "host_example", method: HttpMethod(), path: "path_example", requestHeaders: "TODO", responseHeaders: "TODO", responseStatusCode: 123), tagId: "tagId_example")]) // IntegrationLogsRequestCreate | 

// Receives batched logs from integration applications.
IntegrationsAPI.integrationsLogsPost(integrationLogsRequestCreate: integrationLogsRequestCreate) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationLogsRequestCreate** | [**IntegrationLogsRequestCreate**](IntegrationLogsRequestCreate.md) |  | 

### Return type

[**IntegrationLogsSuccessResponse**](IntegrationLogsSuccessResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

