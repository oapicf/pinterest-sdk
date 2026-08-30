-module(openapi_invite_action_result_item).

-include("openapi.hrl").

-export([openapi_invite_action_result_item/0]).

-export([openapi_invite_action_result_item/1]).

-export_type([openapi_invite_action_result_item/0]).

-type openapi_invite_action_result_item() ::
  [ {'exception', openapi_invite_exception_response:openapi_invite_exception_response() }
  | {'invite', openapi_invite_business_role_binding:openapi_invite_business_role_binding() }
  ].


openapi_invite_action_result_item() ->
    openapi_invite_action_result_item([]).

openapi_invite_action_result_item(Fields) ->
  Default = [ {'exception', openapi_invite_exception_response:openapi_invite_exception_response() }
            , {'invite', openapi_invite_business_role_binding:openapi_invite_business_role_binding() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

