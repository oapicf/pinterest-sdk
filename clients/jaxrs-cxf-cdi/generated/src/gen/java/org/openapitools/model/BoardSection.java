package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sections help organize pins within a board.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Sections help organize pins within a board.")
public class BoardSection   {
  
  private String id;

  private String name;

  /**
   **/
  public BoardSection id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public BoardSection name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Salads", required = true, value = "")
  @JsonProperty("name")
  @NotNull
 @Size(min=1,max=180)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardSection boardSection = (BoardSection) o;
    return Objects.equals(this.id, boardSection.id) &&
        Objects.equals(this.name, boardSection.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardSection {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

