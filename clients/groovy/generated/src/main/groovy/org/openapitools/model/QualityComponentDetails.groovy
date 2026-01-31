package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.QualityComponentIssue;

@Canonical
class QualityComponentDetails {
    /* Coverage percentage for this event type. */
    BigDecimal coverage
    /* List of issues detected for this event type, if any. */
    List<QualityComponentIssue> issues = new ArrayList<>()
    /* Overlap percentage for this event type. Only populated for external_event_id */
    BigDecimal overlap
}
