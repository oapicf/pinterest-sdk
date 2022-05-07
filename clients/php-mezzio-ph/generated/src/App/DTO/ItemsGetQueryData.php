<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for items/get
 */
class ItemsGetQueryData
{
    /**
     * Country for the Catalogs Items
     * @DTA\Data(field="country")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $country;

    /**
     * Catalos Item ids
     * @DTA\Data(field="item_ids")
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @var string[]|null
     */
    public $item_ids;

    /**
     * Language for the Catalogs Items
     * @DTA\Data(field="language")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $language;

}
