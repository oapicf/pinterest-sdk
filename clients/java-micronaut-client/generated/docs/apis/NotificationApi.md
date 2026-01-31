# NotificationApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notificationPost**](NotificationApi.md#notificationPost) | **POST** /notifications | Receive notifications from external partners. |


## Creating NotificationApi

To initiate an instance of `NotificationApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.NotificationApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(NotificationApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    NotificationApi notificationApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="notificationPost"></a>
# **notificationPost**
```java
Mono<NotificationResponse> NotificationApi.notificationPost(notificationPostRequest)
```

Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests&#39; systems. This API is gated and you need to request access to this feature.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationPostRequest** | [**NotificationPostRequest**](NotificationPostRequest.md)| notification event. | |


### Return type
[**NotificationResponse**](NotificationResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `user_accounts:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `user_accounts:read`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

