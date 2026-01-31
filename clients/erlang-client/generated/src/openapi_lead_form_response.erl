-module(openapi_lead_form_response).

-export([encode/1]).

-export_type([openapi_lead_form_response/0]).

-type openapi_lead_form_response() ::
    #{ 'completion_message' => binary(),
       'disclosure_language' => binary(),
       'has_accepted_terms' => boolean(),
       'name' => binary(),
       'policy_links' => list(),
       'privacy_policy_link' => binary(),
       'questions' => list(),
       'status' => openapi_lead_form_status:openapi_lead_form_status(),
       'ad_account_id' => binary(),
       'created_time' => integer(),
       'id' => binary(),
       'updated_time' => integer()
     }.

encode(#{ 'completion_message' := CompletionMessage,
          'disclosure_language' := DisclosureLanguage,
          'has_accepted_terms' := HasAcceptedTerms,
          'name' := Name,
          'policy_links' := PolicyLinks,
          'privacy_policy_link' := PrivacyPolicyLink,
          'questions' := Questions,
          'status' := Status,
          'ad_account_id' := AdAccountId,
          'created_time' := CreatedTime,
          'id' := Id,
          'updated_time' := UpdatedTime
        }) ->
    #{ 'completion_message' => CompletionMessage,
       'disclosure_language' => DisclosureLanguage,
       'has_accepted_terms' => HasAcceptedTerms,
       'name' => Name,
       'policy_links' => PolicyLinks,
       'privacy_policy_link' => PrivacyPolicyLink,
       'questions' => Questions,
       'status' => Status,
       'ad_account_id' => AdAccountId,
       'created_time' => CreatedTime,
       'id' => Id,
       'updated_time' => UpdatedTime
     }.
