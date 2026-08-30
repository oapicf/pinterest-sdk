-module(openapi_related_terms_related_terms_list_items).

-export([encode/1]).

-export_type([openapi_related_terms_related_terms_list_items/0]).

-type openapi_related_terms_related_terms_list_items() ::
    #{ 'related_terms' => list(),
       'term' => binary()
     }.

encode(#{ 'related_terms' := RelatedTerms,
          'term' := Term
        }) ->
    #{ 'related_terms' => RelatedTerms,
       'term' => Term
     }.
