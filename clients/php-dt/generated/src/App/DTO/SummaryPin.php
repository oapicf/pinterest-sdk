<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Summarized pin information
 */
class SummaryPin
{
    /**
     * @DTA\Data(field="media", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SummaryPinMedia::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SummaryPinMedia::class})
     */
    public ?\App\DTO\SummaryPinMedia $media = null;

    /**
     * @DTA\Data(field="alt_text", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":500})
     */
    public ?string $alt_text = null;

    /**
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2048})
     */
    public ?string $link = null;

    /**
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $title = null;

    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

}
