<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class BillingInvoiceDownloadResponse
{
    /**
     * The download url for the billing invoice
     * @DTA\Data(field="download_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $download_url = null;

    /**
     * The billing invoice id
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

}
