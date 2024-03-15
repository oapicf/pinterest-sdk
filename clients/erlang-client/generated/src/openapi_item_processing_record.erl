-module(openapi_item_processing_record).

-export([encode/1]).

-export_type([openapi_item_processing_record/0]).

-type openapi_item_processing_record() ::
    #{ 'item_id' => binary(),
       'errors' => list(),
       'warnings' => list(),
       'status' => openapi_item_processing_status:openapi_item_processing_status()
     }.

encode(#{ 'item_id' := ItemId,
          'errors' := Errors,
          'warnings' := Warnings,
          'status' := Status
        }) ->
    #{ 'item_id' => ItemId,
       'errors' => Errors,
       'warnings' => Warnings,
       'status' => Status
     }.
