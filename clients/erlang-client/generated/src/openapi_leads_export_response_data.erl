-module(openapi_leads_export_response_data).

-export([encode/1]).

-export_type([openapi_leads_export_response_data/0]).

-type openapi_leads_export_response_data() ::
    #{ 'download_url' => binary(),
       'export_status' => openapi_leads_export_status:openapi_leads_export_status()
     }.

encode(#{ 'download_url' := DownloadUrl,
          'export_status' := ExportStatus
        }) ->
    #{ 'download_url' => DownloadUrl,
       'export_status' => ExportStatus
     }.
