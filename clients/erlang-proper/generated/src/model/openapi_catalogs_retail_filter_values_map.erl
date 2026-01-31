-module(openapi_catalogs_retail_filter_values_map).

-include("openapi.hrl").

-export([openapi_catalogs_retail_filter_values_map/0]).

-export([openapi_catalogs_retail_filter_values_map/1]).

-export_type([openapi_catalogs_retail_filter_values_map/0]).

-type openapi_catalogs_retail_filter_values_map() ::
  [ {'ad_image_tags', list(binary()) }
  | {'ad_video_tags', list(binary()) }
  | {'availability', list(binary()) }
  | {'brand', list(binary()) }
  | {'condition', list(binary()) }
  | {'custom_label_0', list(binary()) }
  | {'custom_label_1', list(binary()) }
  | {'custom_label_2', list(binary()) }
  | {'custom_label_3', list(binary()) }
  | {'custom_label_4', list(binary()) }
  | {'gender', list(binary()) }
  | {'google_product_category_0', list(binary()) }
  | {'google_product_category_1', list(binary()) }
  | {'google_product_category_2', list(binary()) }
  | {'google_product_category_3', list(binary()) }
  | {'google_product_category_4', list(binary()) }
  | {'google_product_category_5', list(binary()) }
  | {'google_product_category_6', list(binary()) }
  | {'media_type', list(binary()) }
  | {'product_type_0', list(binary()) }
  | {'product_type_1', list(binary()) }
  | {'product_type_2', list(binary()) }
  | {'product_type_3', list(binary()) }
  | {'product_type_4', list(binary()) }
  ].


openapi_catalogs_retail_filter_values_map() ->
    openapi_catalogs_retail_filter_values_map([]).

openapi_catalogs_retail_filter_values_map(Fields) ->
  Default = [ {'ad_image_tags', list(binary()) }
            , {'ad_video_tags', list(binary()) }
            , {'availability', list(binary()) }
            , {'brand', list(binary()) }
            , {'condition', list(binary()) }
            , {'custom_label_0', list(binary()) }
            , {'custom_label_1', list(binary()) }
            , {'custom_label_2', list(binary()) }
            , {'custom_label_3', list(binary()) }
            , {'custom_label_4', list(binary()) }
            , {'gender', list(binary()) }
            , {'google_product_category_0', list(binary()) }
            , {'google_product_category_1', list(binary()) }
            , {'google_product_category_2', list(binary()) }
            , {'google_product_category_3', list(binary()) }
            , {'google_product_category_4', list(binary()) }
            , {'google_product_category_5', list(binary()) }
            , {'google_product_category_6', list(binary()) }
            , {'media_type', list(binary()) }
            , {'product_type_0', list(binary()) }
            , {'product_type_1', list(binary()) }
            , {'product_type_2', list(binary()) }
            , {'product_type_3', list(binary()) }
            , {'product_type_4', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

