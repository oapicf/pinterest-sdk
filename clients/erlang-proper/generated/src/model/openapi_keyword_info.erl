-module(openapi_keyword_info).

-include("openapi.hrl").

-export([openapi_keyword_info/0]).

-export([openapi_keyword_info/1]).

-export_type([openapi_keyword_info/0]).

-type openapi_keyword_info() ::
  [ {'name', binary() }
  | {'pct_growth_mom', integer() }
  ].


openapi_keyword_info() ->
    openapi_keyword_info([]).

openapi_keyword_info(Fields) ->
  Default = [ {'name', binary() }
            , {'pct_growth_mom', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

