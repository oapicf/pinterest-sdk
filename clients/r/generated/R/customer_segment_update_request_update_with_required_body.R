#' Create a new CustomerSegmentUpdateRequestUpdateWithRequiredBody
#'
#' @description
#' Resource create or update operation model with required body fields (no OptionalProperties).
#'
#' @docType class
#' @title CustomerSegmentUpdateRequestUpdateWithRequiredBody
#' @description CustomerSegmentUpdateRequestUpdateWithRequiredBody Class
#' @format An \code{R6Class} generator object
#' @field audience_ids Audience IDs to update the customer segment to. Only applicable for UPDATE operations. list(character) [optional]
#' @field id Customer segment ID. character
#' @field operation_type  \link{AudienceUpdateOperationType}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomerSegmentUpdateRequestUpdateWithRequiredBody <- R6::R6Class(
  "CustomerSegmentUpdateRequestUpdateWithRequiredBody",
  public = list(
    `audience_ids` = NULL,
    `id` = NULL,
    `operation_type` = NULL,

    #' @description
    #' Initialize a new CustomerSegmentUpdateRequestUpdateWithRequiredBody class.
    #'
    #' @param id Customer segment ID.
    #' @param operation_type operation_type
    #' @param audience_ids Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `operation_type`, `audience_ids` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`operation_type`)) {
        if (!(`operation_type` %in% c())) {
          stop(paste("Error! \"", `operation_type`, "\" cannot be assigned to `operation_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`operation_type`))
        self$`operation_type` <- `operation_type`
      }
      if (!is.null(`audience_ids`)) {
        stopifnot(is.vector(`audience_ids`), length(`audience_ids`) != 0)
        sapply(`audience_ids`, function(x) stopifnot(is.character(x)))
        self$`audience_ids` <- `audience_ids`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return CustomerSegmentUpdateRequestUpdateWithRequiredBody as a base R list.
    #' @examples
    #' # convert array of CustomerSegmentUpdateRequestUpdateWithRequiredBody (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert CustomerSegmentUpdateRequestUpdateWithRequiredBody to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CustomerSegmentUpdateRequestUpdateWithRequiredBodyObject <- list()
      if (!is.null(self$`audience_ids`)) {
        CustomerSegmentUpdateRequestUpdateWithRequiredBodyObject[["audience_ids"]] <-
          self$`audience_ids`
      }
      if (!is.null(self$`id`)) {
        CustomerSegmentUpdateRequestUpdateWithRequiredBodyObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`operation_type`)) {
        CustomerSegmentUpdateRequestUpdateWithRequiredBodyObject[["operation_type"]] <-
          self$extractSimpleType(self$`operation_type`)
      }
      return(CustomerSegmentUpdateRequestUpdateWithRequiredBodyObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomerSegmentUpdateRequestUpdateWithRequiredBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerSegmentUpdateRequestUpdateWithRequiredBody
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`audience_ids`)) {
        self$`audience_ids` <- ApiClient$new()$deserializeObj(this_object$`audience_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`operation_type`)) {
        `operation_type_object` <- AudienceUpdateOperationType$new()
        `operation_type_object`$fromJSON(jsonlite::toJSON(this_object$`operation_type`, auto_unbox = TRUE, digits = NA))
        self$`operation_type` <- `operation_type_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CustomerSegmentUpdateRequestUpdateWithRequiredBody in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomerSegmentUpdateRequestUpdateWithRequiredBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerSegmentUpdateRequestUpdateWithRequiredBody
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`audience_ids` <- ApiClient$new()$deserializeObj(this_object$`audience_ids`, "array[character]", loadNamespace("openapi"))
      self$`id` <- this_object$`id`
      self$`operation_type` <- AudienceUpdateOperationType$new()$fromJSON(jsonlite::toJSON(this_object$`operation_type`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CustomerSegmentUpdateRequestUpdateWithRequiredBody and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerSegmentUpdateRequestUpdateWithRequiredBody: the required field `id` is missing."))
      }
      # check the required field `operation_type`
      if (!is.null(input_json$`operation_type`)) {
        stopifnot(R6::is.R6(input_json$`operation_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerSegmentUpdateRequestUpdateWithRequiredBody: the required field `operation_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomerSegmentUpdateRequestUpdateWithRequiredBody
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `operation_type` is null
      if (is.null(self$`operation_type`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `operation_type` is null
      if (is.null(self$`operation_type`)) {
        invalid_fields["operation_type"] <- "Non-nullable required field `operation_type` cannot be null."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CustomerSegmentUpdateRequestUpdateWithRequiredBody$unlock()
#
## Below is an example to define the print function
# CustomerSegmentUpdateRequestUpdateWithRequiredBody$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomerSegmentUpdateRequestUpdateWithRequiredBody$lock()

