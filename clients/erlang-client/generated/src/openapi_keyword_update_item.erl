-module(openapi_keyword_update_item).

-export([encode/1]).

-export_type([openapi_keyword_update_item/0]).

-type openapi_keyword_update_item() ::
    #{ 'archived' => boolean(),
       'bid' => integer(),
       'id' := binary()
     }.

encode(#{ 'archived' := Archived,
          'bid' := Bid,
          'id' := Id
        }) ->
    #{ 'archived' => Archived,
       'bid' => Bid,
       'id' => Id
     }.
