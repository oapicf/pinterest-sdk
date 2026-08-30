#' Create a new SharedAudienceAccount
#'
#' @description
#' SharedAudienceAccount Class
#'
#' @docType class
#' @title SharedAudienceAccount
#' @description SharedAudienceAccount Class
#' @format An \code{R6Class} generator object
#' @field account_id Account ID (ad account or business ID). character
#' @field account_name Account name. character
#' @field account_type account type \link{AudienceAccountType}
#' @field shared_on_timestamp Epoch timestamp in seconds for the shared audience event integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SharedAudienceAccount <- R6::R6Class(
  "SharedAudienceAccount",
  public = list(
    `account_id` = NULL,
    `account_name` = NULL,
    `account_type` = NULL,
    `shared_on_timestamp` = NULL,

    #' @description
    #' Initialize a new SharedAudienceAccount class.
    #'
    #' @param account_id Account ID (ad account or business ID).
    #' @param account_name Account name.
    #' @param account_type account type
    #' @param shared_on_timestamp Epoch timestamp in seconds for the shared audience event
    #' @param ... Other optional arguments.
    initialize = function(`account_id`, `account_name`, `account_type`, `shared_on_timestamp`, ...) {
      if (!missing(`account_id`)) {
        if (!(is.character(`account_id`) && length(`account_id`) == 1)) {
          stop(paste("Error! Invalid data for `account_id`. Must be a string:", `account_id`))
        }
        self$`account_id` <- `account_id`
      }
      if (!missing(`account_name`)) {
        if (!(is.character(`account_name`) && length(`account_name`) == 1)) {
          stop(paste("Error! Invalid data for `account_name`. Must be a string:", `account_name`))
        }
        self$`account_name` <- `account_name`
      }
      if (!missing(`account_type`)) {
        if (!(`account_type` %in% c())) {
          stop(paste("Error! \"", `account_type`, "\" cannot be assigned to `account_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`account_type`))
        self$`account_type` <- `account_type`
      }
      if (!missing(`shared_on_timestamp`)) {
        if (!(is.numeric(`shared_on_timestamp`) && length(`shared_on_timestamp`) == 1)) {
          stop(paste("Error! Invalid data for `shared_on_timestamp`. Must be an integer:", `shared_on_timestamp`))
        }
        self$`shared_on_timestamp` <- `shared_on_timestamp`
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
    #' @return SharedAudienceAccount as a base R list.
    #' @examples
    #' # convert array of SharedAudienceAccount (x) to a data frame
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
    #' Convert SharedAudienceAccount to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SharedAudienceAccountObject <- list()
      if (!is.null(self$`account_id`)) {
        SharedAudienceAccountObject[["account_id"]] <-
          self$`account_id`
      }
      if (!is.null(self$`account_name`)) {
        SharedAudienceAccountObject[["account_name"]] <-
          self$`account_name`
      }
      if (!is.null(self$`account_type`)) {
        SharedAudienceAccountObject[["account_type"]] <-
          self$extractSimpleType(self$`account_type`)
      }
      if (!is.null(self$`shared_on_timestamp`)) {
        SharedAudienceAccountObject[["shared_on_timestamp"]] <-
          self$`shared_on_timestamp`
      }
      return(SharedAudienceAccountObject)
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
    #' Deserialize JSON string into an instance of SharedAudienceAccount
    #'
    #' @param input_json the JSON input
    #' @return the instance of SharedAudienceAccount
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`account_id`)) {
        self$`account_id` <- this_object$`account_id`
      }
      if (!is.null(this_object$`account_name`)) {
        self$`account_name` <- this_object$`account_name`
      }
      if (!is.null(this_object$`account_type`)) {
        `account_type_object` <- AudienceAccountType$new()
        `account_type_object`$fromJSON(jsonlite::toJSON(this_object$`account_type`, auto_unbox = TRUE, digits = NA))
        self$`account_type` <- `account_type_object`
      }
      if (!is.null(this_object$`shared_on_timestamp`)) {
        self$`shared_on_timestamp` <- this_object$`shared_on_timestamp`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return SharedAudienceAccount in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SharedAudienceAccount
    #'
    #' @param input_json the JSON input
    #' @return the instance of SharedAudienceAccount
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`account_id` <- this_object$`account_id`
      self$`account_name` <- this_object$`account_name`
      self$`account_type` <- AudienceAccountType$new()$fromJSON(jsonlite::toJSON(this_object$`account_type`, auto_unbox = TRUE, digits = NA))
      self$`shared_on_timestamp` <- this_object$`shared_on_timestamp`
      self
    },

    #' @description
    #' Validate JSON input with respect to SharedAudienceAccount and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `account_id`
      if (!is.null(input_json$`account_id`)) {
        if (!(is.character(input_json$`account_id`) && length(input_json$`account_id`) == 1)) {
          stop(paste("Error! Invalid data for `account_id`. Must be a string:", input_json$`account_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SharedAudienceAccount: the required field `account_id` is missing."))
      }
      # check the required field `account_name`
      if (!is.null(input_json$`account_name`)) {
        if (!(is.character(input_json$`account_name`) && length(input_json$`account_name`) == 1)) {
          stop(paste("Error! Invalid data for `account_name`. Must be a string:", input_json$`account_name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SharedAudienceAccount: the required field `account_name` is missing."))
      }
      # check the required field `account_type`
      if (!is.null(input_json$`account_type`)) {
        stopifnot(R6::is.R6(input_json$`account_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SharedAudienceAccount: the required field `account_type` is missing."))
      }
      # check the required field `shared_on_timestamp`
      if (!is.null(input_json$`shared_on_timestamp`)) {
        if (!(is.numeric(input_json$`shared_on_timestamp`) && length(input_json$`shared_on_timestamp`) == 1)) {
          stop(paste("Error! Invalid data for `shared_on_timestamp`. Must be an integer:", input_json$`shared_on_timestamp`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SharedAudienceAccount: the required field `shared_on_timestamp` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SharedAudienceAccount
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `account_id` is null
      if (is.null(self$`account_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`account_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `account_name` is null
      if (is.null(self$`account_name`)) {
        return(FALSE)
      }

      # check if the required `account_type` is null
      if (is.null(self$`account_type`)) {
        return(FALSE)
      }

      # check if the required `shared_on_timestamp` is null
      if (is.null(self$`shared_on_timestamp`)) {
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
      # check if the required `account_id` is null
      if (is.null(self$`account_id`)) {
        invalid_fields["account_id"] <- "Non-nullable required field `account_id` cannot be null."
      }

      if (!str_detect(self$`account_id`, "^\\d+$")) {
        invalid_fields["account_id"] <- "Invalid value for `account_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `account_name` is null
      if (is.null(self$`account_name`)) {
        invalid_fields["account_name"] <- "Non-nullable required field `account_name` cannot be null."
      }

      # check if the required `account_type` is null
      if (is.null(self$`account_type`)) {
        invalid_fields["account_type"] <- "Non-nullable required field `account_type` cannot be null."
      }

      # check if the required `shared_on_timestamp` is null
      if (is.null(self$`shared_on_timestamp`)) {
        invalid_fields["shared_on_timestamp"] <- "Non-nullable required field `shared_on_timestamp` cannot be null."
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
# SharedAudienceAccount$unlock()
#
## Below is an example to define the print function
# SharedAudienceAccount$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SharedAudienceAccount$lock()

