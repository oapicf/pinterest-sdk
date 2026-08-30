-module(openapi_ineligible_product_tag_error_item).

-export([encode/1]).

-export_type([openapi_ineligible_product_tag_error_item/0]).

-type openapi_ineligible_product_tag_error_item() ::
    #{ 'error_message' := openapi_ineligible_product_tag_reason:openapi_ineligible_product_tag_reason(),
       'pin_id' := binary()
     }.

encode(#{ 'error_message' := ErrorMessage,
          'pin_id' := PinId
        }) ->
    #{ 'error_message' => ErrorMessage,
       'pin_id' => PinId
     }.
