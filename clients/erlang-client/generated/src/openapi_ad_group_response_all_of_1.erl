-module(openapi_ad_group_response_all_of_1).

-export([encode/1]).

-export_type([openapi_ad_group_response_all_of_1/0]).

-type openapi_ad_group_response_all_of_1() ::
    #{ 'campaign_id' => binary(),
       'billable_event' => openapi_action_type:openapi_action_type(),
       'id' => binary(),
       'type' => binary(),
       'ad_account_id' => binary(),
       'created_time' => integer(),
       'updated_time' => integer()
     }.

encode(#{ 'campaign_id' := CampaignId,
          'billable_event' := BillableEvent,
          'id' := Id,
          'type' := Type,
          'ad_account_id' := AdAccountId,
          'created_time' := CreatedTime,
          'updated_time' := UpdatedTime
        }) ->
    #{ 'campaign_id' => CampaignId,
       'billable_event' => BillableEvent,
       'id' => Id,
       'type' => Type,
       'ad_account_id' => AdAccountId,
       'created_time' => CreatedTime,
       'updated_time' => UpdatedTime
     }.
