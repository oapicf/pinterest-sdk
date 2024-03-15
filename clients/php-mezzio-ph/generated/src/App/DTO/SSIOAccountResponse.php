<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SSIOAccountResponse
{
    /**
     * Advertiser eligible to create order lines
     * @DTA\Data(field="eligible", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $eligible;

    /**
     * Advertiser eligible to update order lines
     * @DTA\Data(field="can_edit", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $can_edit;

    /**
     * An array of Salesforce account information that includes address, io terms, etc.
     * @DTA\Data(field="billto_infos", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection132::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection132::class})
     * @var \App\DTO\Collection132|null
     */
    public $billto_infos;

    /**
     * @DTA\Data(field="currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $currency;

    /**
     * @DTA\Data(field="pmp_names", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection133::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection133::class})
     * @var \App\DTO\Collection133|null
     */
    public $pmp_names;

    /**
     * Error indicator from Salesforce which could be \&quot;No Error\&quot;
     * @DTA\Data(field="error", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $error;

}
