# PinterestSdkClient::CatalogsUpdatableCreativeAssetsAttributes

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **title** | **String** | The name of the creative assets. | [optional] |
| **description** | **String** | Brief description of the creative assets. | [optional] |
| **link** | **String** | Link to the creative assets page. | [optional] |
| **ios_deep_link** | **String** | IOS deep link to the creative assets page. | [optional] |
| **android_deep_link** | **String** | Link to the creative assets page. | [optional] |
| **google_product_category** | **String** | The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. | [optional] |
| **custom_label_0** | **String** | Custom grouping of creative assets. | [optional] |
| **custom_label_1** | **String** | Custom grouping of creative assets. | [optional] |
| **custom_label_2** | **String** | Custom grouping of creative assets. | [optional] |
| **custom_label_3** | **String** | Custom grouping of creative assets. | [optional] |
| **custom_label_4** | **String** | Custom grouping of creative assets. | [optional] |
| **visibility** | **String** | Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsUpdatableCreativeAssetsAttributes.new(
  title: null,
  description: null,
  link: null,
  ios_deep_link: null,
  android_deep_link: null,
  google_product_category: null,
  custom_label_0: null,
  custom_label_1: null,
  custom_label_2: null,
  custom_label_3: null,
  custom_label_4: null,
  visibility: null
)
```

