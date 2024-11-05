# PinterestSdkClient::Board

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  | [optional][readonly] |
| **created_at** | **Time** | Date and time of board creation. | [optional][readonly] |
| **board_pins_modified_at** | **Time** | Date and time of last board pins modified. | [optional][readonly] |
| **name** | **String** |  |  |
| **description** | **String** |  | [optional] |
| **collaborator_count** | **Integer** | Count of collaborators on the board. | [optional][readonly] |
| **pin_count** | **Integer** | Count of pins on the board. | [optional][readonly] |
| **follower_count** | **Integer** | Board follower count. | [optional][readonly] |
| **media** | [**BoardMedia**](BoardMedia.md) |  | [optional] |
| **owner** | [**BoardOwner**](BoardOwner.md) |  | [optional][readonly] |
| **privacy** | **String** | Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt; | [optional][default to &#39;PUBLIC&#39;] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Board.new(
  id: 549755885175,
  created_at: 2020-01-01T20:10:40Z,
  board_pins_modified_at: 2020-01-01T20:10:40Z,
  name: Summer Recipes,
  description: My favorite summer recipes,
  collaborator_count: 17,
  pin_count: 5,
  follower_count: 13,
  media: null,
  owner: null,
  privacy: null
)
```

