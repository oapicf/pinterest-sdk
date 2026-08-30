-module(openapi_order_line).

-include("openapi.hrl").

-export([openapi_order_line/0]).

-export([openapi_order_line/1]).

-export_type([openapi_order_line/0]).

-type openapi_order_line() ::
  [ {'ad_account_id', binary() }
  | {'budget', integer() }
  | {'campaign_ids', list(binary()) }
  | {'end_time', integer() }
  | {'id', binary() }
  | {'name', binary() }
  | {'paid_budget', integer() }
  | {'paid_type', openapi_order_line_paid_type:openapi_order_line_paid_type() }
  | {'purchase_order_id', binary() }
  | {'start_time', integer() }
  | {'status', openapi_order_line_status:openapi_order_line_status() }
  | {'type', binary() }
  ].


openapi_order_line() ->
    openapi_order_line([]).

openapi_order_line(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'budget', integer() }
            , {'campaign_ids', list(binary()) }
            , {'end_time', integer() }
            , {'id', binary() }
            , {'name', binary() }
            , {'paid_budget', integer() }
            , {'paid_type', openapi_order_line_paid_type:openapi_order_line_paid_type() }
            , {'purchase_order_id', binary() }
            , {'start_time', integer() }
            , {'status', openapi_order_line_status:openapi_order_line_status() }
            , {'type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

