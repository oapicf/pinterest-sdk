-module(openapi_total_count_by_entity_status).

-export([encode/1]).

-export_type([openapi_total_count_by_entity_status/0]).

-type openapi_total_count_by_entity_status() ::
    #{ 'ACTIVE' => integer(),
       'ARCHIVED' => integer(),
       'PAUSED' => integer()
     }.

encode(#{ 'ACTIVE' := ACTIVE,
          'ARCHIVED' := ARCHIVED,
          'PAUSED' := PAUSED
        }) ->
    #{ 'ACTIVE' => ACTIVE,
       'ARCHIVED' => ARCHIVED,
       'PAUSED' => PAUSED
     }.
