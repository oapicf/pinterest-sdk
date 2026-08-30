<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class DynamicTitlesGetStatus
{
    /**
     * The count of generated titles.
     * @DTA\Data(field="generated_count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $generated_count = null;

    /**
     * Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
     * @DTA\Data(field="is_ready", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_ready = null;

    /**
     * The count of advertiser reviewed titles.
     * @DTA\Data(field="reviewed_count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $reviewed_count = null;

}
