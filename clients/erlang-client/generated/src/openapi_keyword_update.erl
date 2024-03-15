-module(openapi_keyword_update).

-export([encode/1]).

-export_type([openapi_keyword_update/0]).

-type openapi_keyword_update() ::
    #{ 'id' := binary(),
       'archived' => boolean(),
       'bid' => integer()
     }.

encode(#{ 'id' := Id,
          'archived' := Archived,
          'bid' := Bid
        }) ->
    #{ 'id' => Id,
       'archived' => Archived,
       'bid' => Bid
     }.
