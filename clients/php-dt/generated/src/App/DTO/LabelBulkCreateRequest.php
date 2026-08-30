<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LabelBulkCreateRequest
{
    /**
     * Labels that you are applying to the campaign.
     * @DTA\Data(field="labels")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection129::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection129::class})
     */
    public ?\App\DTO\Collection129 $labels = null;

    /**
     * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
     * @DTA\Data(field="parent_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^[C]?\d+$/"})
     */
    public ?string $parent_id = null;

}
