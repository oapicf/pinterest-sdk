<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsUpdatableHotelAttributes
{
    /**
     * The hotel&#39;s name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * Link to the product page
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $link;

    /**
     * Brief description of the hotel.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $description;

    /**
     * The brand to which this hotel belongs to.
     * @DTA\Data(field="brand", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $brand;

    /**
     * Latitude of the hotel.
     * @DTA\Data(field="latitude", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $latitude;

    /**
     * Longitude of the hotel.
     * @DTA\Data(field="longitude", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $longitude;

    /**
     * A list of neighborhoods where the hotel is located
     * @DTA\Data(field="neighborhood", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $neighborhood;

    /**
     * @DTA\Data(field="address", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsHotelAddress::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsHotelAddress::class})
     * @var \App\DTO\CatalogsHotelAddress|null
     */
    public $address;

    /**
     * Custom grouping of hotels
     * @DTA\Data(field="custom_label_0", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $custom_label_0;

    /**
     * Custom grouping of hotels
     * @DTA\Data(field="custom_label_1", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $custom_label_1;

    /**
     * Custom grouping of hotels
     * @DTA\Data(field="custom_label_2", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $custom_label_2;

    /**
     * Custom grouping of hotels
     * @DTA\Data(field="custom_label_3", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $custom_label_3;

    /**
     * Custom grouping of hotels
     * @DTA\Data(field="custom_label_4", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $custom_label_4;

    /**
     * The type of property. The category can be any type of internal description desired.
     * @DTA\Data(field="category", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $category;

    /**
     * Base price of the hotel room per night followed by the ISO currency code
     * @DTA\Data(field="base_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $base_price;

    /**
     * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
     * @DTA\Data(field="sale_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $sale_price;

    /**
     * @DTA\Data(field="guest_ratings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsHotelGuestRatings::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsHotelGuestRatings::class})
     * @var \App\DTO\CatalogsHotelGuestRatings|null
     */
    public $guest_ratings;

}
