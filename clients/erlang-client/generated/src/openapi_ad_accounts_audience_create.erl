-module(openapi_ad_accounts_audience_create).

-export([encode/1]).

-export_type([openapi_ad_accounts_audience_create/0]).

-type openapi_ad_accounts_audience_create() ::
    #{ 'ad_account_id' => binary(),
       'audience_type' => openapi_audience_type:openapi_audience_type(),
       'description' => binary(),
       'name' => binary(),
       'rule' => openapi_ad_accounts_audience_rule:openapi_ad_accounts_audience_rule()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'audience_type' := AudienceType,
          'description' := Description,
          'name' := Name,
          'rule' := Rule
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'audience_type' => AudienceType,
       'description' => Description,
       'name' => Name,
       'rule' => Rule
     }.
