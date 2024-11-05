# PinterestSdkClient::CatalogsReportStats

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsReportStats.openapi_one_of
# =>
# [
#   :'CatalogsReportDistributionStats',
#   :'CatalogsReportFeedIngestionStats'
# ]
```

### `openapi_discriminator_name`

Returns the discriminator's property name.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsReportStats.openapi_discriminator_name
# => :'report_type'
```

### `openapi_discriminator_name`

Returns the discriminator's mapping.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsReportStats.openapi_discriminator_mapping
# =>
# {
#   :'DISTRIBUTION_ISSUES' => :'CatalogsReportDistributionStats',
#   :'FEED_INGESTION_ISSUES' => :'CatalogsReportFeedIngestionStats'
# }
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsReportStats.build(data)
# => #<CatalogsReportDistributionStats:0x00007fdd4aab02a0>

PinterestSdkClient::CatalogsReportStats.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `CatalogsReportDistributionStats`
- `CatalogsReportFeedIngestionStats`
- `nil` (if no type matches)

