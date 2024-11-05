# PinterestSdkClient::CatalogsHotelReportParametersReport

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsHotelReportParametersReport.openapi_one_of
# =>
# [
#   :'CatalogsReportDistributionIssueFilter',
#   :'CatalogsReportFeedIngestionFilter'
# ]
```

### `openapi_discriminator_name`

Returns the discriminator's property name.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsHotelReportParametersReport.openapi_discriminator_name
# => :'report_type'
```

### `openapi_discriminator_name`

Returns the discriminator's mapping.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsHotelReportParametersReport.openapi_discriminator_mapping
# =>
# {
#   :'DISTRIBUTION_ISSUES' => :'CatalogsReportDistributionIssueFilter',
#   :'FEED_INGESTION_ISSUES' => :'CatalogsReportFeedIngestionFilter'
# }
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'pinterest_sdk'

PinterestSdkClient::CatalogsHotelReportParametersReport.build(data)
# => #<CatalogsReportDistributionIssueFilter:0x00007fdd4aab02a0>

PinterestSdkClient::CatalogsHotelReportParametersReport.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `CatalogsReportDistributionIssueFilter`
- `CatalogsReportFeedIngestionFilter`
- `nil` (if no type matches)

