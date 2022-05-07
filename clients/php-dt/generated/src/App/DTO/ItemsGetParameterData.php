<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for items/get
 */
class ItemsGetParameterData
{
    /**
     * Country for the Catalogs Items
     * @DTA\Data(subset="query", field="country")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $country;

    /**
     * Catalos Item ids
     * @DTA\Data(subset="query", field="item_ids")
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @var string[]|null
     */
    public $item_ids;

    /**
     * Language for the Catalogs Items
     * @DTA\Data(subset="query", field="language")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $language;

}
