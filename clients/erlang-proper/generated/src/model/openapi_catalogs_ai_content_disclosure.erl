-module(openapi_catalogs_ai_content_disclosure).

-include("openapi.hrl").

-export([openapi_catalogs_ai_content_disclosure/0]).

-export([openapi_catalogs_ai_content_disclosure/1]).

-export_type([openapi_catalogs_ai_content_disclosure/0]).

-type openapi_catalogs_ai_content_disclosure() ::
  [ {'disclosure', list(openapi_catalogs_ai_content_disclosure_label:openapi_catalogs_ai_content_disclosure_label()) }
  | {'url', binary() }
  ].


openapi_catalogs_ai_content_disclosure() ->
    openapi_catalogs_ai_content_disclosure([]).

openapi_catalogs_ai_content_disclosure(Fields) ->
  Default = [ {'disclosure', list(openapi_catalogs_ai_content_disclosure_label:openapi_catalogs_ai_content_disclosure_label(), 1) }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

