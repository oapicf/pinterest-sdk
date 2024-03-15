<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LinkedBusiness
{
    /**
     * Username
     * @DTA\Data(field="username", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $username;

    /**
     * image_small_url
     * @DTA\Data(field="image_small_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $image_small_url;

    /**
     * image_medium_url
     * @DTA\Data(field="image_medium_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $image_medium_url;

    /**
     * image_large_url
     * @DTA\Data(field="image_large_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $image_large_url;

    /**
     * image_xlarge_url
     * @DTA\Data(field="image_xlarge_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $image_xlarge_url;

}
