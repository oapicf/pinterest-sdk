#' Create a new SSIOAccountItem
#'
#' @description
#' Salesforce account item with billing and terms information.
#'
#' @docType class
#' @title SSIOAccountItem
#' @description SSIOAccountItem Class
#' @format An \code{R6Class} generator object
#' @field addresses Address information that is associated with this account. list(\link{SSIOAccountAddress}) [optional]
#' @field id Salesforce id for billto_info character [optional]
#' @field io_terms Salesforce text for IO Terms and Conditions character [optional]
#' @field io_terms_id Salesforce id for IO Terms and Conditions character [optional]
#' @field io_type Insertion Order Type - Pinterest Paper or Agency Paper character [optional]
#' @field row_terms Salesforce text for Rest of the World Terms and Conditions character [optional]
#' @field row_terms_id Salesforce id for Rest of the World Terms and Conditions character [optional]
#' @field us_terms Salesforce text for US Terms and Conditions character [optional]
#' @field us_terms_id Salesforce id for US Terms and Conditions character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SSIOAccountItem <- R6::R6Class(
  "SSIOAccountItem",
  public = list(
    `addresses` = NULL,
    `id` = NULL,
    `io_terms` = NULL,
    `io_terms_id` = NULL,
    `io_type` = NULL,
    `row_terms` = NULL,
    `row_terms_id` = NULL,
    `us_terms` = NULL,
    `us_terms_id` = NULL,

    #' @description
    #' Initialize a new SSIOAccountItem class.
    #'
    #' @param addresses Address information that is associated with this account.
    #' @param id Salesforce id for billto_info
    #' @param io_terms Salesforce text for IO Terms and Conditions
    #' @param io_terms_id Salesforce id for IO Terms and Conditions
    #' @param io_type Insertion Order Type - Pinterest Paper or Agency Paper
    #' @param row_terms Salesforce text for Rest of the World Terms and Conditions
    #' @param row_terms_id Salesforce id for Rest of the World Terms and Conditions
    #' @param us_terms Salesforce text for US Terms and Conditions
    #' @param us_terms_id Salesforce id for US Terms and Conditions
    #' @param ... Other optional arguments.
    initialize = function(`addresses` = NULL, `id` = NULL, `io_terms` = NULL, `io_terms_id` = NULL, `io_type` = NULL, `row_terms` = NULL, `row_terms_id` = NULL, `us_terms` = NULL, `us_terms_id` = NULL, ...) {
      if (!is.null(`addresses`)) {
        stopifnot(is.vector(`addresses`), length(`addresses`) != 0)
        sapply(`addresses`, function(x) stopifnot(R6::is.R6(x)))
        self$`addresses` <- `addresses`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`io_terms`)) {
        if (!(is.character(`io_terms`) && length(`io_terms`) == 1)) {
          stop(paste("Error! Invalid data for `io_terms`. Must be a string:", `io_terms`))
        }
        self$`io_terms` <- `io_terms`
      }
      if (!is.null(`io_terms_id`)) {
        if (!(is.character(`io_terms_id`) && length(`io_terms_id`) == 1)) {
          stop(paste("Error! Invalid data for `io_terms_id`. Must be a string:", `io_terms_id`))
        }
        self$`io_terms_id` <- `io_terms_id`
      }
      if (!is.null(`io_type`)) {
        if (!(is.character(`io_type`) && length(`io_type`) == 1)) {
          stop(paste("Error! Invalid data for `io_type`. Must be a string:", `io_type`))
        }
        self$`io_type` <- `io_type`
      }
      if (!is.null(`row_terms`)) {
        if (!(is.character(`row_terms`) && length(`row_terms`) == 1)) {
          stop(paste("Error! Invalid data for `row_terms`. Must be a string:", `row_terms`))
        }
        self$`row_terms` <- `row_terms`
      }
      if (!is.null(`row_terms_id`)) {
        if (!(is.character(`row_terms_id`) && length(`row_terms_id`) == 1)) {
          stop(paste("Error! Invalid data for `row_terms_id`. Must be a string:", `row_terms_id`))
        }
        self$`row_terms_id` <- `row_terms_id`
      }
      if (!is.null(`us_terms`)) {
        if (!(is.character(`us_terms`) && length(`us_terms`) == 1)) {
          stop(paste("Error! Invalid data for `us_terms`. Must be a string:", `us_terms`))
        }
        self$`us_terms` <- `us_terms`
      }
      if (!is.null(`us_terms_id`)) {
        if (!(is.character(`us_terms_id`) && length(`us_terms_id`) == 1)) {
          stop(paste("Error! Invalid data for `us_terms_id`. Must be a string:", `us_terms_id`))
        }
        self$`us_terms_id` <- `us_terms_id`
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
    #' @return SSIOAccountItem as a base R list.
    #' @examples
    #' # convert array of SSIOAccountItem (x) to a data frame
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
    #' Convert SSIOAccountItem to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SSIOAccountItemObject <- list()
      if (!is.null(self$`addresses`)) {
        SSIOAccountItemObject[["addresses"]] <-
          self$extractSimpleType(self$`addresses`)
      }
      if (!is.null(self$`id`)) {
        SSIOAccountItemObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`io_terms`)) {
        SSIOAccountItemObject[["io_terms"]] <-
          self$`io_terms`
      }
      if (!is.null(self$`io_terms_id`)) {
        SSIOAccountItemObject[["io_terms_id"]] <-
          self$`io_terms_id`
      }
      if (!is.null(self$`io_type`)) {
        SSIOAccountItemObject[["io_type"]] <-
          self$`io_type`
      }
      if (!is.null(self$`row_terms`)) {
        SSIOAccountItemObject[["row_terms"]] <-
          self$`row_terms`
      }
      if (!is.null(self$`row_terms_id`)) {
        SSIOAccountItemObject[["row_terms_id"]] <-
          self$`row_terms_id`
      }
      if (!is.null(self$`us_terms`)) {
        SSIOAccountItemObject[["us_terms"]] <-
          self$`us_terms`
      }
      if (!is.null(self$`us_terms_id`)) {
        SSIOAccountItemObject[["us_terms_id"]] <-
          self$`us_terms_id`
      }
      return(SSIOAccountItemObject)
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
    #' Deserialize JSON string into an instance of SSIOAccountItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOAccountItem
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`addresses`)) {
        self$`addresses` <- ApiClient$new()$deserializeObj(this_object$`addresses`, "array[SSIOAccountAddress]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`io_terms`)) {
        self$`io_terms` <- this_object$`io_terms`
      }
      if (!is.null(this_object$`io_terms_id`)) {
        self$`io_terms_id` <- this_object$`io_terms_id`
      }
      if (!is.null(this_object$`io_type`)) {
        self$`io_type` <- this_object$`io_type`
      }
      if (!is.null(this_object$`row_terms`)) {
        self$`row_terms` <- this_object$`row_terms`
      }
      if (!is.null(this_object$`row_terms_id`)) {
        self$`row_terms_id` <- this_object$`row_terms_id`
      }
      if (!is.null(this_object$`us_terms`)) {
        self$`us_terms` <- this_object$`us_terms`
      }
      if (!is.null(this_object$`us_terms_id`)) {
        self$`us_terms_id` <- this_object$`us_terms_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return SSIOAccountItem in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SSIOAccountItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOAccountItem
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`addresses` <- ApiClient$new()$deserializeObj(this_object$`addresses`, "array[SSIOAccountAddress]", loadNamespace("openapi"))
      self$`id` <- this_object$`id`
      self$`io_terms` <- this_object$`io_terms`
      self$`io_terms_id` <- this_object$`io_terms_id`
      self$`io_type` <- this_object$`io_type`
      self$`row_terms` <- this_object$`row_terms`
      self$`row_terms_id` <- this_object$`row_terms_id`
      self$`us_terms` <- this_object$`us_terms`
      self$`us_terms_id` <- this_object$`us_terms_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to SSIOAccountItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SSIOAccountItem
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# SSIOAccountItem$unlock()
#
## Below is an example to define the print function
# SSIOAccountItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SSIOAccountItem$lock()

