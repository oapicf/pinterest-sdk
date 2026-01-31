-module(openapi_ssio_order_line).

-include("openapi.hrl").

-export([openapi_ssio_order_line/0]).

-export([openapi_ssio_order_line/1]).

-export_type([openapi_ssio_order_line/0]).

-type openapi_ssio_order_line() ::
  [ {'accepted_terms_id', binary() }
  | {'accepted_terms_time', binary() }
  | {'ads_manager_order_line_id', binary() }
  | {'agency_link', binary() }
  | {'bill_to_company_name', binary() }
  | {'billing_contact_email', binary() }
  | {'billing_contact_firstname', binary() }
  | {'billing_contact_lastname', binary() }
  | {'budget_amount', integer() }
  | {'currency_info', openapi_currency:openapi_currency() }
  | {'end_date', date() }
  | {'estimated_monthly_spend', integer() }
  | {'last_modified_date_time', binary() }
  | {'media_contact_email', binary() }
  | {'media_contact_firstname', binary() }
  | {'media_contact_lastname', binary() }
  | {'order_name', binary() }
  | {'pin_order_id', binary() }
  | {'pmp_name', binary() }
  | {'po_number', binary() }
  | {'salesforce_order_line_id', binary() }
  | {'start_date', date() }
  ].


openapi_ssio_order_line() ->
    openapi_ssio_order_line([]).

openapi_ssio_order_line(Fields) ->
  Default = [ {'accepted_terms_id', binary() }
            , {'accepted_terms_time', binary() }
            , {'ads_manager_order_line_id', binary() }
            , {'agency_link', binary() }
            , {'bill_to_company_name', binary() }
            , {'billing_contact_email', binary() }
            , {'billing_contact_firstname', binary() }
            , {'billing_contact_lastname', binary() }
            , {'budget_amount', integer() }
            , {'currency_info', openapi_currency:openapi_currency() }
            , {'end_date', date() }
            , {'estimated_monthly_spend', integer() }
            , {'last_modified_date_time', binary() }
            , {'media_contact_email', binary() }
            , {'media_contact_firstname', binary() }
            , {'media_contact_lastname', binary() }
            , {'order_name', binary() }
            , {'pin_order_id', binary() }
            , {'pmp_name', binary() }
            , {'po_number', binary() }
            , {'salesforce_order_line_id', binary() }
            , {'start_date', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

