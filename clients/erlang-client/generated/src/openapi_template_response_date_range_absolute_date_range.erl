-module(openapi_template_response_date_range_absolute_date_range).

-export([encode/1]).

-export_type([openapi_template_response_date_range_absolute_date_range/0]).

-type openapi_template_response_date_range_absolute_date_range() ::
    #{ 'end_date' => integer(),
       'start_date' => integer(),
       'type' => binary()
     }.

encode(#{ 'end_date' := EndDate,
          'start_date' := StartDate,
          'type' := Type
        }) ->
    #{ 'end_date' => EndDate,
       'start_date' => StartDate,
       'type' => Type
     }.
