# PinterestSdkClient::CatalogsLocalStoresCreate200ResponseInnerData

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsLocalStoresCreate200ResponseInnerData.openapi_one_of
# =>
# [
#   :'CatalogsLocalStoresCreate200ResponseInnerDataOneOf',
#   :'LocalStore'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsLocalStoresCreate200ResponseInnerData.build(data)
# => #<CatalogsLocalStoresCreate200ResponseInnerDataOneOf:0x00007fdd4aab02a0>

PinterestSdkClient::CatalogsLocalStoresCreate200ResponseInnerData.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `CatalogsLocalStoresCreate200ResponseInnerDataOneOf`
- `LocalStore`
- `nil` (if no type matches)

