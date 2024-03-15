-module(openapi_hotel_id_filter).

-include("openapi.hrl").

-export([openapi_hotel_id_filter/0]).

-export([openapi_hotel_id_filter/1]).

-export_type([openapi_hotel_id_filter/0]).

-type openapi_hotel_id_filter() ::
  [ {'HOTEL_ID', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
  ].


openapi_hotel_id_filter() ->
    openapi_hotel_id_filter([]).

openapi_hotel_id_filter(Fields) ->
  Default = [ {'HOTEL_ID', openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

