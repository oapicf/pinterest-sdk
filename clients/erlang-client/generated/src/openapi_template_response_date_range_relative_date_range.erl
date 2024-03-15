-module(openapi_template_response_date_range_relative_date_range).

-export([encode/1]).

-export_type([openapi_template_response_date_range_relative_date_range/0]).

-type openapi_template_response_date_range_relative_date_range() ::
    #{ 'type' => binary(),
       'start_days_in_past' => integer(),
       'end_days_in_past' => integer()
     }.

encode(#{ 'type' := Type,
          'start_days_in_past' := StartDaysInPast,
          'end_days_in_past' := EndDaysInPast
        }) ->
    #{ 'type' => Type,
       'start_days_in_past' => StartDaysInPast,
       'end_days_in_past' => EndDaysInPast
     }.
