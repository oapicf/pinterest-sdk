-module(openapi_create_mmm_report_request).

-export([encode/1]).

-export_type([openapi_create_mmm_report_request/0]).

-type openapi_create_mmm_report_request() ::
    #{ 'countries' => list(),
       'columns' := list(),
       'end_date' := binary(),
       'granularity' := binary(),
       'level' := binary(),
       'report_name' := binary(),
       'start_date' := binary(),
       'targeting_types' := list()
     }.

encode(#{ 'countries' := Countries,
          'columns' := Columns,
          'end_date' := EndDate,
          'granularity' := Granularity,
          'level' := Level,
          'report_name' := ReportName,
          'start_date' := StartDate,
          'targeting_types' := TargetingTypes
        }) ->
    #{ 'countries' => Countries,
       'columns' => Columns,
       'end_date' => EndDate,
       'granularity' => Granularity,
       'level' => Level,
       'report_name' => ReportName,
       'start_date' => StartDate,
       'targeting_types' => TargetingTypes
     }.
