-module(openapi_keyword_update_item).

-include("openapi.hrl").

-export([openapi_keyword_update_item/0]).

-export([openapi_keyword_update_item/1]).

-export_type([openapi_keyword_update_item/0]).

-type openapi_keyword_update_item() ::
  [ {'archived', boolean() }
  | {'bid', integer() }
  | {'id', binary() }
  ].


openapi_keyword_update_item() ->
    openapi_keyword_update_item([]).

openapi_keyword_update_item(Fields) ->
  Default = [ {'archived', boolean() }
            , {'bid', integer() }
            , {'id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

