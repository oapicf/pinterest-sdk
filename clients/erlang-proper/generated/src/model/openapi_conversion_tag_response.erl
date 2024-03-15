-module(openapi_conversion_tag_response).

-include("openapi.hrl").

-export([openapi_conversion_tag_response/0]).

-export([openapi_conversion_tag_response/1]).

-export_type([openapi_conversion_tag_response/0]).

-type openapi_conversion_tag_response() ::
  [ {'ad_account_id', binary() }
  | {'code_snippet', binary() }
  | {'enhanced_match_status', openapi_enhanced_match_status_type:openapi_enhanced_match_status_type() }
  | {'id', binary() }
  | {'last_fired_time_ms', integer() }
  | {'name', binary() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'version', binary() }
  | {'configs', openapi_conversion_tag_configs:openapi_conversion_tag_configs() }
  ].


openapi_conversion_tag_response() ->
    openapi_conversion_tag_response([]).

openapi_conversion_tag_response(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'code_snippet', binary() }
            , {'enhanced_match_status', openapi_enhanced_match_status_type:openapi_enhanced_match_status_type() }
            , {'id', binary() }
            , {'last_fired_time_ms', integer() }
            , {'name', binary() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'version', binary() }
            , {'configs', openapi_conversion_tag_configs:openapi_conversion_tag_configs() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

