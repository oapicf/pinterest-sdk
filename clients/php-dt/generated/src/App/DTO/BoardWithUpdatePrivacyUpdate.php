<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create or update operation model.
 */
class BoardWithUpdatePrivacyUpdate
{
    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="privacy", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BoardUpdatePrivacy::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BoardUpdatePrivacy::class})
     */
    public ?\App\DTO\BoardUpdatePrivacy $privacy = null;

}
