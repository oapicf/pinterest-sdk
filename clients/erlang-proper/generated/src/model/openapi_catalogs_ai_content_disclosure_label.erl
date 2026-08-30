-module(openapi_catalogs_ai_content_disclosure_label).

-include("openapi.hrl").

-export([openapi_catalogs_ai_content_disclosure_label/0]).

-export_type([openapi_catalogs_ai_content_disclosure_label/0]).

-type openapi_catalogs_ai_content_disclosure_label() ::
  binary().

openapi_catalogs_ai_content_disclosure_label() ->
  elements([<<"ai_modified">>, <<"synthetic_performer">>]).

