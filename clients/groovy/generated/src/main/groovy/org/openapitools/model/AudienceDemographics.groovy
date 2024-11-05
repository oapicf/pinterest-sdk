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
    List<AudienceDemographicValue> ages = new ArrayList<>()
    /* Gender distribution. */
    List<AudienceDemographicValue> genders = new ArrayList<>()
    /* Device usage distribution. */
    List<AudienceDemographicValue> devices = new ArrayList<>()
    /* Geographic metro area distribution. */
    List<AudienceDemographicValue> metros = new ArrayList<>()
    /* Country area distribution. */
    List<AudienceDemographicValue> countries = new ArrayList<>()
}
