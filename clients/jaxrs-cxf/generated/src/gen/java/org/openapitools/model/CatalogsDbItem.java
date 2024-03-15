package org.openapitools.model;

import java.util.Date;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsDbItem  {
  
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", value = "")
  private Date createdAt;

  @ApiModelProperty(value = "")
  private String id;

  @ApiModelProperty(example = "2022-03-14T15:16:34Z", value = "")
  private Date updatedAt;
 /**
   * Get createdAt
   * @return createdAt
  **/
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public CatalogsDbItem createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogsDbItem id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get updatedAt
   * @return updatedAt
  **/
  @JsonProperty("updated_at")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CatalogsDbItem updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsDbItem catalogsDbItem = (CatalogsDbItem) o;
    return Objects.equals(this.createdAt, catalogsDbItem.createdAt) &&
        Objects.equals(this.id, catalogsDbItem.id) &&
        Objects.equals(this.updatedAt, catalogsDbItem.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsDbItem {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

