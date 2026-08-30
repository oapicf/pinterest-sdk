-module(openapi_label_create_item).

-export([encode/1]).

-export_type([openapi_label_create_item/0]).

-type openapi_label_create_item() ::
    #{ 'label_type' := openapi_label_type:openapi_label_type(),
       'value' := binary()
     }.

encode(#{ 'label_type' := LabelType,
          'value' := Value
        }) ->
    #{ 'label_type' => LabelType,
       'value' => Value
     }.
