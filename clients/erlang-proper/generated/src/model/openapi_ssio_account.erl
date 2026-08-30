-module(openapi_ssio_account).

-include("openapi.hrl").

-export([openapi_ssio_account/0]).

-export([openapi_ssio_account/1]).

-export_type([openapi_ssio_account/0]).

-type openapi_ssio_account() ::
  [ {'billto_infos', list(openapi_s_sio_account_item:openapi_s_sio_account_item()) }
  | {'can_edit', boolean() }
  | {'currency', binary() }
  | {'eligible', boolean() }
  | {'error', binary() }
  | {'pmp_names', list(openapi_s_sio_account_pmp_name:openapi_s_sio_account_pmp_name()) }
  ].


openapi_ssio_account() ->
    openapi_ssio_account([]).

openapi_ssio_account(Fields) ->
  Default = [ {'billto_infos', list(openapi_s_sio_account_item:openapi_s_sio_account_item()) }
            , {'can_edit', boolean() }
            , {'currency', binary() }
            , {'eligible', boolean() }
            , {'error', binary() }
            , {'pmp_names', list(openapi_s_sio_account_pmp_name:openapi_s_sio_account_pmp_name()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

