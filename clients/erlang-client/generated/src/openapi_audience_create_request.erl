-module(openapi_audience_create_request).

-export([encode/1]).

-export_type([openapi_audience_create_request/0]).

-type openapi_audience_create_request() ::
    #{ 'ad_account_id' => binary(),
       'name' := binary(),
       'rule' := openapi_audience_rule:openapi_audience_rule(),
       'description' => binary(),
       'audience_type' := openapi_audience_create_request_1_audience_type:openapi_audience_create_request_1_audience_type()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'name' := Name,
          'rule' := Rule,
          'description' := Description,
          'audience_type' := AudienceType
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'name' => Name,
       'rule' => Rule,
       'description' => Description,
       'audience_type' => AudienceType
     }.
