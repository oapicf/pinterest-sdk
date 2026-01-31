-module(openapi_template_response_date_range_relative_date_range).

-export([encode/1]).

-export_type([openapi_template_response_date_range_relative_date_range/0]).

-type openapi_template_response_date_range_relative_date_range() ::
    #{ 'end_days_in_past' => integer(),
       'start_days_in_past' => integer(),
       'type' => binary()
     }.

encode(#{ 'end_days_in_past' := EndDaysInPast,
          'start_days_in_past' := StartDaysInPast,
          'type' := Type
        }) ->
    #{ 'end_days_in_past' => EndDaysInPast,
       'start_days_in_past' => StartDaysInPast,
       'type' => Type
     }.
