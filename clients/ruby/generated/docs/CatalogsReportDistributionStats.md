# PinterestSdkClient::CatalogsReportDistributionStats

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **report_type** | **String** |  | [optional] |
| **catalog_id** | **String** | ID of the catalog entity. | [optional] |
| **code** | **Integer** | The event code that a diagnostics aggregated number references | [optional] |
| **code_label** | **String** | A human-friendly label for the event code (e.g, &#39;SPAM&#39;) | [optional] |
| **message** | **String** | Title message describing the diagnostic issue | [optional] |
| **occurrences** | **Integer** | Number of occurrences of the issue | [optional] |
| **ineligible_for_ads** | **Boolean** | Indicates if issue makes items ineligible for ads distribution | [optional] |
| **ineligible_for_organic** | **Boolean** | Indicates if issue makes items ineligible for organic distribution | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsReportDistributionStats.new(
  report_type: null,
  catalog_id: null,
  code: null,
  code_label: SPAM,
  message: null,
  occurrences: 10,
  ineligible_for_ads: true,
  ineligible_for_organic: true
)
```

