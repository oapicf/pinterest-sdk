-module(openapi_local_store_create).

-include("openapi.hrl").

-export([openapi_local_store_create/0]).

-export([openapi_local_store_create/1]).

-export_type([openapi_local_store_create/0]).

-type openapi_local_store_create() ::
  [ {'address_primary', binary() }
  | {'address_secondary', binary() }
  | {'city', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'latitude', integer() }
  | {'longitude', integer() }
  | {'name', binary() }
  | {'postal_code', binary() }
  | {'region', binary() }
  | {'store_code', binary() }
  ].


openapi_local_store_create() ->
    openapi_local_store_create([]).

openapi_local_store_create(Fields) ->
  Default = [ {'address_primary', binary() }
            , {'address_secondary', binary() }
            , {'city', binary() }
            , {'country', openapi_country:openapi_country() }
            , {'latitude', integer() }
            , {'longitude', integer() }
            , {'name', binary() }
            , {'postal_code', binary() }
            , {'region', binary() }
            , {'store_code', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

