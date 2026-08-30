# PinterestSdkClient::TrendsEditorial

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **board_url** | **String** | URL of the editorial board |  |
| **description** | **String** | Description of the editorial article |  |
| **interests** | **Array&lt;String&gt;** | List of interests related to the editorial article |  |
| **pins_url** | **Array&lt;String&gt;** | URL of the pins related to the editorial article |  |
| **related_keywords** | [**Array&lt;KeywordInfo&gt;**](KeywordInfo.md) | List of keywords related to the editorial article |  |
| **title** | **String** | Title of the editorial article |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TrendsEditorial.new(
  board_url: null,
  description: null,
  interests: null,
  pins_url: null,
  related_keywords: null,
  title: null
)
```

