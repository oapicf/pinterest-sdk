<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class UserWebsiteVerificationCode
{
    /**
     * Code to check against the user claiming the website
     * @DTA\Data(field="verification_code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $verification_code;

    /**
     * DNS TXT record to check against for the website to be claimed
     * @DTA\Data(field="dns_txt_record", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $dns_txt_record;

    /**
     * Metatag the verification process searchs for the website to be claimed
     * @DTA\Data(field="metatag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $metatag;

    /**
     * File expected to find on the website being claimed
     * @DTA\Data(field="filename", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $filename;

    /**
     * A full html file to upload to the website in order for it to be claimed
     * @DTA\Data(field="file_content", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $file_content;

}
