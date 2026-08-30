package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum PinFilter {
    EXCLUDE_NATIVE, EXCLUDE_REPINS, HAS_BEEN_PROMOTED
}
