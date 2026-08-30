<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LabelError
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LabelErrorData::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LabelErrorData::class})
     * @var \App\DTO\LabelErrorData|null
     */
    public $data;

    /**
     * @DTA\Data(field="error_messages", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection219::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection219::class})
     * @var \App\DTO\Collection219|null
     */
    public $error_messages;

}
