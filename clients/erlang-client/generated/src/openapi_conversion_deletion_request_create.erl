-module(openapi_conversion_deletion_request_create).

-export([encode/1]).

-export_type([openapi_conversion_deletion_request_create/0]).

-type openapi_conversion_deletion_request_create() ::
    #{ 'deletion_targets' := openapi_conversion_deletion_request_targets:openapi_conversion_deletion_request_targets()
     }.

encode(#{ 'deletion_targets' := DeletionTargets
        }) ->
    #{ 'deletion_targets' => DeletionTargets
     }.
