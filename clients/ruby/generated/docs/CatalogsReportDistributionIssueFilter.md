# PinterestSdkClient::CatalogsReportDistributionIssueFilter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **report_type** | **String** |  |  |
| **catalog_id** | **String** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsReportDistributionIssueFilter.new(
  report_type: null,
  catalog_id: null
)
```

