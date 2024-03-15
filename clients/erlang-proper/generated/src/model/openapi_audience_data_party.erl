-module(openapi_audience_data_party).

-include("openapi.hrl").

-export([openapi_audience_data_party/0]).

-export_type([openapi_audience_data_party/0]).

-type openapi_audience_data_party() ::
  binary().

openapi_audience_data_party() ->
  elements([<<"1p">>, <<"3p">>]).

