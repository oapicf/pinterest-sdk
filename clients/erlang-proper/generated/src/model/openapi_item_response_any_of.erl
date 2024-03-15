-module(openapi_item_response_any_of).

-include("openapi.hrl").

-export([openapi_item_response_any_of/0]).

-export([openapi_item_response_any_of/1]).

-export_type([openapi_item_response_any_of/0]).

-type openapi_item_response_any_of() ::
  [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
  | {'item_id', binary() }
  | {'pins', list(openapi_pin:openapi_pin()) }
  | {'attributes', openapi_catalogs_hotel_attributes:openapi_catalogs_hotel_attributes() }
  | {'hotel_id', binary() }
  ].


openapi_item_response_any_of() ->
    openapi_item_response_any_of([]).

openapi_item_response_any_of(Fields) ->
  Default = [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
            , {'item_id', binary() }
            , {'pins', list(openapi_pin:openapi_pin()) }
            , {'attributes', openapi_catalogs_hotel_attributes:openapi_catalogs_hotel_attributes() }
            , {'hotel_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

