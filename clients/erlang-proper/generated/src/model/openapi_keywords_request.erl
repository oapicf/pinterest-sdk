-module(openapi_keywords_request).

-include("openapi.hrl").

-export([openapi_keywords_request/0]).

-export([openapi_keywords_request/1]).

-export_type([openapi_keywords_request/0]).

-type openapi_keywords_request() ::
  [ {'keywords', list(openapi_keywords_common:openapi_keywords_common()) }
  | {'parent_id', binary() }
  ].


openapi_keywords_request() ->
    openapi_keywords_request([]).

openapi_keywords_request(Fields) ->
  Default = [ {'keywords', list(openapi_keywords_common:openapi_keywords_common()) }
            , {'parent_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

