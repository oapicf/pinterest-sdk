<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * AI disclosure declarations the creator has made about the Pin.
 */
class AiDisclosuresUpdate
{
    /**
     * List of AI disclosure declarations the creator has made about this Pin.
     * @DTA\Data(field="values", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\AiDisclosureItem[]|null
     */
    public $values;

}
