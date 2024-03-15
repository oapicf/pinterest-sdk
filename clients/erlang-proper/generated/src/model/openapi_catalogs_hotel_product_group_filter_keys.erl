-module(openapi_catalogs_hotel_product_group_filter_keys).

-include("openapi.hrl").

-export([openapi_catalogs_hotel_product_group_filter_keys/0]).

-export([openapi_catalogs_hotel_product_group_filter_keys/1]).

-export_type([openapi_catalogs_hotel_product_group_filter_keys/0]).

-type openapi_catalogs_hotel_product_group_filter_keys() ::
  [ {'PRICE', openapi_catalogs_product_group_pricing_currency_criteria:openapi_catalogs_product_group_pricing_currency_criteria() }
  | {'HOTEL_ID', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'BRAND', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'CUSTOM_LABEL_0', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'CUSTOM_LABEL_1', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'CUSTOM_LABEL_2', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'CUSTOM_LABEL_3', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'CUSTOM_LABEL_4', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  | {'COUNTRY', openapi_catalogs_product_group_multiple_countries_criteria:openapi_catalogs_product_group_multiple_countries_criteria() }
  ].


openapi_catalogs_hotel_product_group_filter_keys() ->
    openapi_catalogs_hotel_product_group_filter_keys([]).

openapi_catalogs_hotel_product_group_filter_keys(Fields) ->
  Default = [ {'PRICE', openapi_catalogs_product_group_pricing_currency_criteria:openapi_catalogs_product_group_pricing_currency_criteria() }
            , {'HOTEL_ID', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'BRAND', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'CUSTOM_LABEL_0', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'CUSTOM_LABEL_1', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'CUSTOM_LABEL_2', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'CUSTOM_LABEL_3', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'CUSTOM_LABEL_4', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            , {'COUNTRY', openapi_catalogs_product_group_multiple_countries_criteria:openapi_catalogs_product_group_multiple_countries_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

