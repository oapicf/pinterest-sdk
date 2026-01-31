-module(openapi_related_terms_related_terms_list_inner).

-export([encode/1]).

-export_type([openapi_related_terms_related_terms_list_inner/0]).

-type openapi_related_terms_related_terms_list_inner() ::
    #{ 'related_terms' => list(),
       'term' => binary()
     }.

encode(#{ 'related_terms' := RelatedTerms,
          'term' := Term
        }) ->
    #{ 'related_terms' => RelatedTerms,
       'term' => Term
     }.
