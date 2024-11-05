-module(openapi_catalogs_creative_assets_product_group_filter_keys).

-include("openapi.hrl").

-export([openapi_catalogs_creative_assets_product_group_filter_keys/0]).

-export([openapi_catalogs_creative_assets_product_group_filter_keys/1]).

-export_type([openapi_catalogs_creative_assets_product_group_filter_keys/0]).

-type openapi_catalogs_creative_assets_product_group_filter_keys() ::
  [ {'CREATIVE_ASSETS_ID', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'CUSTOM_LABEL_0', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'CUSTOM_LABEL_1', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'CUSTOM_LABEL_2', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'CUSTOM_LABEL_3', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'CUSTOM_LABEL_4', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'GOOGLE_PRODUCT_CATEGORY_6', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  | {'GOOGLE_PRODUCT_CATEGORY_5', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  | {'GOOGLE_PRODUCT_CATEGORY_4', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  | {'GOOGLE_PRODUCT_CATEGORY_3', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  | {'GOOGLE_PRODUCT_CATEGORY_2', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  | {'GOOGLE_PRODUCT_CATEGORY_1', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  | {'GOOGLE_PRODUCT_CATEGORY_0', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
  | {'MEDIA_TYPE', openapi_catalogs_product_group_multiple_media_types_criteria:openapi_catalogs_product_group_multiple_media_types_criteria() }
  ].


openapi_catalogs_creative_assets_product_group_filter_keys() ->
    openapi_catalogs_creative_assets_product_group_filter_keys([]).

openapi_catalogs_creative_assets_product_group_filter_keys(Fields) ->
  Default = [ {'CREATIVE_ASSETS_ID', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'CUSTOM_LABEL_0', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'CUSTOM_LABEL_1', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'CUSTOM_LABEL_2', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'CUSTOM_LABEL_3', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'CUSTOM_LABEL_4', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'GOOGLE_PRODUCT_CATEGORY_6', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            , {'GOOGLE_PRODUCT_CATEGORY_5', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            , {'GOOGLE_PRODUCT_CATEGORY_4', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            , {'GOOGLE_PRODUCT_CATEGORY_3', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            , {'GOOGLE_PRODUCT_CATEGORY_2', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            , {'GOOGLE_PRODUCT_CATEGORY_1', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            , {'GOOGLE_PRODUCT_CATEGORY_0', openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria() }
            , {'MEDIA_TYPE', openapi_catalogs_product_group_multiple_media_types_criteria:openapi_catalogs_product_group_multiple_media_types_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

