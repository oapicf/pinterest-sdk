/**
 * Pinterest REST API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { UserSummary } from './userSummary';


export interface UserFollowingGet200Response { 
    /**
     * Users
     */
    items: Array<UserSummary>;
    bookmark?: string | null;
}

