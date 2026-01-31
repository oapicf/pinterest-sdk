-module(openapi_audience_subcategory).

-include("openapi.hrl").

-export([openapi_audience_subcategory/0]).

-export([openapi_audience_subcategory/1]).

-export_type([openapi_audience_subcategory/0]).

-type openapi_audience_subcategory() ::
  [ {'id', binary() }
  | {'index', integer() }
  | {'key', binary() }
  | {'name', binary() }
  | {'ratio', integer() }
  ].


openapi_audience_subcategory() ->
    openapi_audience_subcategory([]).

openapi_audience_subcategory(Fields) ->
  Default = [ {'id', binary() }
            , {'index', integer() }
            , {'key', binary() }
            , {'name', binary() }
            , {'ratio', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

