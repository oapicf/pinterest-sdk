<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class EntityLabelError
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityLabel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityLabel::class})
     */
    public ?\App\DTO\EntityLabel $data = null;

    /**
     * @DTA\Data(field="error_messages", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection225::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection225::class})
     */
    public ?\App\DTO\Collection225 $error_messages = null;

}
