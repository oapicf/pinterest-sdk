-module(openapi_members_to_delete_body).

-include("openapi.hrl").

-export([openapi_members_to_delete_body/0]).

-export([openapi_members_to_delete_body/1]).

-export_type([openapi_members_to_delete_body/0]).

-type openapi_members_to_delete_body() ::
  [ {'members', list(openapi_members_to_delete_body_members_inner:openapi_members_to_delete_body_members_inner()) }
  ].


openapi_members_to_delete_body() ->
    openapi_members_to_delete_body([]).

openapi_members_to_delete_body(Fields) ->
  Default = [ {'members', list(openapi_members_to_delete_body_members_inner:openapi_members_to_delete_body_members_inner(), 1, 50) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

