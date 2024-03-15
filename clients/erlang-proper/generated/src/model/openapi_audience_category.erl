-module(openapi_audience_category).

-include("openapi.hrl").

-export([openapi_audience_category/0]).

-export([openapi_audience_category/1]).

-export_type([openapi_audience_category/0]).

-type openapi_audience_category() ::
  [ {'key', binary() }
  | {'name', binary() }
  | {'ratio', integer() }
  | {'index', integer() }
  | {'id', binary() }
  | {'subcategories', list(openapi_audience_subcategory:openapi_audience_subcategory()) }
  ].


openapi_audience_category() ->
    openapi_audience_category([]).

openapi_audience_category(Fields) ->
  Default = [ {'key', binary() }
            , {'name', binary() }
            , {'ratio', integer() }
            , {'index', integer() }
            , {'id', binary() }
            , {'subcategories', list(openapi_audience_subcategory:openapi_audience_subcategory()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

