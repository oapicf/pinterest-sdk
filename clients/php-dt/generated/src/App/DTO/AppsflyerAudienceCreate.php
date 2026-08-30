<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class AppsflyerAudienceCreate
{
    /**
     * The name of the audience
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * The platform of the audience
     * @DTA\Data(field="platform")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AppsflyerPlatform::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AppsflyerPlatform::class})
     */
    public ?\App\DTO\AppsflyerPlatform $platform = null;

}
