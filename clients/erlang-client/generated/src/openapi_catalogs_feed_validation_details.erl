-module(openapi_catalogs_feed_validation_details).

-export([encode/1]).

-export_type([openapi_catalogs_feed_validation_details/0]).

-type openapi_catalogs_feed_validation_details() ::
    #{ 'errors' := openapi_catalogs_feed_validation_errors:openapi_catalogs_feed_validation_errors(),
       'warnings' := openapi_catalogs_feed_validation_warnings:openapi_catalogs_feed_validation_warnings()
     }.

encode(#{ 'errors' := Errors,
          'warnings' := Warnings
        }) ->
    #{ 'errors' => Errors,
       'warnings' => Warnings
     }.
