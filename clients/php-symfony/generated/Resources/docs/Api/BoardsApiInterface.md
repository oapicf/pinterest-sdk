# OpenAPI\Server\Api\BoardsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**boardSectionsCreate**](BoardsApiInterface.md#boardSectionsCreate) | **POST** /boards/{board_id}/sections | Create board section
[**boardSectionsDelete**](BoardsApiInterface.md#boardSectionsDelete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
[**boardSectionsList**](BoardsApiInterface.md#boardSectionsList) | **GET** /boards/{board_id}/sections | List board sections
[**boardSectionsListPins**](BoardsApiInterface.md#boardSectionsListPins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**boardSectionsUpdate**](BoardsApiInterface.md#boardSectionsUpdate) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
[**boardsCreate**](BoardsApiInterface.md#boardsCreate) | **POST** /boards | Create board
[**boardsDelete**](BoardsApiInterface.md#boardsDelete) | **DELETE** /boards/{board_id} | Delete board
[**boardsGet**](BoardsApiInterface.md#boardsGet) | **GET** /boards/{board_id} | Get board
[**boardsList**](BoardsApiInterface.md#boardsList) | **GET** /boards | List boards
[**boardsListPins**](BoardsApiInterface.md#boardsListPins) | **GET** /boards/{board_id}/pins | List Pins on board
[**boardsUpdate**](BoardsApiInterface.md#boardsUpdate) | **PATCH** /boards/{board_id} | Update board


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.boards:
        class: Acme\MyBundle\Api\BoardsApi
        tags:
            - { name: "open_api_server.api", api: "boards" }
    # ...
```

## **boardSectionsCreate**
> OpenAPI\Server\Model\BoardSection boardSectionsCreate($boardId, $boardSection)

Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BoardsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BoardsApiInterface;

class BoardsApi implements BoardsApiInterface
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
     * Implementation of BoardsApiInterface#boardSectionsCreate
     */
    public function boardSectionsCreate($boardId, BoardSection $boardSection)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string**| Unique identifier of a board. |
 **boardSection** | [**OpenAPI\Server\Model\BoardSection**](../Model/BoardSection.md)| Create a board section. |

### Return type

[**OpenAPI\Server\Model\BoardSection**](../Model/BoardSection.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **boardSectionsDelete**
> boardSectionsDelete($boardId, $sectionId)

Delete board section

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BoardsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BoardsApiInterface;

class BoardsApi implements BoardsApiInterface
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
     * Implementation of BoardsApiInterface#boardSectionsDelete
     */
    public function boardSectionsDelete($boardId, $sectionId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string**| Unique identifier of a board. |
 **sectionId** | **string**| Unique identifier of a board section. |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **boardSectionsList**
> Paginated boardSectionsList($boardId, $bookmark, $pageSize)

List board sections

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BoardsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BoardsApiInterface;

class BoardsApi implements BoardsApiInterface
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
     * Implementation of BoardsApiInterface#boardSectionsList
     */
    public function boardSectionsList($boardId, $bookmark = null, $pageSize = '25')
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string**| Unique identifier of a board. |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](../Model/Paginated.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **boardSectionsListPins**
> Paginated boardSectionsListPins($boardId, $sectionId, $bookmark, $pageSize)

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BoardsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BoardsApiInterface;

class BoardsApi implements BoardsApiInterface
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
     * Implementation of BoardsApiInterface#boardSectionsListPins
     */
    public function boardSectionsListPins($boardId, $sectionId, $bookmark = null, $pageSize = '25')
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string**| Unique identifier of a board. |
 **sectionId** | **string**| Unique identifier of a board section. |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](../Model/Paginated.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **boardSectionsUpdate**
> OpenAPI\Server\Model\BoardSection boardSectionsUpdate($boardId, $sectionId, $boardSection)

Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BoardsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BoardsApiInterface;

class BoardsApi implements BoardsApiInterface
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
     * Implementation of BoardsApiInterface#boardSectionsUpdate
     */
    public function boardSectionsUpdate($boardId, $sectionId, BoardSection $boardSection)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string**| Unique identifier of a board. |
 **sectionId** | **string**| Unique identifier of a board section. |
 **boardSection** | [**OpenAPI\Server\Model\BoardSection**](../Model/BoardSection.md)| Update a board section. |

### Return type

[**OpenAPI\Server\Model\BoardSection**](../Model/BoardSection.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **boardsCreate**
> OpenAPI\Server\Model\Board boardsCreate($board)

Create board

Create a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BoardsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BoardsApiInterface;

class BoardsApi implements BoardsApiInterface
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
     * Implementation of BoardsApiInterface#boardsCreate
     */
    public function boardsCreate(Board $board)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board** | [**OpenAPI\Server\Model\Board**](../Model/Board.md)| Create a board using a single board json object. |

### Return type

[**OpenAPI\Server\Model\Board**](../Model/Board.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **boardsDelete**
> boardsDelete($boardId)

Delete board

Delete a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BoardsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BoardsApiInterface;

class BoardsApi implements BoardsApiInterface
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
     * Implementation of BoardsApiInterface#boardsDelete
     */
    public function boardsDelete($boardId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string**| Unique identifier of a board. |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **boardsGet**
> OpenAPI\Server\Model\Board boardsGet($boardId)

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BoardsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BoardsApiInterface;

class BoardsApi implements BoardsApiInterface
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
     * Implementation of BoardsApiInterface#boardsGet
     */
    public function boardsGet($boardId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string**| Unique identifier of a board. |

### Return type

[**OpenAPI\Server\Model\Board**](../Model/Board.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **boardsList**
> Paginated boardsList($bookmark, $pageSize, $privacy)

List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BoardsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BoardsApiInterface;

class BoardsApi implements BoardsApiInterface
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
     * Implementation of BoardsApiInterface#boardsList
     */
    public function boardsList($bookmark = null, $pageSize = '25', $privacy = null)
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
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **privacy** | **string**| Privacy setting for a board. | [optional]

### Return type

[**Paginated**](../Model/Paginated.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **boardsListPins**
> Paginated boardsListPins($boardId, $bookmark, $pageSize)

List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BoardsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BoardsApiInterface;

class BoardsApi implements BoardsApiInterface
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
     * Implementation of BoardsApiInterface#boardsListPins
     */
    public function boardsListPins($boardId, $bookmark = null, $pageSize = '25')
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string**| Unique identifier of a board. |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](../Model/Paginated.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **boardsUpdate**
> OpenAPI\Server\Model\Board boardsUpdate($boardId, $boardUpdate)

Update board

Update a board owned by the \"operating user_account\".

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BoardsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BoardsApiInterface;

class BoardsApi implements BoardsApiInterface
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
     * Implementation of BoardsApiInterface#boardsUpdate
     */
    public function boardsUpdate($boardId, BoardUpdate $boardUpdate)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string**| Unique identifier of a board. |
 **boardUpdate** | [**OpenAPI\Server\Model\BoardUpdate**](../Model/BoardUpdate.md)| Update a board. |

### Return type

[**OpenAPI\Server\Model\Board**](../Model/Board.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

