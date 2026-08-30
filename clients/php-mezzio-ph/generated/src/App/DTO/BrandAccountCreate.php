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
     * @var string|null
     */
    public $about;

    /**
     * @DTA\Data(field="country")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Country::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Country::class})
     * @var \App\DTO\Country|null
     */
    public $country;

    /**
     * Brand Account name
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="profile_image", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BrandAccountProfileImage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BrandAccountProfileImage::class})
     * @var \App\DTO\BrandAccountProfileImage|null
     */
    public $profile_image;

    /**
     * Brand Account username
     * @DTA\Data(field="username")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $username;

    /**
     * Brand Account website
     * @DTA\Data(field="website", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $website;

}
