-module(openapi_catalogs_item_validation_issues).

-export([encode/1]).

-export_type([openapi_catalogs_item_validation_issues/0]).

-type openapi_catalogs_item_validation_issues() ::
    #{ 'errors' := openapi_catalogs_item_validation_errors:openapi_catalogs_item_validation_errors(),
       'item_id' := binary(),
       'item_number' := integer(),
       'warnings' := openapi_catalogs_item_validation_warnings:openapi_catalogs_item_validation_warnings()
     }.

encode(#{ 'errors' := Errors,
          'item_id' := ItemId,
          'item_number' := ItemNumber,
          'warnings' := Warnings
        }) ->
    #{ 'errors' => Errors,
       'item_id' => ItemId,
       'item_number' => ItemNumber,
       'warnings' => Warnings
     }.
