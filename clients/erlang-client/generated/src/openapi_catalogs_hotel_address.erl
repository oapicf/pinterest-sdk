-module(openapi_catalogs_hotel_address).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_address/0]).

-type openapi_catalogs_hotel_address() ::
    #{ 'addr1' => binary(),
       'city' => binary(),
       'region' => binary(),
       'country' => binary(),
       'postal_code' => binary()
     }.

encode(#{ 'addr1' := Addr1,
          'city' := City,
          'region' := Region,
          'country' := Country,
          'postal_code' := PostalCode
        }) ->
    #{ 'addr1' => Addr1,
       'city' => City,
       'region' => Region,
       'country' => Country,
       'postal_code' => PostalCode
     }.
