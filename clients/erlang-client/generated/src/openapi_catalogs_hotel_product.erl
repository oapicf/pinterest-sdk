-module(openapi_catalogs_hotel_product).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_product/0]).

-type openapi_catalogs_hotel_product() ::
    #{ 'catalog_type' := binary(),
       'metadata' := openapi_catalogs_hotel_product_metadata:openapi_catalogs_hotel_product_metadata(),
       'pin' := openapi_pin:openapi_pin()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'metadata' := Metadata,
          'pin' := Pin
        }) ->
    #{ 'catalog_type' => CatalogType,
       'metadata' => Metadata,
       'pin' => Pin
     }.
