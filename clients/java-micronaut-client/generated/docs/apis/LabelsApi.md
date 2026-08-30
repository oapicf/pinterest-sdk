# LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**labelsApply**](LabelsApi.md#labelsApply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity |
| [**labelsCreate**](LabelsApi.md#labelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels |
| [**labelsList**](LabelsApi.md#labelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels |
| [**labelsRemove**](LabelsApi.md#labelsRemove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities |
| [**labelsUpdate**](LabelsApi.md#labelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels |


## Creating LabelsApi

To initiate an instance of `LabelsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.LabelsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(LabelsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    LabelsApi labelsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="labelsApply"></a>
# **labelsApply**
```java
Mono<LabeledEntities> LabelsApi.labelsApply(adAccountIdlabelIdlabeledEntitiesCreate)
```

Apply label to entity

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`|  | |
| **labelId** | `String`| Label ID. | |
| **labeledEntitiesCreate** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md)|  | |


### Return type
[**LabeledEntities**](LabeledEntities.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="labelsCreate"></a>
# **labelsCreate**
```java
Mono<LabelsResponse> LabelsApi.labelsCreate(adAccountIdlabelCreateRequest)
```

Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **labelCreateRequest** | [**LabelCreateRequest**](LabelCreateRequest.md)|  | |


### Return type
[**LabelsResponse**](LabelsResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="labelsList"></a>
# **labelsList**
```java
Mono<LabelsList200Response> LabelsApi.labelsList(adAccountIdcampaignIdslabelIdsentityStatuseslabelTypesbookmarkpageSize)
```

List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **campaignIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)@Size(max &#x3D; 18)String&gt;**](String.md)| List of Campaign Ids to use to filter the results. | [optional parameter] |
| **labelIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)@Size(max &#x3D; 18)String&gt;**](String.md)| List of Label Ids to use to filter the results. | [optional parameter] |
| **entityStatuses** | [**List&lt;QueryLabelEntityStatusesItems&gt;**](QueryLabelEntityStatusesItems.md)| Label entity status | [optional parameter] [default to `ACTIVE`] |
| **labelTypes** | [**List&lt;QueryLabelTypesItems&gt;**](QueryLabelTypesItems.md)| Label type. | [optional parameter] [default to `BRAND,CUSTOM`] |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`] |


### Return type
[**LabelsList200Response**](LabelsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="labelsRemove"></a>
# **labelsRemove**
```java
Mono<LabeledEntities> LabelsApi.labelsRemove(adAccountIdlabelIdlabeledEntitiesCreate)
```

Remove label from entities

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`|  | |
| **labelId** | `String`| Label ID. | |
| **labeledEntitiesCreate** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md)|  | |


### Return type
[**LabeledEntities**](LabeledEntities.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="labelsUpdate"></a>
# **labelsUpdate**
```java
Mono<LabelsResponse> LabelsApi.labelsUpdate(adAccountIdlabelUpdateRequest)
```

Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **labelUpdateRequest** | [**LabelUpdateRequest**](LabelUpdateRequest.md)|  | |


### Return type
[**LabelsResponse**](LabelsResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

