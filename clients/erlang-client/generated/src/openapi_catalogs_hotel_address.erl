-module(openapi_catalogs_hotel_address).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_address/0]).

-type openapi_catalogs_hotel_address() ::
    #{ 'addr1' => binary(),
       'city' => binary(),
       'country' => binary(),
       'postal_code' => binary(),
       'region' => binary()
     }.

encode(#{ 'addr1' := Addr1,
          'city' := City,
          'country' := Country,
          'postal_code' := PostalCode,
          'region' := Region
        }) ->
    #{ 'addr1' => Addr1,
       'city' => City,
       'country' => Country,
       'postal_code' => PostalCode,
       'region' => Region
     }.
