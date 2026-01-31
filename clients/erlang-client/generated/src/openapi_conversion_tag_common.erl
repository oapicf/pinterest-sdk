-module(openapi_conversion_tag_common).

-export([encode/1]).

-export_type([openapi_conversion_tag_common/0]).

-type openapi_conversion_tag_common() ::
    #{ 'code_snippet' => binary(),
       'configs' => openapi_conversion_tag_configs:openapi_conversion_tag_configs(),
       'enhanced_match_status' => openapi_enhanced_match_status_type:openapi_enhanced_match_status_type(),
       'id' => binary(),
       'last_fired_time_ms' => integer(),
       'name' := binary(),
       'version' => binary()
     }.

encode(#{ 'code_snippet' := CodeSnippet,
          'configs' := Configs,
          'enhanced_match_status' := EnhancedMatchStatus,
          'id' := Id,
          'last_fired_time_ms' := LastFiredTimeMs,
          'name' := Name,
          'version' := Version
        }) ->
    #{ 'code_snippet' => CodeSnippet,
       'configs' => Configs,
       'enhanced_match_status' => EnhancedMatchStatus,
       'id' => Id,
       'last_fired_time_ms' => LastFiredTimeMs,
       'name' => Name,
       'version' => Version
     }.
