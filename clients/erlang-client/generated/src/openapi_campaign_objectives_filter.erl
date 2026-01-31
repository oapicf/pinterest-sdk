-module(openapi_campaign_objectives_filter).

-export([encode/1]).

-export_type([openapi_campaign_objectives_filter/0]).

-type openapi_campaign_objectives_filter() ::
    #{ 'campaign_objective_types' => list()
     }.

encode(#{ 'campaign_objective_types' := CampaignObjectiveTypes
        }) ->
    #{ 'campaign_objective_types' => CampaignObjectiveTypes
     }.
