-module(openapi_get_mmm_report_response_data).

-export([encode/1]).

-export_type([openapi_get_mmm_report_response_data/0]).

-type openapi_get_mmm_report_response_data() ::
    #{ 'report_status' => binary(),
       'url' => binary(),
       'size' => integer()
     }.

encode(#{ 'report_status' := ReportStatus,
          'url' := Url,
          'size' := Size
        }) ->
    #{ 'report_status' => ReportStatus,
       'url' => Url,
       'size' => Size
     }.
