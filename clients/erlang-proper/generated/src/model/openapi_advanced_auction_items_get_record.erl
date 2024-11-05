-module(openapi_advanced_auction_items_get_record).

-include("openapi.hrl").

-export([openapi_advanced_auction_items_get_record/0]).

-export([openapi_advanced_auction_items_get_record/1]).

-export_type([openapi_advanced_auction_items_get_record/0]).

-type openapi_advanced_auction_items_get_record() ::
  [ {'item_id', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'language', openapi_language:openapi_language() }
  ].


openapi_advanced_auction_items_get_record() ->
    openapi_advanced_auction_items_get_record([]).

openapi_advanced_auction_items_get_record(Fields) ->
  Default = [ {'item_id', binary() }
            , {'country', openapi_country:openapi_country() }
            , {'language', openapi_language:openapi_language() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

