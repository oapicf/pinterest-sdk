# PinterestRestApi.OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthToken**](OauthApi.md#oauthToken) | **POST** /oauth/token | Generate OAuth access token



## oauthToken

> OauthAccessTokenResponse oauthToken(grantType)

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Authentication&#39;&gt;Authentication&lt;/a&gt; for more.

### Example

```javascript
import PinterestRestApi from 'pinterest_rest_api';

let apiInstance = new PinterestRestApi.OauthApi();
let grantType = "grantType_example"; // String | 
apiInstance.oauthToken(grantType, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **String**|  | 

### Return type

[**OauthAccessTokenResponse**](OauthAccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

