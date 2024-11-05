-module(openapi_catalogs_product).

-export([encode/1]).

-export_type([openapi_catalogs_product/0]).

-type openapi_catalogs_product() ::
    #{ 'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'metadata' := openapi_catalogs_creative_assets_product_metadata:openapi_catalogs_creative_assets_product_metadata(),
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
