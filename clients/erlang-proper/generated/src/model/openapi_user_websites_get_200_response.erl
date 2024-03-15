-module(openapi_user_websites_get_200_response).

-include("openapi.hrl").

-export([openapi_user_websites_get_200_response/0]).

-export([openapi_user_websites_get_200_response/1]).

-export_type([openapi_user_websites_get_200_response/0]).

-type openapi_user_websites_get_200_response() ::
  [ {'items', list(openapi_user_website_summary:openapi_user_website_summary()) }
  | {'bookmark', binary() }
  ].


openapi_user_websites_get_200_response() ->
    openapi_user_websites_get_200_response([]).

openapi_user_websites_get_200_response(Fields) ->
  Default = [ {'items', list(openapi_user_website_summary:openapi_user_website_summary()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

