<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ad preview source from an existing Pin.
 */
class AdPreviewSourcePinId
{
    /**
     * Creative type of the ad preview.
     * @DTA\Data(field="creative_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdPinPreviewCreativeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdPinPreviewCreativeType::class})
     */
    public ?\App\DTO\AdPinPreviewCreativeType $creative_type = null;

    /**
     * Pin ID.
     * @DTA\Data(field="pin_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $pin_id = null;

}
