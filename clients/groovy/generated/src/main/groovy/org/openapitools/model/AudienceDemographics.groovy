package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AudienceDemographicValue;

@Canonical
class AudienceDemographics {
    /* Ages distribution. */
    List<AudienceDemographicValue> ages
    /* Gender distribution. */
    List<AudienceDemographicValue> genders
    /* Device usage distribution. */
    List<AudienceDemographicValue> devices
    /* Geographic metro area distribution. */
    List<AudienceDemographicValue> metros
    /* Country area distribution. */
    List<AudienceDemographicValue> countries
}
