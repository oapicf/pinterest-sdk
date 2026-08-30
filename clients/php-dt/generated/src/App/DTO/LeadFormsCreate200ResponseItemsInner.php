<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LeadFormsCreate200ResponseItemsInner
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LeadForm::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LeadForm::class})
     */
    public ?\App\DTO\LeadForm $data = null;

    /**
     * @DTA\Data(field="exceptions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection234::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection234::class})
     */
    public ?\App\DTO\Collection234 $exceptions = null;

}
