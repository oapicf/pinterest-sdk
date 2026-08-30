# WWW::OpenAPIClient::LabelsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::LabelsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**labels_apply**](LabelsApi.md#labels_apply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
[**labels_create**](LabelsApi.md#labels_create) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**labels_list**](LabelsApi.md#labels_list) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**labels_remove**](LabelsApi.md#labels_remove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
[**labels_update**](LabelsApi.md#labels_update) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels


# **labels_apply**
> LabeledEntities labels_apply(ad_account_id => $ad_account_id, label_id => $label_id, labeled_entities_create => $labeled_entities_create)

Apply label to entity

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LabelsApi;
my $api_instance = WWW::OpenAPIClient::LabelsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | 
my $label_id = "label_id_example"; # string | Label ID.
my $labeled_entities_create = WWW::OpenAPIClient::Object::LabeledEntitiesCreate->new(); # LabeledEntitiesCreate | 

eval {
    my $result = $api_instance->labels_apply(ad_account_id => $ad_account_id, label_id => $label_id, labeled_entities_create => $labeled_entities_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LabelsApi->labels_apply: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**|  | 
 **label_id** | **string**| Label ID. | 
 **labeled_entities_create** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md)|  | 

### Return type

[**LabeledEntities**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels_create**
> LabelsResponse labels_create(ad_account_id => $ad_account_id, label_create_request => $label_create_request)

Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LabelsApi;
my $api_instance = WWW::OpenAPIClient::LabelsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $label_create_request = WWW::OpenAPIClient::Object::LabelCreateRequest->new(); # LabelCreateRequest | 

eval {
    my $result = $api_instance->labels_create(ad_account_id => $ad_account_id, label_create_request => $label_create_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LabelsApi->labels_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **label_create_request** | [**LabelCreateRequest**](LabelCreateRequest.md)|  | 

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels_list**
> LabelsList200Response labels_list(ad_account_id => $ad_account_id, campaign_ids => $campaign_ids, label_ids => $label_ids, entity_statuses => $entity_statuses, label_types => $label_types, bookmark => $bookmark, page_size => $page_size)

List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LabelsApi;
my $api_instance = WWW::OpenAPIClient::LabelsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $campaign_ids = [("null")]; # ARRAY[string] | List of Campaign Ids to use to filter the results.
my $label_ids = [("null")]; # ARRAY[string] | List of Label Ids to use to filter the results.
my $entity_statuses = [(new WWW::OpenAPIClient.QueryLabelEntityStatusesItems())]; # ARRAY[QueryLabelEntityStatusesItems] | Label entity status
my $label_types = [(new WWW::OpenAPIClient.QueryLabelTypesItems())]; # ARRAY[QueryLabelTypesItems] | Label type.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

eval {
    my $result = $api_instance->labels_list(ad_account_id => $ad_account_id, campaign_ids => $campaign_ids, label_ids => $label_ids, entity_statuses => $entity_statuses, label_types => $label_types, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LabelsApi->labels_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **campaign_ids** | [**ARRAY[string]**](string.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **label_ids** | [**ARRAY[string]**](string.md)| List of Label Ids to use to filter the results. | [optional] 
 **entity_statuses** | [**ARRAY[QueryLabelEntityStatusesItems]**](QueryLabelEntityStatusesItems.md)| Label entity status | [optional] 
 **label_types** | [**ARRAY[QueryLabelTypesItems]**](QueryLabelTypesItems.md)| Label type. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**LabelsList200Response**](LabelsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels_remove**
> LabeledEntities labels_remove(ad_account_id => $ad_account_id, label_id => $label_id, labeled_entities_create => $labeled_entities_create)

Remove label from entities

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LabelsApi;
my $api_instance = WWW::OpenAPIClient::LabelsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | 
my $label_id = "label_id_example"; # string | Label ID.
my $labeled_entities_create = WWW::OpenAPIClient::Object::LabeledEntitiesCreate->new(); # LabeledEntitiesCreate | 

eval {
    my $result = $api_instance->labels_remove(ad_account_id => $ad_account_id, label_id => $label_id, labeled_entities_create => $labeled_entities_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LabelsApi->labels_remove: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**|  | 
 **label_id** | **string**| Label ID. | 
 **labeled_entities_create** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md)|  | 

### Return type

[**LabeledEntities**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels_update**
> LabelsResponse labels_update(ad_account_id => $ad_account_id, label_update_request => $label_update_request)

Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LabelsApi;
my $api_instance = WWW::OpenAPIClient::LabelsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $label_update_request = WWW::OpenAPIClient::Object::LabelUpdateRequest->new(); # LabelUpdateRequest | 

eval {
    my $result = $api_instance->labels_update(ad_account_id => $ad_account_id, label_update_request => $label_update_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LabelsApi->labels_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **label_update_request** | [**LabelUpdateRequest**](LabelUpdateRequest.md)|  | 

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

