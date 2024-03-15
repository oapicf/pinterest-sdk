<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class SsioOrderLinesGetByAdAccount200Response
{
    /**
     * SSIO order lines by ad acount id
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $items = null;

    /**
     * @DTA\Data(field="bookmark", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $bookmark = null;

}
