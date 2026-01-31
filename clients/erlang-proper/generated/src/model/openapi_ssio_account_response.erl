-module(openapi_ssio_account_response).

-include("openapi.hrl").

-export([openapi_ssio_account_response/0]).

-export([openapi_ssio_account_response/1]).

-export_type([openapi_ssio_account_response/0]).

-type openapi_ssio_account_response() ::
  [ {'billto_infos', list(openapi_s_sio_account_item:openapi_s_sio_account_item()) }
  | {'can_edit', boolean() }
  | {'currency', binary() }
  | {'eligible', boolean() }
  | {'error', binary() }
  | {'pmp_names', list(openapi_s_sio_account_pmp_name:openapi_s_sio_account_pmp_name()) }
  ].


openapi_ssio_account_response() ->
    openapi_ssio_account_response([]).

openapi_ssio_account_response(Fields) ->
  Default = [ {'billto_infos', list(openapi_s_sio_account_item:openapi_s_sio_account_item()) }
            , {'can_edit', boolean() }
            , {'currency', binary() }
            , {'eligible', boolean() }
            , {'error', binary() }
            , {'pmp_names', list(openapi_s_sio_account_pmp_name:openapi_s_sio_account_pmp_name()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

