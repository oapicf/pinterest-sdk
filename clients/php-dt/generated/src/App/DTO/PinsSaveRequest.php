<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PinsSaveRequest
{
    /**
     * Unique identifier of the board to which the pin will be saved.
     * @DTA\Data(field="board_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $board_id = null;

    /**
     * Unique identifier of the board section to which the pin will be saved.
     * @DTA\Data(field="board_section_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $board_section_id = null;

}
