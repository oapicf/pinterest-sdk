<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Created/updated resource on success or error details on failure
 */
class CatalogsLocalStoresCreate200ResponseInnerData
{
    /**
     * Primary address line of the store.
     * @DTA\Data(field="address_primary", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $address_primary = null;

    /**
     * Secondary address line of the store.
     * @DTA\Data(field="address_secondary", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $address_secondary = null;

    /**
     * City where the store is located.
     * @DTA\Data(field="city", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $city = null;

    /**
     * Country code where the store is located.
     * @DTA\Data(field="country")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Country::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Country::class})
     */
    public ?\App\DTO\Country $country = null;

    /**
     * Creation timestamp
     * @DTA\Data(field="created_at")
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $created_at = null;

    /**
     * The ID of the local store.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * Geographic latitude coordinate of the store.
     * @DTA\Data(field="latitude", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $latitude = null;

    /**
     * Geographic longitude coordinate of the store.
     * @DTA\Data(field="longitude", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $longitude = null;

    /**
     * The name of the local store.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Postal or ZIP code of the store.
     * @DTA\Data(field="postal_code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $postal_code = null;

    /**
     * State or region code where the store is located.
     * @DTA\Data(field="region", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $region = null;

    /**
     * Merchant provided code for the local store. Unique within the merchant&#39;s catalog.
     * @DTA\Data(field="store_code")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $store_code = null;

    /**
     * Last update timestamp
     * @DTA\Data(field="updated_at")
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $updated_at = null;

    /**
     * @DTA\Data(field="exceptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PinterestLibError::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PinterestLibError::class})
     */
    public ?\App\DTO\PinterestLibError $exceptions = null;

}
