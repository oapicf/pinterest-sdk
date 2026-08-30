-module(openapi_local_store).

-include("openapi.hrl").

-export([openapi_local_store/0]).

-export([openapi_local_store/1]).

-export_type([openapi_local_store/0]).

-type openapi_local_store() ::
  [ {'address_primary', binary() }
  | {'address_secondary', binary() }
  | {'city', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'created_at', datetime() }
  | {'id', binary() }
  | {'latitude', integer() }
  | {'longitude', integer() }
  | {'name', binary() }
  | {'postal_code', binary() }
  | {'region', binary() }
  | {'store_code', binary() }
  | {'updated_at', datetime() }
  ].


openapi_local_store() ->
    openapi_local_store([]).

openapi_local_store(Fields) ->
  Default = [ {'address_primary', binary() }
            , {'address_secondary', binary() }
            , {'city', binary() }
            , {'country', openapi_country:openapi_country() }
            , {'created_at', datetime() }
            , {'id', binary() }
            , {'latitude', integer() }
            , {'longitude', integer() }
            , {'name', binary() }
            , {'postal_code', binary() }
            , {'region', binary() }
            , {'store_code', binary() }
            , {'updated_at', datetime() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

