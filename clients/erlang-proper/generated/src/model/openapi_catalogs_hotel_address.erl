-module(openapi_catalogs_hotel_address).

-include("openapi.hrl").

-export([openapi_catalogs_hotel_address/0]).

-export([openapi_catalogs_hotel_address/1]).

-export_type([openapi_catalogs_hotel_address/0]).

-type openapi_catalogs_hotel_address() ::
  [ {'addr1', binary() }
  | {'city', binary() }
  | {'region', binary() }
  | {'country', binary() }
  | {'postal_code', binary() }
  ].


openapi_catalogs_hotel_address() ->
    openapi_catalogs_hotel_address([]).

openapi_catalogs_hotel_address(Fields) ->
  Default = [ {'addr1', binary() }
            , {'city', binary() }
            , {'region', binary() }
            , {'country', binary() }
            , {'postal_code', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

