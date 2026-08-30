-module(openapi_mmm_report_create).

-export([encode/1]).

-export_type([openapi_mmm_report_create/0]).

-type openapi_mmm_report_create() ::
    #{ 'advertiser_ids' => list(),
       'columns' := list(),
       'countries' => list(),
       'custom_column_ids' => list(),
       'end_date' := binary(),
       'granularity' := openapi_m_mm_report_granularity:openapi_m_mm_report_granularity(),
       'level' := openapi_m_mm_report_level:openapi_m_mm_report_level(),
       'report_name' := binary(),
       'start_date' := binary(),
       'targeting_types' := list()
     }.

encode(#{ 'advertiser_ids' := AdvertiserIds,
          'columns' := Columns,
          'countries' := Countries,
          'custom_column_ids' := CustomColumnIds,
          'end_date' := EndDate,
          'granularity' := Granularity,
          'level' := Level,
          'report_name' := ReportName,
          'start_date' := StartDate,
          'targeting_types' := TargetingTypes
        }) ->
    #{ 'advertiser_ids' => AdvertiserIds,
       'columns' => Columns,
       'countries' => Countries,
       'custom_column_ids' => CustomColumnIds,
       'end_date' => EndDate,
       'granularity' => Granularity,
       'level' => Level,
       'report_name' => ReportName,
       'start_date' => StartDate,
       'targeting_types' => TargetingTypes
     }.
