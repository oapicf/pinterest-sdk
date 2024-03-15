-module(openapi_template_response_date_range_absolute_date_range).

-include("openapi.hrl").

-export([openapi_template_response_date_range_absolute_date_range/0]).

-export([openapi_template_response_date_range_absolute_date_range/1]).

-export_type([openapi_template_response_date_range_absolute_date_range/0]).

-type openapi_template_response_date_range_absolute_date_range() ::
  [ {'type', binary() }
  | {'start_date', integer() }
  | {'end_date', integer() }
  ].


openapi_template_response_date_range_absolute_date_range() ->
    openapi_template_response_date_range_absolute_date_range([]).

openapi_template_response_date_range_absolute_date_range(Fields) ->
  Default = [ {'type', binary() }
            , {'start_date', integer() }
            , {'end_date', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

