<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class SSIOAccountItem
{
    /**
     * Salesforce id for billto_info
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * Salesforce id for IO Terms and Conditions
     * @DTA\Data(field="io_terms_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $io_terms_id = null;

    /**
     * Salesforce text for IO Terms and Conditions
     * @DTA\Data(field="io_terms", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $io_terms = null;

    /**
     * Salesforce id for US Terms and Conditions
     * @DTA\Data(field="us_terms_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $us_terms_id = null;

    /**
     * Salesforce text for US Terms and Conditions
     * @DTA\Data(field="us_terms", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $us_terms = null;

    /**
     * Salesforce id for Rest of the World Terms and Conditions
     * @DTA\Data(field="row_terms_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $row_terms_id = null;

    /**
     * Salesforce text for Rest of the World Terms and Conditions
     * @DTA\Data(field="row_terms", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $row_terms = null;

    /**
     * Insertion Order Type - Pinterest Paper or Agency Paper
     * @DTA\Data(field="io_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $io_type = null;

    /**
     * Address information that is associated with this account.
     * @DTA\Data(field="addresses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection131::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection131::class})
     */
    public ?\App\DTO\Collection131 $addresses = null;

}
