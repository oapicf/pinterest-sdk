-module(openapi_respond_to_invites_response_array).

-include("openapi.hrl").

-export([openapi_respond_to_invites_response_array/0]).

-export([openapi_respond_to_invites_response_array/1]).

-export_type([openapi_respond_to_invites_response_array/0]).

-type openapi_respond_to_invites_response_array() ::
  [ {'items', list(openapi_respond_to_invites_response_array_items_inner:openapi_respond_to_invites_response_array_items_inner()) }
  ].


openapi_respond_to_invites_response_array() ->
    openapi_respond_to_invites_response_array([]).

openapi_respond_to_invites_response_array(Fields) ->
  Default = [ {'items', list(openapi_respond_to_invites_response_array_items_inner:openapi_respond_to_invites_response_array_items_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

