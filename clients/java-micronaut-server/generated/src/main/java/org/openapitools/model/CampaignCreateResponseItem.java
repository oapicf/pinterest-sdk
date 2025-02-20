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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignCreateResponseData;
import org.openapitools.model.Exception;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CampaignCreateResponseItem
 */
@JsonPropertyOrder({
  CampaignCreateResponseItem.JSON_PROPERTY_DATA,
  CampaignCreateResponseItem.JSON_PROPERTY_EXCEPTIONS
})
@JsonTypeName("CampaignCreateResponseItem")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-05T02:03:37.829873561Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class CampaignCreateResponseItem {
    public static final String JSON_PROPERTY_DATA = "data";
    private CampaignCreateResponseData data;

    public static final String JSON_PROPERTY_EXCEPTIONS = "exceptions";
    private List<@Valid Exception> exceptions = null;

    public CampaignCreateResponseItem() {
    }

    public CampaignCreateResponseItem data(CampaignCreateResponseData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     * @return data
     */
    @Valid
    @Nullable
    @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CampaignCreateResponseData getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setData(CampaignCreateResponseData data) {
        this.data = data;
    }

    public CampaignCreateResponseItem exceptions(List<@Valid Exception> exceptions) {
        this.exceptions = exceptions;
        return this;
    }

    public CampaignCreateResponseItem addExceptionsItem(Exception exceptionsItem) {
        if (this.exceptions == null) {
            this.exceptions = new ArrayList<>();
        }
        this.exceptions.add(exceptionsItem);
        return this;
    }

    /**
     * Get exceptions
     * @return exceptions
     */
    @Nullable
    @Schema(name = "exceptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_EXCEPTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid Exception> getExceptions() {
        return exceptions;
    }

    @JsonProperty(JSON_PROPERTY_EXCEPTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExceptions(List<@Valid Exception> exceptions) {
        this.exceptions = exceptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CampaignCreateResponseItem campaignCreateResponseItem = (CampaignCreateResponseItem) o;
        return Objects.equals(this.data, campaignCreateResponseItem.data) &&
            Objects.equals(this.exceptions, campaignCreateResponseItem.exceptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, exceptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignCreateResponseItem {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

