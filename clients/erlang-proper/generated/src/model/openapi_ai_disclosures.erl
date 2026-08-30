-module(openapi_ai_disclosures).

-include("openapi.hrl").

-export([openapi_ai_disclosures/0]).

-export([openapi_ai_disclosures/1]).

-export_type([openapi_ai_disclosures/0]).

-type openapi_ai_disclosures() ::
  [ {'values', list(openapi_ai_disclosure_item:openapi_ai_disclosure_item()) }
  ].


openapi_ai_disclosures() ->
    openapi_ai_disclosures([]).

openapi_ai_disclosures(Fields) ->
  Default = [ {'values', list(openapi_ai_disclosure_item:openapi_ai_disclosure_item()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

