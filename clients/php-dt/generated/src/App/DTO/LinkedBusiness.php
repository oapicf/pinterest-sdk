<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LinkedBusiness
{
    /**
     * Username
     * @DTA\Data(field="username", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $username = null;

    /**
     * image_small_url
     * @DTA\Data(field="image_small_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $image_small_url = null;

    /**
     * image_medium_url
     * @DTA\Data(field="image_medium_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $image_medium_url = null;

    /**
     * image_large_url
     * @DTA\Data(field="image_large_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $image_large_url = null;

    /**
     * image_xlarge_url
     * @DTA\Data(field="image_xlarge_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $image_xlarge_url = null;

}
