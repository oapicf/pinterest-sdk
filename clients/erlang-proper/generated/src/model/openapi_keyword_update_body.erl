-module(openapi_keyword_update_body).

-include("openapi.hrl").

-export([openapi_keyword_update_body/0]).

-export([openapi_keyword_update_body/1]).

-export_type([openapi_keyword_update_body/0]).

-type openapi_keyword_update_body() ::
  [ {'keywords', list(openapi_keyword_update:openapi_keyword_update()) }
  ].


openapi_keyword_update_body() ->
    openapi_keyword_update_body([]).

openapi_keyword_update_body(Fields) ->
  Default = [ {'keywords', list(openapi_keyword_update:openapi_keyword_update()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

