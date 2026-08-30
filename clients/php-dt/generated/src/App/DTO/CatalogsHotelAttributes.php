<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsHotelAttributes
{
    /**
     * Hotel address
     * @DTA\Data(field="address", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsHotelAddress::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsHotelAddress::class})
     */
    public ?\App\DTO\CatalogsHotelAddress $address = null;

    /**
     * Base price of the hotel room per night followed by the ISO currency code
     * @DTA\Data(field="base_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $base_price = null;

    /**
     * The brand to which this hotel belongs to.
     * @DTA\Data(field="brand", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $brand = null;

    /**
     * The type of property. The category can be any type of internal description desired.
     * @DTA\Data(field="category", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $category = null;

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
     * Brief description of the hotel.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * If specified, you must provide all properties
     * @DTA\Data(field="guest_ratings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsHotelGuestRatings::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsHotelGuestRatings::class})
     */
    public ?\App\DTO\CatalogsHotelGuestRatings $guest_ratings = null;

    /**
     * Latitude of the hotel.
     * @DTA\Data(field="latitude", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $latitude = null;

    /**
     * Link to the product page
     * @DTA\Data(field="link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $link = null;

    /**
     * Longitude of the hotel.
     * @DTA\Data(field="longitude", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $longitude = null;

    /**
     * The hotel&#39;s name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * A list of neighborhoods where the hotel is located
     * @DTA\Data(field="neighborhood", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $neighborhood = null;

    /**
     * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
     * @DTA\Data(field="sale_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $sale_price = null;

    /**
     * &lt;&#x3D; 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.
     * @DTA\Data(field="additional_image_link", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $additional_image_link = null;

    /**
     * AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL.
     * @DTA\Data(field="ai_disclosures", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $ai_disclosures = null;

    /**
     * The main hotel image
     * @DTA\Data(field="main_image", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsHotelMainImage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsHotelMainImage::class})
     */
    public ?\App\DTO\CatalogsHotelMainImage $main_image = null;

}
