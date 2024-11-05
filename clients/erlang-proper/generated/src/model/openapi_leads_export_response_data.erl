-module(openapi_leads_export_response_data).

-include("openapi.hrl").

-export([openapi_leads_export_response_data/0]).

-export([openapi_leads_export_response_data/1]).

-export_type([openapi_leads_export_response_data/0]).

-type openapi_leads_export_response_data() ::
  [ {'export_status', openapi_leads_export_status:openapi_leads_export_status() }
  | {'download_url', binary() }
  ].


openapi_leads_export_response_data() ->
    openapi_leads_export_response_data([]).

openapi_leads_export_response_data(Fields) ->
  Default = [ {'export_status', openapi_leads_export_status:openapi_leads_export_status() }
            , {'download_url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

