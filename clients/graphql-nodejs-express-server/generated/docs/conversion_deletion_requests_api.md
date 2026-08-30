# conversion_deletion_requests_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConversionDeletionRequestCreate**](conversion_deletion_requests_api.md#ConversionDeletionRequestCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
[**ConversionDeletionRequestDelete**](conversion_deletion_requests_api.md#ConversionDeletionRequestDelete) | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
[**ConversionDeletionRequestGet**](conversion_deletion_requests_api.md#ConversionDeletionRequestGet) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
[**ConversionDeletionRequestList**](conversion_deletion_requests_api.md#ConversionDeletionRequestList) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests


<a name="ConversionDeletionRequestCreate"></a>
# **ConversionDeletionRequestCreate**
> ConversionDeletionRequest ConversionDeletionRequestCreate(adAccountId, conversionDeletionRequestCreate)

Create a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified &#x60;ad_account_id&#x60;. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.
<a name="ConversionDeletionRequestDelete"></a>
# **ConversionDeletionRequestDelete**
> ConversionDeletionRequest ConversionDeletionRequestDelete(requestId, adAccountId)

Delete a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;. This will cancel the request and prevent it from being processed. This can only be done if the request is in the &#x60;PENDING&#x60; status and before the 72 hours mark.
<a name="ConversionDeletionRequestGet"></a>
# **ConversionDeletionRequestGet**
> ConversionDeletionRequest ConversionDeletionRequestGet(requestId, adAccountId)

Get a single conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;.
<a name="ConversionDeletionRequestList"></a>
# **ConversionDeletionRequestList**
> ConversionDeletionRequestList200Response ConversionDeletionRequestList(adAccountId, bookmark, pageSize, order)

List conversion deletion requests

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified &#x60;ad_account_id&#x60;.
