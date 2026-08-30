-module(openapi_leads_exports_create).

-export([encode/1]).

-export_type([openapi_leads_exports_create/0]).

-type openapi_leads_exports_create() ::
    #{ 'ad_id' := binary(),
       'end_date' := binary(),
       'start_date' := binary()
     }.

encode(#{ 'ad_id' := AdId,
          'end_date' := EndDate,
          'start_date' := StartDate
        }) ->
    #{ 'ad_id' => AdId,
       'end_date' => EndDate,
       'start_date' => StartDate
     }.
