<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class SSIOAccountResponse
{
    /**
     * Advertiser eligible to create order lines
     * @DTA\Data(field="eligible", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $eligible = null;

    /**
     * Advertiser eligible to update order lines
     * @DTA\Data(field="can_edit", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $can_edit = null;

    /**
     * An array of Salesforce account information that includes address, io terms, etc.
     * @DTA\Data(field="billto_infos", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection132::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection132::class})
     */
    public ?\App\DTO\Collection132 $billto_infos = null;

    /**
     * @DTA\Data(field="currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $currency = null;

    /**
     * @DTA\Data(field="pmp_names", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection133::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection133::class})
     */
    public ?\App\DTO\Collection133 $pmp_names = null;

    /**
     * Error indicator from Salesforce which could be \&quot;No Error\&quot;
     * @DTA\Data(field="error", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $error = null;

}
