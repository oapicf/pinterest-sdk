<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class UpdatePartnerAssetAccessItem
{
    /**
     * Unique identifier of the business asset.
     * @DTA\Data(field="asset_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":25})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $asset_id;

    /**
     * Unique identifier of a business partner to update asset access to.
     * @DTA\Data(field="partner_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":25})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $partner_id;

    /**
     * A non-empty array of permissions to assign to the partner.
     * @DTA\Data(field="permissions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection395::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection395::class})
     * @var \App\DTO\Collection395|null
     */
    public $permissions;

}
