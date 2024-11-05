-module(openapi_keyword).

-export([encode/1]).

-export_type([openapi_keyword/0]).

-type openapi_keyword() ::
    #{ 'bid' => integer(),
       'match_type' := openapi_match_type_response:openapi_match_type_response(),
       'value' := binary(),
       'archived' => boolean(),
       'id' => binary(),
       'parent_id' => binary(),
       'parent_type' => binary(),
       'type' => binary()
     }.

encode(#{ 'bid' := Bid,
          'match_type' := MatchType,
          'value' := Value,
          'archived' := Archived,
          'id' := Id,
          'parent_id' := ParentId,
          'parent_type' := ParentType,
          'type' := Type
        }) ->
    #{ 'bid' => Bid,
       'match_type' => MatchType,
       'value' => Value,
       'archived' => Archived,
       'id' => Id,
       'parent_id' => ParentId,
       'parent_type' => ParentType,
       'type' => Type
     }.
