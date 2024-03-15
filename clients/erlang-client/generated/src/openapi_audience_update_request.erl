-module(openapi_audience_update_request).

-export([encode/1]).

-export_type([openapi_audience_update_request/0]).

-type openapi_audience_update_request() ::
    #{ 'ad_account_id' => binary(),
       'name' => binary(),
       'rule' => openapi_audience_rule:openapi_audience_rule(),
       'description' => binary(),
       'operation_type' => openapi_audience_update_operation_type:openapi_audience_update_operation_type()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'name' := Name,
          'rule' := Rule,
          'description' := Description,
          'operation_type' := OperationType
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'name' => Name,
       'rule' => Rule,
       'description' => Description,
       'operation_type' => OperationType
     }.
