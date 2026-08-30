<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsLocalStoresCreate200ResponseInnerDataOneOf
{
    /**
     * The ID of the local store.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="exceptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PinterestLibError::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PinterestLibError::class})
     */
    public ?\App\DTO\PinterestLibError $exceptions = null;

}
