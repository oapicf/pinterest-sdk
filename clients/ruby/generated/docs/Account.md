# PinterestSdkClient::Account

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **account_type** | **String** | Type of account | [optional] |
| **id** | **String** | User account ID. | [optional] |
| **profile_image** | **String** |  | [optional] |
| **website_url** | **String** |  | [optional] |
| **username** | **String** |  | [optional] |
| **about** | **String** | Profile about description. | [optional] |
| **business_name** | **String** |  | [optional] |
| **board_count** | **Integer** | User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. | [optional][readonly] |
| **pin_count** | **Integer** | User account pin count. This includes both created and saved pins. | [optional][readonly] |
| **follower_count** | **Integer** | User account follower count. | [optional][readonly] |
| **following_count** | **Integer** | User account following count. | [optional][readonly] |
| **monthly_views** | **Integer** | User account monthly views. | [optional][readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Account.new(
  account_type: null,
  id: 2783136121146311751,
  profile_image: null,
  website_url: null,
  username: null,
  about: null,
  business_name: null,
  board_count: 14,
  pin_count: 339,
  follower_count: 10,
  following_count: 347,
  monthly_views: 163
)
```

