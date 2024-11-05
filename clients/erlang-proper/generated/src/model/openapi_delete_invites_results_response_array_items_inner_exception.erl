-module(openapi_delete_invites_results_response_array_items_inner_exception).

-include("openapi.hrl").

-export([openapi_delete_invites_results_response_array_items_inner_exception/0]).

-export([openapi_delete_invites_results_response_array_items_inner_exception/1]).

-export_type([openapi_delete_invites_results_response_array_items_inner_exception/0]).

-type openapi_delete_invites_results_response_array_items_inner_exception() ::
  [ {'invite_id', binary() }
  | {'message', binary() }
  ].


openapi_delete_invites_results_response_array_items_inner_exception() ->
    openapi_delete_invites_results_response_array_items_inner_exception([]).

openapi_delete_invites_results_response_array_items_inner_exception(Fields) ->
  Default = [ {'invite_id', binary() }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

