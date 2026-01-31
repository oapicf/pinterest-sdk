-module(openapi_advanced_auction_key).

-export([encode/1]).

-export_type([openapi_advanced_auction_key/0]).

-type openapi_advanced_auction_key() ::
    #{ 'country' := openapi_country:openapi_country(),
       'item_id' := binary(),
       'language' := openapi_language:openapi_language()
     }.

encode(#{ 'country' := Country,
          'item_id' := ItemId,
          'language' := Language
        }) ->
    #{ 'country' => Country,
       'item_id' => ItemId,
       'language' => Language
     }.
