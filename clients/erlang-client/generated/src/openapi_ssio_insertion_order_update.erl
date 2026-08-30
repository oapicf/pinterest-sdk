-module(openapi_ssio_insertion_order_update).

-export([encode/1]).

-export_type([openapi_ssio_insertion_order_update/0]).

-type openapi_ssio_insertion_order_update() ::
    #{ 'ads_manager_order_line_id' => binary(),
       'agency_link' => binary(),
       'billing_contact_email' => binary(),
       'billing_contact_firstname' => binary(),
       'billing_contact_lastname' => binary(),
       'budget_amount' => float(),
       'end_date' => binary(),
       'media_contact_email' => binary(),
       'media_contact_firstname' => binary(),
       'media_contact_lastname' => binary(),
       'oracle_line_id' => binary(),
       'po_number' => binary(),
       'salesforce_order_id' => binary(),
       'salesforce_order_line_id' => binary(),
       'start_date' => binary(),
       'user_email' => binary()
     }.

encode(#{ 'ads_manager_order_line_id' := AdsManagerOrderLineId,
          'agency_link' := AgencyLink,
          'billing_contact_email' := BillingContactEmail,
          'billing_contact_firstname' := BillingContactFirstname,
          'billing_contact_lastname' := BillingContactLastname,
          'budget_amount' := BudgetAmount,
          'end_date' := EndDate,
          'media_contact_email' := MediaContactEmail,
          'media_contact_firstname' := MediaContactFirstname,
          'media_contact_lastname' := MediaContactLastname,
          'oracle_line_id' := OracleLineId,
          'po_number' := PoNumber,
          'salesforce_order_id' := SalesforceOrderId,
          'salesforce_order_line_id' := SalesforceOrderLineId,
          'start_date' := StartDate,
          'user_email' := UserEmail
        }) ->
    #{ 'ads_manager_order_line_id' => AdsManagerOrderLineId,
       'agency_link' => AgencyLink,
       'billing_contact_email' => BillingContactEmail,
       'billing_contact_firstname' => BillingContactFirstname,
       'billing_contact_lastname' => BillingContactLastname,
       'budget_amount' => BudgetAmount,
       'end_date' => EndDate,
       'media_contact_email' => MediaContactEmail,
       'media_contact_firstname' => MediaContactFirstname,
       'media_contact_lastname' => MediaContactLastname,
       'oracle_line_id' => OracleLineId,
       'po_number' => PoNumber,
       'salesforce_order_id' => SalesforceOrderId,
       'salesforce_order_line_id' => SalesforceOrderLineId,
       'start_date' => StartDate,
       'user_email' => UserEmail
     }.
