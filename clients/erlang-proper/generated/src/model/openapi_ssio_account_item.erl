-module(openapi_ssio_account_item).

-include("openapi.hrl").

-export([openapi_ssio_account_item/0]).

-export([openapi_ssio_account_item/1]).

-export_type([openapi_ssio_account_item/0]).

-type openapi_ssio_account_item() ::
  [ {'addresses', list(openapi_s_sio_account_address:openapi_s_sio_account_address()) }
  | {'id', binary() }
  | {'io_terms', binary() }
  | {'io_terms_id', binary() }
  | {'io_type', binary() }
  | {'row_terms', binary() }
  | {'row_terms_id', binary() }
  | {'us_terms', binary() }
  | {'us_terms_id', binary() }
  ].


openapi_ssio_account_item() ->
    openapi_ssio_account_item([]).

openapi_ssio_account_item(Fields) ->
  Default = [ {'addresses', list(openapi_s_sio_account_address:openapi_s_sio_account_address()) }
            , {'id', binary() }
            , {'io_terms', binary() }
            , {'io_terms_id', binary() }
            , {'io_type', binary() }
            , {'row_terms', binary() }
            , {'row_terms_id', binary() }
            , {'us_terms', binary() }
            , {'us_terms_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

