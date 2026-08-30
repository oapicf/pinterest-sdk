<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class KeywordsCreate
{
    /**
     * Keywords
     * @DTA\Data(field="keywords")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection206::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection206::class})
     * @var \App\DTO\Collection206|null
     */
    public $keywords;

    /**
     * Keyword data
     * @DTA\Data(field="parent_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $parent_id;

}
