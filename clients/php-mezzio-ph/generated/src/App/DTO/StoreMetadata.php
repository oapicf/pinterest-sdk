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
     * @var string|null
     */
    public $geohash;

    /**
     * Geographic latitude coordinate of the store
     * @DTA\Data(field="latitude", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $latitude;

    /**
     * Geographic longitude coordinate of the store
     * @DTA\Data(field="longitude", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $longitude;

    /**
     * Merchant provided store code
     * @DTA\Data(field="store_code")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $store_code;

    /**
     * Internal store code
     * @DTA\Data(field="store_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $store_id;

    /**
     * Store name
     * @DTA\Data(field="store_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $store_name;

}
