-module(openapi_related_terms_related_terms_list_items).

-include("openapi.hrl").

-export([openapi_related_terms_related_terms_list_items/0]).

-export([openapi_related_terms_related_terms_list_items/1]).

-export_type([openapi_related_terms_related_terms_list_items/0]).

-type openapi_related_terms_related_terms_list_items() ::
  [ {'related_terms', list(binary()) }
  | {'term', binary() }
  ].


openapi_related_terms_related_terms_list_items() ->
    openapi_related_terms_related_terms_list_items([]).

openapi_related_terms_related_terms_list_items(Fields) ->
  Default = [ {'related_terms', list(binary()) }
            , {'term', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

