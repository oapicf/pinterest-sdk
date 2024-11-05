# OpenAPI\Server\Api\BusinessAccessInviteApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetAccessRequestsCreate**](BusinessAccessInviteApiInterface.md#assetAccessRequestsCreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets.
[**cancelInvitesOrRequests**](BusinessAccessInviteApiInterface.md#cancelInvitesOrRequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
[**createAssetInvites**](BusinessAccessInviteApiInterface.md#createAssetInvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
[**createMembershipOrPartnershipInvites**](BusinessAccessInviteApiInterface.md#createMembershipOrPartnershipInvites) | **POST** /businesses/{business_id}/invites | Create invites or requests
[**getInvites**](BusinessAccessInviteApiInterface.md#getInvites) | **GET** /businesses/{business_id}/invites | Get invites/requests
[**respondBusinessAccessInvites**](BusinessAccessInviteApiInterface.md#respondBusinessAccessInvites) | **PATCH** /businesses/invites | Accept or decline an invite/request


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\BusinessAccessInviteApi:
        tags:
            - { name: "open_api_server.api", api: "businessAccessInvite" }
    # ...
```

## **assetAccessRequestsCreate**
> OpenAPI\Server\Model\CreateAssetAccessRequestResponse assetAccessRequestsCreate($businessId, $createAssetAccessRequestBody)

Create a request to access an existing partner's assets.

Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessInviteApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessInviteApiInterface;

class BusinessAccessInviteApi implements BusinessAccessInviteApiInterface
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
     * Implementation of BusinessAccessInviteApiInterface#assetAccessRequestsCreate
     */
    public function assetAccessRequestsCreate(string $businessId, CreateAssetAccessRequestBody $createAssetAccessRequestBody, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string**| Unique identifier of the requesting business. |
 **createAssetAccessRequestBody** | [**OpenAPI\Server\Model\CreateAssetAccessRequestBody**](../Model/CreateAssetAccessRequestBody.md)|  |

### Return type

[**OpenAPI\Server\Model\CreateAssetAccessRequestResponse**](../Model/CreateAssetAccessRequestResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **cancelInvitesOrRequests**
> OpenAPI\Server\Model\DeleteInvitesResultsResponseArray cancelInvitesOrRequests($businessId, $cancelInvitesBody)

Cancel invites/requests

Cancel membership/partnership invites and/or requests.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessInviteApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessInviteApiInterface;

class BusinessAccessInviteApi implements BusinessAccessInviteApiInterface
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
     * Implementation of BusinessAccessInviteApiInterface#cancelInvitesOrRequests
     */
    public function cancelInvitesOrRequests(string $businessId, CancelInvitesBody $cancelInvitesBody, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string**| Business id |
 **cancelInvitesBody** | [**OpenAPI\Server\Model\CancelInvitesBody**](../Model/CancelInvitesBody.md)| A list with invite ids |

### Return type

[**OpenAPI\Server\Model\DeleteInvitesResultsResponseArray**](../Model/DeleteInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createAssetInvites**
> OpenAPI\Server\Model\UpdateInvitesResultsResponseArray createAssetInvites($businessId, $createAssetInvitesRequest)

Update invite/request with an asset permission

Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessInviteApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessInviteApiInterface;

class BusinessAccessInviteApi implements BusinessAccessInviteApiInterface
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
     * Implementation of BusinessAccessInviteApiInterface#createAssetInvites
     */
    public function createAssetInvites(string $businessId, CreateAssetInvitesRequest $createAssetInvitesRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string**| Unique identifier of the requesting business. |
 **createAssetInvitesRequest** | [**OpenAPI\Server\Model\CreateAssetInvitesRequest**](../Model/CreateAssetInvitesRequest.md)| A list of invites/requests together with the asset permissions to be assigned to the invite/request. |

### Return type

[**OpenAPI\Server\Model\UpdateInvitesResultsResponseArray**](../Model/UpdateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createMembershipOrPartnershipInvites**
> OpenAPI\Server\Model\CreateInvitesResultsResponseArray createMembershipOrPartnershipInvites($businessId, $createMembershipOrPartnershipInvitesBody)

Create invites or requests

Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessInviteApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessInviteApiInterface;

class BusinessAccessInviteApi implements BusinessAccessInviteApiInterface
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
     * Implementation of BusinessAccessInviteApiInterface#createMembershipOrPartnershipInvites
     */
    public function createMembershipOrPartnershipInvites(string $businessId, CreateMembershipOrPartnershipInvitesBody $createMembershipOrPartnershipInvitesBody, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string**| Business id |
 **createMembershipOrPartnershipInvitesBody** | [**OpenAPI\Server\Model\CreateMembershipOrPartnershipInvitesBody**](../Model/CreateMembershipOrPartnershipInvitesBody.md)| An object with the properties: invite_type, partners, members, business_role |

### Return type

[**OpenAPI\Server\Model\CreateInvitesResultsResponseArray**](../Model/CreateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getInvites**
> OpenAPI\Server\Model\GetInvites200Response getInvites($businessId, $isMember, $inviteStatus, $inviteType, $bookmark, $pageSize)

Get invites/requests

Get the membership/partnership invites and/or requests for the authorized user.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessInviteApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessInviteApiInterface;

class BusinessAccessInviteApi implements BusinessAccessInviteApiInterface
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
     * Implementation of BusinessAccessInviteApiInterface#getInvites
     */
    public function getInvites(string $businessId, bool $isMember, ?array $inviteStatus, ?InviteType $inviteType, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string**| Unique identifier of the requesting business. |
 **isMember** | **bool**| A boolean field to indicate whether the invite is to create a partnership or a membership. | [optional] [default to true]
 **inviteStatus** | [**string**](../Model/string.md)| A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [optional]
 **inviteType** | [**OpenAPI\Server\Model\InviteType**](../Model/.md)| Invite type to filter invites by. Only invites of the specified type will be returned. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\GetInvites200Response**](../Model/GetInvites200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **respondBusinessAccessInvites**
> OpenAPI\Server\Model\RespondToInvitesResponseArray respondBusinessAccessInvites($authRespondInvitesBody)

Accept or decline an invite/request

Accept or decline invites or requests.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessInviteApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessInviteApiInterface;

class BusinessAccessInviteApi implements BusinessAccessInviteApiInterface
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
     * Implementation of BusinessAccessInviteApiInterface#respondBusinessAccessInvites
     */
    public function respondBusinessAccessInvites(AuthRespondInvitesBody $authRespondInvitesBody, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authRespondInvitesBody** | [**OpenAPI\Server\Model\AuthRespondInvitesBody**](../Model/AuthRespondInvitesBody.md)|  |

### Return type

[**OpenAPI\Server\Model\RespondToInvitesResponseArray**](../Model/RespondToInvitesResponseArray.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

