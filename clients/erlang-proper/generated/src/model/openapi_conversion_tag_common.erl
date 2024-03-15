-module(openapi_conversion_tag_common).

-include("openapi.hrl").

-export([openapi_conversion_tag_common/0]).

-export([openapi_conversion_tag_common/1]).

-export_type([openapi_conversion_tag_common/0]).

-type openapi_conversion_tag_common() ::
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


openapi_conversion_tag_common() ->
    openapi_conversion_tag_common([]).

openapi_conversion_tag_common(Fields) ->
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

