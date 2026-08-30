<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class EntityLabelError
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityLabel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityLabel::class})
     * @var \App\DTO\EntityLabel|null
     */
    public $data;

    /**
     * @DTA\Data(field="error_messages", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection225::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection225::class})
     * @var \App\DTO\Collection225|null
     */
    public $error_messages;

}
