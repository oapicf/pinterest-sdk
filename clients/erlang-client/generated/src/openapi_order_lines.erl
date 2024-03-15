-module(openapi_order_lines).

-export([encode/1]).

-export_type([openapi_order_lines/0]).

-type openapi_order_lines() ::
    #{ 'id' => binary(),
       'type' => binary(),
       'ad_account_id' => binary(),
       'purchase_order_id' => binary(),
       'start_time' => integer(),
       'end_time' => integer(),
       'budget' => integer(),
       'paid_budget' => integer(),
       'status' => openapi_order_line_status:openapi_order_line_status(),
       'name' => binary(),
       'paid_type' => openapi_order_line_paid_type:openapi_order_line_paid_type()
     }.

encode(#{ 'id' := Id,
          'type' := Type,
          'ad_account_id' := AdAccountId,
          'purchase_order_id' := PurchaseOrderId,
          'start_time' := StartTime,
          'end_time' := EndTime,
          'budget' := Budget,
          'paid_budget' := PaidBudget,
          'status' := Status,
          'name' := Name,
          'paid_type' := PaidType
        }) ->
    #{ 'id' => Id,
       'type' => Type,
       'ad_account_id' => AdAccountId,
       'purchase_order_id' => PurchaseOrderId,
       'start_time' => StartTime,
       'end_time' => EndTime,
       'budget' => Budget,
       'paid_budget' => PaidBudget,
       'status' => Status,
       'name' => Name,
       'paid_type' => PaidType
     }.
