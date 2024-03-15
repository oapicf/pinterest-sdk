-module(openapi_audience_subcategory).

-include("openapi.hrl").

-export([openapi_audience_subcategory/0]).

-export([openapi_audience_subcategory/1]).

-export_type([openapi_audience_subcategory/0]).

-type openapi_audience_subcategory() ::
  [ {'key', binary() }
  | {'name', binary() }
  | {'ratio', integer() }
  | {'index', integer() }
  | {'id', binary() }
  ].


openapi_audience_subcategory() ->
    openapi_audience_subcategory([]).

openapi_audience_subcategory(Fields) ->
  Default = [ {'key', binary() }
            , {'name', binary() }
            , {'ratio', integer() }
            , {'index', integer() }
            , {'id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

