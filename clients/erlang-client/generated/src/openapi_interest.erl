-module(openapi_interest).

-export([encode/1]).

-export_type([openapi_interest/0]).

-type openapi_interest() ::
    #{ 'canonical_url' => binary(),
       'id' => binary(),
       'key' => binary(),
       'name' => binary()
     }.

encode(#{ 'canonical_url' := CanonicalUrl,
          'id' := Id,
          'key' := Key,
          'name' := Name
        }) ->
    #{ 'canonical_url' => CanonicalUrl,
       'id' => Id,
       'key' => Key,
       'name' => Name
     }.
