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
> OpenAPI\Server\Model\MediaUpload mediaCreate($mediaUploadCreate)

Register media upload

Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using `curl`, for example) to `upload_url` using the `Content-Type` header value. Send the media file's contents as the request's `file` parameter and also include all of the parameters from `upload_parameters`.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

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
    public function mediaCreate(MediaUploadCreate $mediaUploadCreate, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaUploadCreate** | [**OpenAPI\Server\Model\MediaUploadCreate**](../Model/MediaUploadCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\MediaUpload**](../Model/MediaUpload.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **mediaGet**
> OpenAPI\Server\Model\Media mediaGet($mediaId)

Get media upload details

Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

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
 **mediaId** | **string**| Unique identifier for this media upload. Used to track status and for attaching during Pin creation. |

### Return type

[**OpenAPI\Server\Model\Media**](../Model/Media.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **mediaList**
> OpenAPI\Server\Model\MediaList200Response mediaList($bookmark, $pageSize)

List media uploads

List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

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
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\MediaList200Response**](../Model/MediaList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

