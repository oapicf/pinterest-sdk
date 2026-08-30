<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LabelBulkCreateRequest
{
    /**
     * Labels that you are applying to the campaign.
     * @DTA\Data(field="labels")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection129::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection129::class})
     * @var \App\DTO\Collection129|null
     */
    public $labels;

    /**
     * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
     * @DTA\Data(field="parent_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^[C]?\\d+$/"})
     * @var string|null
     */
    public $parent_id;

}
