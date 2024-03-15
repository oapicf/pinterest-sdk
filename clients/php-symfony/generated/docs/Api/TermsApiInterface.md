# OpenAPI\Server\Api\TermsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**termsRelatedList**](TermsApiInterface.md#termsRelatedList) | **GET** /terms/related | List related terms
[**termsSuggestedList**](TermsApiInterface.md#termsSuggestedList) | **GET** /terms/suggested | List suggested terms


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\TermsApi:
        tags:
            - { name: "open_api_server.api", api: "terms" }
    # ...
```

## **termsRelatedList**
> OpenAPI\Server\Model\RelatedTerms termsRelatedList($terms)

List related terms

Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/TermsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\TermsApiInterface;

class TermsApi implements TermsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of TermsApiInterface#termsRelatedList
     */
    public function termsRelatedList(array $terms, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terms** | [**string**](../Model/string.md)| List of input terms. |

### Return type

[**OpenAPI\Server\Model\RelatedTerms**](../Model/RelatedTerms.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **termsSuggestedList**
> string termsSuggestedList($term, $limit)

List suggested terms

Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/TermsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\TermsApiInterface;

class TermsApi implements TermsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of TermsApiInterface#termsSuggestedList
     */
    public function termsSuggestedList(string $term, int $limit, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **string**| Input term. |
 **limit** | **int**| Max suggested terms to return. | [optional] [default to 4]

### Return type

**string**

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

