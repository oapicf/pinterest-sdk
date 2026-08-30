-module(openapi_catalogs_retail_item_response).

-export([encode/1]).

-export_type([openapi_catalogs_retail_item_response/0]).

-type openapi_catalogs_retail_item_response() ::
    #{ 'attributes' => openapi_item_attributes:openapi_item_attributes(),
       'catalog_type' := binary(),
       'item_id' => binary(),
       'item_response_kind' := binary(),
       'pins' => list()
     }.

encode(#{ 'attributes' := Attributes,
          'catalog_type' := CatalogType,
          'item_id' := ItemId,
          'item_response_kind' := ItemResponseKind,
          'pins' := Pins
        }) ->
    #{ 'attributes' => Attributes,
       'catalog_type' => CatalogType,
       'item_id' => ItemId,
       'item_response_kind' => ItemResponseKind,
       'pins' => Pins
     }.
