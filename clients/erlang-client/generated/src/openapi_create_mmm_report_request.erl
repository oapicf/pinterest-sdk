-module(openapi_create_mmm_report_request).

-export([encode/1]).

-export_type([openapi_create_mmm_report_request/0]).

-type openapi_create_mmm_report_request() ::
    #{ 'report_name' := binary(),
       'start_date' := binary(),
       'end_date' := binary(),
       'granularity' := binary(),
       'level' := binary(),
       'targeting_types' := list(),
       'columns' := list(),
       'countries' => list()
     }.

encode(#{ 'report_name' := ReportName,
          'start_date' := StartDate,
          'end_date' := EndDate,
          'granularity' := Granularity,
          'level' := Level,
          'targeting_types' := TargetingTypes,
          'columns' := Columns,
          'countries' := Countries
        }) ->
    #{ 'report_name' => ReportName,
       'start_date' => StartDate,
       'end_date' => EndDate,
       'granularity' => Granularity,
       'level' => Level,
       'targeting_types' => TargetingTypes,
       'columns' => Columns,
       'countries' => Countries
     }.
