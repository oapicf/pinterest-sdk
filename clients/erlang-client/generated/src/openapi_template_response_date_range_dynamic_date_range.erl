-module(openapi_template_response_date_range_dynamic_date_range).

-export([encode/1]).

-export_type([openapi_template_response_date_range_dynamic_date_range/0]).

-type openapi_template_response_date_range_dynamic_date_range() ::
    #{ 'type' => binary(),
       'range' => binary()
     }.

encode(#{ 'type' := Type,
          'range' := Range
        }) ->
    #{ 'type' => Type,
       'range' => Range
     }.
