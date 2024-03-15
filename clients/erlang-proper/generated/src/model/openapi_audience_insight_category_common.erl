-module(openapi_audience_insight_category_common).

-include("openapi.hrl").

-export([openapi_audience_insight_category_common/0]).

-export([openapi_audience_insight_category_common/1]).

-export_type([openapi_audience_insight_category_common/0]).

-type openapi_audience_insight_category_common() ::
  [ {'key', binary() }
  | {'name', binary() }
  | {'ratio', integer() }
  | {'index', integer() }
  | {'id', binary() }
  ].


openapi_audience_insight_category_common() ->
    openapi_audience_insight_category_common([]).

openapi_audience_insight_category_common(Fields) ->
  Default = [ {'key', binary() }
            , {'name', binary() }
            , {'ratio', integer() }
            , {'index', integer() }
            , {'id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

