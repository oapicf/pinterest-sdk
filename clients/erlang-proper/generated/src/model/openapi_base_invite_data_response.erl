-module(openapi_base_invite_data_response).

-include("openapi.hrl").

-export([openapi_base_invite_data_response/0]).

-export([openapi_base_invite_data_response/1]).

-export_type([openapi_base_invite_data_response/0]).

-type openapi_base_invite_data_response() ::
  [ {'id', binary() }
  | {'invite_data', openapi_base_invite_data_response_invite_data:openapi_base_invite_data_response_invite_data() }
  | {'is_received_invite', boolean() }
  | {'user', openapi_business_access_user_summary:openapi_business_access_user_summary() }
  ].


openapi_base_invite_data_response() ->
    openapi_base_invite_data_response([]).

openapi_base_invite_data_response(Fields) ->
  Default = [ {'id', binary() }
            , {'invite_data', openapi_base_invite_data_response_invite_data:openapi_base_invite_data_response_invite_data() }
            , {'is_received_invite', boolean() }
            , {'user', openapi_business_access_user_summary:openapi_business_access_user_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

