-module(openapi_catalogs_hotel_product_group_product_counts).

-include("openapi.hrl").

-export([openapi_catalogs_hotel_product_group_product_counts/0]).

-export([openapi_catalogs_hotel_product_group_product_counts/1]).

-export_type([openapi_catalogs_hotel_product_group_product_counts/0]).

-type openapi_catalogs_hotel_product_group_product_counts() ::
  [ {'catalog_type', binary() }
  | {'total', integer() }
  ].


openapi_catalogs_hotel_product_group_product_counts() ->
    openapi_catalogs_hotel_product_group_product_counts([]).

openapi_catalogs_hotel_product_group_product_counts(Fields) ->
  Default = [ {'catalog_type', elements([<<"HOTEL">>]) }
            , {'total', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

