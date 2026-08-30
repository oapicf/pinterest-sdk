goog.provide('API.Client.BillingInvoice');

/**
 * A billing invoice in the advertiser account.
 * @record
 */
API.Client.BillingInvoice = function() {}

/**
 * The ID of the ad account this invoice belongs to
 * @type {!string}
 * @export
 */
API.Client.BillingInvoice.prototype.adAccountId;

/**
 * The name of the ad account this invoice belongs to
 * @type {!string}
 * @export
 */
API.Client.BillingInvoice.prototype.adAccountName;

/**
 * The amount billed in this invoice. Denoted in micro currency
 * @type {!number}
 * @export
 */
API.Client.BillingInvoice.prototype.amountBilledMicroCurrency;

/**
 * The discount in this invoice. Denoted in micro currency
 * @type {!number}
 * @export
 */
API.Client.BillingInvoice.prototype.amountDiscountMicroCurrency;

/**
 * The net amount in this invoice. Denoted in micro currency
 * @type {!number}
 * @export
 */
API.Client.BillingInvoice.prototype.amountNetMicroCurrency;

/**
 * The tax in this invoice. Denoted in micro currency
 * @type {!number}
 * @export
 */
API.Client.BillingInvoice.prototype.amountTaxMicroCurrency;

/**
 * The country of the bill to address
 * @type {!string}
 * @export
 */
API.Client.BillingInvoice.prototype.billToCountry;

/**
 * The end date of the billing period. Format: YYYY-MM-DD
 * @type {!API.Client.date}
 * @export
 */
API.Client.BillingInvoice.prototype.billingPeriodEndDate;

/**
 * The start date of the billing period. Format: YYYY-MM-DD
 * @type {!API.Client.date}
 * @export
 */
API.Client.BillingInvoice.prototype.billingPeriodStartDate;

/**
 * @type {!API.Client.Currency}
 * @export
 */
API.Client.BillingInvoice.prototype.currency;

/**
 * The type of the document
 * @type {!API.Client.BillingInvoiceDocumentType}
 * @export
 */
API.Client.BillingInvoice.prototype.documentType;

/**
 * Unique identifier for the billing invoice
 * @type {!string}
 * @export
 */
API.Client.BillingInvoice.prototype.id;

/**
 * The date the invoice is due. Format: YYYY-MM-DD
 * @type {!API.Client.date}
 * @export
 */
API.Client.BillingInvoice.prototype.invoiceDueDate;

/**
 * The payment terms of the invoice
 * @type {!string}
 * @export
 */
API.Client.BillingInvoice.prototype.paymentTerms;

/**
 * The status of the invoice
 * @type {!API.Client.BillingInvoiceStatus}
 * @export
 */
API.Client.BillingInvoice.prototype.status;

