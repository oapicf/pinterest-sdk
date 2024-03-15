<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsHotelAddress
{
    /**
     * Primary street address of hotel.
     * @DTA\Data(field="addr1", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $addr1;

    /**
     * City where the hotel is located.
     * @DTA\Data(field="city", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $city;

    /**
     * State, county, province, where the hotel is located.
     * @DTA\Data(field="region", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $region;

    /**
     * Country where the hotel is located.
     * @DTA\Data(field="country", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $country;

    /**
     * Required for countries with a postal code system. Postal or zip code of the hotel.
     * @DTA\Data(field="postal_code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $postal_code;

}
