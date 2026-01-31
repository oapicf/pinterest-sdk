-module(openapi_template_response_date_range_relative_date_range).

-include("openapi.hrl").

-export([openapi_template_response_date_range_relative_date_range/0]).

-export([openapi_template_response_date_range_relative_date_range/1]).

-export_type([openapi_template_response_date_range_relative_date_range/0]).

-type openapi_template_response_date_range_relative_date_range() ::
  [ {'end_days_in_past', integer() }
  | {'start_days_in_past', integer() }
  | {'type', binary() }
  ].


openapi_template_response_date_range_relative_date_range() ->
    openapi_template_response_date_range_relative_date_range([]).

openapi_template_response_date_range_relative_date_range(Fields) ->
  Default = [ {'end_days_in_past', integer() }
            , {'start_days_in_past', integer() }
            , {'type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

