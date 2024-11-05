-module(openapi_advanced_auction_key).

-include("openapi.hrl").

-export([openapi_advanced_auction_key/0]).

-export([openapi_advanced_auction_key/1]).

-export_type([openapi_advanced_auction_key/0]).

-type openapi_advanced_auction_key() ::
  [ {'item_id', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'language', openapi_language:openapi_language() }
  ].


openapi_advanced_auction_key() ->
    openapi_advanced_auction_key([]).

openapi_advanced_auction_key(Fields) ->
  Default = [ {'item_id', binary() }
            , {'country', openapi_country:openapi_country() }
            , {'language', openapi_language:openapi_language() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

