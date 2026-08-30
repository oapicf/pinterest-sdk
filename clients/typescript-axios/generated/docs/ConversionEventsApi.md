# ConversionEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**eventsCreate**](#eventscreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions|

# **eventsCreate**
> ConversionEvents eventsCreate(conversionEventsCreate)

The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their `ad_account_id`. The request body should be a JSON object. - This endpoint requires an `access_token` be generated through Ads Manager. Review the [Conversions Guide](/docs/api-features/conversion-overview/) for more details. (Note that the authorization header required is `Authorization: Bearer <access_token>`). - The token\'s `user_account` must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)

### Example

```typescript
import {
    ConversionEventsApi,
    Configuration,
    ConversionEventsCreate
} from './api';

const configuration = new Configuration();
const apiInstance = new ConversionEventsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let conversionEventsCreate: ConversionEventsCreate; //
let test: boolean; //Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. (optional) (default to undefined)

const { status, data } = await apiInstance.eventsCreate(
    adAccountId,
    conversionEventsCreate,
    test
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **conversionEventsCreate** | **ConversionEventsCreate**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **test** | [**boolean**] | Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. | (optional) defaults to undefined|


### Return type

**ConversionEvents**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [conversion_token](../README.md#conversion_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**422** | The request was well-formed but was unable to be followed due to semantic errors. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**503** | The server is currently unable to handle the request due to a temporary overload or scheduled maintenance. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

