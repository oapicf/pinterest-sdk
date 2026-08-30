package org.openapitools.server.model;

import org.openapitools.server.model.ConversionTagV3GoalMetadata;
import org.openapitools.server.model.FrequencyGoalMetadata;
import org.openapitools.server.model.ScrollupGoalMetadata;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class NullableOptimizationGoalMetadata   {

    private ConversionTagV3GoalMetadata conversionTagV3GoalMetadata;
    private FrequencyGoalMetadata frequencyGoalMetadata;
    private ScrollupGoalMetadata scrollupGoalMetadata;

    /**
     * Default constructor.
     */
    public NullableOptimizationGoalMetadata() {
    // JSON-B / Jackson
    }

    /**
     * Create NullableOptimizationGoalMetadata.
     *
     * @param conversionTagV3GoalMetadata conversionTagV3GoalMetadata
     * @param frequencyGoalMetadata frequencyGoalMetadata
     * @param scrollupGoalMetadata scrollupGoalMetadata
     */
    public NullableOptimizationGoalMetadata(
        ConversionTagV3GoalMetadata conversionTagV3GoalMetadata, 
        FrequencyGoalMetadata frequencyGoalMetadata, 
        ScrollupGoalMetadata scrollupGoalMetadata
    ) {
        this.conversionTagV3GoalMetadata = conversionTagV3GoalMetadata;
        this.frequencyGoalMetadata = frequencyGoalMetadata;
        this.scrollupGoalMetadata = scrollupGoalMetadata;
    }



    /**
     * Get conversionTagV3GoalMetadata
     * @return conversionTagV3GoalMetadata
     */
    public ConversionTagV3GoalMetadata getConversionTagV3GoalMetadata() {
        return conversionTagV3GoalMetadata;
    }

    public void setConversionTagV3GoalMetadata(ConversionTagV3GoalMetadata conversionTagV3GoalMetadata) {
        this.conversionTagV3GoalMetadata = conversionTagV3GoalMetadata;
    }

    /**
     * Get frequencyGoalMetadata
     * @return frequencyGoalMetadata
     */
    public FrequencyGoalMetadata getFrequencyGoalMetadata() {
        return frequencyGoalMetadata;
    }

    public void setFrequencyGoalMetadata(FrequencyGoalMetadata frequencyGoalMetadata) {
        this.frequencyGoalMetadata = frequencyGoalMetadata;
    }

    /**
     * Get scrollupGoalMetadata
     * @return scrollupGoalMetadata
     */
    public ScrollupGoalMetadata getScrollupGoalMetadata() {
        return scrollupGoalMetadata;
    }

    public void setScrollupGoalMetadata(ScrollupGoalMetadata scrollupGoalMetadata) {
        this.scrollupGoalMetadata = scrollupGoalMetadata;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NullableOptimizationGoalMetadata {\n");
        
        sb.append("    conversionTagV3GoalMetadata: ").append(toIndentedString(conversionTagV3GoalMetadata)).append("\n");
        sb.append("    frequencyGoalMetadata: ").append(toIndentedString(frequencyGoalMetadata)).append("\n");
        sb.append("    scrollupGoalMetadata: ").append(toIndentedString(scrollupGoalMetadata)).append("\n");
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

