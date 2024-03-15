<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsRetailItemsFilter
{
    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $catalog_type = null;

    /**
     * @DTA\Data(field="item_ids")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $item_ids = null;

    /**
     * Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
     * @DTA\Data(field="catalog_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $catalog_id = null;

}
