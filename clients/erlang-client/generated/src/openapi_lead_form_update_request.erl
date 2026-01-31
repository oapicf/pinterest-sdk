-module(openapi_lead_form_update_request).

-export([encode/1]).

-export_type([openapi_lead_form_update_request/0]).

-type openapi_lead_form_update_request() ::
    #{ 'completion_message' => binary(),
       'disclosure_language' => binary(),
       'has_accepted_terms' => boolean(),
       'name' => binary(),
       'policy_links' => list(),
       'privacy_policy_link' => binary(),
       'questions' => list(),
       'status' => openapi_lead_form_status:openapi_lead_form_status(),
       'id' := binary()
     }.

encode(#{ 'completion_message' := CompletionMessage,
          'disclosure_language' := DisclosureLanguage,
          'has_accepted_terms' := HasAcceptedTerms,
          'name' := Name,
          'policy_links' := PolicyLinks,
          'privacy_policy_link' := PrivacyPolicyLink,
          'questions' := Questions,
          'status' := Status,
          'id' := Id
        }) ->
    #{ 'completion_message' => CompletionMessage,
       'disclosure_language' => DisclosureLanguage,
       'has_accepted_terms' => HasAcceptedTerms,
       'name' => Name,
       'policy_links' => PolicyLinks,
       'privacy_policy_link' => PrivacyPolicyLink,
       'questions' => Questions,
       'status' => Status,
       'id' => Id
     }.
