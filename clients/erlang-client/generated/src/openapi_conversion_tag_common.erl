-module(openapi_conversion_tag_common).

-export([encode/1]).

-export_type([openapi_conversion_tag_common/0]).

-type openapi_conversion_tag_common() ::
    #{ 'ad_account_id' => binary(),
       'code_snippet' => binary(),
       'enhanced_match_status' => openapi_enhanced_match_status_type:openapi_enhanced_match_status_type(),
       'id' => binary(),
       'last_fired_time_ms' => integer(),
       'name' => binary(),
       'status' => openapi_entity_status:openapi_entity_status(),
       'version' => binary(),
       'configs' => openapi_conversion_tag_configs:openapi_conversion_tag_configs()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'code_snippet' := CodeSnippet,
          'enhanced_match_status' := EnhancedMatchStatus,
          'id' := Id,
          'last_fired_time_ms' := LastFiredTimeMs,
          'name' := Name,
          'status' := Status,
          'version' := Version,
          'configs' := Configs
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'code_snippet' => CodeSnippet,
       'enhanced_match_status' => EnhancedMatchStatus,
       'id' => Id,
       'last_fired_time_ms' => LastFiredTimeMs,
       'name' => Name,
       'status' => Status,
       'version' => Version,
       'configs' => Configs
     }.
