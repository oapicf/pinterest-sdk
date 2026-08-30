<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The resource was successfully deleted.
 */
class PinterestLibStatus204
{
    /**
     * @DTA\Data(field="statusCode")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $status_code;

}
