-module(openapi_campaign_objective_type).

-include("openapi.hrl").

-export([openapi_campaign_objective_type/0]).

-export_type([openapi_campaign_objective_type/0]).

-type openapi_campaign_objective_type() ::
  binary().

openapi_campaign_objective_type() ->
  elements([<<"AWARENESS">>, <<"CONSIDERATION">>, <<"VIDEO_VIEW">>, <<"WEB_CONVERSION">>, <<"CATALOG_SALES">>, <<"WEB_SESSIONS">>, <<"VIDEO_COMPLETION">>, <<"APP_INSTALL">>, <<"SALES">>, <<"LEADS">>, <<"CTV_CONSIDERATION">>]).

