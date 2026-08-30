-module(openapi_appsflyer_audience_sync_create).

-include("openapi.hrl").

-export([openapi_appsflyer_audience_sync_create/0]).

-export([openapi_appsflyer_audience_sync_create/1]).

-export_type([openapi_appsflyer_audience_sync_create/0]).

-type openapi_appsflyer_audience_sync_create() ::
  [ {'container_id', binary() }
  | {'url_adid_sha256', binary() }
  | {'url_email_sha256', binary() }
  ].


openapi_appsflyer_audience_sync_create() ->
    openapi_appsflyer_audience_sync_create([]).

openapi_appsflyer_audience_sync_create(Fields) ->
  Default = [ {'container_id', binary() }
            , {'url_adid_sha256', binary() }
            , {'url_email_sha256', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

