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
     * @var \App\DTO\SummaryPinMedia|null
     */
    public $media;

    /**
     * @DTA\Data(field="alt_text", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":500})
     * @var string|null
     */
    public $alt_text;

    /**
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2048})
     * @var string|null
     */
    public $link;

    /**
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $title;

    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $description;

}
