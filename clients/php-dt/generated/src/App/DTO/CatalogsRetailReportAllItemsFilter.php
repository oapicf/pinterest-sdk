<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
 */
class CatalogsRetailReportAllItemsFilter
{
    /**
     * Unique identifier of a catalog. If not given, oldest catalog will be used
     * @DTA\Data(field="catalog_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $catalog_id = null;

    /**
     * Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
     * @DTA\Data(field="product_group_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $product_group_id = null;

    /**
     * @DTA\Data(field="report_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $report_type = null;

}
