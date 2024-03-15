-module(openapi_ssio_account_response).

-include("openapi.hrl").

-export([openapi_ssio_account_response/0]).

-export([openapi_ssio_account_response/1]).

-export_type([openapi_ssio_account_response/0]).

-type openapi_ssio_account_response() ::
  [ {'eligible', boolean() }
  | {'can_edit', boolean() }
  | {'billto_infos', list(openapi_s_sio_account_item:openapi_s_sio_account_item()) }
  | {'currency', binary() }
  | {'pmp_names', list(openapi_s_sio_account_pmp_name:openapi_s_sio_account_pmp_name()) }
  | {'error', binary() }
  ].


openapi_ssio_account_response() ->
    openapi_ssio_account_response([]).

openapi_ssio_account_response(Fields) ->
  Default = [ {'eligible', boolean() }
            , {'can_edit', boolean() }
            , {'billto_infos', list(openapi_s_sio_account_item:openapi_s_sio_account_item()) }
            , {'currency', binary() }
            , {'pmp_names', list(openapi_s_sio_account_pmp_name:openapi_s_sio_account_pmp_name()) }
            , {'error', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

