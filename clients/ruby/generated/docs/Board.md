# PinterestSdkClient::Board

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **board_pins_modified_at** | **Time** | Date and time of last board pins modified. | [optional][readonly] |
| **collaborator_count** | **Integer** | Count of collaborators on the board. | [optional][readonly] |
| **created_at** | **Time** | Date and time of board creation. | [optional][readonly] |
| **description** | **String** |  | [optional] |
| **follower_count** | **Integer** | Board follower count. | [optional][readonly] |
| **id** | **String** |  | [readonly] |
| **is_ads_only** | **Boolean** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional][default to false] |
| **media** | [**BoardMedia**](BoardMedia.md) | Board media. | [optional][readonly] |
| **name** | **String** |      Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. |  |
| **owner** | [**BoardOwner**](BoardOwner.md) |  | [optional][readonly] |
| **pin_count** | **Integer** | Count of Pins on the board. | [optional][readonly] |
| **privacy** | [**BoardPrivacy**](BoardPrivacy.md) |     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;.  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Board.new(
  board_pins_modified_at: null,
  collaborator_count: 17,
  created_at: null,
  description: My favorite summer recipes,
  follower_count: 13,
  id: 549755885175,
  is_ads_only: true,
  media: null,
  name: Summer recipes,
  owner: null,
  pin_count: 5,
  privacy: null
)
```

