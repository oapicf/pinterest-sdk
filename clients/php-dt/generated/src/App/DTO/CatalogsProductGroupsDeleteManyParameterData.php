<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for catalogsProductGroupsDeleteMany
 */
class CatalogsProductGroupsDeleteManyParameterData
{
    /**
     * Comma-separated list of product group ids
     * @DTA\Data(subset="query", field="id")
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"int", "format":"csv"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"int", "format":"csv", "min_items":1, "max_items":1000})
     */
    public ?array $id = null;

    /**
     * Unique identifier of an ad account.
     * @DTA\Data(subset="query", field="ad_account_id", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="Length", options={"max":18})
     * @DTA\Validator(subset="query", name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

}
