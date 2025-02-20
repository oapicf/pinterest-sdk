<?php
/**
 * Role
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
 * Class representing the Role model.
 *
 * An internal role type used on business access, EMPLOYEE, ADMIN.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
enum Role: string
{
        case UNKNOWN = "UNKNOWN";
        case OWNER = "OWNER";
        case ADMIN = "ADMIN";
        case ANALYST = "ANALYST";
        case SOS_READER = "SOS_READER";
        case FINANCE_MANAGER = "FINANCE_MANAGER";
        case AUDIENCE_MANAGER = "AUDIENCE_MANAGER";
        case CAMPAIGN_MANAGER = "CAMPAIGN_MANAGER";
        case CATALOGS_MANAGER = "CATALOGS_MANAGER";
        case RESTRICTED_OWNER = "RESTRICTED_OWNER";
        case PROFILE_MANAGER = "PROFILE_MANAGER";
        case PROFILE_PUBLISHER = "PROFILE_PUBLISHER";
        case RESOURCE_PINNER_LIST_OWNER = "RESOURCE_PINNER_LIST_OWNER";
        case RESOURCE_PINNER_LIST_READER = "RESOURCE_PINNER_LIST_READER";
        case BIZ_PINNER_LIST_SHARER = "BIZ_PINNER_LIST_SHARER";
        case RESOURCE_CONVERSION_TAGS_READER = "RESOURCE_CONVERSION_TAGS_READER";
}



