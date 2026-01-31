-module(openapi_get_mmm_report_response_data).

-export([encode/1]).

-export_type([openapi_get_mmm_report_response_data/0]).

-type openapi_get_mmm_report_response_data() ::
    #{ 'report_status' => binary(),
       'size' => integer(),
       'url' => binary()
     }.

encode(#{ 'report_status' := ReportStatus,
          'size' := Size,
          'url' := Url
        }) ->
    #{ 'report_status' => ReportStatus,
       'size' => Size,
       'url' => Url
     }.
