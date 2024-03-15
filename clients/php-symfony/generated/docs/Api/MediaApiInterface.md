# OpenAPI\Server\Api\MediaApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mediaCreate**](MediaApiInterface.md#mediaCreate) | **POST** /media | Register media upload
[**mediaGet**](MediaApiInterface.md#mediaGet) | **GET** /media/{media_id} | Get media upload details
[**mediaList**](MediaApiInterface.md#mediaList) | **GET** /media | List media uploads


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\MediaApi:
        tags:
            - { name: "open_api_server.api", api: "media" }
    # ...
```

## **mediaCreate**
> OpenAPI\Server\Model\MediaUpload mediaCreate($mediaUploadRequest)

Register media upload

Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file's contents as the request's <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MediaApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MediaApiInterface;

class MediaApi implements MediaApiInterface
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
     * Implementation of MediaApiInterface#mediaCreate
     */
    public function mediaCreate(MediaUploadRequest $mediaUploadRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaUploadRequest** | [**OpenAPI\Server\Model\MediaUploadRequest**](../Model/MediaUploadRequest.md)| Create a media upload request |

### Return type

[**OpenAPI\Server\Model\MediaUpload**](../Model/MediaUpload.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **mediaGet**
> OpenAPI\Server\Model\MediaUploadDetails mediaGet($mediaId)

Get media upload details

Get details for a registered media upload, including its current status.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MediaApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MediaApiInterface;

class MediaApi implements MediaApiInterface
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
     * Implementation of MediaApiInterface#mediaGet
     */
    public function mediaGet(string $mediaId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **string**| Media identifier |

### Return type

[**OpenAPI\Server\Model\MediaUploadDetails**](../Model/MediaUploadDetails.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **mediaList**
> OpenAPI\Server\Model\MediaList200Response mediaList($bookmark, $pageSize)

List media uploads

List media uploads filtered by given parameters.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MediaApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MediaApiInterface;

class MediaApi implements MediaApiInterface
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
     * Implementation of MediaApiInterface#mediaList
     */
    public function mediaList(?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\MediaList200Response**](../Model/MediaList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

