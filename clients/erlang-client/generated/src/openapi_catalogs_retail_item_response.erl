-module(openapi_catalogs_retail_item_response).

-export([encode/1]).

-export_type([openapi_catalogs_retail_item_response/0]).

-type openapi_catalogs_retail_item_response() ::
    #{ 'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'item_id' => binary(),
       'pins' => list(),
       'attributes' => openapi_item_attributes:openapi_item_attributes()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'item_id' := ItemId,
          'pins' := Pins,
          'attributes' := Attributes
        }) ->
    #{ 'catalog_type' => CatalogType,
       'item_id' => ItemId,
       'pins' => Pins,
       'attributes' => Attributes
     }.
