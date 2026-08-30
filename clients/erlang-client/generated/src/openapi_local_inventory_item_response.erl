-module(openapi_local_inventory_item_response).

-export([encode/1]).

-export_type([openapi_local_inventory_item_response/0]).

-type openapi_local_inventory_item_response() ::
    #{ 'ad_link' => binary(),
       'availability' => openapi_item_availability:openapi_item_availability(),
       'created_at' := integer(),
       'item_id' := binary(),
       'last_updated_time' := integer(),
       'price' => binary(),
       'sale_price' => binary(),
       'store_metadata' := openapi_store_metadata:openapi_store_metadata()
     }.

encode(#{ 'ad_link' := AdLink,
          'availability' := Availability,
          'created_at' := CreatedAt,
          'item_id' := ItemId,
          'last_updated_time' := LastUpdatedTime,
          'price' := Price,
          'sale_price' := SalePrice,
          'store_metadata' := StoreMetadata
        }) ->
    #{ 'ad_link' => AdLink,
       'availability' => Availability,
       'created_at' => CreatedAt,
       'item_id' => ItemId,
       'last_updated_time' => LastUpdatedTime,
       'price' => Price,
       'sale_price' => SalePrice,
       'store_metadata' => StoreMetadata
     }.
