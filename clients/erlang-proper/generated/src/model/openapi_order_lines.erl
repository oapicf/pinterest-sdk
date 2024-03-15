-module(openapi_order_lines).

-include("openapi.hrl").

-export([openapi_order_lines/0]).

-export([openapi_order_lines/1]).

-export_type([openapi_order_lines/0]).

-type openapi_order_lines() ::
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
  ].


openapi_order_lines() ->
    openapi_order_lines([]).

openapi_order_lines(Fields) ->
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
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

