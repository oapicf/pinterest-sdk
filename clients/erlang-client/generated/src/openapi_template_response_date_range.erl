-module(openapi_template_response_date_range).

-export([encode/1]).

-export_type([openapi_template_response_date_range/0]).

-type openapi_template_response_date_range() ::
    #{ 'dynamic_date_range' => openapi_template_response_date_range_dynamic_date_range:openapi_template_response_date_range_dynamic_date_range(),
       'relative_date_range' => openapi_template_response_date_range_relative_date_range:openapi_template_response_date_range_relative_date_range(),
       'absolute_date_range' => openapi_template_response_date_range_absolute_date_range:openapi_template_response_date_range_absolute_date_range()
     }.

encode(#{ 'dynamic_date_range' := DynamicDateRange,
          'relative_date_range' := RelativeDateRange,
          'absolute_date_range' := AbsoluteDateRange
        }) ->
    #{ 'dynamic_date_range' => DynamicDateRange,
       'relative_date_range' => RelativeDateRange,
       'absolute_date_range' => AbsoluteDateRange
     }.
