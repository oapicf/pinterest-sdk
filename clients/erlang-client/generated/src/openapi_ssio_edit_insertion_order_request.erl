-module(openapi_ssio_edit_insertion_order_request).

-export([encode/1]).

-export_type([openapi_ssio_edit_insertion_order_request/0]).

-type openapi_ssio_edit_insertion_order_request() ::
    #{ 'start_date' => binary(),
       'end_date' => binary(),
       'po_number' => binary(),
       'budget_amount' => integer(),
       'billing_contact_firstname' => binary(),
       'billing_contact_lastname' => binary(),
       'billing_contact_email' => binary(),
       'media_contact_firstname' => binary(),
       'media_contact_lastname' => binary(),
       'media_contact_email' => binary(),
       'agency_link' => binary(),
       'user_email' => binary(),
       'oracle_line_id' => binary(),
       'salesforce_order_id' => binary(),
       'salesforce_order_line_id' => binary(),
       'ads_manager_order_line_id' => binary()
     }.

encode(#{ 'start_date' := StartDate,
          'end_date' := EndDate,
          'po_number' := PoNumber,
          'budget_amount' := BudgetAmount,
          'billing_contact_firstname' := BillingContactFirstname,
          'billing_contact_lastname' := BillingContactLastname,
          'billing_contact_email' := BillingContactEmail,
          'media_contact_firstname' := MediaContactFirstname,
          'media_contact_lastname' := MediaContactLastname,
          'media_contact_email' := MediaContactEmail,
          'agency_link' := AgencyLink,
          'user_email' := UserEmail,
          'oracle_line_id' := OracleLineId,
          'salesforce_order_id' := SalesforceOrderId,
          'salesforce_order_line_id' := SalesforceOrderLineId,
          'ads_manager_order_line_id' := AdsManagerOrderLineId
        }) ->
    #{ 'start_date' => StartDate,
       'end_date' => EndDate,
       'po_number' => PoNumber,
       'budget_amount' => BudgetAmount,
       'billing_contact_firstname' => BillingContactFirstname,
       'billing_contact_lastname' => BillingContactLastname,
       'billing_contact_email' => BillingContactEmail,
       'media_contact_firstname' => MediaContactFirstname,
       'media_contact_lastname' => MediaContactLastname,
       'media_contact_email' => MediaContactEmail,
       'agency_link' => AgencyLink,
       'user_email' => UserEmail,
       'oracle_line_id' => OracleLineId,
       'salesforce_order_id' => SalesforceOrderId,
       'salesforce_order_line_id' => SalesforceOrderLineId,
       'ads_manager_order_line_id' => AdsManagerOrderLineId
     }.
