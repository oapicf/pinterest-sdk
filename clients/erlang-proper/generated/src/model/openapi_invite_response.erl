-module(openapi_invite_response).

-include("openapi.hrl").

-export([openapi_invite_response/0]).

-export([openapi_invite_response/1]).

-export_type([openapi_invite_response/0]).

-type openapi_invite_response() ::
  [ {'id', binary() }
  | {'invite_data', openapi_base_invite_data_response_invite_data:openapi_base_invite_data_response_invite_data() }
  | {'is_received_invite', boolean() }
  | {'user', openapi_business_access_user_summary:openapi_business_access_user_summary() }
  | {'assets_summary', openapi_invite_assets_summary:openapi_invite_assets_summary() }
  | {'business_roles', list(binary()) }
  | {'created_by_business', map() }
  | {'created_by_user', map() }
  | {'created_time', integer() }
  ].


openapi_invite_response() ->
    openapi_invite_response([]).

openapi_invite_response(Fields) ->
  Default = [ {'id', binary() }
            , {'invite_data', openapi_base_invite_data_response_invite_data:openapi_base_invite_data_response_invite_data() }
            , {'is_received_invite', boolean() }
            , {'user', openapi_business_access_user_summary:openapi_business_access_user_summary() }
            , {'assets_summary', openapi_invite_assets_summary:openapi_invite_assets_summary() }
            , {'business_roles', list(binary()) }
            , {'created_by_business', map() }
            , {'created_by_user', map() }
            , {'created_time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

