-module(openapi_leads_export_create_request).

-export([encode/1]).

-export_type([openapi_leads_export_create_request/0]).

-type openapi_leads_export_create_request() ::
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
