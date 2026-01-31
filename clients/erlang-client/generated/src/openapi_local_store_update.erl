-module(openapi_local_store_update).

-export([encode/1]).

-export_type([openapi_local_store_update/0]).

-type openapi_local_store_update() ::
    #{ 'address_primary' => binary(),
       'address_secondary' => binary(),
       'city' => binary(),
       'country' => openapi_country:openapi_country(),
       'id' := binary(),
       'latitude' => integer(),
       'longitude' => integer(),
       'name' => binary(),
       'postal_code' => binary(),
       'region' => binary(),
       'store_code' => binary()
     }.

encode(#{ 'address_primary' := AddressPrimary,
          'address_secondary' := AddressSecondary,
          'city' := City,
          'country' := Country,
          'id' := Id,
          'latitude' := Latitude,
          'longitude' := Longitude,
          'name' := Name,
          'postal_code' := PostalCode,
          'region' := Region,
          'store_code' := StoreCode
        }) ->
    #{ 'address_primary' => AddressPrimary,
       'address_secondary' => AddressSecondary,
       'city' => City,
       'country' => Country,
       'id' => Id,
       'latitude' => Latitude,
       'longitude' => Longitude,
       'name' => Name,
       'postal_code' => PostalCode,
       'region' => Region,
       'store_code' => StoreCode
     }.
