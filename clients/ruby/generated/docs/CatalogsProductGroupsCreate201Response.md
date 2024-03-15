# PinterestSdkClient::CatalogsProductGroupsCreate201Response

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsProductGroupsCreate201Response.openapi_one_of
# =>
# [
#   :'CatalogsProductGroup',
#   :'CatalogsVerticalProductGroup'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsProductGroupsCreate201Response.build(data)
# => #<CatalogsProductGroup:0x00007fdd4aab02a0>

PinterestSdkClient::CatalogsProductGroupsCreate201Response.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `CatalogsProductGroup`
- `CatalogsVerticalProductGroup`
- `nil` (if no type matches)

