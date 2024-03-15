-module(openapi_template_response_date_range_relative_date_range).

-include("openapi.hrl").

-export([openapi_template_response_date_range_relative_date_range/0]).

-export([openapi_template_response_date_range_relative_date_range/1]).

-export_type([openapi_template_response_date_range_relative_date_range/0]).

-type openapi_template_response_date_range_relative_date_range() ::
  [ {'type', binary() }
  | {'start_days_in_past', integer() }
  | {'end_days_in_past', integer() }
  ].


openapi_template_response_date_range_relative_date_range() ->
    openapi_template_response_date_range_relative_date_range([]).

openapi_template_response_date_range_relative_date_range(Fields) ->
  Default = [ {'type', binary() }
            , {'start_days_in_past', integer() }
            , {'end_days_in_past', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

