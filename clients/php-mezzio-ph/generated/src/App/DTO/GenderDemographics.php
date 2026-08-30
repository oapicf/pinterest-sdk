<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Gender demographic distribution
 */
class GenderDemographics
{
    /**
     * Percentage of female users
     * @DTA\Data(field="female")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $female;

    /**
     * Percentage of male users
     * @DTA\Data(field="male")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $male;

    /**
     * Percentage of users with unspecified gender
     * @DTA\Data(field="unspecified")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $unspecified;

}
