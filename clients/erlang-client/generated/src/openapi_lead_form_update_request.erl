-module(openapi_lead_form_update_request).

-export([encode/1]).

-export_type([openapi_lead_form_update_request/0]).

-type openapi_lead_form_update_request() ::
    #{ 'name' => binary(),
       'privacy_policy_link' => binary(),
       'has_accepted_terms' => boolean(),
       'completion_message' => binary(),
       'status' => openapi_lead_form_status:openapi_lead_form_status(),
       'disclosure_language' => binary(),
       'questions' => list(),
       'policy_links' => list(),
       'id' := binary()
     }.

encode(#{ 'name' := Name,
          'privacy_policy_link' := PrivacyPolicyLink,
          'has_accepted_terms' := HasAcceptedTerms,
          'completion_message' := CompletionMessage,
          'status' := Status,
          'disclosure_language' := DisclosureLanguage,
          'questions' := Questions,
          'policy_links' := PolicyLinks,
          'id' := Id
        }) ->
    #{ 'name' => Name,
       'privacy_policy_link' => PrivacyPolicyLink,
       'has_accepted_terms' => HasAcceptedTerms,
       'completion_message' => CompletionMessage,
       'status' => Status,
       'disclosure_language' => DisclosureLanguage,
       'questions' => Questions,
       'policy_links' => PolicyLinks,
       'id' => Id
     }.
