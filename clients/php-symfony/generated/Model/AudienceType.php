<?php
/**
 * AudienceType
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
 * The version of the OpenAPI document: 5.12.0
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
 * Class representing the AudienceType model.
 *
 * Audience type
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
enum AudienceType: string
{
        case CUSTOMER_LIST = "CUSTOMER_LIST";
        case VISITOR = "VISITOR";
        case ENGAGEMENT = "ENGAGEMENT";
        case ACTALIKE = "ACTALIKE";
        case PERSONA = "PERSONA";
}


