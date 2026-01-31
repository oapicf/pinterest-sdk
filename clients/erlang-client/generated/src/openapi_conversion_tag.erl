-module(openapi_conversion_tag).

-export([encode/1]).

-export_type([openapi_conversion_tag/0]).

-type openapi_conversion_tag() ::
    #{ 'code_snippet' => binary(),
       'configs' => openapi_conversion_tag_configs:openapi_conversion_tag_configs(),
       'enhanced_match_status' => openapi_enhanced_match_status_type:openapi_enhanced_match_status_type(),
       'id' => binary(),
       'last_fired_time_ms' => integer(),
       'name' := binary(),
       'version' => binary(),
       'ad_account_id' := binary(),
       'status' => openapi_entity_status:openapi_entity_status()
     }.

encode(#{ 'code_snippet' := CodeSnippet,
          'configs' := Configs,
          'enhanced_match_status' := EnhancedMatchStatus,
          'id' := Id,
          'last_fired_time_ms' := LastFiredTimeMs,
          'name' := Name,
          'version' := Version,
          'ad_account_id' := AdAccountId,
          'status' := Status
        }) ->
    #{ 'code_snippet' => CodeSnippet,
       'configs' => Configs,
       'enhanced_match_status' => EnhancedMatchStatus,
       'id' => Id,
       'last_fired_time_ms' => LastFiredTimeMs,
       'name' => Name,
       'version' => Version,
       'ad_account_id' => AdAccountId,
       'status' => Status
     }.
