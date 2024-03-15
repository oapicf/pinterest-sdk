<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsHotelAttributes
{
    /**
     * The hotel&#39;s name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Link to the product page
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $link = null;

    /**
     * Brief description of the hotel.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * The brand to which this hotel belongs to.
     * @DTA\Data(field="brand", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $brand = null;

    /**
     * Latitude of the hotel.
     * @DTA\Data(field="latitude", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $latitude = null;

    /**
     * Longitude of the hotel.
     * @DTA\Data(field="longitude", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $longitude = null;

    /**
     * A list of neighborhoods where the hotel is located
     * @DTA\Data(field="neighborhood", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $neighborhood = null;

    /**
     * @DTA\Data(field="address", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsHotelAddress::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsHotelAddress::class})
     */
    public ?\App\DTO\CatalogsHotelAddress $address = null;

    /**
     * Custom grouping of hotels
     * @DTA\Data(field="custom_label_0", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $custom_label_0 = null;

    /**
     * Custom grouping of hotels
     * @DTA\Data(field="custom_label_1", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $custom_label_1 = null;

    /**
     * Custom grouping of hotels
     * @DTA\Data(field="custom_label_2", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $custom_label_2 = null;

    /**
     * Custom grouping of hotels
     * @DTA\Data(field="custom_label_3", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $custom_label_3 = null;

    /**
     * Custom grouping of hotels
     * @DTA\Data(field="custom_label_4", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $custom_label_4 = null;

    /**
     * The type of property. The category can be any type of internal description desired.
     * @DTA\Data(field="category", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $category = null;

    /**
     * Base price of the hotel room per night followed by the ISO currency code
     * @DTA\Data(field="base_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $base_price = null;

    /**
     * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
     * @DTA\Data(field="sale_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $sale_price = null;

    /**
     * @DTA\Data(field="guest_ratings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsHotelGuestRatings::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsHotelGuestRatings::class})
     */
    public ?\App\DTO\CatalogsHotelGuestRatings $guest_ratings = null;

    /**
     * @DTA\Data(field="main_image", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsHotelAttributesAllOfMainImage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsHotelAttributesAllOfMainImage::class})
     */
    public ?\App\DTO\CatalogsHotelAttributesAllOfMainImage $main_image = null;

    /**
     * &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.&lt;/p&gt;
     * @DTA\Data(field="additional_image_link", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $additional_image_link = null;

}
