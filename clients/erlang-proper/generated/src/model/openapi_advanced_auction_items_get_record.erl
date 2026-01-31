-module(openapi_advanced_auction_items_get_record).

-include("openapi.hrl").

-export([openapi_advanced_auction_items_get_record/0]).

-export([openapi_advanced_auction_items_get_record/1]).

-export_type([openapi_advanced_auction_items_get_record/0]).

-type openapi_advanced_auction_items_get_record() ::
  [ {'country', openapi_country:openapi_country() }
  | {'item_id', binary() }
  | {'language', openapi_language:openapi_language() }
  ].


openapi_advanced_auction_items_get_record() ->
    openapi_advanced_auction_items_get_record([]).

openapi_advanced_auction_items_get_record(Fields) ->
  Default = [ {'country', openapi_country:openapi_country() }
            , {'item_id', binary() }
            , {'language', openapi_language:openapi_language() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

