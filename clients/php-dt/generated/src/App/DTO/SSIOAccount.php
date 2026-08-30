<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Salesforce account details including bill-to information.
 */
class SSIOAccount
{
    /**
     * An array of Salesforce account information that includes address, io terms, etc.
     * @DTA\Data(field="billto_infos", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection300::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection300::class})
     */
    public ?\App\DTO\Collection300 $billto_infos = null;

    /**
     * Advertiser eligible to update order lines
     * @DTA\Data(field="can_edit", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $can_edit = null;

    /**
     * @DTA\Data(field="currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $currency = null;

    /**
     * Advertiser eligible to create order lines
     * @DTA\Data(field="eligible", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $eligible = null;

    /**
     * Error indicator from Salesforce which could be \&quot;No Error\&quot;
     * @DTA\Data(field="error", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $error = null;

    /**
     * @DTA\Data(field="pmp_names", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection301::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection301::class})
     */
    public ?\App\DTO\Collection301 $pmp_names = null;

}
