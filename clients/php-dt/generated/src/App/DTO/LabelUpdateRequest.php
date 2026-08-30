<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LabelUpdateRequest
{
    /**
     * Labels that you are applying to the campaign.
     * @DTA\Data(field="labels")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection222::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection222::class})
     */
    public ?\App\DTO\Collection222 $labels = null;

}
