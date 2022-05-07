-module(openapi_catalogs_feed_processing_schedule).

-export([encode/1]).

-export_type([openapi_catalogs_feed_processing_schedule/0]).

-type openapi_catalogs_feed_processing_schedule() ::
    #{ 'time' := binary(),
       'timezone' := binary()
     }.

encode(#{ 'time' := Time,
          'timezone' := Timezone
        }) ->
    #{ 'time' => Time,
       'timezone' => Timezone
     }.
