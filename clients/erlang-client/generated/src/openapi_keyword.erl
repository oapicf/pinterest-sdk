-module(openapi_keyword).

-export([encode/1]).

-export_type([openapi_keyword/0]).

-type openapi_keyword() ::
    #{ 'archived' => boolean(),
       'bid' => integer(),
       'id' := binary(),
       'match_type' := openapi_match_type:openapi_match_type(),
       'parent_id' := binary(),
       'parent_type' => binary(),
       'type' => binary(),
       'value' := binary()
     }.

encode(#{ 'archived' := Archived,
          'bid' := Bid,
          'id' := Id,
          'match_type' := MatchType,
          'parent_id' := ParentId,
          'parent_type' := ParentType,
          'type' := Type,
          'value' := Value
        }) ->
    #{ 'archived' => Archived,
       'bid' => Bid,
       'id' => Id,
       'match_type' => MatchType,
       'parent_id' => ParentId,
       'parent_type' => ParentType,
       'type' => Type,
       'value' => Value
     }.
