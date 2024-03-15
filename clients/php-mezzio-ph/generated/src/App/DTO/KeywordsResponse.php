<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class KeywordsResponse
{
    /**
     * @DTA\Data(field="errors", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection115::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection115::class})
     * @var \App\DTO\Collection115|null
     */
    public $errors;

    /**
     * @DTA\Data(field="keywords", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection116::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection116::class})
     * @var \App\DTO\Collection116|null
     */
    public $keywords;

}
