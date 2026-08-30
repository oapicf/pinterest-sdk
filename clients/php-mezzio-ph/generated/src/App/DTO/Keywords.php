<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class Keywords
{
    /**
     * Keyword error
     * @DTA\Data(field="errors")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection208::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection208::class})
     * @var \App\DTO\Collection208|null
     */
    public $errors;

    /**
     * Keywords
     * @DTA\Data(field="keywords")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection209::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection209::class})
     * @var \App\DTO\Collection209|null
     */
    public $keywords;

}
