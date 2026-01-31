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
        actionSource: "app_ios",
        appId: "429047995",
        appInfo: {
          appId: "429047995",
          appName: "MyAwesomeApp",
          appPackageName: "com.company.myawesomeapp",
          appStore: "Google Play Store",
          appVersion: "7.9",
          installTime: 1739222269,
          userAgent: "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36",
          windowHeight: 900,
          windowWidth: 1678,
        },
        appName: "Pinterest",
        appVersion: "7.9",
        customData: {
          contentBrand: "pinterest-brand",
          contentCategory: "shirts",
          contentIds: ["product-id-001","product-id-002"],
          contentName: "pinterest-themed-clothing",
          contents: [
            {
              id: "id_example",
              itemBrand: "itemBrand_example",
              itemCategory: "itemCategory_example",
              itemName: "itemName_example",
              itemPrice: "itemPrice_example",
              quantity: 1,
            },
          ],
          currency: "USD",
          externalMeasurementId: "rbos-cb7a9e56-4988-4ca0-801b-05c79b29785f",
          externalMeasurementVendorId: 1,
          np: "ss-company",
          numItems: 5,
          optOutType: "LDP",
          orderId: "my_order_id",
          predictedLtv: "2794.82",
          searchString: "sample string",
          value: "72.39",
        },
        deviceBrand: "Apple",
        deviceCarrier: "T-Mobile",
        deviceInfo: {
          batteryLevel: 78,
          brand: "Apple, Samsung, Motorola",
          carrier: "T-Mobile",
          cpuCores: 8,
          externalStorageFreeSpace: 126,
          externalStorageSize: 512,
          formFactor: "cellphone",
          kernelVersion: "6.15",
          languages: ["en","de","lt"],
          locale: "en-us",
          model: "16 Pro, Galaxy S25 Ultra",
          networkType: "wifi",
          osFamily: "ios",
          osName: "10",
          osReleaseName: "18.3",
          osVersion: "18.3",
          screenDensity: 460,
          screenHeight: 2868,
          screenWidth: 1320,
          storageFreeSpace: 184,
          storageSize: 256,
          timezone: "USA/New York",
          timezoneAbbr: "PDT",
          type: "iPhone, Android",
        },
        deviceModel: "iPhone X",
        deviceType: "iPhone",
        eventId: "eventId0001",
        eventName: "checkout",
        eventSourceUrl: "https://www.my-clothing-shop.org/",
        eventTime: 1451431341,
        language: "en",
        optOut: false,
        osVersion: "12.1.4",
        partnerName: "ss-partnername",
        userData: ,
        wifi: false,
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


