<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Store metadata for a specific store location
 */
class StoreMetadata
{
    /**
     * Geohash of the store location
     * @DTA\Data(field="geohash", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $geohash = null;

    /**
     * Geographic latitude coordinate of the store
     * @DTA\Data(field="latitude", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $latitude = null;

    /**
     * Geographic longitude coordinate of the store
     * @DTA\Data(field="longitude", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $longitude = null;

    /**
     * Merchant provided store code
     * @DTA\Data(field="store_code")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $store_code = null;

    /**
     * Internal store code
     * @DTA\Data(field="store_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $store_id = null;

    /**
     * Store name
     * @DTA\Data(field="store_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $store_name = null;

}
