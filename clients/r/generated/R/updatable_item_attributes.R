#' Create a new UpdatableItemAttributes
#'
#' @description
#' UpdatableItemAttributes Class
#'
#' @docType class
#' @title UpdatableItemAttributes
#' @description UpdatableItemAttributes Class
#' @format An \code{R6Class} generator object
#' @field ad_link Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://. character [optional]
#' @field adult Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest. character [optional]
#' @field age_group The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’. character [optional]
#' @field availability The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’. character [optional]
#' @field average_review_rating Average reviews for the item. Can be a number from 1-5. numeric [optional]
#' @field brand The brand of the product. character [optional]
#' @field checkout_enabled This attribute is not supported anymore. character [optional]
#' @field color The primary color of the product. character [optional]
#' @field condition The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’. character [optional]
#' @field custom_label_0 <p><= 1000 characters</p> <p>Custom grouping of products.</p> character [optional]
#' @field custom_label_1 <p><= 1000 characters</p> <p>Custom grouping of products.</p> character [optional]
#' @field custom_label_2 <p><= 1000 characters</p> <p>Custom grouping of products.</p> character [optional]
#' @field custom_label_3 <p><= 1000 characters</p> <p>Custom grouping of products.</p> character [optional]
#' @field custom_label_4 <p><= 1000 characters</p> <p>Custom grouping of products.</p> character [optional]
#' @field description <p><= 10000 characters</p> <p>The description of the product.</p> character [optional]
#' @field free_shipping_label The item is free to ship. character [optional]
#' @field free_shipping_limit The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered. character [optional]
#' @field gender The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’. character [optional]
#' @field google_product_category The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. character [optional]
#' @field gtin The unique universal product identifier. integer [optional]
#' @field id <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p> character [optional]
#' @field item_group_id <p><= 127 characters</p> <p>The parent ID of the product.</p> character [optional]
#' @field last_updated_time The millisecond timestamp when the item was lastly modified by the merchant. integer [optional]
#' @field link <p><= 511 characters</p> <p>The landing page for the product.</p> character [optional]
#' @field material The material used to make the product. character [optional]
#' @field min_ad_price The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars. character [optional]
#' @field mobile_link The mobile-optimized version of your landing page. Must begin with http:// or https://. character [optional]
#' @field mpn Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer. character [optional]
#' @field number_of_ratings The number of ratings for the item. integer [optional]
#' @field number_of_reviews The number of reviews available for the item. integer [optional]
#' @field pattern The description of the pattern used for the product. character [optional]
#' @field price The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. character [optional]
#' @field product_type <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p> character [optional]
#' @field sale_price The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars. character [optional]
#' @field shipping Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required. character [optional]
#' @field shipping_height The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. character [optional]
#' @field shipping_weight The weight of the product. Ensure there is a space between the numeric string and the metric. character [optional]
#' @field shipping_width The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. character [optional]
#' @field size The size of the product. character [optional]
#' @field size_system Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’. character [optional]
#' @field size_type Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’. character [optional]
#' @field tax Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required. character [optional]
#' @field title <p><= 500 characters</p> <p>The name of the product.</p> character [optional]
#' @field variant_names Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. list(character) [optional]
#' @field variant_values Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdatableItemAttributes <- R6::R6Class(
  "UpdatableItemAttributes",
  public = list(
    `ad_link` = NULL,
    `adult` = NULL,
    `age_group` = NULL,
    `availability` = NULL,
    `average_review_rating` = NULL,
    `brand` = NULL,
    `checkout_enabled` = NULL,
    `color` = NULL,
    `condition` = NULL,
    `custom_label_0` = NULL,
    `custom_label_1` = NULL,
    `custom_label_2` = NULL,
    `custom_label_3` = NULL,
    `custom_label_4` = NULL,
    `description` = NULL,
    `free_shipping_label` = NULL,
    `free_shipping_limit` = NULL,
    `gender` = NULL,
    `google_product_category` = NULL,
    `gtin` = NULL,
    `id` = NULL,
    `item_group_id` = NULL,
    `last_updated_time` = NULL,
    `link` = NULL,
    `material` = NULL,
    `min_ad_price` = NULL,
    `mobile_link` = NULL,
    `mpn` = NULL,
    `number_of_ratings` = NULL,
    `number_of_reviews` = NULL,
    `pattern` = NULL,
    `price` = NULL,
    `product_type` = NULL,
    `sale_price` = NULL,
    `shipping` = NULL,
    `shipping_height` = NULL,
    `shipping_weight` = NULL,
    `shipping_width` = NULL,
    `size` = NULL,
    `size_system` = NULL,
    `size_type` = NULL,
    `tax` = NULL,
    `title` = NULL,
    `variant_names` = NULL,
    `variant_values` = NULL,
    #' Initialize a new UpdatableItemAttributes class.
    #'
    #' @description
    #' Initialize a new UpdatableItemAttributes class.
    #'
    #' @param ad_link Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
    #' @param adult Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
    #' @param age_group The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
    #' @param availability The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.
    #' @param average_review_rating Average reviews for the item. Can be a number from 1-5.
    #' @param brand The brand of the product.
    #' @param checkout_enabled This attribute is not supported anymore.
    #' @param color The primary color of the product.
    #' @param condition The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
    #' @param custom_label_0 <p><= 1000 characters</p> <p>Custom grouping of products.</p>
    #' @param custom_label_1 <p><= 1000 characters</p> <p>Custom grouping of products.</p>
    #' @param custom_label_2 <p><= 1000 characters</p> <p>Custom grouping of products.</p>
    #' @param custom_label_3 <p><= 1000 characters</p> <p>Custom grouping of products.</p>
    #' @param custom_label_4 <p><= 1000 characters</p> <p>Custom grouping of products.</p>
    #' @param description <p><= 10000 characters</p> <p>The description of the product.</p>
    #' @param free_shipping_label The item is free to ship.
    #' @param free_shipping_limit The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
    #' @param gender The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.
    #' @param google_product_category The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
    #' @param gtin The unique universal product identifier.
    #' @param id <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>
    #' @param item_group_id <p><= 127 characters</p> <p>The parent ID of the product.</p>
    #' @param last_updated_time The millisecond timestamp when the item was lastly modified by the merchant.
    #' @param link <p><= 511 characters</p> <p>The landing page for the product.</p>
    #' @param material The material used to make the product.
    #' @param min_ad_price The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
    #' @param mobile_link The mobile-optimized version of your landing page. Must begin with http:// or https://.
    #' @param mpn Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
    #' @param number_of_ratings The number of ratings for the item.
    #' @param number_of_reviews The number of reviews available for the item.
    #' @param pattern The description of the pattern used for the product.
    #' @param price The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
    #' @param product_type <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>
    #' @param sale_price The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
    #' @param shipping Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
    #' @param shipping_height The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
    #' @param shipping_weight The weight of the product. Ensure there is a space between the numeric string and the metric.
    #' @param shipping_width The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
    #' @param size The size of the product.
    #' @param size_system Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.
    #' @param size_type Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.
    #' @param tax Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
    #' @param title <p><= 500 characters</p> <p>The name of the product.</p>
    #' @param variant_names Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
    #' @param variant_values Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`ad_link` = NULL, `adult` = NULL, `age_group` = NULL, `availability` = NULL, `average_review_rating` = NULL, `brand` = NULL, `checkout_enabled` = NULL, `color` = NULL, `condition` = NULL, `custom_label_0` = NULL, `custom_label_1` = NULL, `custom_label_2` = NULL, `custom_label_3` = NULL, `custom_label_4` = NULL, `description` = NULL, `free_shipping_label` = NULL, `free_shipping_limit` = NULL, `gender` = NULL, `google_product_category` = NULL, `gtin` = NULL, `id` = NULL, `item_group_id` = NULL, `last_updated_time` = NULL, `link` = NULL, `material` = NULL, `min_ad_price` = NULL, `mobile_link` = NULL, `mpn` = NULL, `number_of_ratings` = NULL, `number_of_reviews` = NULL, `pattern` = NULL, `price` = NULL, `product_type` = NULL, `sale_price` = NULL, `shipping` = NULL, `shipping_height` = NULL, `shipping_weight` = NULL, `shipping_width` = NULL, `size` = NULL, `size_system` = NULL, `size_type` = NULL, `tax` = NULL, `title` = NULL, `variant_names` = NULL, `variant_values` = NULL, ...) {
      if (!is.null(`ad_link`)) {
        if (!(is.character(`ad_link`) && length(`ad_link`) == 1)) {
          stop(paste("Error! Invalid data for `ad_link`. Must be a string:", `ad_link`))
        }
        self$`ad_link` <- `ad_link`
      }
      if (!is.null(`adult`)) {
        if (!(is.logical(`adult`) && length(`adult`) == 1)) {
          stop(paste("Error! Invalid data for `adult`. Must be a boolean:", `adult`))
        }
        self$`adult` <- `adult`
      }
      if (!is.null(`age_group`)) {
        if (!(is.character(`age_group`) && length(`age_group`) == 1)) {
          stop(paste("Error! Invalid data for `age_group`. Must be a string:", `age_group`))
        }
        self$`age_group` <- `age_group`
      }
      if (!is.null(`availability`)) {
        if (!(is.character(`availability`) && length(`availability`) == 1)) {
          stop(paste("Error! Invalid data for `availability`. Must be a string:", `availability`))
        }
        self$`availability` <- `availability`
      }
      if (!is.null(`average_review_rating`)) {
        self$`average_review_rating` <- `average_review_rating`
      }
      if (!is.null(`brand`)) {
        if (!(is.character(`brand`) && length(`brand`) == 1)) {
          stop(paste("Error! Invalid data for `brand`. Must be a string:", `brand`))
        }
        self$`brand` <- `brand`
      }
      if (!is.null(`checkout_enabled`)) {
        if (!(is.logical(`checkout_enabled`) && length(`checkout_enabled`) == 1)) {
          stop(paste("Error! Invalid data for `checkout_enabled`. Must be a boolean:", `checkout_enabled`))
        }
        self$`checkout_enabled` <- `checkout_enabled`
      }
      if (!is.null(`color`)) {
        if (!(is.character(`color`) && length(`color`) == 1)) {
          stop(paste("Error! Invalid data for `color`. Must be a string:", `color`))
        }
        self$`color` <- `color`
      }
      if (!is.null(`condition`)) {
        if (!(is.character(`condition`) && length(`condition`) == 1)) {
          stop(paste("Error! Invalid data for `condition`. Must be a string:", `condition`))
        }
        self$`condition` <- `condition`
      }
      if (!is.null(`custom_label_0`)) {
        if (!(is.character(`custom_label_0`) && length(`custom_label_0`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_0`. Must be a string:", `custom_label_0`))
        }
        self$`custom_label_0` <- `custom_label_0`
      }
      if (!is.null(`custom_label_1`)) {
        if (!(is.character(`custom_label_1`) && length(`custom_label_1`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_1`. Must be a string:", `custom_label_1`))
        }
        self$`custom_label_1` <- `custom_label_1`
      }
      if (!is.null(`custom_label_2`)) {
        if (!(is.character(`custom_label_2`) && length(`custom_label_2`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_2`. Must be a string:", `custom_label_2`))
        }
        self$`custom_label_2` <- `custom_label_2`
      }
      if (!is.null(`custom_label_3`)) {
        if (!(is.character(`custom_label_3`) && length(`custom_label_3`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_3`. Must be a string:", `custom_label_3`))
        }
        self$`custom_label_3` <- `custom_label_3`
      }
      if (!is.null(`custom_label_4`)) {
        if (!(is.character(`custom_label_4`) && length(`custom_label_4`) == 1)) {
          stop(paste("Error! Invalid data for `custom_label_4`. Must be a string:", `custom_label_4`))
        }
        self$`custom_label_4` <- `custom_label_4`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`free_shipping_label`)) {
        if (!(is.logical(`free_shipping_label`) && length(`free_shipping_label`) == 1)) {
          stop(paste("Error! Invalid data for `free_shipping_label`. Must be a boolean:", `free_shipping_label`))
        }
        self$`free_shipping_label` <- `free_shipping_label`
      }
      if (!is.null(`free_shipping_limit`)) {
        if (!(is.character(`free_shipping_limit`) && length(`free_shipping_limit`) == 1)) {
          stop(paste("Error! Invalid data for `free_shipping_limit`. Must be a string:", `free_shipping_limit`))
        }
        self$`free_shipping_limit` <- `free_shipping_limit`
      }
      if (!is.null(`gender`)) {
        if (!(is.character(`gender`) && length(`gender`) == 1)) {
          stop(paste("Error! Invalid data for `gender`. Must be a string:", `gender`))
        }
        self$`gender` <- `gender`
      }
      if (!is.null(`google_product_category`)) {
        if (!(is.character(`google_product_category`) && length(`google_product_category`) == 1)) {
          stop(paste("Error! Invalid data for `google_product_category`. Must be a string:", `google_product_category`))
        }
        self$`google_product_category` <- `google_product_category`
      }
      if (!is.null(`gtin`)) {
        if (!(is.numeric(`gtin`) && length(`gtin`) == 1)) {
          stop(paste("Error! Invalid data for `gtin`. Must be an integer:", `gtin`))
        }
        self$`gtin` <- `gtin`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`item_group_id`)) {
        if (!(is.character(`item_group_id`) && length(`item_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_group_id`. Must be a string:", `item_group_id`))
        }
        self$`item_group_id` <- `item_group_id`
      }
      if (!is.null(`last_updated_time`)) {
        if (!(is.numeric(`last_updated_time`) && length(`last_updated_time`) == 1)) {
          stop(paste("Error! Invalid data for `last_updated_time`. Must be an integer:", `last_updated_time`))
        }
        self$`last_updated_time` <- `last_updated_time`
      }
      if (!is.null(`link`)) {
        if (!(is.character(`link`) && length(`link`) == 1)) {
          stop(paste("Error! Invalid data for `link`. Must be a string:", `link`))
        }
        self$`link` <- `link`
      }
      if (!is.null(`material`)) {
        if (!(is.character(`material`) && length(`material`) == 1)) {
          stop(paste("Error! Invalid data for `material`. Must be a string:", `material`))
        }
        self$`material` <- `material`
      }
      if (!is.null(`min_ad_price`)) {
        if (!(is.character(`min_ad_price`) && length(`min_ad_price`) == 1)) {
          stop(paste("Error! Invalid data for `min_ad_price`. Must be a string:", `min_ad_price`))
        }
        self$`min_ad_price` <- `min_ad_price`
      }
      if (!is.null(`mobile_link`)) {
        if (!(is.character(`mobile_link`) && length(`mobile_link`) == 1)) {
          stop(paste("Error! Invalid data for `mobile_link`. Must be a string:", `mobile_link`))
        }
        self$`mobile_link` <- `mobile_link`
      }
      if (!is.null(`mpn`)) {
        if (!(is.character(`mpn`) && length(`mpn`) == 1)) {
          stop(paste("Error! Invalid data for `mpn`. Must be a string:", `mpn`))
        }
        self$`mpn` <- `mpn`
      }
      if (!is.null(`number_of_ratings`)) {
        if (!(is.numeric(`number_of_ratings`) && length(`number_of_ratings`) == 1)) {
          stop(paste("Error! Invalid data for `number_of_ratings`. Must be an integer:", `number_of_ratings`))
        }
        self$`number_of_ratings` <- `number_of_ratings`
      }
      if (!is.null(`number_of_reviews`)) {
        if (!(is.numeric(`number_of_reviews`) && length(`number_of_reviews`) == 1)) {
          stop(paste("Error! Invalid data for `number_of_reviews`. Must be an integer:", `number_of_reviews`))
        }
        self$`number_of_reviews` <- `number_of_reviews`
      }
      if (!is.null(`pattern`)) {
        if (!(is.character(`pattern`) && length(`pattern`) == 1)) {
          stop(paste("Error! Invalid data for `pattern`. Must be a string:", `pattern`))
        }
        self$`pattern` <- `pattern`
      }
      if (!is.null(`price`)) {
        if (!(is.character(`price`) && length(`price`) == 1)) {
          stop(paste("Error! Invalid data for `price`. Must be a string:", `price`))
        }
        self$`price` <- `price`
      }
      if (!is.null(`product_type`)) {
        if (!(is.character(`product_type`) && length(`product_type`) == 1)) {
          stop(paste("Error! Invalid data for `product_type`. Must be a string:", `product_type`))
        }
        self$`product_type` <- `product_type`
      }
      if (!is.null(`sale_price`)) {
        if (!(is.character(`sale_price`) && length(`sale_price`) == 1)) {
          stop(paste("Error! Invalid data for `sale_price`. Must be a string:", `sale_price`))
        }
        self$`sale_price` <- `sale_price`
      }
      if (!is.null(`shipping`)) {
        if (!(is.character(`shipping`) && length(`shipping`) == 1)) {
          stop(paste("Error! Invalid data for `shipping`. Must be a string:", `shipping`))
        }
        self$`shipping` <- `shipping`
      }
      if (!is.null(`shipping_height`)) {
        if (!(is.character(`shipping_height`) && length(`shipping_height`) == 1)) {
          stop(paste("Error! Invalid data for `shipping_height`. Must be a string:", `shipping_height`))
        }
        self$`shipping_height` <- `shipping_height`
      }
      if (!is.null(`shipping_weight`)) {
        if (!(is.character(`shipping_weight`) && length(`shipping_weight`) == 1)) {
          stop(paste("Error! Invalid data for `shipping_weight`. Must be a string:", `shipping_weight`))
        }
        self$`shipping_weight` <- `shipping_weight`
      }
      if (!is.null(`shipping_width`)) {
        if (!(is.character(`shipping_width`) && length(`shipping_width`) == 1)) {
          stop(paste("Error! Invalid data for `shipping_width`. Must be a string:", `shipping_width`))
        }
        self$`shipping_width` <- `shipping_width`
      }
      if (!is.null(`size`)) {
        if (!(is.character(`size`) && length(`size`) == 1)) {
          stop(paste("Error! Invalid data for `size`. Must be a string:", `size`))
        }
        self$`size` <- `size`
      }
      if (!is.null(`size_system`)) {
        if (!(is.character(`size_system`) && length(`size_system`) == 1)) {
          stop(paste("Error! Invalid data for `size_system`. Must be a string:", `size_system`))
        }
        self$`size_system` <- `size_system`
      }
      if (!is.null(`size_type`)) {
        if (!(is.character(`size_type`) && length(`size_type`) == 1)) {
          stop(paste("Error! Invalid data for `size_type`. Must be a string:", `size_type`))
        }
        self$`size_type` <- `size_type`
      }
      if (!is.null(`tax`)) {
        if (!(is.character(`tax`) && length(`tax`) == 1)) {
          stop(paste("Error! Invalid data for `tax`. Must be a string:", `tax`))
        }
        self$`tax` <- `tax`
      }
      if (!is.null(`title`)) {
        if (!(is.character(`title`) && length(`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", `title`))
        }
        self$`title` <- `title`
      }
      if (!is.null(`variant_names`)) {
        stopifnot(is.vector(`variant_names`), length(`variant_names`) != 0)
        sapply(`variant_names`, function(x) stopifnot(is.character(x)))
        self$`variant_names` <- `variant_names`
      }
      if (!is.null(`variant_values`)) {
        stopifnot(is.vector(`variant_values`), length(`variant_values`) != 0)
        sapply(`variant_values`, function(x) stopifnot(is.character(x)))
        self$`variant_values` <- `variant_values`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdatableItemAttributes in JSON format
    #' @export
    toJSON = function() {
      UpdatableItemAttributesObject <- list()
      if (!is.null(self$`ad_link`)) {
        UpdatableItemAttributesObject[["ad_link"]] <-
          self$`ad_link`
      }
      if (!is.null(self$`adult`)) {
        UpdatableItemAttributesObject[["adult"]] <-
          self$`adult`
      }
      if (!is.null(self$`age_group`)) {
        UpdatableItemAttributesObject[["age_group"]] <-
          self$`age_group`
      }
      if (!is.null(self$`availability`)) {
        UpdatableItemAttributesObject[["availability"]] <-
          self$`availability`
      }
      if (!is.null(self$`average_review_rating`)) {
        UpdatableItemAttributesObject[["average_review_rating"]] <-
          self$`average_review_rating`
      }
      if (!is.null(self$`brand`)) {
        UpdatableItemAttributesObject[["brand"]] <-
          self$`brand`
      }
      if (!is.null(self$`checkout_enabled`)) {
        UpdatableItemAttributesObject[["checkout_enabled"]] <-
          self$`checkout_enabled`
      }
      if (!is.null(self$`color`)) {
        UpdatableItemAttributesObject[["color"]] <-
          self$`color`
      }
      if (!is.null(self$`condition`)) {
        UpdatableItemAttributesObject[["condition"]] <-
          self$`condition`
      }
      if (!is.null(self$`custom_label_0`)) {
        UpdatableItemAttributesObject[["custom_label_0"]] <-
          self$`custom_label_0`
      }
      if (!is.null(self$`custom_label_1`)) {
        UpdatableItemAttributesObject[["custom_label_1"]] <-
          self$`custom_label_1`
      }
      if (!is.null(self$`custom_label_2`)) {
        UpdatableItemAttributesObject[["custom_label_2"]] <-
          self$`custom_label_2`
      }
      if (!is.null(self$`custom_label_3`)) {
        UpdatableItemAttributesObject[["custom_label_3"]] <-
          self$`custom_label_3`
      }
      if (!is.null(self$`custom_label_4`)) {
        UpdatableItemAttributesObject[["custom_label_4"]] <-
          self$`custom_label_4`
      }
      if (!is.null(self$`description`)) {
        UpdatableItemAttributesObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`free_shipping_label`)) {
        UpdatableItemAttributesObject[["free_shipping_label"]] <-
          self$`free_shipping_label`
      }
      if (!is.null(self$`free_shipping_limit`)) {
        UpdatableItemAttributesObject[["free_shipping_limit"]] <-
          self$`free_shipping_limit`
      }
      if (!is.null(self$`gender`)) {
        UpdatableItemAttributesObject[["gender"]] <-
          self$`gender`
      }
      if (!is.null(self$`google_product_category`)) {
        UpdatableItemAttributesObject[["google_product_category"]] <-
          self$`google_product_category`
      }
      if (!is.null(self$`gtin`)) {
        UpdatableItemAttributesObject[["gtin"]] <-
          self$`gtin`
      }
      if (!is.null(self$`id`)) {
        UpdatableItemAttributesObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`item_group_id`)) {
        UpdatableItemAttributesObject[["item_group_id"]] <-
          self$`item_group_id`
      }
      if (!is.null(self$`last_updated_time`)) {
        UpdatableItemAttributesObject[["last_updated_time"]] <-
          self$`last_updated_time`
      }
      if (!is.null(self$`link`)) {
        UpdatableItemAttributesObject[["link"]] <-
          self$`link`
      }
      if (!is.null(self$`material`)) {
        UpdatableItemAttributesObject[["material"]] <-
          self$`material`
      }
      if (!is.null(self$`min_ad_price`)) {
        UpdatableItemAttributesObject[["min_ad_price"]] <-
          self$`min_ad_price`
      }
      if (!is.null(self$`mobile_link`)) {
        UpdatableItemAttributesObject[["mobile_link"]] <-
          self$`mobile_link`
      }
      if (!is.null(self$`mpn`)) {
        UpdatableItemAttributesObject[["mpn"]] <-
          self$`mpn`
      }
      if (!is.null(self$`number_of_ratings`)) {
        UpdatableItemAttributesObject[["number_of_ratings"]] <-
          self$`number_of_ratings`
      }
      if (!is.null(self$`number_of_reviews`)) {
        UpdatableItemAttributesObject[["number_of_reviews"]] <-
          self$`number_of_reviews`
      }
      if (!is.null(self$`pattern`)) {
        UpdatableItemAttributesObject[["pattern"]] <-
          self$`pattern`
      }
      if (!is.null(self$`price`)) {
        UpdatableItemAttributesObject[["price"]] <-
          self$`price`
      }
      if (!is.null(self$`product_type`)) {
        UpdatableItemAttributesObject[["product_type"]] <-
          self$`product_type`
      }
      if (!is.null(self$`sale_price`)) {
        UpdatableItemAttributesObject[["sale_price"]] <-
          self$`sale_price`
      }
      if (!is.null(self$`shipping`)) {
        UpdatableItemAttributesObject[["shipping"]] <-
          self$`shipping`
      }
      if (!is.null(self$`shipping_height`)) {
        UpdatableItemAttributesObject[["shipping_height"]] <-
          self$`shipping_height`
      }
      if (!is.null(self$`shipping_weight`)) {
        UpdatableItemAttributesObject[["shipping_weight"]] <-
          self$`shipping_weight`
      }
      if (!is.null(self$`shipping_width`)) {
        UpdatableItemAttributesObject[["shipping_width"]] <-
          self$`shipping_width`
      }
      if (!is.null(self$`size`)) {
        UpdatableItemAttributesObject[["size"]] <-
          self$`size`
      }
      if (!is.null(self$`size_system`)) {
        UpdatableItemAttributesObject[["size_system"]] <-
          self$`size_system`
      }
      if (!is.null(self$`size_type`)) {
        UpdatableItemAttributesObject[["size_type"]] <-
          self$`size_type`
      }
      if (!is.null(self$`tax`)) {
        UpdatableItemAttributesObject[["tax"]] <-
          self$`tax`
      }
      if (!is.null(self$`title`)) {
        UpdatableItemAttributesObject[["title"]] <-
          self$`title`
      }
      if (!is.null(self$`variant_names`)) {
        UpdatableItemAttributesObject[["variant_names"]] <-
          self$`variant_names`
      }
      if (!is.null(self$`variant_values`)) {
        UpdatableItemAttributesObject[["variant_values"]] <-
          self$`variant_values`
      }
      UpdatableItemAttributesObject
    },
    #' Deserialize JSON string into an instance of UpdatableItemAttributes
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdatableItemAttributes
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdatableItemAttributes
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_link`)) {
        self$`ad_link` <- this_object$`ad_link`
      }
      if (!is.null(this_object$`adult`)) {
        self$`adult` <- this_object$`adult`
      }
      if (!is.null(this_object$`age_group`)) {
        self$`age_group` <- this_object$`age_group`
      }
      if (!is.null(this_object$`availability`)) {
        self$`availability` <- this_object$`availability`
      }
      if (!is.null(this_object$`average_review_rating`)) {
        self$`average_review_rating` <- this_object$`average_review_rating`
      }
      if (!is.null(this_object$`brand`)) {
        self$`brand` <- this_object$`brand`
      }
      if (!is.null(this_object$`checkout_enabled`)) {
        self$`checkout_enabled` <- this_object$`checkout_enabled`
      }
      if (!is.null(this_object$`color`)) {
        self$`color` <- this_object$`color`
      }
      if (!is.null(this_object$`condition`)) {
        self$`condition` <- this_object$`condition`
      }
      if (!is.null(this_object$`custom_label_0`)) {
        self$`custom_label_0` <- this_object$`custom_label_0`
      }
      if (!is.null(this_object$`custom_label_1`)) {
        self$`custom_label_1` <- this_object$`custom_label_1`
      }
      if (!is.null(this_object$`custom_label_2`)) {
        self$`custom_label_2` <- this_object$`custom_label_2`
      }
      if (!is.null(this_object$`custom_label_3`)) {
        self$`custom_label_3` <- this_object$`custom_label_3`
      }
      if (!is.null(this_object$`custom_label_4`)) {
        self$`custom_label_4` <- this_object$`custom_label_4`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`free_shipping_label`)) {
        self$`free_shipping_label` <- this_object$`free_shipping_label`
      }
      if (!is.null(this_object$`free_shipping_limit`)) {
        self$`free_shipping_limit` <- this_object$`free_shipping_limit`
      }
      if (!is.null(this_object$`gender`)) {
        self$`gender` <- this_object$`gender`
      }
      if (!is.null(this_object$`google_product_category`)) {
        self$`google_product_category` <- this_object$`google_product_category`
      }
      if (!is.null(this_object$`gtin`)) {
        self$`gtin` <- this_object$`gtin`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`item_group_id`)) {
        self$`item_group_id` <- this_object$`item_group_id`
      }
      if (!is.null(this_object$`last_updated_time`)) {
        self$`last_updated_time` <- this_object$`last_updated_time`
      }
      if (!is.null(this_object$`link`)) {
        self$`link` <- this_object$`link`
      }
      if (!is.null(this_object$`material`)) {
        self$`material` <- this_object$`material`
      }
      if (!is.null(this_object$`min_ad_price`)) {
        self$`min_ad_price` <- this_object$`min_ad_price`
      }
      if (!is.null(this_object$`mobile_link`)) {
        self$`mobile_link` <- this_object$`mobile_link`
      }
      if (!is.null(this_object$`mpn`)) {
        self$`mpn` <- this_object$`mpn`
      }
      if (!is.null(this_object$`number_of_ratings`)) {
        self$`number_of_ratings` <- this_object$`number_of_ratings`
      }
      if (!is.null(this_object$`number_of_reviews`)) {
        self$`number_of_reviews` <- this_object$`number_of_reviews`
      }
      if (!is.null(this_object$`pattern`)) {
        self$`pattern` <- this_object$`pattern`
      }
      if (!is.null(this_object$`price`)) {
        self$`price` <- this_object$`price`
      }
      if (!is.null(this_object$`product_type`)) {
        self$`product_type` <- this_object$`product_type`
      }
      if (!is.null(this_object$`sale_price`)) {
        self$`sale_price` <- this_object$`sale_price`
      }
      if (!is.null(this_object$`shipping`)) {
        self$`shipping` <- this_object$`shipping`
      }
      if (!is.null(this_object$`shipping_height`)) {
        self$`shipping_height` <- this_object$`shipping_height`
      }
      if (!is.null(this_object$`shipping_weight`)) {
        self$`shipping_weight` <- this_object$`shipping_weight`
      }
      if (!is.null(this_object$`shipping_width`)) {
        self$`shipping_width` <- this_object$`shipping_width`
      }
      if (!is.null(this_object$`size`)) {
        self$`size` <- this_object$`size`
      }
      if (!is.null(this_object$`size_system`)) {
        self$`size_system` <- this_object$`size_system`
      }
      if (!is.null(this_object$`size_type`)) {
        self$`size_type` <- this_object$`size_type`
      }
      if (!is.null(this_object$`tax`)) {
        self$`tax` <- this_object$`tax`
      }
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      if (!is.null(this_object$`variant_names`)) {
        self$`variant_names` <- ApiClient$new()$deserializeObj(this_object$`variant_names`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`variant_values`)) {
        self$`variant_values` <- ApiClient$new()$deserializeObj(this_object$`variant_values`, "array[character]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return UpdatableItemAttributes in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`ad_link`)) {
          sprintf(
          '"ad_link":
            "%s"
                    ',
          self$`ad_link`
          )
        },
        if (!is.null(self$`adult`)) {
          sprintf(
          '"adult":
            %s
                    ',
          tolower(self$`adult`)
          )
        },
        if (!is.null(self$`age_group`)) {
          sprintf(
          '"age_group":
            "%s"
                    ',
          self$`age_group`
          )
        },
        if (!is.null(self$`availability`)) {
          sprintf(
          '"availability":
            "%s"
                    ',
          self$`availability`
          )
        },
        if (!is.null(self$`average_review_rating`)) {
          sprintf(
          '"average_review_rating":
            %d
                    ',
          self$`average_review_rating`
          )
        },
        if (!is.null(self$`brand`)) {
          sprintf(
          '"brand":
            "%s"
                    ',
          self$`brand`
          )
        },
        if (!is.null(self$`checkout_enabled`)) {
          sprintf(
          '"checkout_enabled":
            %s
                    ',
          tolower(self$`checkout_enabled`)
          )
        },
        if (!is.null(self$`color`)) {
          sprintf(
          '"color":
            "%s"
                    ',
          self$`color`
          )
        },
        if (!is.null(self$`condition`)) {
          sprintf(
          '"condition":
            "%s"
                    ',
          self$`condition`
          )
        },
        if (!is.null(self$`custom_label_0`)) {
          sprintf(
          '"custom_label_0":
            "%s"
                    ',
          self$`custom_label_0`
          )
        },
        if (!is.null(self$`custom_label_1`)) {
          sprintf(
          '"custom_label_1":
            "%s"
                    ',
          self$`custom_label_1`
          )
        },
        if (!is.null(self$`custom_label_2`)) {
          sprintf(
          '"custom_label_2":
            "%s"
                    ',
          self$`custom_label_2`
          )
        },
        if (!is.null(self$`custom_label_3`)) {
          sprintf(
          '"custom_label_3":
            "%s"
                    ',
          self$`custom_label_3`
          )
        },
        if (!is.null(self$`custom_label_4`)) {
          sprintf(
          '"custom_label_4":
            "%s"
                    ',
          self$`custom_label_4`
          )
        },
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        },
        if (!is.null(self$`free_shipping_label`)) {
          sprintf(
          '"free_shipping_label":
            %s
                    ',
          tolower(self$`free_shipping_label`)
          )
        },
        if (!is.null(self$`free_shipping_limit`)) {
          sprintf(
          '"free_shipping_limit":
            "%s"
                    ',
          self$`free_shipping_limit`
          )
        },
        if (!is.null(self$`gender`)) {
          sprintf(
          '"gender":
            "%s"
                    ',
          self$`gender`
          )
        },
        if (!is.null(self$`google_product_category`)) {
          sprintf(
          '"google_product_category":
            "%s"
                    ',
          self$`google_product_category`
          )
        },
        if (!is.null(self$`gtin`)) {
          sprintf(
          '"gtin":
            %d
                    ',
          self$`gtin`
          )
        },
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`item_group_id`)) {
          sprintf(
          '"item_group_id":
            "%s"
                    ',
          self$`item_group_id`
          )
        },
        if (!is.null(self$`last_updated_time`)) {
          sprintf(
          '"last_updated_time":
            %d
                    ',
          self$`last_updated_time`
          )
        },
        if (!is.null(self$`link`)) {
          sprintf(
          '"link":
            "%s"
                    ',
          self$`link`
          )
        },
        if (!is.null(self$`material`)) {
          sprintf(
          '"material":
            "%s"
                    ',
          self$`material`
          )
        },
        if (!is.null(self$`min_ad_price`)) {
          sprintf(
          '"min_ad_price":
            "%s"
                    ',
          self$`min_ad_price`
          )
        },
        if (!is.null(self$`mobile_link`)) {
          sprintf(
          '"mobile_link":
            "%s"
                    ',
          self$`mobile_link`
          )
        },
        if (!is.null(self$`mpn`)) {
          sprintf(
          '"mpn":
            "%s"
                    ',
          self$`mpn`
          )
        },
        if (!is.null(self$`number_of_ratings`)) {
          sprintf(
          '"number_of_ratings":
            %d
                    ',
          self$`number_of_ratings`
          )
        },
        if (!is.null(self$`number_of_reviews`)) {
          sprintf(
          '"number_of_reviews":
            %d
                    ',
          self$`number_of_reviews`
          )
        },
        if (!is.null(self$`pattern`)) {
          sprintf(
          '"pattern":
            "%s"
                    ',
          self$`pattern`
          )
        },
        if (!is.null(self$`price`)) {
          sprintf(
          '"price":
            "%s"
                    ',
          self$`price`
          )
        },
        if (!is.null(self$`product_type`)) {
          sprintf(
          '"product_type":
            "%s"
                    ',
          self$`product_type`
          )
        },
        if (!is.null(self$`sale_price`)) {
          sprintf(
          '"sale_price":
            "%s"
                    ',
          self$`sale_price`
          )
        },
        if (!is.null(self$`shipping`)) {
          sprintf(
          '"shipping":
            "%s"
                    ',
          self$`shipping`
          )
        },
        if (!is.null(self$`shipping_height`)) {
          sprintf(
          '"shipping_height":
            "%s"
                    ',
          self$`shipping_height`
          )
        },
        if (!is.null(self$`shipping_weight`)) {
          sprintf(
          '"shipping_weight":
            "%s"
                    ',
          self$`shipping_weight`
          )
        },
        if (!is.null(self$`shipping_width`)) {
          sprintf(
          '"shipping_width":
            "%s"
                    ',
          self$`shipping_width`
          )
        },
        if (!is.null(self$`size`)) {
          sprintf(
          '"size":
            "%s"
                    ',
          self$`size`
          )
        },
        if (!is.null(self$`size_system`)) {
          sprintf(
          '"size_system":
            "%s"
                    ',
          self$`size_system`
          )
        },
        if (!is.null(self$`size_type`)) {
          sprintf(
          '"size_type":
            "%s"
                    ',
          self$`size_type`
          )
        },
        if (!is.null(self$`tax`)) {
          sprintf(
          '"tax":
            "%s"
                    ',
          self$`tax`
          )
        },
        if (!is.null(self$`title`)) {
          sprintf(
          '"title":
            "%s"
                    ',
          self$`title`
          )
        },
        if (!is.null(self$`variant_names`)) {
          sprintf(
          '"variant_names":
             [%s]
          ',
          paste(unlist(lapply(self$`variant_names`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`variant_values`)) {
          sprintf(
          '"variant_values":
             [%s]
          ',
          paste(unlist(lapply(self$`variant_values`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of UpdatableItemAttributes
    #'
    #' @description
    #' Deserialize JSON string into an instance of UpdatableItemAttributes
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdatableItemAttributes
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_link` <- this_object$`ad_link`
      self$`adult` <- this_object$`adult`
      self$`age_group` <- this_object$`age_group`
      self$`availability` <- this_object$`availability`
      self$`average_review_rating` <- this_object$`average_review_rating`
      self$`brand` <- this_object$`brand`
      self$`checkout_enabled` <- this_object$`checkout_enabled`
      self$`color` <- this_object$`color`
      self$`condition` <- this_object$`condition`
      self$`custom_label_0` <- this_object$`custom_label_0`
      self$`custom_label_1` <- this_object$`custom_label_1`
      self$`custom_label_2` <- this_object$`custom_label_2`
      self$`custom_label_3` <- this_object$`custom_label_3`
      self$`custom_label_4` <- this_object$`custom_label_4`
      self$`description` <- this_object$`description`
      self$`free_shipping_label` <- this_object$`free_shipping_label`
      self$`free_shipping_limit` <- this_object$`free_shipping_limit`
      self$`gender` <- this_object$`gender`
      self$`google_product_category` <- this_object$`google_product_category`
      self$`gtin` <- this_object$`gtin`
      self$`id` <- this_object$`id`
      self$`item_group_id` <- this_object$`item_group_id`
      self$`last_updated_time` <- this_object$`last_updated_time`
      self$`link` <- this_object$`link`
      self$`material` <- this_object$`material`
      self$`min_ad_price` <- this_object$`min_ad_price`
      self$`mobile_link` <- this_object$`mobile_link`
      self$`mpn` <- this_object$`mpn`
      self$`number_of_ratings` <- this_object$`number_of_ratings`
      self$`number_of_reviews` <- this_object$`number_of_reviews`
      self$`pattern` <- this_object$`pattern`
      self$`price` <- this_object$`price`
      self$`product_type` <- this_object$`product_type`
      self$`sale_price` <- this_object$`sale_price`
      self$`shipping` <- this_object$`shipping`
      self$`shipping_height` <- this_object$`shipping_height`
      self$`shipping_weight` <- this_object$`shipping_weight`
      self$`shipping_width` <- this_object$`shipping_width`
      self$`size` <- this_object$`size`
      self$`size_system` <- this_object$`size_system`
      self$`size_type` <- this_object$`size_type`
      self$`tax` <- this_object$`tax`
      self$`title` <- this_object$`title`
      self$`variant_names` <- ApiClient$new()$deserializeObj(this_object$`variant_names`, "array[character]", loadNamespace("openapi"))
      self$`variant_values` <- ApiClient$new()$deserializeObj(this_object$`variant_values`, "array[character]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to UpdatableItemAttributes
    #'
    #' @description
    #' Validate JSON input with respect to UpdatableItemAttributes and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdatableItemAttributes
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# UpdatableItemAttributes$unlock()
#
## Below is an example to define the print function
# UpdatableItemAttributes$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdatableItemAttributes$lock()

