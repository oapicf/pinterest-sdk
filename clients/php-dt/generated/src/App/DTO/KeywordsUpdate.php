<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create or update operation model.
 */
class KeywordsUpdate
{
    /**
     * Keywords
     * @DTA\Data(field="keywords", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection210::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection210::class})
     */
    public ?\App\DTO\Collection210 $keywords = null;

}
