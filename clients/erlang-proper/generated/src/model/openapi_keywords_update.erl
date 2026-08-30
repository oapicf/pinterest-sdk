-module(openapi_keywords_update).

-include("openapi.hrl").

-export([openapi_keywords_update/0]).

-export([openapi_keywords_update/1]).

-export_type([openapi_keywords_update/0]).

-type openapi_keywords_update() ::
  [ {'keywords', list(openapi_keyword_update_item:openapi_keyword_update_item()) }
  ].


openapi_keywords_update() ->
    openapi_keywords_update([]).

openapi_keywords_update(Fields) ->
  Default = [ {'keywords', list(openapi_keyword_update_item:openapi_keyword_update_item()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

