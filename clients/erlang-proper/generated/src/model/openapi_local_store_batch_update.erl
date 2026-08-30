-module(openapi_local_store_batch_update).

-include("openapi.hrl").

-export([openapi_local_store_batch_update/0]).

-export([openapi_local_store_batch_update/1]).

-export_type([openapi_local_store_batch_update/0]).

-type openapi_local_store_batch_update() ::
  [ {'address_primary', binary() }
  | {'address_secondary', binary() }
  | {'city', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'id', binary() }
  | {'latitude', integer() }
  | {'longitude', integer() }
  | {'name', binary() }
  | {'postal_code', binary() }
  | {'region', binary() }
  | {'store_code', binary() }
  ].


openapi_local_store_batch_update() ->
    openapi_local_store_batch_update([]).

openapi_local_store_batch_update(Fields) ->
  Default = [ {'address_primary', binary() }
            , {'address_secondary', binary() }
            , {'city', binary() }
            , {'country', openapi_country:openapi_country() }
            , {'id', binary() }
            , {'latitude', integer() }
            , {'longitude', integer() }
            , {'name', binary() }
            , {'postal_code', binary() }
            , {'region', binary() }
            , {'store_code', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

