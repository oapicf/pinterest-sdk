-module(openapi_lead_form).

-export([encode/1]).

-export_type([openapi_lead_form/0]).

-type openapi_lead_form() ::
    #{ 'ad_account_id' => binary(),
       'completion_message' := binary(),
       'created_time' => integer(),
       'disclosure_language' => binary(),
       'has_accepted_terms' := boolean(),
       'id' := binary(),
       'name' := binary(),
       'policy_links' => list(),
       'privacy_policy_link' := binary(),
       'questions' := list(),
       'status' => openapi_lead_form_status:openapi_lead_form_status(),
       'updated_time' => integer()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'completion_message' := CompletionMessage,
          'created_time' := CreatedTime,
          'disclosure_language' := DisclosureLanguage,
          'has_accepted_terms' := HasAcceptedTerms,
          'id' := Id,
          'name' := Name,
          'policy_links' := PolicyLinks,
          'privacy_policy_link' := PrivacyPolicyLink,
          'questions' := Questions,
          'status' := Status,
          'updated_time' := UpdatedTime
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'completion_message' => CompletionMessage,
       'created_time' => CreatedTime,
       'disclosure_language' => DisclosureLanguage,
       'has_accepted_terms' => HasAcceptedTerms,
       'id' => Id,
       'name' => Name,
       'policy_links' => PolicyLinks,
       'privacy_policy_link' => PrivacyPolicyLink,
       'questions' => Questions,
       'status' => Status,
       'updated_time' => UpdatedTime
     }.
