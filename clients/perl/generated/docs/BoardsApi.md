# WWW::OpenAPIClient::BoardsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::BoardsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**board_sections_create**](BoardsApi.md#board_sections_create) | **POST** /boards/{board_id}/sections | Create board section
[**board_sections_delete**](BoardsApi.md#board_sections_delete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
[**board_sections_list**](BoardsApi.md#board_sections_list) | **GET** /boards/{board_id}/sections | List board sections
[**board_sections_list_pins**](BoardsApi.md#board_sections_list_pins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**board_sections_update**](BoardsApi.md#board_sections_update) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
[**boards_create**](BoardsApi.md#boards_create) | **POST** /boards | Create board
[**boards_delete**](BoardsApi.md#boards_delete) | **DELETE** /boards/{board_id} | Delete board
[**boards_get**](BoardsApi.md#boards_get) | **GET** /boards/{board_id} | Get board
[**boards_list**](BoardsApi.md#boards_list) | **GET** /boards | List boards
[**boards_list_pins**](BoardsApi.md#boards_list_pins) | **GET** /boards/{board_id}/pins | List Pins on board
[**boards_update**](BoardsApi.md#boards_update) | **PATCH** /boards/{board_id} | Update board


# **board_sections_create**
> BoardSection board_sections_create(board_id => $board_id, board_section => $board_section)

Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BoardsApi;
my $api_instance = WWW::OpenAPIClient::BoardsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $board_id = "board_id_example"; # string | Unique identifier of a board.
my $board_section = WWW::OpenAPIClient::Object::BoardSection->new(); # BoardSection | Create a board section.

eval {
    my $result = $api_instance->board_sections_create(board_id => $board_id, board_section => $board_section);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BoardsApi->board_sections_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **string**| Unique identifier of a board. | 
 **board_section** | [**BoardSection**](BoardSection.md)| Create a board section. | 

### Return type

[**BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **board_sections_delete**
> board_sections_delete(board_id => $board_id, section_id => $section_id)

Delete board section

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BoardsApi;
my $api_instance = WWW::OpenAPIClient::BoardsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $board_id = "board_id_example"; # string | Unique identifier of a board.
my $section_id = "section_id_example"; # string | Unique identifier of a board section.

eval {
    $api_instance->board_sections_delete(board_id => $board_id, section_id => $section_id);
};
if ($@) {
    warn "Exception when calling BoardsApi->board_sections_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **string**| Unique identifier of a board. | 
 **section_id** | **string**| Unique identifier of a board section. | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **board_sections_list**
> Paginated board_sections_list(board_id => $board_id, bookmark => $bookmark, page_size => $page_size)

List board sections

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BoardsApi;
my $api_instance = WWW::OpenAPIClient::BoardsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $board_id = "board_id_example"; # string | Unique identifier of a board.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.

eval {
    my $result = $api_instance->board_sections_list(board_id => $board_id, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BoardsApi->board_sections_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **string**| Unique identifier of a board. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **board_sections_list_pins**
> Paginated board_sections_list_pins(board_id => $board_id, section_id => $section_id, bookmark => $bookmark, page_size => $page_size)

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BoardsApi;
my $api_instance = WWW::OpenAPIClient::BoardsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $board_id = "board_id_example"; # string | Unique identifier of a board.
my $section_id = "section_id_example"; # string | Unique identifier of a board section.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.

eval {
    my $result = $api_instance->board_sections_list_pins(board_id => $board_id, section_id => $section_id, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BoardsApi->board_sections_list_pins: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **string**| Unique identifier of a board. | 
 **section_id** | **string**| Unique identifier of a board section. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **board_sections_update**
> BoardSection board_sections_update(board_id => $board_id, section_id => $section_id, board_section => $board_section)

Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BoardsApi;
my $api_instance = WWW::OpenAPIClient::BoardsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $board_id = "board_id_example"; # string | Unique identifier of a board.
my $section_id = "section_id_example"; # string | Unique identifier of a board section.
my $board_section = WWW::OpenAPIClient::Object::BoardSection->new(); # BoardSection | Update a board section.

eval {
    my $result = $api_instance->board_sections_update(board_id => $board_id, section_id => $section_id, board_section => $board_section);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BoardsApi->board_sections_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **string**| Unique identifier of a board. | 
 **section_id** | **string**| Unique identifier of a board section. | 
 **board_section** | [**BoardSection**](BoardSection.md)| Update a board section. | 

### Return type

[**BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boards_create**
> Board boards_create(board => $board)

Create board

Create a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BoardsApi;
my $api_instance = WWW::OpenAPIClient::BoardsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $board = WWW::OpenAPIClient::Object::Board->new(); # Board | Create a board using a single board json object.

eval {
    my $result = $api_instance->boards_create(board => $board);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BoardsApi->boards_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board** | [**Board**](Board.md)| Create a board using a single board json object. | 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boards_delete**
> boards_delete(board_id => $board_id)

Delete board

Delete a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BoardsApi;
my $api_instance = WWW::OpenAPIClient::BoardsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $board_id = "board_id_example"; # string | Unique identifier of a board.

eval {
    $api_instance->boards_delete(board_id => $board_id);
};
if ($@) {
    warn "Exception when calling BoardsApi->boards_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **string**| Unique identifier of a board. | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boards_get**
> Board boards_get(board_id => $board_id)

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BoardsApi;
my $api_instance = WWW::OpenAPIClient::BoardsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $board_id = "board_id_example"; # string | Unique identifier of a board.

eval {
    my $result = $api_instance->boards_get(board_id => $board_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BoardsApi->boards_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **string**| Unique identifier of a board. | 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boards_list**
> Paginated boards_list(bookmark => $bookmark, page_size => $page_size, privacy => $privacy)

List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BoardsApi;
my $api_instance = WWW::OpenAPIClient::BoardsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
my $privacy = "privacy_example"; # string | Privacy setting for a board.

eval {
    my $result = $api_instance->boards_list(bookmark => $bookmark, page_size => $page_size, privacy => $privacy);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BoardsApi->boards_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **privacy** | **string**| Privacy setting for a board. | [optional] 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boards_list_pins**
> Paginated boards_list_pins(board_id => $board_id, bookmark => $bookmark, page_size => $page_size)

List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BoardsApi;
my $api_instance = WWW::OpenAPIClient::BoardsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $board_id = "board_id_example"; # string | Unique identifier of a board.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.

eval {
    my $result = $api_instance->boards_list_pins(board_id => $board_id, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BoardsApi->boards_list_pins: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **string**| Unique identifier of a board. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boards_update**
> Board boards_update(board_id => $board_id, board_update => $board_update)

Update board

Update a board owned by the \"operating user_account\".

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BoardsApi;
my $api_instance = WWW::OpenAPIClient::BoardsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $board_id = "board_id_example"; # string | Unique identifier of a board.
my $board_update = WWW::OpenAPIClient::Object::BoardUpdate->new(); # BoardUpdate | Update a board.

eval {
    my $result = $api_instance->boards_update(board_id => $board_id, board_update => $board_update);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BoardsApi->boards_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **string**| Unique identifier of a board. | 
 **board_update** | [**BoardUpdate**](BoardUpdate.md)| Update a board. | 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

