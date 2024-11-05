-module(openapi_catalogs_hotel_product_metadata).

-include("openapi.hrl").

-export([openapi_catalogs_hotel_product_metadata/0]).

-export([openapi_catalogs_hotel_product_metadata/1]).

-export_type([openapi_catalogs_hotel_product_metadata/0]).

-type openapi_catalogs_hotel_product_metadata() ::
  [ {'hotel_id', binary() }
  ].


openapi_catalogs_hotel_product_metadata() ->
    openapi_catalogs_hotel_product_metadata([]).

openapi_catalogs_hotel_product_metadata(Fields) ->
  Default = [ {'hotel_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

