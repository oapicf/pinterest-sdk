-module(openapi_catalogs_product_group_filter_keys).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_filter_keys/0]).

-export([openapi_catalogs_product_group_filter_keys/1]).

-export_type([openapi_catalogs_product_group_filter_keys/0]).

-type openapi_catalogs_product_group_filter_keys() ::
  [ {'MIN_PRICE', openapi_catalogs_product_group_pricing_criteria:openapi_catalogs_product_group_pricing_criteria() }
  | {'MAX_PRICE', openapi_catalogs_product_group_pricing_criteria:openapi_catalogs_product_group_pricing_criteria() }
  | {'CURRENCY', openapi_catalogs_product_group_currency_criteria:openapi_catalogs_product_group_currency_criteria() }
  | {'ITEM_ID', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'AVAILABILITY', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'BRAND', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'CONDITION', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'CUSTOM_LABEL_0', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'CUSTOM_LABEL_1', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'CUSTOM_LABEL_2', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'CUSTOM_LABEL_3', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'CUSTOM_LABEL_4', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'ITEM_GROUP_ID', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'GENDER', openapi_catalogs_product_group_multiple_gender_criteria:openapi_catalogs_product_group_multiple_gender_criteria() }
  | {'MEDIA_TYPE', openapi_catalogs_product_group_multiple_media_types_criteria:openapi_catalogs_product_group_multiple_media_types_criteria() }
  | {'PRODUCT_TYPE_4', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  | {'PRODUCT_TYPE_3', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  | {'PRODUCT_TYPE_2', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  | {'PRODUCT_TYPE_1', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  | {'PRODUCT_TYPE_0', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  | {'GOOGLE_PRODUCT_CATEGORY_6', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  | {'GOOGLE_PRODUCT_CATEGORY_5', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  | {'GOOGLE_PRODUCT_CATEGORY_4', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  | {'GOOGLE_PRODUCT_CATEGORY_3', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  | {'GOOGLE_PRODUCT_CATEGORY_2', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  | {'GOOGLE_PRODUCT_CATEGORY_1', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  | {'GOOGLE_PRODUCT_CATEGORY_0', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  | {'PRODUCT_GROUP', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  ].


openapi_catalogs_product_group_filter_keys() ->
    openapi_catalogs_product_group_filter_keys([]).

openapi_catalogs_product_group_filter_keys(Fields) ->
  Default = [ {'MIN_PRICE', openapi_catalogs_product_group_pricing_criteria:openapi_catalogs_product_group_pricing_criteria() }
            , {'MAX_PRICE', openapi_catalogs_product_group_pricing_criteria:openapi_catalogs_product_group_pricing_criteria() }
            , {'CURRENCY', openapi_catalogs_product_group_currency_criteria:openapi_catalogs_product_group_currency_criteria() }
            , {'ITEM_ID', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'AVAILABILITY', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'BRAND', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'CONDITION', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'CUSTOM_LABEL_0', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'CUSTOM_LABEL_1', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'CUSTOM_LABEL_2', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'CUSTOM_LABEL_3', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'CUSTOM_LABEL_4', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'ITEM_GROUP_ID', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'GENDER', openapi_catalogs_product_group_multiple_gender_criteria:openapi_catalogs_product_group_multiple_gender_criteria() }
            , {'MEDIA_TYPE', openapi_catalogs_product_group_multiple_media_types_criteria:openapi_catalogs_product_group_multiple_media_types_criteria() }
            , {'PRODUCT_TYPE_4', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            , {'PRODUCT_TYPE_3', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            , {'PRODUCT_TYPE_2', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            , {'PRODUCT_TYPE_1', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            , {'PRODUCT_TYPE_0', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            , {'GOOGLE_PRODUCT_CATEGORY_6', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            , {'GOOGLE_PRODUCT_CATEGORY_5', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            , {'GOOGLE_PRODUCT_CATEGORY_4', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            , {'GOOGLE_PRODUCT_CATEGORY_3', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            , {'GOOGLE_PRODUCT_CATEGORY_2', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            , {'GOOGLE_PRODUCT_CATEGORY_1', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            , {'GOOGLE_PRODUCT_CATEGORY_0', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            , {'PRODUCT_GROUP', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

