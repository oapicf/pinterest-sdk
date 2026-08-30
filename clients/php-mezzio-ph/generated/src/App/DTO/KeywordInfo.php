<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Related Keyword information of the editorial article
 */
class KeywordInfo
{
    /**
     * Keyword Name
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * MoM growth as a percentage, if there is no growth rate, this field is not present
     * @DTA\Data(field="pct_growth_mom", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $pct_growth_mom;

}
