-module(openapi_leads_export_response_data).

-include("openapi.hrl").

-export([openapi_leads_export_response_data/0]).

-export([openapi_leads_export_response_data/1]).

-export_type([openapi_leads_export_response_data/0]).

-type openapi_leads_export_response_data() ::
  [ {'download_url', binary() }
  | {'export_status', openapi_leads_export_status:openapi_leads_export_status() }
  ].


openapi_leads_export_response_data() ->
    openapi_leads_export_response_data([]).

openapi_leads_export_response_data(Fields) ->
  Default = [ {'download_url', binary() }
            , {'export_status', openapi_leads_export_status:openapi_leads_export_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

