-module(openapi_template_response_date_range_absolute_date_range).

-include("openapi.hrl").

-export([openapi_template_response_date_range_absolute_date_range/0]).

-export([openapi_template_response_date_range_absolute_date_range/1]).

-export_type([openapi_template_response_date_range_absolute_date_range/0]).

-type openapi_template_response_date_range_absolute_date_range() ::
  [ {'end_date', integer() }
  | {'start_date', integer() }
  | {'type', binary() }
  ].


openapi_template_response_date_range_absolute_date_range() ->
    openapi_template_response_date_range_absolute_date_range([]).

openapi_template_response_date_range_absolute_date_range(Fields) ->
  Default = [ {'end_date', integer() }
            , {'start_date', integer() }
            , {'type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

