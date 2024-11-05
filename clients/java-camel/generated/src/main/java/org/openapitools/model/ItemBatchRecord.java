package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ItemAttributesRequest;
import org.openapitools.model.ItemCreateBatchRecord;
import org.openapitools.model.ItemDeleteBatchRecord;
import org.openapitools.model.ItemDeleteDiscontinuedBatchRecord;
import org.openapitools.model.ItemUpdateBatchRecord;
import org.openapitools.model.ItemUpsertBatchRecord;
import org.openapitools.model.UpdateMaskFieldType;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public interface ItemBatchRecord {
}
