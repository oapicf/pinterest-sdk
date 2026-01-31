# PinterestSdkClient::EventQualityScore

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ingestion_source** | [**IngestionSourceOptions**](IngestionSourceOptions.md) |  |  |
| **lookback_period** | [**LookbackPeriodOptions**](LookbackPeriodOptions.md) |  |  |
| **overall_status** | [**OverallStatusOptions**](OverallStatusOptions.md) |  |  |
| **quality_components** | [**QualityComponents**](QualityComponents.md) |  |  |
| **source_platform** | [**SourcePlatformOptions**](SourcePlatformOptions.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::EventQualityScore.new(
  ingestion_source: null,
  lookback_period: null,
  overall_status: null,
  quality_components: null,
  source_platform: null
)
```

