-module(openapi_account_template).

-include("openapi.hrl").

-export([openapi_account_template/0]).

-export([openapi_account_template/1]).

-export_type([openapi_account_template/0]).

-type openapi_account_template() ::
  [ {'ad_account_id', binary() }
  | {'ad_account_ids', list(binary()) }
  | {'ade_columns', list(binary()) }
  | {'attribution_type', openapi_any_type:openapi_any_type() }
  | {'click_window_days', integer() }
  | {'columns', list(openapi_reporting_column:openapi_reporting_column()) }
  | {'conversion_report_time_type', openapi_conversion_report_time_type:openapi_conversion_report_time_type() }
  | {'creation_source', openapi_creation_source:openapi_creation_source() }
  | {'custom_column_ids', list(binary()) }
  | {'display_metadata', binary() }
  | {'engagement_window_days', integer() }
  | {'filters_json', binary() }
  | {'granularity', openapi_granularity:openapi_granularity() }
  | {'id', binary() }
  | {'ingestion_sources', list(openapi_ingestion_source:openapi_ingestion_source()) }
  | {'is_default', boolean() }
  | {'is_deleted', boolean() }
  | {'is_owned_by_user', boolean() }
  | {'is_scheduled', boolean() }
  | {'name', binary() }
  | {'report_end_relative_days_in_past', integer() }
  | {'report_format', openapi_data_output_format:openapi_data_output_format() }
  | {'report_level', openapi_metrics_reporting_level:openapi_metrics_reporting_level() }
  | {'report_start_relative_days_in_past', integer() }
  | {'reporting_time_zone', openapi_reporting_time_zone:openapi_reporting_time_zone() }
  | {'sort_by', openapi_any_type:openapi_any_type() }
  | {'type', binary() }
  | {'updated_time', integer() }
  | {'user_id', binary() }
  | {'view_window_days', integer() }
  ].


openapi_account_template() ->
    openapi_account_template([]).

openapi_account_template(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'ad_account_ids', list(binary()) }
            , {'ade_columns', list(binary()) }
            , {'attribution_type', openapi_any_type:openapi_any_type() }
            , {'click_window_days', integer() }
            , {'columns', list(openapi_reporting_column:openapi_reporting_column()) }
            , {'conversion_report_time_type', openapi_conversion_report_time_type:openapi_conversion_report_time_type() }
            , {'creation_source', openapi_creation_source:openapi_creation_source() }
            , {'custom_column_ids', list(binary()) }
            , {'display_metadata', binary() }
            , {'engagement_window_days', integer() }
            , {'filters_json', binary() }
            , {'granularity', openapi_granularity:openapi_granularity() }
            , {'id', binary() }
            , {'ingestion_sources', list(openapi_ingestion_source:openapi_ingestion_source()) }
            , {'is_default', boolean() }
            , {'is_deleted', boolean() }
            , {'is_owned_by_user', boolean() }
            , {'is_scheduled', boolean() }
            , {'name', binary() }
            , {'report_end_relative_days_in_past', integer() }
            , {'report_format', openapi_data_output_format:openapi_data_output_format() }
            , {'report_level', openapi_metrics_reporting_level:openapi_metrics_reporting_level() }
            , {'report_start_relative_days_in_past', integer() }
            , {'reporting_time_zone', openapi_reporting_time_zone:openapi_reporting_time_zone() }
            , {'sort_by', openapi_any_type:openapi_any_type() }
            , {'type', binary() }
            , {'updated_time', integer() }
            , {'user_id', binary() }
            , {'view_window_days', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

