-module(openapi_advanced_auction_items_submit_delete_record).

-include("openapi.hrl").

-export([openapi_advanced_auction_items_submit_delete_record/0]).

-export([openapi_advanced_auction_items_submit_delete_record/1]).

-export_type([openapi_advanced_auction_items_submit_delete_record/0]).

-type openapi_advanced_auction_items_submit_delete_record() ::
  [ {'country', openapi_country:openapi_country() }
  | {'errors', list(openapi_advanced_auction_operation_error:openapi_advanced_auction_operation_error()) }
  | {'item_id', binary() }
  | {'language', openapi_language:openapi_language() }
  | {'operation', binary() }
  ].


openapi_advanced_auction_items_submit_delete_record() ->
    openapi_advanced_auction_items_submit_delete_record([]).

openapi_advanced_auction_items_submit_delete_record(Fields) ->
  Default = [ {'country', openapi_country:openapi_country() }
            , {'errors', list(openapi_advanced_auction_operation_error:openapi_advanced_auction_operation_error()) }
            , {'item_id', binary() }
            , {'language', openapi_language:openapi_language() }
            , {'operation', elements([<<"DELETE">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

