-module(openapi_store_metadata).

-export([encode/1]).

-export_type([openapi_store_metadata/0]).

-type openapi_store_metadata() ::
    #{ 'geohash' => binary(),
       'latitude' => float(),
       'longitude' => float(),
       'store_code' := binary(),
       'store_id' := binary(),
       'store_name' => binary()
     }.

encode(#{ 'geohash' := Geohash,
          'latitude' := Latitude,
          'longitude' := Longitude,
          'store_code' := StoreCode,
          'store_id' := StoreId,
          'store_name' := StoreName
        }) ->
    #{ 'geohash' => Geohash,
       'latitude' => Latitude,
       'longitude' => Longitude,
       'store_code' => StoreCode,
       'store_id' => StoreId,
       'store_name' => StoreName
     }.
