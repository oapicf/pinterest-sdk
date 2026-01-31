-module(openapi_campaign_id_filter).

-export([encode/1]).

-export_type([openapi_campaign_id_filter/0]).

-type openapi_campaign_id_filter() ::
    #{ 'campaign_ids' => list()
     }.

encode(#{ 'campaign_ids' := CampaignIds
        }) ->
    #{ 'campaign_ids' => CampaignIds
     }.
