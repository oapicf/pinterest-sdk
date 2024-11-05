package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-05T02:20:31.447227872Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PinMediaWithImageAllOfImages   {
  
  private Object _150x150;
  private Object _400x300;
  private Object _600x;
  private Object _1200x;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("150x150")
  public Object get150x150() {
    return _150x150;
  }
  public void set150x150(Object _150x150) {
    this._150x150 = _150x150;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("400x300")
  public Object get400x300() {
    return _400x300;
  }
  public void set400x300(Object _400x300) {
    this._400x300 = _400x300;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("600x")
  public Object get600x() {
    return _600x;
  }
  public void set600x(Object _600x) {
    this._600x = _600x;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("1200x")
  public Object get1200x() {
    return _1200x;
  }
  public void set1200x(Object _1200x) {
    this._1200x = _1200x;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMediaWithImageAllOfImages pinMediaWithImageAllOfImages = (PinMediaWithImageAllOfImages) o;
    return Objects.equals(this._150x150, pinMediaWithImageAllOfImages._150x150) &&
        Objects.equals(this._400x300, pinMediaWithImageAllOfImages._400x300) &&
        Objects.equals(this._600x, pinMediaWithImageAllOfImages._600x) &&
        Objects.equals(this._1200x, pinMediaWithImageAllOfImages._1200x);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_150x150, _400x300, _600x, _1200x);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaWithImageAllOfImages {\n");
    
    sb.append("    _150x150: ").append(toIndentedString(_150x150)).append("\n");
    sb.append("    _400x300: ").append(toIndentedString(_400x300)).append("\n");
    sb.append("    _600x: ").append(toIndentedString(_600x)).append("\n");
    sb.append("    _1200x: ").append(toIndentedString(_1200x)).append("\n");
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

