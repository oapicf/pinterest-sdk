<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class KeywordError
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Keyword::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Keyword::class})
     */
    public ?\App\DTO\Keyword $data = null;

    /**
     * @DTA\Data(field="error_messages", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection114::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection114::class})
     */
    public ?\App\DTO\Collection114 $error_messages = null;

}
