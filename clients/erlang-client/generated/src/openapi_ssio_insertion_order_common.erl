-module(openapi_ssio_insertion_order_common).

-export([encode/1]).

-export_type([openapi_ssio_insertion_order_common/0]).

-type openapi_ssio_insertion_order_common() ::
    #{ 'agency_link' => binary(),
       'billing_contact_email' => binary(),
       'billing_contact_firstname' => binary(),
       'billing_contact_lastname' => binary(),
       'budget_amount' => integer(),
       'end_date' => binary(),
       'media_contact_email' => binary(),
       'media_contact_firstname' => binary(),
       'media_contact_lastname' => binary(),
       'po_number' => binary(),
       'start_date' => binary(),
       'user_email' => binary()
     }.

encode(#{ 'agency_link' := AgencyLink,
          'billing_contact_email' := BillingContactEmail,
          'billing_contact_firstname' := BillingContactFirstname,
          'billing_contact_lastname' := BillingContactLastname,
          'budget_amount' := BudgetAmount,
          'end_date' := EndDate,
          'media_contact_email' := MediaContactEmail,
          'media_contact_firstname' := MediaContactFirstname,
          'media_contact_lastname' := MediaContactLastname,
          'po_number' := PoNumber,
          'start_date' := StartDate,
          'user_email' := UserEmail
        }) ->
    #{ 'agency_link' => AgencyLink,
       'billing_contact_email' => BillingContactEmail,
       'billing_contact_firstname' => BillingContactFirstname,
       'billing_contact_lastname' => BillingContactLastname,
       'budget_amount' => BudgetAmount,
       'end_date' => EndDate,
       'media_contact_email' => MediaContactEmail,
       'media_contact_firstname' => MediaContactFirstname,
       'media_contact_lastname' => MediaContactLastname,
       'po_number' => PoNumber,
       'start_date' => StartDate,
       'user_email' => UserEmail
     }.
