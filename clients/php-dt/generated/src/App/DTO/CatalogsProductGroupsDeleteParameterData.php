<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for catalogs_product_groups/delete
 */
class CatalogsProductGroupsDeleteParameterData
{
    /**
     * Unique identifier of a product group
     * @DTA\Data(subset="path", field="product_group_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $product_group_id;

}
