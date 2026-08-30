<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class BrandAccountCreate
{
    /**
     * Brand Account about information
     * @DTA\Data(field="about", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $about = null;

    /**
     * @DTA\Data(field="country")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Country::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Country::class})
     */
    public ?\App\DTO\Country $country = null;

    /**
     * Brand Account name
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="profile_image", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BrandAccountProfileImage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BrandAccountProfileImage::class})
     */
    public ?\App\DTO\BrandAccountProfileImage $profile_image = null;

    /**
     * Brand Account username
     * @DTA\Data(field="username")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $username = null;

    /**
     * Brand Account website
     * @DTA\Data(field="website", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $website = null;

}
