-module(openapi_invite_business_role_binding).

-include("openapi.hrl").

-export([openapi_invite_business_role_binding/0]).

-export([openapi_invite_business_role_binding/1]).

-export_type([openapi_invite_business_role_binding/0]).

-type openapi_invite_business_role_binding() ::
  [ {'created_by_business_id', binary() }
  | {'created_by_user_id', binary() }
  | {'user', openapi_business_access_user_summary:openapi_business_access_user_summary() }
  | {'id', binary() }
  | {'invite_data', openapi_base_invite_data_response_invite_data:openapi_base_invite_data_response_invite_data() }
  | {'is_received_invite', boolean() }
  ].


openapi_invite_business_role_binding() ->
    openapi_invite_business_role_binding([]).

openapi_invite_business_role_binding(Fields) ->
  Default = [ {'created_by_business_id', binary() }
            , {'created_by_user_id', binary() }
            , {'user', openapi_business_access_user_summary:openapi_business_access_user_summary() }
            , {'id', binary() }
            , {'invite_data', openapi_base_invite_data_response_invite_data:openapi_base_invite_data_response_invite_data() }
            , {'is_received_invite', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

