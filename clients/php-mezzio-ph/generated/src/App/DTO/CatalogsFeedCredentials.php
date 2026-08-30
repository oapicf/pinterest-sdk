<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * This field is **OPTIONAL**. Use this if your feed file requires username and password.
 */
class CatalogsFeedCredentials
{
    /**
     * The required password for downloading a feed.
     * @DTA\Data(field="password")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $password;

    /**
     * The required username for downloading a feed.
     * @DTA\Data(field="username")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $username;

}
