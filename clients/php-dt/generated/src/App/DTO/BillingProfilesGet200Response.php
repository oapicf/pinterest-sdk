<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class BillingProfilesGet200Response
{
    /**
     * @DTA\Data(field="bookmark", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $bookmark = null;

    /**
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection118::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection118::class})
     */
    public ?\App\DTO\Collection118 $items = null;

}
