#' Create a new SupplementalItemsBatchResponse
#'
#' @description
#' Response model for supplemental items batch operation
#'
#' @docType class
#' @title SupplementalItemsBatchResponse
#' @description SupplementalItemsBatchResponse Class
#' @format An \code{R6Class} generator object
#' @field batch_id Id of the batch operation character
#' @field completed_time Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss character [optional]
#' @field created_time Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss character
#' @field operation_results Array of operation results list(\link{SupplementalOperationResult})
#' @field status Status of the batch: PROCESSING, COMPLETED, FAILED \link{SupplementalItemBatchOperationStatus}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SupplementalItemsBatchResponse <- R6::R6Class(
  "SupplementalItemsBatchResponse",
  public = list(
    `batch_id` = NULL,
    `completed_time` = NULL,
    `created_time` = NULL,
    `operation_results` = NULL,
    `status` = NULL,

    #' @description
    #' Initialize a new SupplementalItemsBatchResponse class.
    #'
    #' @param batch_id Id of the batch operation
    #' @param created_time Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
    #' @param operation_results Array of operation results
    #' @param status Status of the batch: PROCESSING, COMPLETED, FAILED
    #' @param completed_time Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
    #' @param ... Other optional arguments.
    initialize = function(`batch_id`, `created_time`, `operation_results`, `status`, `completed_time` = NULL, ...) {
      if (!missing(`batch_id`)) {
        if (!(is.character(`batch_id`) && length(`batch_id`) == 1)) {
          stop(paste("Error! Invalid data for `batch_id`. Must be a string:", `batch_id`))
        }
        self$`batch_id` <- `batch_id`
      }
      if (!missing(`created_time`)) {
        if (!(is.character(`created_time`) && length(`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be a string:", `created_time`))
        }
        self$`created_time` <- `created_time`
      }
      if (!missing(`operation_results`)) {
        stopifnot(is.vector(`operation_results`), length(`operation_results`) != 0)
        sapply(`operation_results`, function(x) stopifnot(R6::is.R6(x)))
        self$`operation_results` <- `operation_results`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`completed_time`)) {
        if (!is.character(`completed_time`)) {
          stop(paste("Error! Invalid data for `completed_time`. Must be a string:", `completed_time`))
        }
        self$`completed_time` <- `completed_time`
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
    #' @return SupplementalItemsBatchResponse as a base R list.
    #' @examples
    #' # convert array of SupplementalItemsBatchResponse (x) to a data frame
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
    #' Convert SupplementalItemsBatchResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SupplementalItemsBatchResponseObject <- list()
      if (!is.null(self$`batch_id`)) {
        SupplementalItemsBatchResponseObject[["batch_id"]] <-
          self$`batch_id`
      }
      if (!is.null(self$`completed_time`)) {
        SupplementalItemsBatchResponseObject[["completed_time"]] <-
          self$`completed_time`
      }
      if (!is.null(self$`created_time`)) {
        SupplementalItemsBatchResponseObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`operation_results`)) {
        SupplementalItemsBatchResponseObject[["operation_results"]] <-
          self$extractSimpleType(self$`operation_results`)
      }
      if (!is.null(self$`status`)) {
        SupplementalItemsBatchResponseObject[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      return(SupplementalItemsBatchResponseObject)
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
    #' Deserialize JSON string into an instance of SupplementalItemsBatchResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of SupplementalItemsBatchResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`batch_id`)) {
        self$`batch_id` <- this_object$`batch_id`
      }
      if (!is.null(this_object$`completed_time`)) {
        self$`completed_time` <- this_object$`completed_time`
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`operation_results`)) {
        self$`operation_results` <- ApiClient$new()$deserializeObj(this_object$`operation_results`, "array[SupplementalOperationResult]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- SupplementalItemBatchOperationStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return SupplementalItemsBatchResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SupplementalItemsBatchResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of SupplementalItemsBatchResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`batch_id` <- this_object$`batch_id`
      self$`completed_time` <- this_object$`completed_time`
      self$`created_time` <- this_object$`created_time`
      self$`operation_results` <- ApiClient$new()$deserializeObj(this_object$`operation_results`, "array[SupplementalOperationResult]", loadNamespace("openapi"))
      self$`status` <- SupplementalItemBatchOperationStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to SupplementalItemsBatchResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `batch_id`
      if (!is.null(input_json$`batch_id`)) {
        if (!(is.character(input_json$`batch_id`) && length(input_json$`batch_id`) == 1)) {
          stop(paste("Error! Invalid data for `batch_id`. Must be a string:", input_json$`batch_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SupplementalItemsBatchResponse: the required field `batch_id` is missing."))
      }
      # check the required field `created_time`
      if (!is.null(input_json$`created_time`)) {
        if (!(is.character(input_json$`created_time`) && length(input_json$`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be a string:", input_json$`created_time`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SupplementalItemsBatchResponse: the required field `created_time` is missing."))
      }
      # check the required field `operation_results`
      if (!is.null(input_json$`operation_results`)) {
        stopifnot(is.vector(input_json$`operation_results`), length(input_json$`operation_results`) != 0)
        tmp <- sapply(input_json$`operation_results`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SupplementalItemsBatchResponse: the required field `operation_results` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        stopifnot(R6::is.R6(input_json$`status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SupplementalItemsBatchResponse: the required field `status` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SupplementalItemsBatchResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `batch_id` is null
      if (is.null(self$`batch_id`)) {
        return(FALSE)
      }

      # check if the required `created_time` is null
      if (is.null(self$`created_time`)) {
        return(FALSE)
      }

      # check if the required `operation_results` is null
      if (is.null(self$`operation_results`)) {
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
      # check if the required `batch_id` is null
      if (is.null(self$`batch_id`)) {
        invalid_fields["batch_id"] <- "Non-nullable required field `batch_id` cannot be null."
      }

      # check if the required `created_time` is null
      if (is.null(self$`created_time`)) {
        invalid_fields["created_time"] <- "Non-nullable required field `created_time` cannot be null."
      }

      # check if the required `operation_results` is null
      if (is.null(self$`operation_results`)) {
        invalid_fields["operation_results"] <- "Non-nullable required field `operation_results` cannot be null."
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
# SupplementalItemsBatchResponse$unlock()
#
## Below is an example to define the print function
# SupplementalItemsBatchResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SupplementalItemsBatchResponse$lock()

