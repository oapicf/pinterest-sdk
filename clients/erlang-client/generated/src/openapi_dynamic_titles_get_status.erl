-module(openapi_dynamic_titles_get_status).

-export([encode/1]).

-export_type([openapi_dynamic_titles_get_status/0]).

-type openapi_dynamic_titles_get_status() ::
    #{ 'generated_count' => integer(),
       'is_ready' => boolean(),
       'reviewed_count' => integer()
     }.

encode(#{ 'generated_count' := GeneratedCount,
          'is_ready' := IsReady,
          'reviewed_count' := ReviewedCount
        }) ->
    #{ 'generated_count' => GeneratedCount,
       'is_ready' => IsReady,
       'reviewed_count' => ReviewedCount
     }.
