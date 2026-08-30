<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AssetGroupBinding
{
    /**
     * A list of ad account IDs under the asset group
     * @DTA\Data(field="ad_accounts_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection333::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection333::class})
     */
    public ?\App\DTO\Collection333 $ad_accounts_ids = null;

    /**
     * Asset group description
     * @DTA\Data(field="asset_group_description")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $asset_group_description = null;

    /**
     * Asset Group name
     * @DTA\Data(field="asset_group_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $asset_group_name = null;

    /**
     * Asset group types
     * @DTA\Data(field="asset_group_types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection334::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection334::class})
     */
    public ?\App\DTO\Collection334 $asset_group_types = null;

    /**
     * A list of catalog IDs under asset group
     * @DTA\Data(field="catalogs_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection335::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection335::class})
     */
    public ?\App\DTO\Collection335 $catalogs_ids = null;

    /**
     * The data of the user that created the asset group.
     * @DTA\Data(field="created_by")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     */
    public ?\App\DTO\BusinessAccessUserSummary $created_by = null;

    /**
     * The creation time of the asset group
     * @DTA\Data(field="created_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_time = null;

    /**
     * Asset Group ID.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * The data of the business that owns the asset group.
     * @DTA\Data(field="owner")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     */
    public ?\App\DTO\BusinessAccessUserSummary $owner = null;

    /**
     * A list of profile IDs under asset group
     * @DTA\Data(field="profiles_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection336::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection336::class})
     */
    public ?\App\DTO\Collection336 $profiles_ids = null;

    /**
     * The last update time of the asset group
     * @DTA\Data(field="updated_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $updated_time = null;

}
