# PinterestSdkClient::CatalogsHotelGuestRatings

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **score** | **Float** | Your hotel&#39;s rating. | [optional] |
| **number_of_reviewers** | **Integer** | Total number of people who have rated this hotel. | [optional] |
| **max_score** | **Float** | Max value for the hotel rating score. | [optional] |
| **rating_system** | **String** | System you use for guest reviews. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelGuestRatings.new(
  score: null,
  number_of_reviewers: null,
  max_score: null,
  rating_system: null
)
```

