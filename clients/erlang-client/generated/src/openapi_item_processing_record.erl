-module(openapi_item_processing_record).

-export([encode/1]).

-export_type([openapi_item_processing_record/0]).

-type openapi_item_processing_record() ::
    #{ 'errors' => list(),
       'item_id' => binary(),
       'status' => openapi_item_processing_status:openapi_item_processing_status(),
       'warnings' => list()
     }.

encode(#{ 'errors' := Errors,
          'item_id' := ItemId,
          'status' := Status,
          'warnings' := Warnings
        }) ->
    #{ 'errors' => Errors,
       'item_id' => ItemId,
       'status' => Status,
       'warnings' => Warnings
     }.
