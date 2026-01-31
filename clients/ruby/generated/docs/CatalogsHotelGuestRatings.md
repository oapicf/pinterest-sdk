# PinterestSdkClient::CatalogsHotelGuestRatings

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **max_score** | **Float** | Max value for the hotel rating score. | [optional] |
| **number_of_reviewers** | **Integer** | Total number of people who have rated this hotel. | [optional] |
| **rating_system** | **String** | System you use for guest reviews. | [optional] |
| **score** | **Float** | Your hotel&#39;s rating. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelGuestRatings.new(
  max_score: null,
  number_of_reviewers: null,
  rating_system: null,
  score: null
)
```

