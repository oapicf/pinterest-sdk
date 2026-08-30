-module(openapi_product_tags_error).

-export([encode/1]).

-export_type([openapi_product_tags_error/0]).

-type openapi_product_tags_error() ::
    #{ 'code' := integer(),
       'details' => openapi_ineligible_product_tags_error_details:openapi_ineligible_product_tags_error_details(),
       'message' := binary()
     }.

encode(#{ 'code' := Code,
          'details' := Details,
          'message' := Message
        }) ->
    #{ 'code' => Code,
       'details' => Details,
       'message' => Message
     }.
