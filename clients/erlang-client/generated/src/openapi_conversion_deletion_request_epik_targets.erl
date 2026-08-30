-module(openapi_conversion_deletion_request_epik_targets).

-export([encode/1]).

-export_type([openapi_conversion_deletion_request_epik_targets/0]).

-type openapi_conversion_deletion_request_epik_targets() ::
    #{ 'epiks' := list()
     }.

encode(#{ 'epiks' := Epiks
        }) ->
    #{ 'epiks' => Epiks
     }.
