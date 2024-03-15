-module(openapi_followers_list_200_response).

-include("openapi.hrl").

-export([openapi_followers_list_200_response/0]).

-export([openapi_followers_list_200_response/1]).

-export_type([openapi_followers_list_200_response/0]).

-type openapi_followers_list_200_response() ::
  [ {'items', list(openapi_user_summary:openapi_user_summary()) }
  | {'bookmark', binary() }
  ].


openapi_followers_list_200_response() ->
    openapi_followers_list_200_response([]).

openapi_followers_list_200_response(Fields) ->
  Default = [ {'items', list(openapi_user_summary:openapi_user_summary()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

