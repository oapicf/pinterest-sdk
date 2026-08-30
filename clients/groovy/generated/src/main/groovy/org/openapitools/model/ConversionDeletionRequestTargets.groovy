package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ConversionDeletionRequestEPIKTargets;
import org.openapitools.model.ConversionDeletionRequestUserEmailTargets;

@Canonical
class ConversionDeletionRequestTargets {
    /* Array of plain text user emails. */
    List<String> userEmails = new ArrayList<>()
    /* Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie). */
    List<String> epiks = new ArrayList<>()
}
