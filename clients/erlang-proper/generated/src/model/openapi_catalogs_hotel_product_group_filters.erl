-module(openapi_catalogs_hotel_product_group_filters).

-include("openapi.hrl").

-export([openapi_catalogs_hotel_product_group_filters/0]).

-export([openapi_catalogs_hotel_product_group_filters/1]).

-export_type([openapi_catalogs_hotel_product_group_filters/0]).

-type openapi_catalogs_hotel_product_group_filters() ::
  [ {'any_of', list(openapi_catalogs_hotel_product_group_filter_keys:openapi_catalogs_hotel_product_group_filter_keys()) }
  | {'all_of', list(openapi_catalogs_hotel_product_group_filter_keys:openapi_catalogs_hotel_product_group_filter_keys()) }
  ].


openapi_catalogs_hotel_product_group_filters() ->
    openapi_catalogs_hotel_product_group_filters([]).

openapi_catalogs_hotel_product_group_filters(Fields) ->
  Default = [ {'any_of', list(openapi_catalogs_hotel_product_group_filter_keys:openapi_catalogs_hotel_product_group_filter_keys()) }
            , {'all_of', list(openapi_catalogs_hotel_product_group_filter_keys:openapi_catalogs_hotel_product_group_filter_keys()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

