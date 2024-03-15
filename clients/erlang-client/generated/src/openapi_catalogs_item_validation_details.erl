-module(openapi_catalogs_item_validation_details).

-export([encode/1]).

-export_type([openapi_catalogs_item_validation_details/0]).

-type openapi_catalogs_item_validation_details() ::
    #{ 'attribute_name' := openapi_nullable_catalogs_item_field_type:openapi_nullable_catalogs_item_field_type(),
       'provided_value' := binary()
     }.

encode(#{ 'attribute_name' := AttributeName,
          'provided_value' := ProvidedValue
        }) ->
    #{ 'attribute_name' => AttributeName,
       'provided_value' => ProvidedValue
     }.
