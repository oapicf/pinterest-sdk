-module(openapi_follow_user_request).

-include("openapi.hrl").

-export([openapi_follow_user_request/0]).

-export([openapi_follow_user_request/1]).

-export_type([openapi_follow_user_request/0]).

-type openapi_follow_user_request() ::
  [ {'auto_follow', boolean() }
  ].


openapi_follow_user_request() ->
    openapi_follow_user_request([]).

openapi_follow_user_request(Fields) ->
  Default = [ {'auto_follow', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

