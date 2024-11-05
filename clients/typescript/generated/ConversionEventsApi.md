# .ConversionEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventsCreate**](ConversionEventsApi.md#eventsCreate) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions


# **eventsCreate**
> ConversionApiResponse eventsCreate(conversionEvents)

The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/api-features/conversion-overview/\">Conversions Guide</a> for more details. (Note that the authorization header required is <code>Authorization: Bearer &lt;access_token&gt;</code>). - The token\'s <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)

### Example


```typescript
import { createConfiguration, ConversionEventsApi } from '';
import type { ConversionEventsApiEventsCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConversionEventsApi(configuration);

const request: ConversionEventsApiEventsCreateRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Conversion events.
  conversionEvents: {
    data: [
      {
        eventName: "checkout",
        actionSource: "app_ios",
        eventTime: 1451431341,
        eventId: "eventId0001",
        eventSourceUrl: "https://www.my-clothing-shop.org/",
        optOut: false,
        partnerName: "ss-partnername",
        userData: ,
        customData: {
          currency: "USD",
          value: "72.39",
          contentIds: ["red-pinterest-shirt-logo-1","purple-pinterest-shirt-logo-3"],
          contentName: "pinterest-themed-clothing",
          contentCategory: "shirts",
          contentBrand: "pinterest-brand",
          contents: [
            {
              id: "red-pinterest-shirt-logo-1",
              itemPrice: "1325.12",
              quantity: 5,
              itemName: "pinterest-clothing-shirt",
              itemCategory: "pinterest-entertainment",
              itemBrand: "pinterest",
            },
          ],
          numItems: 2,
          orderId: "my_order_id",
          searchString: "sample string",
          optOutType: "LDP",
          np: "ss-company",
        },
        appId: "429047995",
        appName: "Pinterest",
        appVersion: "7.9",
        deviceBrand: "Apple",
        deviceCarrier: "T-Mobile",
        deviceModel: "iPhone X",
        deviceType: "iPhone",
        osVersion: "12.1.4",
        wifi: false,
        language: "en",
      },
    ],
  },
    // Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. (optional)
  test: true,
};

const data = await apiInstance.eventsCreate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversionEvents** | **ConversionEvents**| Conversion events. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **test** | [**boolean**] | Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. | (optional) defaults to undefined


### Return type

**ConversionApiResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [conversion_token](README.md#conversion_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | The request was invalid. |  -  |
**401** | Not authorized to send conversion events |  -  |
**403** | Unauthorized access. |  -  |
**422** | Not all events were successfully processed. |  -  |
**429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window. |  -  |
**503** | The endpoint has been ramped down and is currently not accepting any traffic. |  -  |
**0** | Unexpected errors |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


