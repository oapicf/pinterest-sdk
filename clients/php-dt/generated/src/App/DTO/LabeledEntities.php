<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LabeledEntities
{
    /**
     * @DTA\Data(field="entities_labels", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection224::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection224::class})
     */
    public ?\App\DTO\Collection224 $entities_labels = null;

    /**
     * Labels that were not successfully applied.
     * @DTA\Data(field="errors", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection226::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection226::class})
     */
    public ?\App\DTO\Collection226 $errors = null;

}
