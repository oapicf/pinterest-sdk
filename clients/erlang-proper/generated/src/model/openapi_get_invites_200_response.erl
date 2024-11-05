-module(openapi_get_invites_200_response).

-include("openapi.hrl").

-export([openapi_get_invites_200_response/0]).

-export([openapi_get_invites_200_response/1]).

-export_type([openapi_get_invites_200_response/0]).

-type openapi_get_invites_200_response() ::
  [ {'items', list(openapi_invite_response:openapi_invite_response()) }
  | {'bookmark', binary() }
  ].


openapi_get_invites_200_response() ->
    openapi_get_invites_200_response([]).

openapi_get_invites_200_response(Fields) ->
  Default = [ {'items', list(openapi_invite_response:openapi_invite_response()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

