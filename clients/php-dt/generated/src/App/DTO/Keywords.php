<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class Keywords
{
    /**
     * Keyword error
     * @DTA\Data(field="errors")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection208::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection208::class})
     */
    public ?\App\DTO\Collection208 $errors = null;

    /**
     * Keywords
     * @DTA\Data(field="keywords")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection209::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection209::class})
     */
    public ?\App\DTO\Collection209 $keywords = null;

}
