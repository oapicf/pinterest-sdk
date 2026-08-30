#' Create a new CustomerListUpdateWithRequiredBody
#'
#' @description
#' Resource create or update operation model with required body fields (no OptionalProperties).
#'
#' @docType class
#' @title CustomerListUpdateWithRequiredBody
#' @description CustomerListUpdateWithRequiredBody Class
#' @format An \code{R6Class} generator object
#' @field operation_type Customer list update operation type (add or remove). Only valid in update request body. \link{UserListOperationType}
#' @field records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. character [optional]
#' @field records_v2 Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. list(\link{CustomerListRecordRow}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomerListUpdateWithRequiredBody <- R6::R6Class(
  "CustomerListUpdateWithRequiredBody",
  public = list(
    `operation_type` = NULL,
    `records` = NULL,
    `records_v2` = NULL,

    #' @description
    #' Initialize a new CustomerListUpdateWithRequiredBody class.
    #'
    #' @param operation_type Customer list update operation type (add or remove). Only valid in update request body.
    #' @param records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
    #' @param records_v2 Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
    #' @param ... Other optional arguments.
    initialize = function(`operation_type`, `records` = NULL, `records_v2` = NULL, ...) {
      if (!missing(`operation_type`)) {
        if (!(`operation_type` %in% c())) {
          stop(paste("Error! \"", `operation_type`, "\" cannot be assigned to `operation_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`operation_type`))
        self$`operation_type` <- `operation_type`
      }
      if (!is.null(`records`)) {
        if (!(is.character(`records`) && length(`records`) == 1)) {
          stop(paste("Error! Invalid data for `records`. Must be a string:", `records`))
        }
        self$`records` <- `records`
      }
      if (!is.null(`records_v2`)) {
        stopifnot(is.vector(`records_v2`), length(`records_v2`) != 0)
        sapply(`records_v2`, function(x) stopifnot(R6::is.R6(x)))
        self$`records_v2` <- `records_v2`
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
    #' @return CustomerListUpdateWithRequiredBody as a base R list.
    #' @examples
    #' # convert array of CustomerListUpdateWithRequiredBody (x) to a data frame
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
    #' Convert CustomerListUpdateWithRequiredBody to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CustomerListUpdateWithRequiredBodyObject <- list()
      if (!is.null(self$`operation_type`)) {
        CustomerListUpdateWithRequiredBodyObject[["operation_type"]] <-
          self$extractSimpleType(self$`operation_type`)
      }
      if (!is.null(self$`records`)) {
        CustomerListUpdateWithRequiredBodyObject[["records"]] <-
          self$`records`
      }
      if (!is.null(self$`records_v2`)) {
        CustomerListUpdateWithRequiredBodyObject[["records_v2"]] <-
          self$extractSimpleType(self$`records_v2`)
      }
      return(CustomerListUpdateWithRequiredBodyObject)
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
    #' Deserialize JSON string into an instance of CustomerListUpdateWithRequiredBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerListUpdateWithRequiredBody
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`operation_type`)) {
        `operation_type_object` <- UserListOperationType$new()
        `operation_type_object`$fromJSON(jsonlite::toJSON(this_object$`operation_type`, auto_unbox = TRUE, digits = NA))
        self$`operation_type` <- `operation_type_object`
      }
      if (!is.null(this_object$`records`)) {
        self$`records` <- this_object$`records`
      }
      if (!is.null(this_object$`records_v2`)) {
        self$`records_v2` <- ApiClient$new()$deserializeObj(this_object$`records_v2`, "array[CustomerListRecordRow]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CustomerListUpdateWithRequiredBody in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomerListUpdateWithRequiredBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerListUpdateWithRequiredBody
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`operation_type` <- UserListOperationType$new()$fromJSON(jsonlite::toJSON(this_object$`operation_type`, auto_unbox = TRUE, digits = NA))
      self$`records` <- this_object$`records`
      self$`records_v2` <- ApiClient$new()$deserializeObj(this_object$`records_v2`, "array[CustomerListRecordRow]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CustomerListUpdateWithRequiredBody and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `operation_type`
      if (!is.null(input_json$`operation_type`)) {
        stopifnot(R6::is.R6(input_json$`operation_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerListUpdateWithRequiredBody: the required field `operation_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomerListUpdateWithRequiredBody
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
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
# CustomerListUpdateWithRequiredBody$unlock()
#
## Below is an example to define the print function
# CustomerListUpdateWithRequiredBody$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomerListUpdateWithRequiredBody$lock()

