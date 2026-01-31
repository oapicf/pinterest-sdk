-module(openapi_audience_category).

-include("openapi.hrl").

-export([openapi_audience_category/0]).

-export([openapi_audience_category/1]).

-export_type([openapi_audience_category/0]).

-type openapi_audience_category() ::
  [ {'id', binary() }
  | {'index', integer() }
  | {'key', binary() }
  | {'name', binary() }
  | {'ratio', integer() }
  | {'subcategories', list(openapi_audience_subcategory:openapi_audience_subcategory()) }
  ].


openapi_audience_category() ->
    openapi_audience_category([]).

openapi_audience_category(Fields) ->
  Default = [ {'id', binary() }
            , {'index', integer() }
            , {'key', binary() }
            , {'name', binary() }
            , {'ratio', integer() }
            , {'subcategories', list(openapi_audience_subcategory:openapi_audience_subcategory()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

