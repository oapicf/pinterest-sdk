#' Create a new SSIOAccount
#'
#' @description
#' Salesforce account details including bill-to information.
#'
#' @docType class
#' @title SSIOAccount
#' @description SSIOAccount Class
#' @format An \code{R6Class} generator object
#' @field billto_infos An array of Salesforce account information that includes address, io terms, etc. list(\link{SSIOAccountItem}) [optional]
#' @field can_edit Advertiser eligible to update order lines character [optional]
#' @field currency  character [optional]
#' @field eligible Advertiser eligible to create order lines character [optional]
#' @field error Error indicator from Salesforce which could be \"No Error\" character [optional]
#' @field pmp_names  list(\link{SSIOAccountPMPName}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SSIOAccount <- R6::R6Class(
  "SSIOAccount",
  public = list(
    `billto_infos` = NULL,
    `can_edit` = NULL,
    `currency` = NULL,
    `eligible` = NULL,
    `error` = NULL,
    `pmp_names` = NULL,

    #' @description
    #' Initialize a new SSIOAccount class.
    #'
    #' @param billto_infos An array of Salesforce account information that includes address, io terms, etc.
    #' @param can_edit Advertiser eligible to update order lines
    #' @param currency currency
    #' @param eligible Advertiser eligible to create order lines
    #' @param error Error indicator from Salesforce which could be \"No Error\"
    #' @param pmp_names pmp_names
    #' @param ... Other optional arguments.
    initialize = function(`billto_infos` = NULL, `can_edit` = NULL, `currency` = NULL, `eligible` = NULL, `error` = NULL, `pmp_names` = NULL, ...) {
      if (!is.null(`billto_infos`)) {
        stopifnot(is.vector(`billto_infos`), length(`billto_infos`) != 0)
        sapply(`billto_infos`, function(x) stopifnot(R6::is.R6(x)))
        self$`billto_infos` <- `billto_infos`
      }
      if (!is.null(`can_edit`)) {
        if (!(is.logical(`can_edit`) && length(`can_edit`) == 1)) {
          stop(paste("Error! Invalid data for `can_edit`. Must be a boolean:", `can_edit`))
        }
        self$`can_edit` <- `can_edit`
      }
      if (!is.null(`currency`)) {
        if (!(is.character(`currency`) && length(`currency`) == 1)) {
          stop(paste("Error! Invalid data for `currency`. Must be a string:", `currency`))
        }
        self$`currency` <- `currency`
      }
      if (!is.null(`eligible`)) {
        if (!(is.logical(`eligible`) && length(`eligible`) == 1)) {
          stop(paste("Error! Invalid data for `eligible`. Must be a boolean:", `eligible`))
        }
        self$`eligible` <- `eligible`
      }
      if (!is.null(`error`)) {
        if (!(is.character(`error`) && length(`error`) == 1)) {
          stop(paste("Error! Invalid data for `error`. Must be a string:", `error`))
        }
        self$`error` <- `error`
      }
      if (!is.null(`pmp_names`)) {
        stopifnot(is.vector(`pmp_names`), length(`pmp_names`) != 0)
        sapply(`pmp_names`, function(x) stopifnot(R6::is.R6(x)))
        self$`pmp_names` <- `pmp_names`
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
    #' @return SSIOAccount as a base R list.
    #' @examples
    #' # convert array of SSIOAccount (x) to a data frame
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
    #' Convert SSIOAccount to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SSIOAccountObject <- list()
      if (!is.null(self$`billto_infos`)) {
        SSIOAccountObject[["billto_infos"]] <-
          self$extractSimpleType(self$`billto_infos`)
      }
      if (!is.null(self$`can_edit`)) {
        SSIOAccountObject[["can_edit"]] <-
          self$`can_edit`
      }
      if (!is.null(self$`currency`)) {
        SSIOAccountObject[["currency"]] <-
          self$`currency`
      }
      if (!is.null(self$`eligible`)) {
        SSIOAccountObject[["eligible"]] <-
          self$`eligible`
      }
      if (!is.null(self$`error`)) {
        SSIOAccountObject[["error"]] <-
          self$`error`
      }
      if (!is.null(self$`pmp_names`)) {
        SSIOAccountObject[["pmp_names"]] <-
          self$extractSimpleType(self$`pmp_names`)
      }
      return(SSIOAccountObject)
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
    #' Deserialize JSON string into an instance of SSIOAccount
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOAccount
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`billto_infos`)) {
        self$`billto_infos` <- ApiClient$new()$deserializeObj(this_object$`billto_infos`, "array[SSIOAccountItem]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`can_edit`)) {
        self$`can_edit` <- this_object$`can_edit`
      }
      if (!is.null(this_object$`currency`)) {
        self$`currency` <- this_object$`currency`
      }
      if (!is.null(this_object$`eligible`)) {
        self$`eligible` <- this_object$`eligible`
      }
      if (!is.null(this_object$`error`)) {
        self$`error` <- this_object$`error`
      }
      if (!is.null(this_object$`pmp_names`)) {
        self$`pmp_names` <- ApiClient$new()$deserializeObj(this_object$`pmp_names`, "array[SSIOAccountPMPName]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return SSIOAccount in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SSIOAccount
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOAccount
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`billto_infos` <- ApiClient$new()$deserializeObj(this_object$`billto_infos`, "array[SSIOAccountItem]", loadNamespace("openapi"))
      self$`can_edit` <- this_object$`can_edit`
      self$`currency` <- this_object$`currency`
      self$`eligible` <- this_object$`eligible`
      self$`error` <- this_object$`error`
      self$`pmp_names` <- ApiClient$new()$deserializeObj(this_object$`pmp_names`, "array[SSIOAccountPMPName]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to SSIOAccount and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SSIOAccount
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
# SSIOAccount$unlock()
#
## Below is an example to define the print function
# SSIOAccount$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SSIOAccount$lock()

