-module(openapi_catalogs_report).

-export([encode/1]).

-export_type([openapi_catalogs_report/0]).

-type openapi_catalogs_report() ::
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
