-module(openapi_ssio_account_address).

-include("openapi.hrl").

-export([openapi_ssio_account_address/0]).

-export([openapi_ssio_account_address/1]).

-export_type([openapi_ssio_account_address/0]).

-type openapi_ssio_account_address() ::
  [ {'display', binary() }
  | {'purpose', binary() }
  | {'address_id', binary() }
  | {'order_legal_entity', binary() }
  ].


openapi_ssio_account_address() ->
    openapi_ssio_account_address([]).

openapi_ssio_account_address(Fields) ->
  Default = [ {'display', binary() }
            , {'purpose', binary() }
            , {'address_id', binary() }
            , {'order_legal_entity', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

