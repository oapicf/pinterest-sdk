<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class UserWebsiteVerificationCode
{
    /**
     * Code to check against the user claiming the website
     * @DTA\Data(field="verification_code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $verification_code = null;

    /**
     * DNS TXT record to check against for the website to be claimed
     * @DTA\Data(field="dns_txt_record", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $dns_txt_record = null;

    /**
     * Metatag the verification process searchs for the website to be claimed
     * @DTA\Data(field="metatag", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $metatag = null;

    /**
     * File expected to find on the website being claimed
     * @DTA\Data(field="filename", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $filename = null;

    /**
     * A full html file to upload to the website in order for it to be claimed
     * @DTA\Data(field="file_content", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $file_content = null;

}
