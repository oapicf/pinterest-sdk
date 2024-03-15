-module(openapi_keywords_common).

-include("openapi.hrl").

-export([openapi_keywords_common/0]).

-export([openapi_keywords_common/1]).

-export_type([openapi_keywords_common/0]).

-type openapi_keywords_common() ::
  [ {'bid', integer() }
  | {'match_type', openapi_match_type_response:openapi_match_type_response() }
  | {'value', binary() }
  ].


openapi_keywords_common() ->
    openapi_keywords_common([]).

openapi_keywords_common(Fields) ->
  Default = [ {'bid', integer() }
            , {'match_type', openapi_match_type_response:openapi_match_type_response() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

