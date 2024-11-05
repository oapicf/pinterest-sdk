-module(openapi_create_invites_results_response_array_items_inner_invite).

-include("openapi.hrl").

-export([openapi_create_invites_results_response_array_items_inner_invite/0]).

-export([openapi_create_invites_results_response_array_items_inner_invite/1]).

-export_type([openapi_create_invites_results_response_array_items_inner_invite/0]).

-type openapi_create_invites_results_response_array_items_inner_invite() ::
  [ {'id', binary() }
  | {'user', openapi_business_access_user_summary:openapi_business_access_user_summary() }
  ].


openapi_create_invites_results_response_array_items_inner_invite() ->
    openapi_create_invites_results_response_array_items_inner_invite([]).

openapi_create_invites_results_response_array_items_inner_invite(Fields) ->
  Default = [ {'id', binary() }
            , {'user', openapi_business_access_user_summary:openapi_business_access_user_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

