<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdBatchItem
{
    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Ad::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Ad::class})
     */
    public ?\App\DTO\Ad $data = null;

    /**
     * @DTA\Data(field="exceptions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PinterestLibError::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PinterestLibError::class})
     */
    public ?\App\DTO\PinterestLibError $exceptions = null;

}
