-module(openapi_catalogs_ai_content_disclosure).

-export([encode/1]).

-export_type([openapi_catalogs_ai_content_disclosure/0]).

-type openapi_catalogs_ai_content_disclosure() ::
    #{ 'disclosure' := list(),
       'url' := binary()
     }.

encode(#{ 'disclosure' := Disclosure,
          'url' := Url
        }) ->
    #{ 'disclosure' => Disclosure,
       'url' => Url
     }.
