<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CampaignAdPreviewCreate200ResponseInnerDataOneOf
{
    /**
     * @DTA\Data(field="exceptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PinterestLibError::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PinterestLibError::class})
     * @var \App\DTO\PinterestLibError|null
     */
    public $exceptions;

}
