#' Create a new ConversionDeletionRequest
#'
#' @description
#' Conversion deletion request
#'
#' @docType class
#' @title ConversionDeletionRequest
#' @description ConversionDeletionRequest Class
#' @format An \code{R6Class} generator object
#' @field created_time Timestamp when the conversion deletion request was succesfully created. character
#' @field processed_time Timestamp when the conversion deletion request was processed. character [optional]
#' @field request_id Unique identifier of the conversion deletion request character
#' @field status Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled. \link{ConversionDeletionRequestStatus}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionDeletionRequest <- R6::R6Class(
  "ConversionDeletionRequest",
  public = list(
    `created_time` = NULL,
    `processed_time` = NULL,
    `request_id` = NULL,
    `status` = NULL,

    #' @description
    #' Initialize a new ConversionDeletionRequest class.
    #'
    #' @param created_time Timestamp when the conversion deletion request was succesfully created.
    #' @param request_id Unique identifier of the conversion deletion request
    #' @param status Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
    #' @param processed_time Timestamp when the conversion deletion request was processed.
    #' @param ... Other optional arguments.
    initialize = function(`created_time`, `request_id`, `status`, `processed_time` = NULL, ...) {
      if (!missing(`created_time`)) {
        if (!(is.character(`created_time`) && length(`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be a string:", `created_time`))
        }
        self$`created_time` <- `created_time`
      }
      if (!missing(`request_id`)) {
        if (!(is.character(`request_id`) && length(`request_id`) == 1)) {
          stop(paste("Error! Invalid data for `request_id`. Must be a string:", `request_id`))
        }
        self$`request_id` <- `request_id`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`processed_time`)) {
        if (!is.character(`processed_time`)) {
          stop(paste("Error! Invalid data for `processed_time`. Must be a string:", `processed_time`))
        }
        self$`processed_time` <- `processed_time`
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
    #' @return ConversionDeletionRequest as a base R list.
    #' @examples
    #' # convert array of ConversionDeletionRequest (x) to a data frame
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
    #' Convert ConversionDeletionRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ConversionDeletionRequestObject <- list()
      if (!is.null(self$`created_time`)) {
        ConversionDeletionRequestObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`processed_time`)) {
        ConversionDeletionRequestObject[["processed_time"]] <-
          self$`processed_time`
      }
      if (!is.null(self$`request_id`)) {
        ConversionDeletionRequestObject[["request_id"]] <-
          self$`request_id`
      }
      if (!is.null(self$`status`)) {
        ConversionDeletionRequestObject[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      return(ConversionDeletionRequestObject)
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
    #' Deserialize JSON string into an instance of ConversionDeletionRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionDeletionRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`processed_time`)) {
        self$`processed_time` <- this_object$`processed_time`
      }
      if (!is.null(this_object$`request_id`)) {
        self$`request_id` <- this_object$`request_id`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- ConversionDeletionRequestStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionDeletionRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionDeletionRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionDeletionRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`created_time` <- this_object$`created_time`
      self$`processed_time` <- this_object$`processed_time`
      self$`request_id` <- this_object$`request_id`
      self$`status` <- ConversionDeletionRequestStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionDeletionRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `created_time`
      if (!is.null(input_json$`created_time`)) {
        if (!(is.character(input_json$`created_time`) && length(input_json$`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be a string:", input_json$`created_time`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionDeletionRequest: the required field `created_time` is missing."))
      }
      # check the required field `request_id`
      if (!is.null(input_json$`request_id`)) {
        if (!(is.character(input_json$`request_id`) && length(input_json$`request_id`) == 1)) {
          stop(paste("Error! Invalid data for `request_id`. Must be a string:", input_json$`request_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionDeletionRequest: the required field `request_id` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        stopifnot(R6::is.R6(input_json$`status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ConversionDeletionRequest: the required field `status` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionDeletionRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `created_time` is null
      if (is.null(self$`created_time`)) {
        return(FALSE)
      }

      # check if the required `request_id` is null
      if (is.null(self$`request_id`)) {
        return(FALSE)
      }

      if (nchar(self$`request_id`) > 18) {
        return(FALSE)
      }
      if (!str_detect(self$`request_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
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
      # check if the required `created_time` is null
      if (is.null(self$`created_time`)) {
        invalid_fields["created_time"] <- "Non-nullable required field `created_time` cannot be null."
      }

      # check if the required `request_id` is null
      if (is.null(self$`request_id`)) {
        invalid_fields["request_id"] <- "Non-nullable required field `request_id` cannot be null."
      }

      if (nchar(self$`request_id`) > 18) {
        invalid_fields["request_id"] <- "Invalid length for `request_id`, must be smaller than or equal to 18."
      }
      if (!str_detect(self$`request_id`, "^\\d+$")) {
        invalid_fields["request_id"] <- "Invalid value for `request_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
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
# ConversionDeletionRequest$unlock()
#
## Below is an example to define the print function
# ConversionDeletionRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionDeletionRequest$lock()

