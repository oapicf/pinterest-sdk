# PinterestSdkClient::AudienceDemographics

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ages** | [**Array&lt;AudienceDemographicValue&gt;**](AudienceDemographicValue.md) | Ages distribution. | [optional] |
| **genders** | [**Array&lt;AudienceDemographicValue&gt;**](AudienceDemographicValue.md) | Gender distribution. | [optional] |
| **devices** | [**Array&lt;AudienceDemographicValue&gt;**](AudienceDemographicValue.md) | Device usage distribution. | [optional] |
| **metros** | [**Array&lt;AudienceDemographicValue&gt;**](AudienceDemographicValue.md) | Geographic metro area distribution. | [optional] |
| **countries** | [**Array&lt;AudienceDemographicValue&gt;**](AudienceDemographicValue.md) | Country area distribution. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AudienceDemographics.new(
  ages: null,
  genders: null,
  devices: null,
  metros: null,
  countries: null
)
```

