-module(openapi_conversion_tag_response).

-include("openapi.hrl").

-export([openapi_conversion_tag_response/0]).

-export([openapi_conversion_tag_response/1]).

-export_type([openapi_conversion_tag_response/0]).

-type openapi_conversion_tag_response() ::
  [ {'code_snippet', binary() }
  | {'configs', openapi_conversion_tag_configs:openapi_conversion_tag_configs() }
  | {'enhanced_match_status', openapi_enhanced_match_status_type:openapi_enhanced_match_status_type() }
  | {'id', binary() }
  | {'last_fired_time_ms', integer() }
  | {'name', binary() }
  | {'version', binary() }
  | {'ad_account_id', binary() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  ].


openapi_conversion_tag_response() ->
    openapi_conversion_tag_response([]).

openapi_conversion_tag_response(Fields) ->
  Default = [ {'code_snippet', binary() }
            , {'configs', openapi_conversion_tag_configs:openapi_conversion_tag_configs() }
            , {'enhanced_match_status', openapi_enhanced_match_status_type:openapi_enhanced_match_status_type() }
            , {'id', binary() }
            , {'last_fired_time_ms', integer() }
            , {'name', binary() }
            , {'version', binary() }
            , {'ad_account_id', binary() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

