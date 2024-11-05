-module(openapi_deleted_members_response).

-include("openapi.hrl").

-export([openapi_deleted_members_response/0]).

-export([openapi_deleted_members_response/1]).

-export_type([openapi_deleted_members_response/0]).

-type openapi_deleted_members_response() ::
  [ {'deleted_members', list(binary()) }
  ].


openapi_deleted_members_response() ->
    openapi_deleted_members_response([]).

openapi_deleted_members_response(Fields) ->
  Default = [ {'deleted_members', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

