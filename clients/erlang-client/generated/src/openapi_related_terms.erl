-module(openapi_related_terms).

-export([encode/1]).

-export_type([openapi_related_terms/0]).

-type openapi_related_terms() ::
    #{ 'id' => binary(),
       'related_term_count' => integer(),
       'related_terms_list' => list()
     }.

encode(#{ 'id' := Id,
          'related_term_count' := RelatedTermCount,
          'related_terms_list' := RelatedTermsList
        }) ->
    #{ 'id' => Id,
       'related_term_count' => RelatedTermCount,
       'related_terms_list' => RelatedTermsList
     }.
