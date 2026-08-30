-module(openapi_keyword_update_generated).

-export([encode/1]).

-export_type([openapi_keyword_update_generated/0]).

-type openapi_keyword_update_generated() ::
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
