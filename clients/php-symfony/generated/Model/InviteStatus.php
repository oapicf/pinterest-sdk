<?php
/**
 * InviteStatus
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the InviteStatus model.
 *
 * The current status of the invite.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
enum InviteStatus: string
{
        case PENDING = "PENDING";
        case ACCEPTED = "ACCEPTED";
        case DECLINED = "DECLINED";
        case CANCELLED = "CANCELLED";
        case EXPIRED = "EXPIRED";
}



