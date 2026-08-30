-module(openapi_leads_exports).

-export([encode/1]).

-export_type([openapi_leads_exports/0]).

-type openapi_leads_exports() ::
    #{ 'leads_export_id' => binary()
     }.

encode(#{ 'leads_export_id' := LeadsExportId
        }) ->
    #{ 'leads_export_id' => LeadsExportId
     }.
