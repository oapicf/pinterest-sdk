-module(openapi_ad_accounts_audience_update).

-export([encode/1]).

-export_type([openapi_ad_accounts_audience_update/0]).

-type openapi_ad_accounts_audience_update() ::
    #{ 'ad_account_id' => binary(),
       'audience_type' => openapi_audience_type:openapi_audience_type(),
       'description' => binary(),
       'name' => binary(),
       'operation_type' => openapi_audience_update_operation_type:openapi_audience_update_operation_type(),
       'rule' => openapi_ad_accounts_audience_rule:openapi_ad_accounts_audience_rule()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'audience_type' := AudienceType,
          'description' := Description,
          'name' := Name,
          'operation_type' := OperationType,
          'rule' := Rule
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'audience_type' => AudienceType,
       'description' => Description,
       'name' => Name,
       'operation_type' => OperationType,
       'rule' => Rule
     }.
