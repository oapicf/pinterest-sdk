-module(openapi_catalogs_feed_validation_warnings).

-include("openapi.hrl").

-export([openapi_catalogs_feed_validation_warnings/0]).

-export([openapi_catalogs_feed_validation_warnings/1]).

-export_type([openapi_catalogs_feed_validation_warnings/0]).

-type openapi_catalogs_feed_validation_warnings() ::
  [ {'AD_LINK_FORMAT_WARNING', integer() }
  | {'AD_LINK_SAME_AS_LINK', integer() }
  | {'TITLE_LENGTH_TOO_LONG', integer() }
  | {'DESCRIPTION_LENGTH_TOO_LONG', integer() }
  | {'GENDER_INVALID', integer() }
  | {'AGE_GROUP_INVALID', integer() }
  | {'SIZE_TYPE_INVALID', integer() }
  | {'SIZE_SYSTEM_INVALID', integer() }
  | {'LINK_FORMAT_WARNING', integer() }
  | {'SALES_PRICE_INVALID', integer() }
  | {'PRODUCT_CATEGORY_DEPTH_WARNING', integer() }
  | {'ADWORDS_FORMAT_WARNING', integer() }
  | {'ADWORDS_SAME_AS_LINK', integer() }
  | {'DUPLICATE_HEADERS', integer() }
  | {'FETCH_SAME_SIGNATURE', integer() }
  | {'ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG', integer() }
  | {'ADDITIONAL_IMAGE_LINK_WARNING', integer() }
  | {'IMAGE_LINK_WARNING', integer() }
  | {'SHIPPING_INVALID', integer() }
  | {'TAX_INVALID', integer() }
  | {'SHIPPING_WEIGHT_INVALID', integer() }
  | {'EXPIRATION_DATE_INVALID', integer() }
  | {'AVAILABILITY_DATE_INVALID', integer() }
  | {'SALE_DATE_INVALID', integer() }
  | {'WEIGHT_UNIT_INVALID', integer() }
  | {'IS_BUNDLE_INVALID', integer() }
  | {'UPDATED_TIME_INVALID', integer() }
  | {'CUSTOM_LABEL_LENGTH_TOO_LONG', integer() }
  | {'PRODUCT_TYPE_LENGTH_TOO_LONG', integer() }
  | {'TOO_MANY_ADDITIONAL_IMAGE_LINKS', integer() }
  | {'MULTIPACK_INVALID', integer() }
  | {'INDEXED_PRODUCT_COUNT_LARGE_DELTA', integer() }
  | {'ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE', integer() }
  | {'OPTIONAL_PRODUCT_CATEGORY_MISSING', integer() }
  | {'OPTIONAL_PRODUCT_CATEGORY_INVALID', integer() }
  | {'OPTIONAL_CONDITION_MISSING', integer() }
  | {'OPTIONAL_CONDITION_INVALID', integer() }
  | {'IOS_DEEP_LINK_INVALID', integer() }
  | {'ANDROID_DEEP_LINK_INVALID', integer() }
  | {'UTM_SOURCE_AUTO_CORRECTED', integer() }
  | {'COUNTRY_DOES_NOT_MAP_TO_CURRENCY', integer() }
  | {'MIN_AD_PRICE_INVALID', integer() }
  | {'GTIN_INVALID', integer() }
  | {'INCONSISTENT_CURRENCY_VALUES', integer() }
  | {'SALES_PRICE_TOO_LOW', integer() }
  | {'SHIPPING_WIDTH_INVALID', integer() }
  | {'SHIPPING_HEIGHT_INVALID', integer() }
  | {'SALES_PRICE_TOO_HIGH', integer() }
  | {'MPN_INVALID', integer() }
  ].


openapi_catalogs_feed_validation_warnings() ->
    openapi_catalogs_feed_validation_warnings([]).

openapi_catalogs_feed_validation_warnings(Fields) ->
  Default = [ {'AD_LINK_FORMAT_WARNING', integer() }
            , {'AD_LINK_SAME_AS_LINK', integer() }
            , {'TITLE_LENGTH_TOO_LONG', integer() }
            , {'DESCRIPTION_LENGTH_TOO_LONG', integer() }
            , {'GENDER_INVALID', integer() }
            , {'AGE_GROUP_INVALID', integer() }
            , {'SIZE_TYPE_INVALID', integer() }
            , {'SIZE_SYSTEM_INVALID', integer() }
            , {'LINK_FORMAT_WARNING', integer() }
            , {'SALES_PRICE_INVALID', integer() }
            , {'PRODUCT_CATEGORY_DEPTH_WARNING', integer() }
            , {'ADWORDS_FORMAT_WARNING', integer() }
            , {'ADWORDS_SAME_AS_LINK', integer() }
            , {'DUPLICATE_HEADERS', integer() }
            , {'FETCH_SAME_SIGNATURE', integer() }
            , {'ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG', integer() }
            , {'ADDITIONAL_IMAGE_LINK_WARNING', integer() }
            , {'IMAGE_LINK_WARNING', integer() }
            , {'SHIPPING_INVALID', integer() }
            , {'TAX_INVALID', integer() }
            , {'SHIPPING_WEIGHT_INVALID', integer() }
            , {'EXPIRATION_DATE_INVALID', integer() }
            , {'AVAILABILITY_DATE_INVALID', integer() }
            , {'SALE_DATE_INVALID', integer() }
            , {'WEIGHT_UNIT_INVALID', integer() }
            , {'IS_BUNDLE_INVALID', integer() }
            , {'UPDATED_TIME_INVALID', integer() }
            , {'CUSTOM_LABEL_LENGTH_TOO_LONG', integer() }
            , {'PRODUCT_TYPE_LENGTH_TOO_LONG', integer() }
            , {'TOO_MANY_ADDITIONAL_IMAGE_LINKS', integer() }
            , {'MULTIPACK_INVALID', integer() }
            , {'INDEXED_PRODUCT_COUNT_LARGE_DELTA', integer() }
            , {'ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE', integer() }
            , {'OPTIONAL_PRODUCT_CATEGORY_MISSING', integer() }
            , {'OPTIONAL_PRODUCT_CATEGORY_INVALID', integer() }
            , {'OPTIONAL_CONDITION_MISSING', integer() }
            , {'OPTIONAL_CONDITION_INVALID', integer() }
            , {'IOS_DEEP_LINK_INVALID', integer() }
            , {'ANDROID_DEEP_LINK_INVALID', integer() }
            , {'UTM_SOURCE_AUTO_CORRECTED', integer() }
            , {'COUNTRY_DOES_NOT_MAP_TO_CURRENCY', integer() }
            , {'MIN_AD_PRICE_INVALID', integer() }
            , {'GTIN_INVALID', integer() }
            , {'INCONSISTENT_CURRENCY_VALUES', integer() }
            , {'SALES_PRICE_TOO_LOW', integer() }
            , {'SHIPPING_WIDTH_INVALID', integer() }
            , {'SHIPPING_HEIGHT_INVALID', integer() }
            , {'SALES_PRICE_TOO_HIGH', integer() }
            , {'MPN_INVALID', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

