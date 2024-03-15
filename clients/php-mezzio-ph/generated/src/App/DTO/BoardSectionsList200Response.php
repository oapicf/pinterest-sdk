<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class BoardSectionsList200Response
{
    /**
     * Board sections
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\BoardSection[]|null
     */
    public $items;

    /**
     * @DTA\Data(field="bookmark", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $bookmark;

}
