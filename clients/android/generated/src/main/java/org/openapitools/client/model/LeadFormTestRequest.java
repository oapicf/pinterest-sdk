/**
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

package org.openapitools.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request to create test data for lead data test API.
 **/
@ApiModel(description = "Request to create test data for lead data test API.")
public class LeadFormTestRequest {
  
  @SerializedName("answers")
  private List<String> answers = null;

  /**
   * Test lead answers. Should follow the creation order.
   **/
  @ApiModelProperty(required = true, value = "Test lead answers. Should follow the creation order.")
  public List<String> getAnswers() {
    return answers;
  }
  public void setAnswers(List<String> answers) {
    this.answers = answers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadFormTestRequest leadFormTestRequest = (LeadFormTestRequest) o;
    return (this.answers == null ? leadFormTestRequest.answers == null : this.answers.equals(leadFormTestRequest.answers));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.answers == null ? 0: this.answers.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormTestRequest {\n");
    
    sb.append("  answers: ").append(answers).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
