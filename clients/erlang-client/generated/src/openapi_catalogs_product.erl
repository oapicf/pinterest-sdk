-module(openapi_catalogs_product).

-export([encode/1]).

-export_type([openapi_catalogs_product/0]).

-type openapi_catalogs_product() ::
    #{ 'metadata' := openapi_catalogs_product_metadata:openapi_catalogs_product_metadata(),
       'pin' := openapi_pin:openapi_pin()
     }.

encode(#{ 'metadata' := Metadata,
          'pin' := Pin
        }) ->
    #{ 'metadata' => Metadata,
       'pin' => Pin
     }.
