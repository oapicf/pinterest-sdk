# PinterestSdkClient::CatalogsHotelProductGroupFilterKeys

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **price** | [**CatalogsProductGroupPricingCurrencyCriteria**](CatalogsProductGroupPricingCurrencyCriteria.md) |  |  |
| **hotel_id** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  |  |
| **brand** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  |  |
| **custom_label_0** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  |  |
| **custom_label_1** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  |  |
| **custom_label_2** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  |  |
| **custom_label_3** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  |  |
| **custom_label_4** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  |  |
| **country** | [**CatalogsProductGroupMultipleCountriesCriteria**](.md) |  |  |
| **title_keywords** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelProductGroupFilterKeys.new(
  price: null,
  hotel_id: null,
  brand: null,
  custom_label_0: null,
  custom_label_1: null,
  custom_label_2: null,
  custom_label_3: null,
  custom_label_4: null,
  country: null,
  title_keywords: null
)
```

