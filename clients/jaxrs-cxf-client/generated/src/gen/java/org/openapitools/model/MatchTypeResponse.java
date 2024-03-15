package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Keyword match type
 */
public enum MatchTypeResponse {
  
  BROAD("BROAD"),
  
  PHRASE("PHRASE"),
  
  EXACT("EXACT"),
  
  EXACT_NEGATIVE("EXACT_NEGATIVE"),
  
  PHRASE_NEGATIVE("PHRASE_NEGATIVE"),
  
  NULL("null");

  private String value;

  MatchTypeResponse(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MatchTypeResponse fromValue(String value) {
    for (MatchTypeResponse b : MatchTypeResponse.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

