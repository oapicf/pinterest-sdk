-module(openapi_follow_user_create).

-include("openapi.hrl").

-export([openapi_follow_user_create/0]).

-export([openapi_follow_user_create/1]).

-export_type([openapi_follow_user_create/0]).

-type openapi_follow_user_create() ::
  [ {'auto_follow', boolean() }
  ].


openapi_follow_user_create() ->
    openapi_follow_user_create([]).

openapi_follow_user_create(Fields) ->
  Default = [ {'auto_follow', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

