package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.openapitools.model.TrendingPin;

@Canonical
class TrendingTopic {
    /* Description of the trending topic */
    String description
    /* Unique identifier for the trending topic */
    String id
    /* Month-over-month growth percentage */
    Integer percentGrowthMom
    /* Array of pin images related to this trend (up to 6) */
    List<TrendingPin> pins = new ArrayList<>()
    /* List of related interest categories */
    List<String> relatedInterests = new ArrayList<>()
    /* List of related search terms */
    List<String> relatedSearches = new ArrayList<>()
    /* Time series data showing trend values over time, with dates as keys and values as numeric */
    Map<String, BigDecimal> timeSeries = new HashMap<>()
    /* Title of the trending topic */
    String title
}
