package org.openapitools.server.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.QualityComponentIssue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Metrics for a specific event type within a quality component.
 */
public class QualityComponentDetails   {

    private BigDecimal coverage;
    private List<@Valid QualityComponentIssue> issues = new ArrayList<>();
    private BigDecimal overlap;

    /**
     * Default constructor.
     */
    public QualityComponentDetails() {
    // JSON-B / Jackson
    }

    /**
     * Create QualityComponentDetails.
     *
     * @param coverage Coverage percentage for this event type.
     * @param issues List of issues detected for this event type, if any.
     * @param overlap Overlap percentage for this event type. Only populated for external_event_id
     */
    public QualityComponentDetails(
        BigDecimal coverage, 
        List<@Valid QualityComponentIssue> issues, 
        BigDecimal overlap
    ) {
        this.coverage = coverage;
        this.issues = issues;
        this.overlap = overlap;
    }



    /**
     * Coverage percentage for this event type.
     * @return coverage
     */
    public BigDecimal getCoverage() {
        return coverage;
    }

    public void setCoverage(BigDecimal coverage) {
        this.coverage = coverage;
    }

    /**
     * List of issues detected for this event type, if any.
     * @return issues
     */
    public List<@Valid QualityComponentIssue> getIssues() {
        return issues;
    }

    public void setIssues(List<@Valid QualityComponentIssue> issues) {
        this.issues = issues;
    }

    /**
     * Overlap percentage for this event type. Only populated for external_event_id
     * @return overlap
     */
    public BigDecimal getOverlap() {
        return overlap;
    }

    public void setOverlap(BigDecimal overlap) {
        this.overlap = overlap;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityComponentDetails {\n");
        
        sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
        sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
        sb.append("    overlap: ").append(toIndentedString(overlap)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

