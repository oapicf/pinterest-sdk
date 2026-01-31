-module(openapi_order_line).

-export([encode/1]).

-export_type([openapi_order_line/0]).

-type openapi_order_line() ::
    #{ 'ad_account_id' => binary(),
       'budget' => integer(),
       'end_time' => integer(),
       'id' => binary(),
       'name' => binary(),
       'paid_budget' => integer(),
       'paid_type' => openapi_order_line_paid_type:openapi_order_line_paid_type(),
       'purchase_order_id' => binary(),
       'start_time' => integer(),
       'status' => openapi_order_line_status:openapi_order_line_status(),
       'type' => binary(),
       'campaign_ids' := list()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'budget' := Budget,
          'end_time' := EndTime,
          'id' := Id,
          'name' := Name,
          'paid_budget' := PaidBudget,
          'paid_type' := PaidType,
          'purchase_order_id' := PurchaseOrderId,
          'start_time' := StartTime,
          'status' := Status,
          'type' := Type,
          'campaign_ids' := CampaignIds
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'budget' => Budget,
       'end_time' => EndTime,
       'id' => Id,
       'name' => Name,
       'paid_budget' => PaidBudget,
       'paid_type' => PaidType,
       'purchase_order_id' => PurchaseOrderId,
       'start_time' => StartTime,
       'status' => Status,
       'type' => Type,
       'campaign_ids' => CampaignIds
     }.
