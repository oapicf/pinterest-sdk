-module(openapi_leads_export_create_response).

-include("openapi.hrl").

-export([openapi_leads_export_create_response/0]).

-export([openapi_leads_export_create_response/1]).

-export_type([openapi_leads_export_create_response/0]).

-type openapi_leads_export_create_response() ::
  [ {'leads_export_id', binary() }
  ].


openapi_leads_export_create_response() ->
    openapi_leads_export_create_response([]).

openapi_leads_export_create_response(Fields) ->
  Default = [ {'leads_export_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

