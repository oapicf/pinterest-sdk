-module(openapi_catalogs_report).

-export([encode/1]).

-export_type([openapi_catalogs_report/0]).

-type openapi_catalogs_report() ::
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
