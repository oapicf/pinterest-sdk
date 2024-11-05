-module(openapi_leads_export_create_response).

-export([encode/1]).

-export_type([openapi_leads_export_create_response/0]).

-type openapi_leads_export_create_response() ::
    #{ 'leads_export_id' => binary()
     }.

encode(#{ 'leads_export_id' := LeadsExportId
        }) ->
    #{ 'leads_export_id' => LeadsExportId
     }.
