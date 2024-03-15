<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class KeywordError
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Keyword::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Keyword::class})
     * @var \App\DTO\Keyword|null
     */
    public $data;

    /**
     * @DTA\Data(field="error_messages", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection114::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection114::class})
     * @var \App\DTO\Collection114|null
     */
    public $error_messages;

}
