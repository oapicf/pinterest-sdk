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
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

    /**
     * The name of the ad account this invoice belongs to
     * @DTA\Data(field="ad_account_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $ad_account_name = null;

    /**
     * The amount billed in this invoice. Denoted in micro currency
     * @DTA\Data(field="amount_billed_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $amount_billed_micro_currency = null;

    /**
     * The discount in this invoice. Denoted in micro currency
     * @DTA\Data(field="amount_discount_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $amount_discount_micro_currency = null;

    /**
     * The net amount in this invoice. Denoted in micro currency
     * @DTA\Data(field="amount_net_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $amount_net_micro_currency = null;

    /**
     * The tax in this invoice. Denoted in micro currency
     * @DTA\Data(field="amount_tax_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $amount_tax_micro_currency = null;

    /**
     * The country of the bill to address
     * @DTA\Data(field="bill_to_country", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $bill_to_country = null;

    /**
     * The end date of the billing period. Format: YYYY-MM-DD
     * @DTA\Data(field="billing_period_end_date", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     */
    public ?\DateTimeInterface $billing_period_end_date = null;

    /**
     * The start date of the billing period. Format: YYYY-MM-DD
     * @DTA\Data(field="billing_period_start_date", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     */
    public ?\DateTimeInterface $billing_period_start_date = null;

    /**
     * @DTA\Data(field="currency", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Currency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Currency::class})
     */
    public ?\App\DTO\Currency $currency = null;

    /**
     * The type of the document
     * @DTA\Data(field="document_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BillingInvoiceDocumentType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BillingInvoiceDocumentType::class})
     */
    public ?\App\DTO\BillingInvoiceDocumentType $document_type = null;

    /**
     * Unique identifier for the billing invoice
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * The date the invoice is due. Format: YYYY-MM-DD
     * @DTA\Data(field="invoice_due_date", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     */
    public ?\DateTimeInterface $invoice_due_date = null;

    /**
     * The payment terms of the invoice
     * @DTA\Data(field="payment_terms", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $payment_terms = null;

    /**
     * The status of the invoice
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BillingInvoiceStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BillingInvoiceStatus::class})
     */
    public ?\App\DTO\BillingInvoiceStatus $status = null;

}
