# OpenAPI\Server\Api\CatalogReportsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportsCreate**](CatalogReportsApiInterface.md#reportsCreate) | **POST** /catalogs/reports | Build catalogs report
[**reportsGet**](CatalogReportsApiInterface.md#reportsGet) | **GET** /catalogs/reports | Get catalogs report
[**reportsStats**](CatalogReportsApiInterface.md#reportsStats) | **GET** /catalogs/reports/stats | List report stats


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\CatalogReportsApi:
        tags:
            - { name: "open_api_server.api", api: "catalogReports" }
    # ...
```

## **reportsCreate**
> OpenAPI\Server\Model\CatalogsCreateReportResponse reportsCreate($catalogsReportParameters, $adAccountId)

Build catalogs report

Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogReportsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogReportsApiInterface;

class CatalogReportsApi implements CatalogReportsApiInterface
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
     * Implementation of CatalogReportsApiInterface#reportsCreate
     */
    public function reportsCreate(CatalogsReportParameters $catalogsReportParameters, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsReportParameters** | [**OpenAPI\Server\Model\CatalogsReportParameters**](../Model/CatalogsReportParameters.md)|  |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsCreateReportResponse**](../Model/CatalogsCreateReportResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **reportsGet**
> OpenAPI\Server\Model\CatalogsReport reportsGet($token, $adAccountId)

Get catalogs report

This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogReportsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogReportsApiInterface;

class CatalogReportsApi implements CatalogReportsApiInterface
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
     * Implementation of CatalogReportsApiInterface#reportsGet
     */
    public function reportsGet(string $token, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Token returned from the post request creation call |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsReport**](../Model/CatalogsReport.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **reportsStats**
> OpenAPI\Server\Model\ReportsStats200Response reportsStats($parameters, $adAccountId, $bookmark, $pageSize)

List report stats

List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogReportsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogReportsApiInterface;

class CatalogReportsApi implements CatalogReportsApiInterface
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
     * Implementation of CatalogReportsApiInterface#reportsStats
     */
    public function reportsStats(CatalogsReportStatsParameters $parameters, ?string $adAccountId, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parameters** | [**OpenAPI\Server\Model\CatalogsReportStatsParameters**](../Model/.md)| Contains the parameters for report identification. |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\ReportsStats200Response**](../Model/ReportsStats200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

