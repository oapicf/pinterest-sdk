# AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiencesCreate**](AudiencesApi.md#audiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiencesCreateCustom**](AudiencesApi.md#audiencesCreateCustom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
[**audiencesGet**](AudiencesApi.md#audiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiencesList**](AudiencesApi.md#audiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiencesUpdate**](AudiencesApi.md#audiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience



## audiencesCreate

> Audience audiencesCreate(adAccountId, audienceCreateRequest)

Create audience

Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. &lt;p/&gt; For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AudiencesApi;

AudiencesApi apiInstance = new AudiencesApi();
String adAccountId = null; // String | Unique identifier of an ad account.
AudienceCreateRequest audienceCreateRequest = new AudienceCreateRequest(); // AudienceCreateRequest | List of ads to create, size limit [1, 30]
try {
    Audience result = apiInstance.audiencesCreate(adAccountId, audienceCreateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudiencesApi#audiencesCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **audienceCreateRequest** | [**AudienceCreateRequest**](AudienceCreateRequest.md)| List of ads to create, size limit [1, 30] |

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## audiencesCreateCustom

> Audience audiencesCreateCustom(adAccountId, audienceCreateCustomRequest)

Create custom audience

Create a custom audience and find the audiences you want your ads to reach.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AudiencesApi;

AudiencesApi apiInstance = new AudiencesApi();
String adAccountId = null; // String | Unique identifier of an ad account.
AudienceCreateCustomRequest audienceCreateCustomRequest = new AudienceCreateCustomRequest(); // AudienceCreateCustomRequest | Custom audience to create.
try {
    Audience result = apiInstance.audiencesCreateCustom(adAccountId, audienceCreateCustomRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudiencesApi#audiencesCreateCustom");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **audienceCreateCustomRequest** | [**AudienceCreateCustomRequest**](AudienceCreateCustomRequest.md)| Custom audience to create. |

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## audiencesGet

> Audience audiencesGet(adAccountId, audienceId)

Get audience

Get a specific audience given the audience ID.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AudiencesApi;

AudiencesApi apiInstance = new AudiencesApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String audienceId = null; // String | Unique identifier of an audience
try {
    Audience result = apiInstance.audiencesGet(adAccountId, audienceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudiencesApi#audiencesGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **audienceId** | **String**| Unique identifier of an audience | [default to null]

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## audiencesList

> AudiencesList200Response audiencesList(adAccountId, bookmark, order, pageSize, ownershipType)

List audiences

Get list of audiences for the ad account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AudiencesApi;

AudiencesApi apiInstance = new AudiencesApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
String order = ASCENDING; // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
String ownershipType = OWNED; // String | <strong>This feature is currently in beta and not available to all apps.</strong> Filter audiences by ownership type.
try {
    AudiencesList200Response result = apiInstance.audiencesList(adAccountId, bookmark, order, pageSize, ownershipType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudiencesApi#audiencesList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ownershipType** | **String**| &lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type. | [optional] [default to OWNED] [enum: OWNED, RECEIVED]

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## audiencesUpdate

> Audience audiencesUpdate(adAccountId, audienceId, audienceUpdateRequest)

Update audience

Update (edit or remove) an existing targeting audience.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AudiencesApi;

AudiencesApi apiInstance = new AudiencesApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String audienceId = null; // String | Unique identifier of an audience
AudienceUpdateRequest audienceUpdateRequest = new AudienceUpdateRequest(); // AudienceUpdateRequest | The audience to be updated.
try {
    Audience result = apiInstance.audiencesUpdate(adAccountId, audienceId, audienceUpdateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudiencesApi#audiencesUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **audienceId** | **String**| Unique identifier of an audience | [default to null]
 **audienceUpdateRequest** | [**AudienceUpdateRequest**](AudienceUpdateRequest.md)| The audience to be updated. | [optional]

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

