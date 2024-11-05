-module(openapi_leads_export_create_request).

-export([encode/1]).

-export_type([openapi_leads_export_create_request/0]).

-type openapi_leads_export_create_request() ::
    #{ 'start_date' := binary(),
       'end_date' := binary(),
       'ad_id' := binary()
     }.

encode(#{ 'start_date' := StartDate,
          'end_date' := EndDate,
          'ad_id' := AdId
        }) ->
    #{ 'start_date' => StartDate,
       'end_date' => EndDate,
       'ad_id' => AdId
     }.
