-module(openapi_keywords_create).

-include("openapi.hrl").

-export([openapi_keywords_create/0]).

-export([openapi_keywords_create/1]).

-export_type([openapi_keywords_create/0]).

-type openapi_keywords_create() ::
  [ {'keywords', list(openapi_keyword_create_item:openapi_keyword_create_item()) }
  | {'parent_id', binary() }
  ].


openapi_keywords_create() ->
    openapi_keywords_create([]).

openapi_keywords_create(Fields) ->
  Default = [ {'keywords', list(openapi_keyword_create_item:openapi_keyword_create_item()) }
            , {'parent_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

