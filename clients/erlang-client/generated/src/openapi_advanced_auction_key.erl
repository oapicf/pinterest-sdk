-module(openapi_advanced_auction_key).

-export([encode/1]).

-export_type([openapi_advanced_auction_key/0]).

-type openapi_advanced_auction_key() ::
    #{ 'item_id' := binary(),
       'country' := openapi_country:openapi_country(),
       'language' := openapi_language:openapi_language()
     }.

encode(#{ 'item_id' := ItemId,
          'country' := Country,
          'language' := Language
        }) ->
    #{ 'item_id' => ItemId,
       'country' => Country,
       'language' => Language
     }.
