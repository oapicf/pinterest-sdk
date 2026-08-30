# PinterestSdkClient::TargetingSpecOperations

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::TargetingSpecOperations.openapi_one_of
# =>
# [
#   :'TargetingSpecOperationAgeBucket',
#   :'TargetingSpecOperationAppType',
#   :'TargetingSpecOperationAudienceExclude',
#   :'TargetingSpecOperationAudienceInclude',
#   :'TargetingSpecOperationGender',
#   :'TargetingSpecOperationGeo',
#   :'TargetingSpecOperationGeoExclude',
#   :'TargetingSpecOperationInterest',
#   :'TargetingSpecOperationLocale',
#   :'TargetingSpecOperationLocation',
#   :'TargetingSpecOperationLocationExclude',
#   :'TargetingSpecOperationMaximumAge',
#   :'TargetingSpecOperationMinimumAge',
#   :'TargetingSpecOperationShoppingRetargeting'
# ]
```

### `openapi_discriminator_name`

Returns the discriminator's property name.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::TargetingSpecOperations.openapi_discriminator_name
# => :'field'
```

### `openapi_discriminator_name`

Returns the discriminator's mapping.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::TargetingSpecOperations.openapi_discriminator_mapping
# =>
# {
#   :'AGE_BUCKET' => :'TargetingSpecOperationAgeBucket',
#   :'APPTYPE' => :'TargetingSpecOperationAppType',
#   :'AUDIENCE_EXCLUDE' => :'TargetingSpecOperationAudienceExclude',
#   :'AUDIENCE_INCLUDE' => :'TargetingSpecOperationAudienceInclude',
#   :'GENDER' => :'TargetingSpecOperationGender',
#   :'GEO' => :'TargetingSpecOperationGeo',
#   :'GEO_EXCLUDE' => :'TargetingSpecOperationGeoExclude',
#   :'INTEREST' => :'TargetingSpecOperationInterest',
#   :'LOCALE' => :'TargetingSpecOperationLocale',
#   :'LOCATION' => :'TargetingSpecOperationLocation',
#   :'LOCATION_EXCLUDE' => :'TargetingSpecOperationLocationExclude',
#   :'MAXIMUM_AGE' => :'TargetingSpecOperationMaximumAge',
#   :'MINIMUM_AGE' => :'TargetingSpecOperationMinimumAge',
#   :'SHOPPING_RETARGETING' => :'TargetingSpecOperationShoppingRetargeting'
# }
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::TargetingSpecOperations.build(data)
# => #<TargetingSpecOperationAgeBucket:0x00007fdd4aab02a0>

PinterestSdkClient::TargetingSpecOperations.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `TargetingSpecOperationAgeBucket`
- `TargetingSpecOperationAppType`
- `TargetingSpecOperationAudienceExclude`
- `TargetingSpecOperationAudienceInclude`
- `TargetingSpecOperationGender`
- `TargetingSpecOperationGeo`
- `TargetingSpecOperationGeoExclude`
- `TargetingSpecOperationInterest`
- `TargetingSpecOperationLocale`
- `TargetingSpecOperationLocation`
- `TargetingSpecOperationLocationExclude`
- `TargetingSpecOperationMaximumAge`
- `TargetingSpecOperationMinimumAge`
- `TargetingSpecOperationShoppingRetargeting`
- `nil` (if no type matches)

