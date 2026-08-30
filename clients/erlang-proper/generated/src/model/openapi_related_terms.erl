-module(openapi_related_terms).

-include("openapi.hrl").

-export([openapi_related_terms/0]).

-export([openapi_related_terms/1]).

-export_type([openapi_related_terms/0]).

-type openapi_related_terms() ::
  [ {'id', binary() }
  | {'related_term_count', integer() }
  | {'related_terms_list', list(openapi_related_terms_related_terms_list_items:openapi_related_terms_related_terms_list_items()) }
  ].


openapi_related_terms() ->
    openapi_related_terms([]).

openapi_related_terms(Fields) ->
  Default = [ {'id', binary() }
            , {'related_term_count', integer() }
            , {'related_terms_list', list(openapi_related_terms_related_terms_list_items:openapi_related_terms_related_terms_list_items()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

