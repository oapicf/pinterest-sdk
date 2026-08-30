<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for catalogsProductGroupsDeleteMany
 */
class CatalogsProductGroupsDeleteManyQueryData
{
    /**
     * Comma-separated list of product group ids
     * @DTA\Data(field="id")
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"int", "format":"csv"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"int", "format":"csv", "min_items":1, "max_items":1000})
     * @var int[]|null
     */
    public $id;

    /**
     * Unique identifier of an ad account.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":18})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

}
