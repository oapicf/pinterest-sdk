-module(openapi_billing_invoice_response).

-export([encode/1]).

-export_type([openapi_billing_invoice_response/0]).

-type openapi_billing_invoice_response() ::
    #{ 'ad_account_id' => binary(),
       'ad_account_name' => binary(),
       'amount_billed_micro_currency' => integer(),
       'amount_discount_micro_currency' => integer(),
       'amount_net_micro_currency' => integer(),
       'amount_tax_micro_currency' => integer(),
       'bill_to_country' => binary(),
       'billing_period_end_date' => calendar:date(),
       'billing_period_start_date' => calendar:date(),
       'currency' => openapi_currency:openapi_currency(),
       'document_type' => binary(),
       'id' => binary(),
       'invoice_due_date' => calendar:date(),
       'payment_terms' => binary(),
       'status' => binary()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'ad_account_name' := AdAccountName,
          'amount_billed_micro_currency' := AmountBilledMicroCurrency,
          'amount_discount_micro_currency' := AmountDiscountMicroCurrency,
          'amount_net_micro_currency' := AmountNetMicroCurrency,
          'amount_tax_micro_currency' := AmountTaxMicroCurrency,
          'bill_to_country' := BillToCountry,
          'billing_period_end_date' := BillingPeriodEndDate,
          'billing_period_start_date' := BillingPeriodStartDate,
          'currency' := Currency,
          'document_type' := DocumentType,
          'id' := Id,
          'invoice_due_date' := InvoiceDueDate,
          'payment_terms' := PaymentTerms,
          'status' := Status
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'ad_account_name' => AdAccountName,
       'amount_billed_micro_currency' => AmountBilledMicroCurrency,
       'amount_discount_micro_currency' => AmountDiscountMicroCurrency,
       'amount_net_micro_currency' => AmountNetMicroCurrency,
       'amount_tax_micro_currency' => AmountTaxMicroCurrency,
       'bill_to_country' => BillToCountry,
       'billing_period_end_date' => BillingPeriodEndDate,
       'billing_period_start_date' => BillingPeriodStartDate,
       'currency' => Currency,
       'document_type' => DocumentType,
       'id' => Id,
       'invoice_due_date' => InvoiceDueDate,
       'payment_terms' => PaymentTerms,
       'status' => Status
     }.
