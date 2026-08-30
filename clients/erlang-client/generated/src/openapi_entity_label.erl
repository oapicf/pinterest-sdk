-module(openapi_entity_label).

-export([encode/1]).

-export_type([openapi_entity_label/0]).

-type openapi_entity_label() ::
    #{ 'entity_id' := binary(),
       'entity_type' => openapi_label_parent_type:openapi_label_parent_type(),
       'label_id' := binary(),
       'status' => openapi_entity_label_status:openapi_entity_label_status()
     }.

encode(#{ 'entity_id' := EntityId,
          'entity_type' := EntityType,
          'label_id' := LabelId,
          'status' := Status
        }) ->
    #{ 'entity_id' => EntityId,
       'entity_type' => EntityType,
       'label_id' => LabelId,
       'status' => Status
     }.
