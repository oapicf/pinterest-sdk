-module(openapi_creative_assets_processing_record).

-export([encode/1]).

-export_type([openapi_creative_assets_processing_record/0]).

-type openapi_creative_assets_processing_record() ::
    #{ 'creative_assets_id' => binary(),
       'errors' => list(),
       'status' => openapi_item_processing_status:openapi_item_processing_status(),
       'warnings' => list()
     }.

encode(#{ 'creative_assets_id' := CreativeAssetsId,
          'errors' := Errors,
          'status' := Status,
          'warnings' := Warnings
        }) ->
    #{ 'creative_assets_id' => CreativeAssetsId,
       'errors' => Errors,
       'status' => Status,
       'warnings' => Warnings
     }.
