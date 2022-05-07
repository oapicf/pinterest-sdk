<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Board
 */
class Board
{
    /**
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $description;

    /**
     * @DTA\Data(field="owner", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":BoardOwner::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":BoardOwner::class})
     * @var BoardOwner|null
     */
    public $owner;

    /**
     * Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt;
     * @DTA\Data(field="privacy", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $privacy;

}
