-module(openapi_bulk_download_request_campaign_filter).

-export([encode/1]).

-export_type([openapi_bulk_download_request_campaign_filter/0]).

-type openapi_bulk_download_request_campaign_filter() ::
    #{ 'campaign_status' => list(),
       'end_time' => binary(),
       'name' => binary(),
       'objective_type' => list(),
       'start_time' => binary()
     }.

encode(#{ 'campaign_status' := CampaignStatus,
          'end_time' := EndTime,
          'name' := Name,
          'objective_type' := ObjectiveType,
          'start_time' := StartTime
        }) ->
    #{ 'campaign_status' => CampaignStatus,
       'end_time' => EndTime,
       'name' => Name,
       'objective_type' => ObjectiveType,
       'start_time' => StartTime
     }.
