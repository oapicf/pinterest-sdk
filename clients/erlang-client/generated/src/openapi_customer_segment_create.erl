-module(openapi_customer_segment_create).

-export([encode/1]).

-export_type([openapi_customer_segment_create/0]).

-type openapi_customer_segment_create() ::
    #{ 'audience_ids' := list(),
       'name' := binary()
     }.

encode(#{ 'audience_ids' := AudienceIds,
          'name' := Name
        }) ->
    #{ 'audience_ids' => AudienceIds,
       'name' => Name
     }.
