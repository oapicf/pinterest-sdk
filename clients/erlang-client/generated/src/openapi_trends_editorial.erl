-module(openapi_trends_editorial).

-export([encode/1]).

-export_type([openapi_trends_editorial/0]).

-type openapi_trends_editorial() ::
    #{ 'board_url' := binary(),
       'description' := binary(),
       'interests' := list(),
       'pins_url' := list(),
       'related_keywords' := list(),
       'title' := binary()
     }.

encode(#{ 'board_url' := BoardUrl,
          'description' := Description,
          'interests' := Interests,
          'pins_url' := PinsUrl,
          'related_keywords' := RelatedKeywords,
          'title' := Title
        }) ->
    #{ 'board_url' => BoardUrl,
       'description' => Description,
       'interests' => Interests,
       'pins_url' => PinsUrl,
       'related_keywords' => RelatedKeywords,
       'title' => Title
     }.
