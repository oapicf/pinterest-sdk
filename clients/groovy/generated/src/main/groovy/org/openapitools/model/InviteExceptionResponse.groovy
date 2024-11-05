package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class InviteExceptionResponse {
    /* Unique identifier of the invite/request. */
    String inviteOrRequestId
    /* Error code associated with the error in performing the action on the invite/request. */
    Integer code
    /* Error message associated with the error in performing the action on the invite/request. */
    String message
    /* A list of users' usernames or emails OR a list of partner ids that caused the error. */
    List<String> usersOrPartnerIds
}
