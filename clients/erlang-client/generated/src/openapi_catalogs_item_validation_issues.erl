-module(openapi_catalogs_item_validation_issues).

-export([encode/1]).

-export_type([openapi_catalogs_item_validation_issues/0]).

-type openapi_catalogs_item_validation_issues() ::
    #{ 'item_number' := integer(),
       'item_id' := binary(),
       'errors' := openapi_catalogs_item_validation_errors:openapi_catalogs_item_validation_errors(),
       'warnings' := openapi_catalogs_item_validation_warnings:openapi_catalogs_item_validation_warnings()
     }.

encode(#{ 'item_number' := ItemNumber,
          'item_id' := ItemId,
          'errors' := Errors,
          'warnings' := Warnings
        }) ->
    #{ 'item_number' => ItemNumber,
       'item_id' => ItemId,
       'errors' => Errors,
       'warnings' => Warnings
     }.
