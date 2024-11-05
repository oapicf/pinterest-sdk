-module(openapi_catalogs_hotel_items_post_filter).

-include("openapi.hrl").

-export([openapi_catalogs_hotel_items_post_filter/0]).

-export([openapi_catalogs_hotel_items_post_filter/1]).

-export_type([openapi_catalogs_hotel_items_post_filter/0]).

-type openapi_catalogs_hotel_items_post_filter() ::
  [ {'catalog_type', binary() }
  | {'hotel_ids', list(binary()) }
  | {'catalog_id', binary() }
  ].


openapi_catalogs_hotel_items_post_filter() ->
    openapi_catalogs_hotel_items_post_filter([]).

openapi_catalogs_hotel_items_post_filter(Fields) ->
  Default = [ {'catalog_type', elements([<<"HOTEL">>]) }
            , {'hotel_ids', list(binary(), 1, 1000) }
            , {'catalog_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

