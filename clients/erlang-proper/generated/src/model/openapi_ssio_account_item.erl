-module(openapi_ssio_account_item).

-include("openapi.hrl").

-export([openapi_ssio_account_item/0]).

-export([openapi_ssio_account_item/1]).

-export_type([openapi_ssio_account_item/0]).

-type openapi_ssio_account_item() ::
  [ {'id', binary() }
  | {'io_terms_id', binary() }
  | {'io_terms', binary() }
  | {'us_terms_id', binary() }
  | {'us_terms', binary() }
  | {'row_terms_id', binary() }
  | {'row_terms', binary() }
  | {'io_type', binary() }
  | {'addresses', list(openapi_s_sio_account_address:openapi_s_sio_account_address()) }
  ].


openapi_ssio_account_item() ->
    openapi_ssio_account_item([]).

openapi_ssio_account_item(Fields) ->
  Default = [ {'id', binary() }
            , {'io_terms_id', binary() }
            , {'io_terms', binary() }
            , {'us_terms_id', binary() }
            , {'us_terms', binary() }
            , {'row_terms_id', binary() }
            , {'row_terms', binary() }
            , {'io_type', binary() }
            , {'addresses', list(openapi_s_sio_account_address:openapi_s_sio_account_address()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

