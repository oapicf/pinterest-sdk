-module(openapi_related_terms_related_terms_list_inner).

-include("openapi.hrl").

-export([openapi_related_terms_related_terms_list_inner/0]).

-export([openapi_related_terms_related_terms_list_inner/1]).

-export_type([openapi_related_terms_related_terms_list_inner/0]).

-type openapi_related_terms_related_terms_list_inner() ::
  [ {'term', binary() }
  | {'related_terms', list(binary()) }
  ].


openapi_related_terms_related_terms_list_inner() ->
    openapi_related_terms_related_terms_list_inner([]).

openapi_related_terms_related_terms_list_inner(Fields) ->
  Default = [ {'term', binary() }
            , {'related_terms', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

