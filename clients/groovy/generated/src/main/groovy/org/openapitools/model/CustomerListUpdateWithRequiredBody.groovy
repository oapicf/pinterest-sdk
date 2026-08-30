package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CustomerListRecordRow;
import org.openapitools.model.UserListOperationType;

@Canonical
class CustomerListUpdateWithRequiredBody {
    /* Customer list update operation type (add or remove). Only valid in update request body. */
    UserListOperationType operationType
    /* Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. */
    String records
    /* Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. */
    List<CustomerListRecordRow> recordsV2 = new ArrayList<>()
}
