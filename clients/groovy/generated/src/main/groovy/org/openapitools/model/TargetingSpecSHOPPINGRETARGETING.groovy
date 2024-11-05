package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class TargetingSpecSHOPPINGRETARGETING {
    /* Number of days ago to start lookback timeframe for dynamic retargeting */
    Integer lookbackWindow
    /* Event types to target for dynamic retargeting */
    List<Integer> tagTypes = new ArrayList<>()
    /* Number of days ago to stop lookback timeframe for dynamic retargeting */
    Integer exclusionWindow
}
