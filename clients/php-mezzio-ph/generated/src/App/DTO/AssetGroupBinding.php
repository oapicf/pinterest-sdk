<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AssetGroupBinding
{
    /**
     * A list of ad account IDs under the asset group
     * @DTA\Data(field="ad_accounts_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection333::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection333::class})
     * @var \App\DTO\Collection333|null
     */
    public $ad_accounts_ids;

    /**
     * Asset group description
     * @DTA\Data(field="asset_group_description")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $asset_group_description;

    /**
     * Asset Group name
     * @DTA\Data(field="asset_group_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $asset_group_name;

    /**
     * Asset group types
     * @DTA\Data(field="asset_group_types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection334::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection334::class})
     * @var \App\DTO\Collection334|null
     */
    public $asset_group_types;

    /**
     * A list of catalog IDs under asset group
     * @DTA\Data(field="catalogs_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection335::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection335::class})
     * @var \App\DTO\Collection335|null
     */
    public $catalogs_ids;

    /**
     * The data of the user that created the asset group.
     * @DTA\Data(field="created_by")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @var \App\DTO\BusinessAccessUserSummary|null
     */
    public $created_by;

    /**
     * The creation time of the asset group
     * @DTA\Data(field="created_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_time;

    /**
     * Asset Group ID.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * The data of the business that owns the asset group.
     * @DTA\Data(field="owner")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessAccessUserSummary::class})
     * @var \App\DTO\BusinessAccessUserSummary|null
     */
    public $owner;

    /**
     * A list of profile IDs under asset group
     * @DTA\Data(field="profiles_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection336::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection336::class})
     * @var \App\DTO\Collection336|null
     */
    public $profiles_ids;

    /**
     * The last update time of the asset group
     * @DTA\Data(field="updated_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $updated_time;

}
