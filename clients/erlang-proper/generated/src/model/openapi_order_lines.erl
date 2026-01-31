-module(openapi_order_lines).

-include("openapi.hrl").

-export([openapi_order_lines/0]).

-export([openapi_order_lines/1]).

-export_type([openapi_order_lines/0]).

-type openapi_order_lines() ::
  [ {'ad_account_id', binary() }
  | {'budget', integer() }
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


openapi_order_lines() ->
    openapi_order_lines([]).

openapi_order_lines(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'budget', integer() }
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

