<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsHotelAddress
{
    /**
     * Primary street address of hotel.
     * @DTA\Data(field="addr1", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $addr1 = null;

    /**
     * City where the hotel is located.
     * @DTA\Data(field="city", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $city = null;

    /**
     * State, county, province, where the hotel is located.
     * @DTA\Data(field="region", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $region = null;

    /**
     * Country where the hotel is located.
     * @DTA\Data(field="country", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $country = null;

    /**
     * Required for countries with a postal code system. Postal or zip code of the hotel.
     * @DTA\Data(field="postal_code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $postal_code = null;

}
