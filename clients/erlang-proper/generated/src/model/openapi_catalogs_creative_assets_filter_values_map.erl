-module(openapi_catalogs_creative_assets_filter_values_map).

-include("openapi.hrl").

-export([openapi_catalogs_creative_assets_filter_values_map/0]).

-export([openapi_catalogs_creative_assets_filter_values_map/1]).

-export_type([openapi_catalogs_creative_assets_filter_values_map/0]).

-type openapi_catalogs_creative_assets_filter_values_map() ::
  [ {'custom_label_0', list(binary()) }
  | {'custom_label_1', list(binary()) }
  | {'custom_label_2', list(binary()) }
  | {'custom_label_3', list(binary()) }
  | {'custom_label_4', list(binary()) }
  | {'google_product_category_0', list(binary()) }
  | {'google_product_category_1', list(binary()) }
  | {'google_product_category_2', list(binary()) }
  | {'google_product_category_3', list(binary()) }
  | {'google_product_category_4', list(binary()) }
  | {'google_product_category_5', list(binary()) }
  | {'google_product_category_6', list(binary()) }
  | {'media_type', list(openapi_media_type:openapi_media_type()) }
  ].


openapi_catalogs_creative_assets_filter_values_map() ->
    openapi_catalogs_creative_assets_filter_values_map([]).

openapi_catalogs_creative_assets_filter_values_map(Fields) ->
  Default = [ {'custom_label_0', list(binary()) }
            , {'custom_label_1', list(binary()) }
            , {'custom_label_2', list(binary()) }
            , {'custom_label_3', list(binary()) }
            , {'custom_label_4', list(binary()) }
            , {'google_product_category_0', list(binary()) }
            , {'google_product_category_1', list(binary()) }
            , {'google_product_category_2', list(binary()) }
            , {'google_product_category_3', list(binary()) }
            , {'google_product_category_4', list(binary()) }
            , {'google_product_category_5', list(binary()) }
            , {'google_product_category_6', list(binary()) }
            , {'media_type', list(openapi_media_type:openapi_media_type()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

