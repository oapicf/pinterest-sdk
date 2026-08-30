# PinterestSdkClient::Account

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **about** | **String** | Profile about description. | [optional] |
| **account_type** | [**UserAccountType**](UserAccountType.md) | Type of account | [optional] |
| **board_count** | **Integer** |   User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. | [optional][readonly] |
| **business_name** | **String** |  | [optional] |
| **follower_count** | **Integer** | User account follower count. | [optional][readonly] |
| **following_count** | **Integer** | User account following count. | [optional][readonly] |
| **id** | **String** | User account ID. | [optional] |
| **monthly_views** | **Integer** | User account monthly views. | [optional][readonly] |
| **pin_count** | **Integer** | User account pin count. This includes both created and saved pins. | [optional][readonly] |
| **profile_image** | **String** |  | [optional] |
| **username** | **String** |  | [optional] |
| **website_url** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Account.new(
  about: null,
  account_type: null,
  board_count: 14,
  business_name: null,
  follower_count: 10,
  following_count: 347,
  id: 2783136121146311751,
  monthly_views: 163,
  pin_count: 339,
  profile_image: null,
  username: null,
  website_url: null
)
```

