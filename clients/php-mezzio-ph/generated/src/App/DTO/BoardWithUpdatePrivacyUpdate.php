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
     * @var string|null
     */
    public $description;

    /**
     * Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="privacy", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BoardUpdatePrivacy::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BoardUpdatePrivacy::class})
     * @var \App\DTO\BoardUpdatePrivacy|null
     */
    public $privacy;

}
