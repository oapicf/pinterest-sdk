-module(openapi_ssio_account_address).

-include("openapi.hrl").

-export([openapi_ssio_account_address/0]).

-export([openapi_ssio_account_address/1]).

-export_type([openapi_ssio_account_address/0]).

-type openapi_ssio_account_address() ::
  [ {'address_id', binary() }
  | {'display', binary() }
  | {'order_legal_entity', binary() }
  | {'purpose', binary() }
  ].


openapi_ssio_account_address() ->
    openapi_ssio_account_address([]).

openapi_ssio_account_address(Fields) ->
  Default = [ {'address_id', binary() }
            , {'display', binary() }
            , {'order_legal_entity', binary() }
            , {'purpose', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

