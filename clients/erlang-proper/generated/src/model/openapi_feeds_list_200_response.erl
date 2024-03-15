-module(openapi_feeds_list_200_response).

-include("openapi.hrl").

-export([openapi_feeds_list_200_response/0]).

-export([openapi_feeds_list_200_response/1]).

-export_type([openapi_feeds_list_200_response/0]).

-type openapi_feeds_list_200_response() ::
  [ {'items', list(openapi_catalogs_feed:openapi_catalogs_feed()) }
  | {'bookmark', binary() }
  ].


openapi_feeds_list_200_response() ->
    openapi_feeds_list_200_response([]).

openapi_feeds_list_200_response(Fields) ->
  Default = [ {'items', list(openapi_catalogs_feed:openapi_catalogs_feed()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

