note
 description:"[
		Pinterest REST API
 		Pinterest's REST API
  		The version of the OpenAPI document: 5.14.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class CATALOGS_ITEM_VALIDATION_ISSUE

feature -- Access

  value: detachable STRING_32
      -- enumerated value.
    note
            option: stable
    attribute
    end

feature -- Enum

 val_ad_link_format_warning: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("AD_LINK_FORMAT_WARNING")
    end

 val_ad_link_same_as_link: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("AD_LINK_SAME_AS_LINK")
    end

 val_additional_image_link_length_too_long: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG")
    end

 val_additional_image_link_warning: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("ADDITIONAL_IMAGE_LINK_WARNING")
    end

 val_adult_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("ADULT_INVALID")
    end

 val_adwords_format_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("ADWORDS_FORMAT_INVALID")
    end

 val_adwords_format_warning: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("ADWORDS_FORMAT_WARNING")
    end

 val_adwords_same_as_link: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("ADWORDS_SAME_AS_LINK")
    end

 val_age_group_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("AGE_GROUP_INVALID")
    end

 val_android_deep_link_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("ANDROID_DEEP_LINK_INVALID")
    end

 val_availability_date_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("AVAILABILITY_DATE_INVALID")
    end

 val_availability_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("AVAILABILITY_INVALID")
    end

 val_blocklisted_image_signature: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("BLOCKLISTED_IMAGE_SIGNATURE")
    end

 val_country_does_not_map_to_currency: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("COUNTRY_DOES_NOT_MAP_TO_CURRENCY")
    end

 val_custom_label_length_too_long: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("CUSTOM_LABEL_LENGTH_TOO_LONG")
    end

 val_description_length_too_long: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("DESCRIPTION_LENGTH_TOO_LONG")
    end

 val_description_missing: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("DESCRIPTION_MISSING")
    end

 val_duplicate_products: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("DUPLICATE_PRODUCTS")
    end

 val_expiration_date_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("EXPIRATION_DATE_INVALID")
    end

 val_gender_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("GENDER_INVALID")
    end

 val_gtin_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("GTIN_INVALID")
    end

 val_image_link_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("IMAGE_LINK_INVALID")
    end

 val_image_link_length_too_long: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("IMAGE_LINK_LENGTH_TOO_LONG")
    end

 val_image_link_missing: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("IMAGE_LINK_MISSING")
    end

 val_image_link_warning: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("IMAGE_LINK_WARNING")
    end

 val_invalid_domain: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("INVALID_DOMAIN")
    end

 val_ios_deep_link_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("IOS_DEEP_LINK_INVALID")
    end

 val_is_bundle_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("IS_BUNDLE_INVALID")
    end

 val_item_additional_image_download_failure: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE")
    end

 val_item_main_image_download_failure: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE")
    end

 val_itemid_missing: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("ITEMID_MISSING")
    end

 val_link_format_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("LINK_FORMAT_INVALID")
    end

 val_link_format_warning: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("LINK_FORMAT_WARNING")
    end

 val_link_length_too_long: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("LINK_LENGTH_TOO_LONG")
    end

 val_list_price_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("LIST_PRICE_INVALID")
    end

 val_max_items_per_item_group_exceeded: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED")
    end

 val_min_ad_price_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("MIN_AD_PRICE_INVALID")
    end

 val_mpn_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("MPN_INVALID")
    end

 val_multipack_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("MULTIPACK_INVALID")
    end

 val_optional_condition_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("OPTIONAL_CONDITION_INVALID")
    end

 val_optional_condition_missing: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("OPTIONAL_CONDITION_MISSING")
    end

 val_optional_product_category_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("OPTIONAL_PRODUCT_CATEGORY_INVALID")
    end

 val_optional_product_category_missing: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("OPTIONAL_PRODUCT_CATEGORY_MISSING")
    end

 val_parse_line_error: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("PARSE_LINE_ERROR")
    end

 val_pinjoin_content_unsafe: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("PINJOIN_CONTENT_UNSAFE")
    end

 val_price_cannot_be_determined: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("PRICE_CANNOT_BE_DETERMINED")
    end

 val_price_missing: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("PRICE_MISSING")
    end

 val_product_category_depth_warning: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("PRODUCT_CATEGORY_DEPTH_WARNING")
    end

 val_product_link_missing: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("PRODUCT_LINK_MISSING")
    end

 val_product_price_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("PRODUCT_PRICE_INVALID")
    end

 val_product_type_length_too_long: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("PRODUCT_TYPE_LENGTH_TOO_LONG")
    end

 val_sale_date_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("SALE_DATE_INVALID")
    end

 val_sales_price_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("SALES_PRICE_INVALID")
    end

 val_sales_price_too_high: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("SALES_PRICE_TOO_HIGH")
    end

 val_sales_price_too_low: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("SALES_PRICE_TOO_LOW")
    end

 val_shipping_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("SHIPPING_INVALID")
    end

 val_shipping_height_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("SHIPPING_HEIGHT_INVALID")
    end

 val_shipping_weight_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("SHIPPING_WEIGHT_INVALID")
    end

 val_shipping_width_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("SHIPPING_WIDTH_INVALID")
    end

 val_size_system_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("SIZE_SYSTEM_INVALID")
    end

 val_size_type_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("SIZE_TYPE_INVALID")
    end

 val_tax_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("TAX_INVALID")
    end

 val_title_length_too_long: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("TITLE_LENGTH_TOO_LONG")
    end

 val_title_missing: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("TITLE_MISSING")
    end

 val_too_many_additional_image_links: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("TOO_MANY_ADDITIONAL_IMAGE_LINKS")
    end

 val_utm_source_auto_corrected: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("UTM_SOURCE_AUTO_CORRECTED")
    end

 val_weight_unit_invalid: CATALOGS_ITEM_VALIDATION_ISSUE
    once
      create Result
      Result.set_value ("WEIGHT_UNIT_INVALID")
    end


feature -- Element Change

  set_value (a_val: like value)
      -- Set `value' with `a_value'.
    do
      value := a_val
    ensure
      value_set: value = a_val
    end


end

