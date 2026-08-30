package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScrollupGoalMetadata   {
  
  private String scrollupGoalValueInMicroCurrency;

  public ScrollupGoalMetadata () {

  }

  public ScrollupGoalMetadata (String scrollupGoalValueInMicroCurrency) {
    this.scrollupGoalValueInMicroCurrency = scrollupGoalValueInMicroCurrency;
  }

    
  @JsonProperty("scrollup_goal_value_in_micro_currency")
  public String getScrollupGoalValueInMicroCurrency() {
    return scrollupGoalValueInMicroCurrency;
  }
  public void setScrollupGoalValueInMicroCurrency(String scrollupGoalValueInMicroCurrency) {
    this.scrollupGoalValueInMicroCurrency = scrollupGoalValueInMicroCurrency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScrollupGoalMetadata scrollupGoalMetadata = (ScrollupGoalMetadata) o;
    return Objects.equals(scrollupGoalValueInMicroCurrency, scrollupGoalMetadata.scrollupGoalValueInMicroCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scrollupGoalValueInMicroCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScrollupGoalMetadata {\n");
    
    sb.append("    scrollupGoalValueInMicroCurrency: ").append(toIndentedString(scrollupGoalValueInMicroCurrency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
