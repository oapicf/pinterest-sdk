-module(openapi_ai_disclosures_update).

-include("openapi.hrl").

-export([openapi_ai_disclosures_update/0]).

-export([openapi_ai_disclosures_update/1]).

-export_type([openapi_ai_disclosures_update/0]).

-type openapi_ai_disclosures_update() ::
  [ {'values', list(openapi_ai_disclosure_item:openapi_ai_disclosure_item()) }
  ].


openapi_ai_disclosures_update() ->
    openapi_ai_disclosures_update([]).

openapi_ai_disclosures_update(Fields) ->
  Default = [ {'values', list(openapi_ai_disclosure_item:openapi_ai_disclosure_item()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

