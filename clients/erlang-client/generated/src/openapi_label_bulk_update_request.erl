-module(openapi_label_bulk_update_request).

-export([encode/1]).

-export_type([openapi_label_bulk_update_request/0]).

-type openapi_label_bulk_update_request() ::
    #{ 'id' := binary(),
       'parent_id' := binary(),
       'status' := openapi_label_status_bulk_update:openapi_label_status_bulk_update()
     }.

encode(#{ 'id' := Id,
          'parent_id' := ParentId,
          'status' := Status
        }) ->
    #{ 'id' => Id,
       'parent_id' => ParentId,
       'status' => Status
     }.
