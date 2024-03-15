-module(openapi_ssio_create_insertion_order_request).

-include("openapi.hrl").

-export([openapi_ssio_create_insertion_order_request/0]).

-export([openapi_ssio_create_insertion_order_request/1]).

-export_type([openapi_ssio_create_insertion_order_request/0]).

-type openapi_ssio_create_insertion_order_request() ::
  [ {'start_date', binary() }
  | {'end_date', binary() }
  | {'po_number', binary() }
  | {'budget_amount', integer() }
  | {'billing_contact_firstname', binary() }
  | {'billing_contact_lastname', binary() }
  | {'billing_contact_email', binary() }
  | {'media_contact_firstname', binary() }
  | {'media_contact_lastname', binary() }
  | {'media_contact_email', binary() }
  | {'agency_link', binary() }
  | {'user_email', binary() }
  | {'accepted_terms_time', integer() }
  | {'pmp_id', binary() }
  | {'order_name', binary() }
  | {'order_line_type', binary() }
  | {'accepted_terms_id', binary() }
  | {'billto_company_id', binary() }
  | {'billto_business_address_id', binary() }
  | {'billto_billing_address_id', binary() }
  | {'estimated_monthly_spend', integer() }
  | {'currency_info', openapi_currency:openapi_currency() }
  ].


openapi_ssio_create_insertion_order_request() ->
    openapi_ssio_create_insertion_order_request([]).

openapi_ssio_create_insertion_order_request(Fields) ->
  Default = [ {'start_date', binary() }
            , {'end_date', binary() }
            , {'po_number', binary() }
            , {'budget_amount', integer() }
            , {'billing_contact_firstname', binary() }
            , {'billing_contact_lastname', binary() }
            , {'billing_contact_email', binary() }
            , {'media_contact_firstname', binary() }
            , {'media_contact_lastname', binary() }
            , {'media_contact_email', binary() }
            , {'agency_link', binary() }
            , {'user_email', binary() }
            , {'accepted_terms_time', integer() }
            , {'pmp_id', binary() }
            , {'order_name', binary() }
            , {'order_line_type', elements([<<"BUDGET">>, <<"PERPETUALS">>]) }
            , {'accepted_terms_id', binary() }
            , {'billto_company_id', binary() }
            , {'billto_business_address_id', binary() }
            , {'billto_billing_address_id', binary() }
            , {'estimated_monthly_spend', integer() }
            , {'currency_info', openapi_currency:openapi_currency() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

