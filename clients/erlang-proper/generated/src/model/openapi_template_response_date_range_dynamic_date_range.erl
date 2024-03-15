-module(openapi_template_response_date_range_dynamic_date_range).

-include("openapi.hrl").

-export([openapi_template_response_date_range_dynamic_date_range/0]).

-export([openapi_template_response_date_range_dynamic_date_range/1]).

-export_type([openapi_template_response_date_range_dynamic_date_range/0]).

-type openapi_template_response_date_range_dynamic_date_range() ::
  [ {'type', binary() }
  | {'range', binary() }
  ].


openapi_template_response_date_range_dynamic_date_range() ->
    openapi_template_response_date_range_dynamic_date_range([]).

openapi_template_response_date_range_dynamic_date_range(Fields) ->
  Default = [ {'type', binary() }
            , {'range', elements([<<"YEAR_TO_DATE">>, <<"QUARTER_TO_DATE">>, <<"MONTH_TO_DATE">>, <<"LAST_MONTH">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

