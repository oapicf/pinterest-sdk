# OpenAPI\Server\Api\LeadsExportApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadsExportCreate**](LeadsExportApiInterface.md#leadsExportCreate) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
[**leadsExportGet**](LeadsExportApiInterface.md#leadsExportGet) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\LeadsExportApi:
        tags:
            - { name: "open_api_server.api", api: "leadsExport" }
    # ...
```

## **leadsExportCreate**
> OpenAPI\Server\Model\LeadsExportCreateResponse leadsExportCreate($adAccountId, $leadsExportCreateRequest)

Create a request to export leads collected from a lead ad

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LeadsExportApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LeadsExportApiInterface;

class LeadsExportApi implements LeadsExportApiInterface
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
     * Implementation of LeadsExportApiInterface#leadsExportCreate
     */
    public function leadsExportCreate(string $adAccountId, LeadsExportCreateRequest $leadsExportCreateRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. |
 **leadsExportCreateRequest** | [**OpenAPI\Server\Model\LeadsExportCreateRequest**](../Model/LeadsExportCreateRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\LeadsExportCreateResponse**](../Model/LeadsExportCreateResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **leadsExportGet**
> OpenAPI\Server\Model\LeadsExportResponseData leadsExportGet($adAccountId, $leadsExportId)

Get the lead export from the lead export create call

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LeadsExportApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LeadsExportApiInterface;

class LeadsExportApi implements LeadsExportApiInterface
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
     * Implementation of LeadsExportApiInterface#leadsExportGet
     */
    public function leadsExportGet(string $adAccountId, string $leadsExportId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. |
 **leadsExportId** | **string**| lead_export_id token returned from the create a lead export endpoint |

### Return type

[**OpenAPI\Server\Model\LeadsExportResponseData**](../Model/LeadsExportResponseData.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

