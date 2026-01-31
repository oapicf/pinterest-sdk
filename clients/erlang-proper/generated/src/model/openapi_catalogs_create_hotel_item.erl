-module(openapi_catalogs_create_hotel_item).

-include("openapi.hrl").

-export([openapi_catalogs_create_hotel_item/0]).

-export([openapi_catalogs_create_hotel_item/1]).

-export_type([openapi_catalogs_create_hotel_item/0]).

-type openapi_catalogs_create_hotel_item() ::
  [ {'attributes', openapi_catalogs_hotel_attributes:openapi_catalogs_hotel_attributes() }
  | {'hotel_id', binary() }
  | {'operation', binary() }
  ].


openapi_catalogs_create_hotel_item() ->
    openapi_catalogs_create_hotel_item([]).

openapi_catalogs_create_hotel_item(Fields) ->
  Default = [ {'attributes', openapi_catalogs_hotel_attributes:openapi_catalogs_hotel_attributes() }
            , {'hotel_id', binary() }
            , {'operation', elements([<<"CREATE">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

