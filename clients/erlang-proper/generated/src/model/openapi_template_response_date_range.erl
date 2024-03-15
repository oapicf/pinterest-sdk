-module(openapi_template_response_date_range).

-include("openapi.hrl").

-export([openapi_template_response_date_range/0]).

-export([openapi_template_response_date_range/1]).

-export_type([openapi_template_response_date_range/0]).

-type openapi_template_response_date_range() ::
  [ {'dynamic_date_range', openapi_template_response_date_range_dynamic_date_range:openapi_template_response_date_range_dynamic_date_range() }
  | {'relative_date_range', openapi_template_response_date_range_relative_date_range:openapi_template_response_date_range_relative_date_range() }
  | {'absolute_date_range', openapi_template_response_date_range_absolute_date_range:openapi_template_response_date_range_absolute_date_range() }
  ].


openapi_template_response_date_range() ->
    openapi_template_response_date_range([]).

openapi_template_response_date_range(Fields) ->
  Default = [ {'dynamic_date_range', openapi_template_response_date_range_dynamic_date_range:openapi_template_response_date_range_dynamic_date_range() }
            , {'relative_date_range', openapi_template_response_date_range_relative_date_range:openapi_template_response_date_range_relative_date_range() }
            , {'absolute_date_range', openapi_template_response_date_range_absolute_date_range:openapi_template_response_date_range_absolute_date_range() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

