-module(openapi_lead_form_response).

-export([encode/1]).

-export_type([openapi_lead_form_response/0]).

-type openapi_lead_form_response() ::
    #{ 'name' => binary(),
       'privacy_policy_link' => binary(),
       'has_accepted_terms' => boolean(),
       'completion_message' => binary(),
       'status' => openapi_lead_form_status:openapi_lead_form_status(),
       'disclosure_language' => binary(),
       'questions' => list(),
       'policy_links' => list(),
       'id' => binary(),
       'ad_account_id' => binary(),
       'created_time' => integer(),
       'updated_time' => integer()
     }.

encode(#{ 'name' := Name,
          'privacy_policy_link' := PrivacyPolicyLink,
          'has_accepted_terms' := HasAcceptedTerms,
          'completion_message' := CompletionMessage,
          'status' := Status,
          'disclosure_language' := DisclosureLanguage,
          'questions' := Questions,
          'policy_links' := PolicyLinks,
          'id' := Id,
          'ad_account_id' := AdAccountId,
          'created_time' := CreatedTime,
          'updated_time' := UpdatedTime
        }) ->
    #{ 'name' => Name,
       'privacy_policy_link' => PrivacyPolicyLink,
       'has_accepted_terms' => HasAcceptedTerms,
       'completion_message' => CompletionMessage,
       'status' => Status,
       'disclosure_language' => DisclosureLanguage,
       'questions' => Questions,
       'policy_links' => PolicyLinks,
       'id' => Id,
       'ad_account_id' => AdAccountId,
       'created_time' => CreatedTime,
       'updated_time' => UpdatedTime
     }.
