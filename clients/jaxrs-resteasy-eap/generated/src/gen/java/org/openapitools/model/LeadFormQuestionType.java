package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum LeadFormQuestionType {
  CUSTOM,
  FULL_NAME,
  FIRST_NAME,
  LAST_NAME,
  EMAIL,
  PHONE_NUMBER,
  ZIP_CODE,
  GENDER,
  CITY,
  COUNTRY,
  STATE_PROVINCE,
  ADDRESS,
  DATE_OF_BIRTH,
  AGE;
}
