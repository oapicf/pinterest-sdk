#' Create a new SupplementalOperationResult
#'
#' @description
#' Result of a supplemental item operation, discriminated by supplemental_type
#'
#' @docType class
#' @title SupplementalOperationResult
#' @description SupplementalOperationResult Class
#' @format An \code{R6Class} generator object
#' @field errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. list(\link{SupplementalItemValidationEvent}) [optional]
#' @field item_id Catalog item id in the merchant namespace character
#' @field status Status of the item processing record \link{SupplementalItemProcessingStatus}
#' @field store_code Store code for the local inventory item character
#' @field supplemental_type  character
#' @field warnings Array with the validation warnings for the item processing record list(\link{SupplementalItemValidationEvent}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SupplementalOperationResult <- R6::R6Class(
  "SupplementalOperationResult",
  public = list(
    `errors` = NULL,
    `item_id` = NULL,
    `status` = NULL,
    `store_code` = NULL,
    `supplemental_type` = NULL,
    `warnings` = NULL,

    #' @description
    #' Initialize a new SupplementalOperationResult class.
    #'
    #' @param item_id Catalog item id in the merchant namespace
    #' @param status Status of the item processing record
    #' @param store_code Store code for the local inventory item
    #' @param supplemental_type supplemental_type
    #' @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
    #' @param warnings Array with the validation warnings for the item processing record
    #' @param ... Other optional arguments.
    initialize = function(`item_id`, `status`, `store_code`, `supplemental_type`, `errors` = NULL, `warnings` = NULL, ...) {
      if (!missing(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!missing(`store_code`)) {
        if (!(is.character(`store_code`) && length(`store_code`) == 1)) {
          stop(paste("Error! Invalid data for `store_code`. Must be a string:", `store_code`))
        }
        self$`store_code` <- `store_code`
      }
      if (!missing(`supplemental_type`)) {
        if (!(`supplemental_type` %in% c("LOCAL_INVENTORY"))) {
          stop(paste("Error! \"", `supplemental_type`, "\" cannot be assigned to `supplemental_type`. Must be \"LOCAL_INVENTORY\".", sep = ""))
        }
        if (!(is.character(`supplemental_type`) && length(`supplemental_type`) == 1)) {
          stop(paste("Error! Invalid data for `supplemental_type`. Must be a string:", `supplemental_type`))
        }
        self$`supplemental_type` <- `supplemental_type`
      }
      if (!is.null(`errors`)) {
        stopifnot(is.vector(`errors`), length(`errors`) != 0)
        sapply(`errors`, function(x) stopifnot(R6::is.R6(x)))
        self$`errors` <- `errors`
      }
      if (!is.null(`warnings`)) {
        stopifnot(is.vector(`warnings`), length(`warnings`) != 0)
        sapply(`warnings`, function(x) stopifnot(R6::is.R6(x)))
        self$`warnings` <- `warnings`
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
    #' @return SupplementalOperationResult as a base R list.
    #' @examples
    #' # convert array of SupplementalOperationResult (x) to a data frame
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
    #' Convert SupplementalOperationResult to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SupplementalOperationResultObject <- list()
      if (!is.null(self$`errors`)) {
        SupplementalOperationResultObject[["errors"]] <-
          self$extractSimpleType(self$`errors`)
      }
      if (!is.null(self$`item_id`)) {
        SupplementalOperationResultObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`status`)) {
        SupplementalOperationResultObject[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      if (!is.null(self$`store_code`)) {
        SupplementalOperationResultObject[["store_code"]] <-
          self$`store_code`
      }
      if (!is.null(self$`supplemental_type`)) {
        SupplementalOperationResultObject[["supplemental_type"]] <-
          self$`supplemental_type`
      }
      if (!is.null(self$`warnings`)) {
        SupplementalOperationResultObject[["warnings"]] <-
          self$extractSimpleType(self$`warnings`)
      }
      return(SupplementalOperationResultObject)
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
    #' Deserialize JSON string into an instance of SupplementalOperationResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of SupplementalOperationResult
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`errors`)) {
        self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[SupplementalItemValidationEvent]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- SupplementalItemProcessingStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`store_code`)) {
        self$`store_code` <- this_object$`store_code`
      }
      if (!is.null(this_object$`supplemental_type`)) {
        if (!is.null(this_object$`supplemental_type`) && !(this_object$`supplemental_type` %in% c("LOCAL_INVENTORY"))) {
          stop(paste("Error! \"", this_object$`supplemental_type`, "\" cannot be assigned to `supplemental_type`. Must be \"LOCAL_INVENTORY\".", sep = ""))
        }
        self$`supplemental_type` <- this_object$`supplemental_type`
      }
      if (!is.null(this_object$`warnings`)) {
        self$`warnings` <- ApiClient$new()$deserializeObj(this_object$`warnings`, "array[SupplementalItemValidationEvent]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return SupplementalOperationResult in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SupplementalOperationResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of SupplementalOperationResult
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[SupplementalItemValidationEvent]", loadNamespace("openapi"))
      self$`item_id` <- this_object$`item_id`
      self$`status` <- SupplementalItemProcessingStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`store_code` <- this_object$`store_code`
      if (!is.null(this_object$`supplemental_type`) && !(this_object$`supplemental_type` %in% c("LOCAL_INVENTORY"))) {
        stop(paste("Error! \"", this_object$`supplemental_type`, "\" cannot be assigned to `supplemental_type`. Must be \"LOCAL_INVENTORY\".", sep = ""))
      }
      self$`supplemental_type` <- this_object$`supplemental_type`
      self$`warnings` <- ApiClient$new()$deserializeObj(this_object$`warnings`, "array[SupplementalItemValidationEvent]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to SupplementalOperationResult and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `item_id`
      if (!is.null(input_json$`item_id`)) {
        if (!(is.character(input_json$`item_id`) && length(input_json$`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", input_json$`item_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SupplementalOperationResult: the required field `item_id` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        stopifnot(R6::is.R6(input_json$`status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SupplementalOperationResult: the required field `status` is missing."))
      }
      # check the required field `store_code`
      if (!is.null(input_json$`store_code`)) {
        if (!(is.character(input_json$`store_code`) && length(input_json$`store_code`) == 1)) {
          stop(paste("Error! Invalid data for `store_code`. Must be a string:", input_json$`store_code`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SupplementalOperationResult: the required field `store_code` is missing."))
      }
      # check the required field `supplemental_type`
      if (!is.null(input_json$`supplemental_type`)) {
        if (!(is.character(input_json$`supplemental_type`) && length(input_json$`supplemental_type`) == 1)) {
          stop(paste("Error! Invalid data for `supplemental_type`. Must be a string:", input_json$`supplemental_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SupplementalOperationResult: the required field `supplemental_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SupplementalOperationResult
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        return(FALSE)
      }

      # check if the required `store_code` is null
      if (is.null(self$`store_code`)) {
        return(FALSE)
      }

      # check if the required `supplemental_type` is null
      if (is.null(self$`supplemental_type`)) {
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
      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        invalid_fields["item_id"] <- "Non-nullable required field `item_id` cannot be null."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
      }

      # check if the required `store_code` is null
      if (is.null(self$`store_code`)) {
        invalid_fields["store_code"] <- "Non-nullable required field `store_code` cannot be null."
      }

      # check if the required `supplemental_type` is null
      if (is.null(self$`supplemental_type`)) {
        invalid_fields["supplemental_type"] <- "Non-nullable required field `supplemental_type` cannot be null."
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
# SupplementalOperationResult$unlock()
#
## Below is an example to define the print function
# SupplementalOperationResult$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SupplementalOperationResult$lock()

