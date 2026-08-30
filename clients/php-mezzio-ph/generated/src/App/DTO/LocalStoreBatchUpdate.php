<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LocalStoreBatchUpdate
{
    /**
     * Primary address line of the store.
     * @DTA\Data(field="address_primary", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $address_primary;

    /**
     * Secondary address line of the store.
     * @DTA\Data(field="address_secondary", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $address_secondary;

    /**
     * City where the store is located.
     * @DTA\Data(field="city", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $city;

    /**
     * Country code where the store is located.
     * @DTA\Data(field="country", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Country::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Country::class})
     * @var \App\DTO\Country|null
     */
    public $country;

    /**
     * The ID of the local store.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * Geographic latitude coordinate of the store.
     * @DTA\Data(field="latitude", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $latitude;

    /**
     * Geographic longitude coordinate of the store.
     * @DTA\Data(field="longitude", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $longitude;

    /**
     * The name of the local store.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * Postal or ZIP code of the store.
     * @DTA\Data(field="postal_code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $postal_code;

    /**
     * State or region code where the store is located.
     * @DTA\Data(field="region", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $region;

    /**
     * Merchant provided code for the local store. Unique within the merchant&#39;s catalog.
     * @DTA\Data(field="store_code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $store_code;

}
