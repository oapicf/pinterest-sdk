-module(openapi_audience_create_custom_request).

-include("openapi.hrl").

-export([openapi_audience_create_custom_request/0]).

-export([openapi_audience_create_custom_request/1]).

-export_type([openapi_audience_create_custom_request/0]).

-type openapi_audience_create_custom_request() ::
  [ {'ad_account_id', binary() }
  | {'name', binary() }
  | {'rule', openapi_audience_rule:openapi_audience_rule() }
  | {'sharing_type', openapi_audience_sharing_type:openapi_audience_sharing_type() }
  | {'data_party', openapi_audience_data_party:openapi_audience_data_party() }
  | {'category', binary() }
  ].


openapi_audience_create_custom_request() ->
    openapi_audience_create_custom_request([]).

openapi_audience_create_custom_request(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'name', binary() }
            , {'rule', openapi_audience_rule:openapi_audience_rule() }
            , {'sharing_type', openapi_audience_sharing_type:openapi_audience_sharing_type() }
            , {'data_party', openapi_audience_data_party:openapi_audience_data_party() }
            , {'category', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

