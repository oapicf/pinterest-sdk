-module(openapi_lead_form_batch_update).

-export([encode/1]).

-export_type([openapi_lead_form_batch_update/0]).

-type openapi_lead_form_batch_update() ::
    #{ 'completion_message' => binary(),
       'disclosure_language' => binary(),
       'has_accepted_terms' => boolean(),
       'id' := binary(),
       'name' => binary(),
       'policy_links' => list(),
       'privacy_policy_link' => binary(),
       'questions' => list(),
       'status' => openapi_lead_form_status:openapi_lead_form_status()
     }.

encode(#{ 'completion_message' := CompletionMessage,
          'disclosure_language' := DisclosureLanguage,
          'has_accepted_terms' := HasAcceptedTerms,
          'id' := Id,
          'name' := Name,
          'policy_links' := PolicyLinks,
          'privacy_policy_link' := PrivacyPolicyLink,
          'questions' := Questions,
          'status' := Status
        }) ->
    #{ 'completion_message' => CompletionMessage,
       'disclosure_language' => DisclosureLanguage,
       'has_accepted_terms' => HasAcceptedTerms,
       'id' => Id,
       'name' => Name,
       'policy_links' => PolicyLinks,
       'privacy_policy_link' => PrivacyPolicyLink,
       'questions' => Questions,
       'status' => Status
     }.
