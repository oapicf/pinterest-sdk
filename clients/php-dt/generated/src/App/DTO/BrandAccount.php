<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class BrandAccount
{
    /**
     * @DTA\Data(field="brand_account_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $brand_account_id = null;

}
