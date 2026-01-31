#' Create a new CustomerListUpload
#'
#' @description
#' CustomerListUpload Class
#'
#' @docType class
#' @title CustomerListUpload
#' @description CustomerListUpload Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id Advertiser ID. character
#' @field creation_time Customer List Upload creation_time. Epoch (seconds). integer
#' @field customer_list_id ID of the customer list associated with this upload. character
#' @field error_counts Error counts by error code list(\link{ErrorDetail}) [optional]
#' @field id Customer List Upload ID. character
#' @field operation  \link{UserListOperationType}
#' @field record_counts  \link{RecordCounts} [optional]
#' @field state Workload processing state character
#' @field updated_time Customer List Upload updated_time. Epoch (seconds). integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomerListUpload <- R6::R6Class(
  "CustomerListUpload",
  public = list(
    `ad_account_id` = NULL,
    `creation_time` = NULL,
    `customer_list_id` = NULL,
    `error_counts` = NULL,
    `id` = NULL,
    `operation` = NULL,
    `record_counts` = NULL,
    `state` = NULL,
    `updated_time` = NULL,

    #' @description
    #' Initialize a new CustomerListUpload class.
    #'
    #' @param ad_account_id Advertiser ID.
    #' @param creation_time Customer List Upload creation_time. Epoch (seconds).
    #' @param customer_list_id ID of the customer list associated with this upload.
    #' @param id Customer List Upload ID.
    #' @param operation operation
    #' @param state Workload processing state
    #' @param updated_time Customer List Upload updated_time. Epoch (seconds).
    #' @param error_counts Error counts by error code
    #' @param record_counts record_counts
    #' @param ... Other optional arguments.
    initialize = function(`ad_account_id`, `creation_time`, `customer_list_id`, `id`, `operation`, `state`, `updated_time`, `error_counts` = NULL, `record_counts` = NULL, ...) {
      if (!missing(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!missing(`creation_time`)) {
        if (!(is.numeric(`creation_time`) && length(`creation_time`) == 1)) {
          stop(paste("Error! Invalid data for `creation_time`. Must be an integer:", `creation_time`))
        }
        self$`creation_time` <- `creation_time`
      }
      if (!missing(`customer_list_id`)) {
        if (!(is.character(`customer_list_id`) && length(`customer_list_id`) == 1)) {
          stop(paste("Error! Invalid data for `customer_list_id`. Must be a string:", `customer_list_id`))
        }
        self$`customer_list_id` <- `customer_list_id`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`operation`)) {
        if (!(`operation` %in% c())) {
          stop(paste("Error! \"", `operation`, "\" cannot be assigned to `operation`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`operation`))
        self$`operation` <- `operation`
      }
      if (!missing(`state`)) {
        if (!(`state` %in% c("NOT_STARTED", "RUNNING", "PAUSED", "SUCCEEDED", "FAILED"))) {
          stop(paste("Error! \"", `state`, "\" cannot be assigned to `state`. Must be \"NOT_STARTED\", \"RUNNING\", \"PAUSED\", \"SUCCEEDED\", \"FAILED\".", sep = ""))
        }
        if (!(is.character(`state`) && length(`state`) == 1)) {
          stop(paste("Error! Invalid data for `state`. Must be a string:", `state`))
        }
        self$`state` <- `state`
      }
      if (!missing(`updated_time`)) {
        if (!(is.numeric(`updated_time`) && length(`updated_time`) == 1)) {
          stop(paste("Error! Invalid data for `updated_time`. Must be an integer:", `updated_time`))
        }
        self$`updated_time` <- `updated_time`
      }
      if (!is.null(`error_counts`)) {
        stopifnot(is.vector(`error_counts`), length(`error_counts`) != 0)
        sapply(`error_counts`, function(x) stopifnot(R6::is.R6(x)))
        self$`error_counts` <- `error_counts`
      }
      if (!is.null(`record_counts`)) {
        stopifnot(R6::is.R6(`record_counts`))
        self$`record_counts` <- `record_counts`
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
    #' @return CustomerListUpload as a base R list.
    #' @examples
    #' # convert array of CustomerListUpload (x) to a data frame
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
    #' Convert CustomerListUpload to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CustomerListUploadObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        CustomerListUploadObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`creation_time`)) {
        CustomerListUploadObject[["creation_time"]] <-
          self$`creation_time`
      }
      if (!is.null(self$`customer_list_id`)) {
        CustomerListUploadObject[["customer_list_id"]] <-
          self$`customer_list_id`
      }
      if (!is.null(self$`error_counts`)) {
        CustomerListUploadObject[["error_counts"]] <-
          lapply(self$`error_counts`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`id`)) {
        CustomerListUploadObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`operation`)) {
        CustomerListUploadObject[["operation"]] <-
          self$`operation`$toSimpleType()
      }
      if (!is.null(self$`record_counts`)) {
        CustomerListUploadObject[["record_counts"]] <-
          self$`record_counts`$toSimpleType()
      }
      if (!is.null(self$`state`)) {
        CustomerListUploadObject[["state"]] <-
          self$`state`
      }
      if (!is.null(self$`updated_time`)) {
        CustomerListUploadObject[["updated_time"]] <-
          self$`updated_time`
      }
      return(CustomerListUploadObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomerListUpload
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerListUpload
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`creation_time`)) {
        self$`creation_time` <- this_object$`creation_time`
      }
      if (!is.null(this_object$`customer_list_id`)) {
        self$`customer_list_id` <- this_object$`customer_list_id`
      }
      if (!is.null(this_object$`error_counts`)) {
        self$`error_counts` <- ApiClient$new()$deserializeObj(this_object$`error_counts`, "array[ErrorDetail]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`operation`)) {
        `operation_object` <- UserListOperationType$new()
        `operation_object`$fromJSON(jsonlite::toJSON(this_object$`operation`, auto_unbox = TRUE, digits = NA))
        self$`operation` <- `operation_object`
      }
      if (!is.null(this_object$`record_counts`)) {
        `record_counts_object` <- RecordCounts$new()
        `record_counts_object`$fromJSON(jsonlite::toJSON(this_object$`record_counts`, auto_unbox = TRUE, digits = NA))
        self$`record_counts` <- `record_counts_object`
      }
      if (!is.null(this_object$`state`)) {
        if (!is.null(this_object$`state`) && !(this_object$`state` %in% c("NOT_STARTED", "RUNNING", "PAUSED", "SUCCEEDED", "FAILED"))) {
          stop(paste("Error! \"", this_object$`state`, "\" cannot be assigned to `state`. Must be \"NOT_STARTED\", \"RUNNING\", \"PAUSED\", \"SUCCEEDED\", \"FAILED\".", sep = ""))
        }
        self$`state` <- this_object$`state`
      }
      if (!is.null(this_object$`updated_time`)) {
        self$`updated_time` <- this_object$`updated_time`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CustomerListUpload in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomerListUpload
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerListUpload
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`creation_time` <- this_object$`creation_time`
      self$`customer_list_id` <- this_object$`customer_list_id`
      self$`error_counts` <- ApiClient$new()$deserializeObj(this_object$`error_counts`, "array[ErrorDetail]", loadNamespace("openapi"))
      self$`id` <- this_object$`id`
      self$`operation` <- UserListOperationType$new()$fromJSON(jsonlite::toJSON(this_object$`operation`, auto_unbox = TRUE, digits = NA))
      self$`record_counts` <- RecordCounts$new()$fromJSON(jsonlite::toJSON(this_object$`record_counts`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`state`) && !(this_object$`state` %in% c("NOT_STARTED", "RUNNING", "PAUSED", "SUCCEEDED", "FAILED"))) {
        stop(paste("Error! \"", this_object$`state`, "\" cannot be assigned to `state`. Must be \"NOT_STARTED\", \"RUNNING\", \"PAUSED\", \"SUCCEEDED\", \"FAILED\".", sep = ""))
      }
      self$`state` <- this_object$`state`
      self$`updated_time` <- this_object$`updated_time`
      self
    },

    #' @description
    #' Validate JSON input with respect to CustomerListUpload and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `ad_account_id`
      if (!is.null(input_json$`ad_account_id`)) {
        if (!(is.character(input_json$`ad_account_id`) && length(input_json$`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", input_json$`ad_account_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerListUpload: the required field `ad_account_id` is missing."))
      }
      # check the required field `creation_time`
      if (!is.null(input_json$`creation_time`)) {
        if (!(is.numeric(input_json$`creation_time`) && length(input_json$`creation_time`) == 1)) {
          stop(paste("Error! Invalid data for `creation_time`. Must be an integer:", input_json$`creation_time`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerListUpload: the required field `creation_time` is missing."))
      }
      # check the required field `customer_list_id`
      if (!is.null(input_json$`customer_list_id`)) {
        if (!(is.character(input_json$`customer_list_id`) && length(input_json$`customer_list_id`) == 1)) {
          stop(paste("Error! Invalid data for `customer_list_id`. Must be a string:", input_json$`customer_list_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerListUpload: the required field `customer_list_id` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerListUpload: the required field `id` is missing."))
      }
      # check the required field `operation`
      if (!is.null(input_json$`operation`)) {
        stopifnot(R6::is.R6(input_json$`operation`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerListUpload: the required field `operation` is missing."))
      }
      # check the required field `state`
      if (!is.null(input_json$`state`)) {
        if (!(is.character(input_json$`state`) && length(input_json$`state`) == 1)) {
          stop(paste("Error! Invalid data for `state`. Must be a string:", input_json$`state`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerListUpload: the required field `state` is missing."))
      }
      # check the required field `updated_time`
      if (!is.null(input_json$`updated_time`)) {
        if (!(is.numeric(input_json$`updated_time`) && length(input_json$`updated_time`) == 1)) {
          stop(paste("Error! Invalid data for `updated_time`. Must be an integer:", input_json$`updated_time`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerListUpload: the required field `updated_time` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomerListUpload
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `ad_account_id` is null
      if (is.null(self$`ad_account_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `creation_time` is null
      if (is.null(self$`creation_time`)) {
        return(FALSE)
      }

      # check if the required `customer_list_id` is null
      if (is.null(self$`customer_list_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`customer_list_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        return(FALSE)
      }

      # check if the required `state` is null
      if (is.null(self$`state`)) {
        return(FALSE)
      }

      # check if the required `updated_time` is null
      if (is.null(self$`updated_time`)) {
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
      # check if the required `ad_account_id` is null
      if (is.null(self$`ad_account_id`)) {
        invalid_fields["ad_account_id"] <- "Non-nullable required field `ad_account_id` cannot be null."
      }

      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        invalid_fields["ad_account_id"] <- "Invalid value for `ad_account_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `creation_time` is null
      if (is.null(self$`creation_time`)) {
        invalid_fields["creation_time"] <- "Non-nullable required field `creation_time` cannot be null."
      }

      # check if the required `customer_list_id` is null
      if (is.null(self$`customer_list_id`)) {
        invalid_fields["customer_list_id"] <- "Non-nullable required field `customer_list_id` cannot be null."
      }

      if (!str_detect(self$`customer_list_id`, "^\\d+$")) {
        invalid_fields["customer_list_id"] <- "Invalid value for `customer_list_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        invalid_fields["operation"] <- "Non-nullable required field `operation` cannot be null."
      }

      # check if the required `state` is null
      if (is.null(self$`state`)) {
        invalid_fields["state"] <- "Non-nullable required field `state` cannot be null."
      }

      # check if the required `updated_time` is null
      if (is.null(self$`updated_time`)) {
        invalid_fields["updated_time"] <- "Non-nullable required field `updated_time` cannot be null."
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
# CustomerListUpload$unlock()
#
## Below is an example to define the print function
# CustomerListUpload$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomerListUpload$lock()

