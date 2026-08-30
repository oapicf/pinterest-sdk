<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A billing invoice in the advertiser account.
 */
class BillingInvoice
{
    /**
     * The ID of the ad account this invoice belongs to
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * The name of the ad account this invoice belongs to
     * @DTA\Data(field="ad_account_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $ad_account_name;

    /**
     * The amount billed in this invoice. Denoted in micro currency
     * @DTA\Data(field="amount_billed_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $amount_billed_micro_currency;

    /**
     * The discount in this invoice. Denoted in micro currency
     * @DTA\Data(field="amount_discount_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $amount_discount_micro_currency;

    /**
     * The net amount in this invoice. Denoted in micro currency
     * @DTA\Data(field="amount_net_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $amount_net_micro_currency;

    /**
     * The tax in this invoice. Denoted in micro currency
     * @DTA\Data(field="amount_tax_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $amount_tax_micro_currency;

    /**
     * The country of the bill to address
     * @DTA\Data(field="bill_to_country", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $bill_to_country;

    /**
     * The end date of the billing period. Format: YYYY-MM-DD
     * @DTA\Data(field="billing_period_end_date", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $billing_period_end_date;

    /**
     * The start date of the billing period. Format: YYYY-MM-DD
     * @DTA\Data(field="billing_period_start_date", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $billing_period_start_date;

    /**
     * @DTA\Data(field="currency", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Currency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Currency::class})
     * @var \App\DTO\Currency|null
     */
    public $currency;

    /**
     * The type of the document
     * @DTA\Data(field="document_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BillingInvoiceDocumentType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BillingInvoiceDocumentType::class})
     * @var \App\DTO\BillingInvoiceDocumentType|null
     */
    public $document_type;

    /**
     * Unique identifier for the billing invoice
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * The date the invoice is due. Format: YYYY-MM-DD
     * @DTA\Data(field="invoice_due_date", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $invoice_due_date;

    /**
     * The payment terms of the invoice
     * @DTA\Data(field="payment_terms", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $payment_terms;

    /**
     * The status of the invoice
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BillingInvoiceStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BillingInvoiceStatus::class})
     * @var \App\DTO\BillingInvoiceStatus|null
     */
    public $status;

}
