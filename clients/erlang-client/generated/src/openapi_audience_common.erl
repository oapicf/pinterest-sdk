-module(openapi_audience_common).

-export([encode/1]).

-export_type([openapi_audience_common/0]).

-type openapi_audience_common() ::
    #{ 'ad_account_id' => binary(),
       'name' => binary(),
       'rule' => openapi_audience_rule:openapi_audience_rule()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'name' := Name,
          'rule' := Rule
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'name' => Name,
       'rule' => Rule
     }.
