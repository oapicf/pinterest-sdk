#' Create a new BulkJobData
#'
#' @description
#' Bulk request result data.
#'
#' @docType class
#' @title BulkJobData
#' @description BulkJobData Class
#' @format An \code{R6Class} generator object
#' @field result_url Presigned s3 file url for the bulk request result. character [optional]
#' @field status  \link{BulkRequestStatus}
#' @field workload_id Bulk Workload Id. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BulkJobData <- R6::R6Class(
  "BulkJobData",
  public = list(
    `result_url` = NULL,
    `status` = NULL,
    `workload_id` = NULL,

    #' @description
    #' Initialize a new BulkJobData class.
    #'
    #' @param status status
    #' @param result_url Presigned s3 file url for the bulk request result.
    #' @param workload_id Bulk Workload Id.
    #' @param ... Other optional arguments.
    initialize = function(`status`, `result_url` = NULL, `workload_id` = NULL, ...) {
      if (!missing(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`result_url`)) {
        if (!(is.character(`result_url`) && length(`result_url`) == 1)) {
          stop(paste("Error! Invalid data for `result_url`. Must be a string:", `result_url`))
        }
        self$`result_url` <- `result_url`
      }
      if (!is.null(`workload_id`)) {
        if (!(is.numeric(`workload_id`) && length(`workload_id`) == 1)) {
          stop(paste("Error! Invalid data for `workload_id`. Must be an integer:", `workload_id`))
        }
        self$`workload_id` <- `workload_id`
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
    #' @return BulkJobData as a base R list.
    #' @examples
    #' # convert array of BulkJobData (x) to a data frame
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
    #' Convert BulkJobData to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BulkJobDataObject <- list()
      if (!is.null(self$`result_url`)) {
        BulkJobDataObject[["result_url"]] <-
          self$`result_url`
      }
      if (!is.null(self$`status`)) {
        BulkJobDataObject[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      if (!is.null(self$`workload_id`)) {
        BulkJobDataObject[["workload_id"]] <-
          self$`workload_id`
      }
      return(BulkJobDataObject)
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
    #' Deserialize JSON string into an instance of BulkJobData
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkJobData
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`result_url`)) {
        self$`result_url` <- this_object$`result_url`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- BulkRequestStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`workload_id`)) {
        self$`workload_id` <- this_object$`workload_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BulkJobData in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BulkJobData
    #'
    #' @param input_json the JSON input
    #' @return the instance of BulkJobData
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`result_url` <- this_object$`result_url`
      self$`status` <- BulkRequestStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`workload_id` <- this_object$`workload_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to BulkJobData and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        stopifnot(R6::is.R6(input_json$`status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BulkJobData: the required field `status` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BulkJobData
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
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
# BulkJobData$unlock()
#
## Below is an example to define the print function
# BulkJobData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BulkJobData$lock()

