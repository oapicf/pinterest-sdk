goog.provide('API.Client.BillingInvoiceResponse');

/**
 * @record
 */
API.Client.BillingInvoiceResponse = function() {}

/**
 * The ID of the ad account this invoice belongs to
 * @type {!string}
 * @export
 */
API.Client.BillingInvoiceResponse.prototype.adAccountId;

/**
 * The name of the ad account this invoice belongs to
 * @type {!string}
 * @export
 */
API.Client.BillingInvoiceResponse.prototype.adAccountName;

/**
 * The amount billed in this invoice. Denoted in micro currency
 * @type {!number}
 * @export
 */
API.Client.BillingInvoiceResponse.prototype.amountBilledMicroCurrency;

/**
 * The discount in this invoice. Denoted in micro currency
 * @type {!number}
 * @export
 */
API.Client.BillingInvoiceResponse.prototype.amountDiscountMicroCurrency;

/**
 * The net amount in this invoice. Denoted in micro currency
 * @type {!number}
 * @export
 */
API.Client.BillingInvoiceResponse.prototype.amountNetMicroCurrency;

/**
 * The tax in this invoice. Denoted in micro currency
 * @type {!number}
 * @export
 */
API.Client.BillingInvoiceResponse.prototype.amountTaxMicroCurrency;

/**
 * The country of the bill to address
 * @type {!string}
 * @export
 */
API.Client.BillingInvoiceResponse.prototype.billToCountry;

/**
 * The end date of the billing period. Format: YYYY-MM-DD
 * @type {!API.Client.date}
 * @export
 */
API.Client.BillingInvoiceResponse.prototype.billingPeriodEndDate;

/**
 * The start date of the billing period. Format: YYYY-MM-DD
 * @type {!API.Client.date}
 * @export
 */
API.Client.BillingInvoiceResponse.prototype.billingPeriodStartDate;

/**
 * @type {!API.Client.Currency}
 * @export
 */
API.Client.BillingInvoiceResponse.prototype.currency;

/**
 * The type of the document
 * @type {!string}
 * @export
 */
API.Client.BillingInvoiceResponse.prototype.documentType;

/**
 * Unique identifier for the billing invoice
 * @type {!string}
 * @export
 */
API.Client.BillingInvoiceResponse.prototype.id;

/**
 * The date the invoice is due. Format: YYYY-MM-DD
 * @type {!API.Client.date}
 * @export
 */
API.Client.BillingInvoiceResponse.prototype.invoiceDueDate;

/**
 * The payment terms of the invoice
 * @type {!string}
 * @export
 */
API.Client.BillingInvoiceResponse.prototype.paymentTerms;

/**
 * The status of the invoice
 * @type {!string}
 * @export
 */
API.Client.BillingInvoiceResponse.prototype.status;

/** @enum {string} */
API.Client.BillingInvoiceResponse.DocumentTypeEnum = { 
  INVOICE: 'INVOICE',
  CREDIT_MEMO: 'CREDIT_MEMO',
}
/** @enum {string} */
API.Client.BillingInvoiceResponse.StatusEnum = { 
  OPEN: 'OPEN',
  CLOSED: 'CLOSED',
}
