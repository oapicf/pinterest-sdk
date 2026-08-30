-module(openapi_keyword_create_item).

-include("openapi.hrl").

-export([openapi_keyword_create_item/0]).

-export([openapi_keyword_create_item/1]).

-export_type([openapi_keyword_create_item/0]).

-type openapi_keyword_create_item() ::
  [ {'bid', integer() }
  | {'match_type', openapi_match_type:openapi_match_type() }
  | {'value', binary() }
  ].


openapi_keyword_create_item() ->
    openapi_keyword_create_item([]).

openapi_keyword_create_item(Fields) ->
  Default = [ {'bid', integer() }
            , {'match_type', openapi_match_type:openapi_match_type() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

