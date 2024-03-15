# PinterestSdkClient::BoardsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**board_sections_create**](BoardsApi.md#board_sections_create) | **POST** /boards/{board_id}/sections | Create board section |
| [**board_sections_delete**](BoardsApi.md#board_sections_delete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section |
| [**board_sections_list**](BoardsApi.md#board_sections_list) | **GET** /boards/{board_id}/sections | List board sections |
| [**board_sections_list_pins**](BoardsApi.md#board_sections_list_pins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section |
| [**board_sections_update**](BoardsApi.md#board_sections_update) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section |
| [**boards_create**](BoardsApi.md#boards_create) | **POST** /boards | Create board |
| [**boards_delete**](BoardsApi.md#boards_delete) | **DELETE** /boards/{board_id} | Delete board |
| [**boards_get**](BoardsApi.md#boards_get) | **GET** /boards/{board_id} | Get board |
| [**boards_list**](BoardsApi.md#boards_list) | **GET** /boards | List boards |
| [**boards_list_pins**](BoardsApi.md#boards_list_pins) | **GET** /boards/{board_id}/pins | List Pins on board |
| [**boards_update**](BoardsApi.md#boards_update) | **PATCH** /boards/{board_id} | Update board |


## board_sections_create

> <BoardSection> board_sections_create(board_id, board_section, opts)

Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BoardsApi.new
board_id = 'board_id_example' # String | Unique identifier of a board.
board_section = PinterestSdkClient::BoardSection.new({name: 'Salads'}) # BoardSection | Create a board section.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Create board section
  result = api_instance.board_sections_create(board_id, board_section, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->board_sections_create: #{e}"
end
```

#### Using the board_sections_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BoardSection>, Integer, Hash)> board_sections_create_with_http_info(board_id, board_section, opts)

```ruby
begin
  # Create board section
  data, status_code, headers = api_instance.board_sections_create_with_http_info(board_id, board_section, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BoardSection>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->board_sections_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **board_id** | **String** | Unique identifier of a board. |  |
| **board_section** | [**BoardSection**](BoardSection.md) | Create a board section. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## board_sections_delete

> board_sections_delete(board_id, section_id, opts)

Delete board section

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BoardsApi.new
board_id = 'board_id_example' # String | Unique identifier of a board.
section_id = 'section_id_example' # String | Unique identifier of a board section.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Delete board section
  api_instance.board_sections_delete(board_id, section_id, opts)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->board_sections_delete: #{e}"
end
```

#### Using the board_sections_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> board_sections_delete_with_http_info(board_id, section_id, opts)

```ruby
begin
  # Delete board section
  data, status_code, headers = api_instance.board_sections_delete_with_http_info(board_id, section_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->board_sections_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **board_id** | **String** | Unique identifier of a board. |  |
| **section_id** | **String** | Unique identifier of a board section. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## board_sections_list

> <BoardSectionsList200Response> board_sections_list(board_id, opts)

List board sections

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BoardsApi.new
board_id = 'board_id_example' # String | Unique identifier of a board.
opts = {
  ad_account_id: 'ad_account_id_example', # String | Unique identifier of an ad account.
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
}

begin
  # List board sections
  result = api_instance.board_sections_list(board_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->board_sections_list: #{e}"
end
```

#### Using the board_sections_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BoardSectionsList200Response>, Integer, Hash)> board_sections_list_with_http_info(board_id, opts)

```ruby
begin
  # List board sections
  data, status_code, headers = api_instance.board_sections_list_with_http_info(board_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BoardSectionsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->board_sections_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **board_id** | **String** | Unique identifier of a board. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |

### Return type

[**BoardSectionsList200Response**](BoardSectionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## board_sections_list_pins

> <BoardsListPins200Response> board_sections_list_pins(board_id, section_id, opts)

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BoardsApi.new
board_id = 'board_id_example' # String | Unique identifier of a board.
section_id = 'section_id_example' # String | Unique identifier of a board section.
opts = {
  ad_account_id: 'ad_account_id_example', # String | Unique identifier of an ad account.
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
}

begin
  # List Pins on board section
  result = api_instance.board_sections_list_pins(board_id, section_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->board_sections_list_pins: #{e}"
end
```

#### Using the board_sections_list_pins_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BoardsListPins200Response>, Integer, Hash)> board_sections_list_pins_with_http_info(board_id, section_id, opts)

```ruby
begin
  # List Pins on board section
  data, status_code, headers = api_instance.board_sections_list_pins_with_http_info(board_id, section_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BoardsListPins200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->board_sections_list_pins_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **board_id** | **String** | Unique identifier of a board. |  |
| **section_id** | **String** | Unique identifier of a board section. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |

### Return type

[**BoardsListPins200Response**](BoardsListPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## board_sections_update

> <BoardSection> board_sections_update(board_id, section_id, board_section, opts)

Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BoardsApi.new
board_id = 'board_id_example' # String | Unique identifier of a board.
section_id = 'section_id_example' # String | Unique identifier of a board section.
board_section = PinterestSdkClient::BoardSection.new({name: 'Salads'}) # BoardSection | Update a board section.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Update board section
  result = api_instance.board_sections_update(board_id, section_id, board_section, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->board_sections_update: #{e}"
end
```

#### Using the board_sections_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BoardSection>, Integer, Hash)> board_sections_update_with_http_info(board_id, section_id, board_section, opts)

```ruby
begin
  # Update board section
  data, status_code, headers = api_instance.board_sections_update_with_http_info(board_id, section_id, board_section, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BoardSection>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->board_sections_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **board_id** | **String** | Unique identifier of a board. |  |
| **section_id** | **String** | Unique identifier of a board section. |  |
| **board_section** | [**BoardSection**](BoardSection.md) | Update a board section. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## boards_create

> <Board> boards_create(board, opts)

Create board

Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BoardsApi.new
board = PinterestSdkClient::Board.new({name: 'Summer Recipes'}) # Board | Create a board using a single board json object.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Create board
  result = api_instance.boards_create(board, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->boards_create: #{e}"
end
```

#### Using the boards_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Board>, Integer, Hash)> boards_create_with_http_info(board, opts)

```ruby
begin
  # Create board
  data, status_code, headers = api_instance.boards_create_with_http_info(board, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Board>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->boards_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **board** | [**Board**](Board.md) | Create a board using a single board json object. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## boards_delete

> boards_delete(board_id, opts)

Delete board

Delete a board owned by the \"operation user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BoardsApi.new
board_id = 'board_id_example' # String | Unique identifier of a board.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Delete board
  api_instance.boards_delete(board_id, opts)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->boards_delete: #{e}"
end
```

#### Using the boards_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> boards_delete_with_http_info(board_id, opts)

```ruby
begin
  # Delete board
  data, status_code, headers = api_instance.boards_delete_with_http_info(board_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->boards_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **board_id** | **String** | Unique identifier of a board. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## boards_get

> <Board> boards_get(board_id, opts)

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BoardsApi.new
board_id = 'board_id_example' # String | Unique identifier of a board.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get board
  result = api_instance.boards_get(board_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->boards_get: #{e}"
end
```

#### Using the boards_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Board>, Integer, Hash)> boards_get_with_http_info(board_id, opts)

```ruby
begin
  # Get board
  data, status_code, headers = api_instance.boards_get_with_http_info(board_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Board>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->boards_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **board_id** | **String** | Unique identifier of a board. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## boards_list

> <BoardsList200Response> boards_list(opts)

List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BoardsApi.new
opts = {
  ad_account_id: 'ad_account_id_example', # String | Unique identifier of an ad account.
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  privacy: 'ALL' # String | Privacy setting for a board.
}

begin
  # List boards
  result = api_instance.boards_list(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->boards_list: #{e}"
end
```

#### Using the boards_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BoardsList200Response>, Integer, Hash)> boards_list_with_http_info(opts)

```ruby
begin
  # List boards
  data, status_code, headers = api_instance.boards_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BoardsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->boards_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **privacy** | **String** | Privacy setting for a board. | [optional] |

### Return type

[**BoardsList200Response**](BoardsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## boards_list_pins

> <BoardsListPins200Response> boards_list_pins(board_id, opts)

List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BoardsApi.new
board_id = 'board_id_example' # String | Unique identifier of a board.
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  creative_types: ['REGULAR'], # Array<String> | Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  ad_account_id: 'ad_account_id_example', # String | Unique identifier of an ad account.
  pin_metrics: true # Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
}

begin
  # List Pins on board
  result = api_instance.boards_list_pins(board_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->boards_list_pins: #{e}"
end
```

#### Using the boards_list_pins_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BoardsListPins200Response>, Integer, Hash)> boards_list_pins_with_http_info(board_id, opts)

```ruby
begin
  # List Pins on board
  data, status_code, headers = api_instance.boards_list_pins_with_http_info(board_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BoardsListPins200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->boards_list_pins_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **board_id** | **String** | Unique identifier of a board. |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **creative_types** | [**Array&lt;String&gt;**](String.md) | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |
| **pin_metrics** | **Boolean** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional][default to false] |

### Return type

[**BoardsListPins200Response**](BoardsListPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## boards_update

> <Board> boards_update(board_id, board_update, opts)

Update board

Update a board owned by the \"operating user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BoardsApi.new
board_id = 'board_id_example' # String | Unique identifier of a board.
board_update = PinterestSdkClient::BoardUpdate.new # BoardUpdate | Update a board.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Update board
  result = api_instance.boards_update(board_id, board_update, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->boards_update: #{e}"
end
```

#### Using the boards_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Board>, Integer, Hash)> boards_update_with_http_info(board_id, board_update, opts)

```ruby
begin
  # Update board
  data, status_code, headers = api_instance.boards_update_with_http_info(board_id, board_update, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Board>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BoardsApi->boards_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **board_id** | **String** | Unique identifier of a board. |  |
| **board_update** | [**BoardUpdate**](BoardUpdate.md) | Update a board. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

