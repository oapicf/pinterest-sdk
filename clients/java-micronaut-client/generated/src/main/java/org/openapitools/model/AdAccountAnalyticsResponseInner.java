/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * AdAccountAnalyticsResponseInner
 */
@JsonPropertyOrder({
  AdAccountAnalyticsResponseInner.JSON_PROPERTY_A_D_A_C_C_O_U_N_T_I_D,
  AdAccountAnalyticsResponseInner.JSON_PROPERTY_D_A_T_E
})
@JsonTypeName("AdAccountAnalyticsResponse_inner")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class AdAccountAnalyticsResponseInner extends HashMap<String, Object> {
    public static final String JSON_PROPERTY_A_D_A_C_C_O_U_N_T_I_D = "AD_ACCOUNT_ID";
    private String AD_ACCOUNT_ID;

    public static final String JSON_PROPERTY_D_A_T_E = "DATE";
    private LocalDate DATE;

    public AdAccountAnalyticsResponseInner(String AD_ACCOUNT_ID) {
        super();
        this.AD_ACCOUNT_ID = AD_ACCOUNT_ID;
    }

    public AdAccountAnalyticsResponseInner AD_ACCOUNT_ID(String AD_ACCOUNT_ID) {
        this.AD_ACCOUNT_ID = AD_ACCOUNT_ID;
        return this;
    }

    /**
     * The ID of the advertiser that this metrics belongs to.
     * @return AD_ACCOUNT_ID
     */
    @NotNull
    @Pattern(regexp="^\\d+$")
    @JsonProperty(JSON_PROPERTY_A_D_A_C_C_O_U_N_T_I_D)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getADACCOUNTID() {
        return AD_ACCOUNT_ID;
    }

    @JsonProperty(JSON_PROPERTY_A_D_A_C_C_O_U_N_T_I_D)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setADACCOUNTID(String AD_ACCOUNT_ID) {
        this.AD_ACCOUNT_ID = AD_ACCOUNT_ID;
    }

    public AdAccountAnalyticsResponseInner DATE(LocalDate DATE) {
        this.DATE = DATE;
        return this;
    }

    /**
     * Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
     * @return DATE
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_D_A_T_E)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public LocalDate getDATE() {
        return DATE;
    }

    @JsonProperty(JSON_PROPERTY_D_A_T_E)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public void setDATE(LocalDate DATE) {
        this.DATE = DATE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner = (AdAccountAnalyticsResponseInner) o;
        return Objects.equals(this.AD_ACCOUNT_ID, adAccountAnalyticsResponseInner.AD_ACCOUNT_ID) &&
            Objects.equals(this.DATE, adAccountAnalyticsResponseInner.DATE) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(AD_ACCOUNT_ID, DATE, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdAccountAnalyticsResponseInner {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    AD_ACCOUNT_ID: ").append(toIndentedString(AD_ACCOUNT_ID)).append("\n");
        sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

