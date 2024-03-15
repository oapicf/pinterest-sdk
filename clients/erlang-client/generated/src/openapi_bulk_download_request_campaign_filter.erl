-module(openapi_bulk_download_request_campaign_filter).

-export([encode/1]).

-export_type([openapi_bulk_download_request_campaign_filter/0]).

-type openapi_bulk_download_request_campaign_filter() ::
    #{ 'start_time' => binary(),
       'end_time' => binary(),
       'name' => binary(),
       'campaign_status' => list(),
       'objective_type' => list()
     }.

encode(#{ 'start_time' := StartTime,
          'end_time' := EndTime,
          'name' := Name,
          'campaign_status' := CampaignStatus,
          'objective_type' := ObjectiveType
        }) ->
    #{ 'start_time' => StartTime,
       'end_time' => EndTime,
       'name' => Name,
       'campaign_status' => CampaignStatus,
       'objective_type' => ObjectiveType
     }.
