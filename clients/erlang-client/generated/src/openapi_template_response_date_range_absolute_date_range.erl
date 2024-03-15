-module(openapi_template_response_date_range_absolute_date_range).

-export([encode/1]).

-export_type([openapi_template_response_date_range_absolute_date_range/0]).

-type openapi_template_response_date_range_absolute_date_range() ::
    #{ 'type' => binary(),
       'start_date' => integer(),
       'end_date' => integer()
     }.

encode(#{ 'type' := Type,
          'start_date' := StartDate,
          'end_date' := EndDate
        }) ->
    #{ 'type' => Type,
       'start_date' => StartDate,
       'end_date' => EndDate
     }.
