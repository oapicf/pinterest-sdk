-module(openapi_order_line).

-include("openapi.hrl").

-export([openapi_order_line/0]).

-export([openapi_order_line/1]).

-export_type([openapi_order_line/0]).

-type openapi_order_line() ::
  [ {'id', binary() }
  | {'type', binary() }
  | {'ad_account_id', binary() }
  | {'purchase_order_id', binary() }
  | {'start_time', integer() }
  | {'end_time', integer() }
  | {'budget', integer() }
  | {'paid_budget', integer() }
  | {'status', openapi_order_line_status:openapi_order_line_status() }
  | {'name', binary() }
  | {'paid_type', openapi_order_line_paid_type:openapi_order_line_paid_type() }
  | {'campaign_ids', list(binary()) }
  ].


openapi_order_line() ->
    openapi_order_line([]).

openapi_order_line(Fields) ->
  Default = [ {'id', binary() }
            , {'type', binary() }
            , {'ad_account_id', binary() }
            , {'purchase_order_id', binary() }
            , {'start_time', integer() }
            , {'end_time', integer() }
            , {'budget', integer() }
            , {'paid_budget', integer() }
            , {'status', openapi_order_line_status:openapi_order_line_status() }
            , {'name', binary() }
            , {'paid_type', openapi_order_line_paid_type:openapi_order_line_paid_type() }
            , {'campaign_ids', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

