-module(openapi_template_response_date_range_dynamic_date_range).

-include("openapi.hrl").

-export([openapi_template_response_date_range_dynamic_date_range/0]).

-export([openapi_template_response_date_range_dynamic_date_range/1]).

-export_type([openapi_template_response_date_range_dynamic_date_range/0]).

-type openapi_template_response_date_range_dynamic_date_range() ::
  [ {'range', binary() }
  | {'type', binary() }
  ].


openapi_template_response_date_range_dynamic_date_range() ->
    openapi_template_response_date_range_dynamic_date_range([]).

openapi_template_response_date_range_dynamic_date_range(Fields) ->
  Default = [ {'range', elements([<<"YEAR_TO_DATE">>, <<"QUARTER_TO_DATE">>, <<"MONTH_TO_DATE">>, <<"LAST_MONTH">>, <<"LAST_QUARTER">>]) }
            , {'type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

