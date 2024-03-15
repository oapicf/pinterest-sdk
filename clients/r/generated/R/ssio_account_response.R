#' Create a new SSIOAccountResponse
#'
#' @description
#' SSIOAccountResponse Class
#'
#' @docType class
#' @title SSIOAccountResponse
#' @description SSIOAccountResponse Class
#' @format An \code{R6Class} generator object
#' @field eligible Advertiser eligible to create order lines character [optional]
#' @field can_edit Advertiser eligible to update order lines character [optional]
#' @field billto_infos An array of Salesforce account information that includes address, io terms, etc. list(\link{SSIOAccountItem}) [optional]
#' @field currency  character [optional]
#' @field pmp_names  list(\link{SSIOAccountPMPName}) [optional]
#' @field error Error indicator from Salesforce which could be \"No Error\" character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SSIOAccountResponse <- R6::R6Class(
  "SSIOAccountResponse",
  public = list(
    `eligible` = NULL,
    `can_edit` = NULL,
    `billto_infos` = NULL,
    `currency` = NULL,
    `pmp_names` = NULL,
    `error` = NULL,
    #' Initialize a new SSIOAccountResponse class.
    #'
    #' @description
    #' Initialize a new SSIOAccountResponse class.
    #'
    #' @param eligible Advertiser eligible to create order lines
    #' @param can_edit Advertiser eligible to update order lines
    #' @param billto_infos An array of Salesforce account information that includes address, io terms, etc.
    #' @param currency currency
    #' @param pmp_names pmp_names
    #' @param error Error indicator from Salesforce which could be \"No Error\"
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`eligible` = NULL, `can_edit` = NULL, `billto_infos` = NULL, `currency` = NULL, `pmp_names` = NULL, `error` = NULL, ...) {
      if (!is.null(`eligible`)) {
        if (!(is.logical(`eligible`) && length(`eligible`) == 1)) {
          stop(paste("Error! Invalid data for `eligible`. Must be a boolean:", `eligible`))
        }
        self$`eligible` <- `eligible`
      }
      if (!is.null(`can_edit`)) {
        if (!(is.logical(`can_edit`) && length(`can_edit`) == 1)) {
          stop(paste("Error! Invalid data for `can_edit`. Must be a boolean:", `can_edit`))
        }
        self$`can_edit` <- `can_edit`
      }
      if (!is.null(`billto_infos`)) {
        stopifnot(is.vector(`billto_infos`), length(`billto_infos`) != 0)
        sapply(`billto_infos`, function(x) stopifnot(R6::is.R6(x)))
        self$`billto_infos` <- `billto_infos`
      }
      if (!is.null(`currency`)) {
        if (!(is.character(`currency`) && length(`currency`) == 1)) {
          stop(paste("Error! Invalid data for `currency`. Must be a string:", `currency`))
        }
        self$`currency` <- `currency`
      }
      if (!is.null(`pmp_names`)) {
        stopifnot(is.vector(`pmp_names`), length(`pmp_names`) != 0)
        sapply(`pmp_names`, function(x) stopifnot(R6::is.R6(x)))
        self$`pmp_names` <- `pmp_names`
      }
      if (!is.null(`error`)) {
        if (!(is.character(`error`) && length(`error`) == 1)) {
          stop(paste("Error! Invalid data for `error`. Must be a string:", `error`))
        }
        self$`error` <- `error`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SSIOAccountResponse in JSON format
    #' @export
    toJSON = function() {
      SSIOAccountResponseObject <- list()
      if (!is.null(self$`eligible`)) {
        SSIOAccountResponseObject[["eligible"]] <-
          self$`eligible`
      }
      if (!is.null(self$`can_edit`)) {
        SSIOAccountResponseObject[["can_edit"]] <-
          self$`can_edit`
      }
      if (!is.null(self$`billto_infos`)) {
        SSIOAccountResponseObject[["billto_infos"]] <-
          lapply(self$`billto_infos`, function(x) x$toJSON())
      }
      if (!is.null(self$`currency`)) {
        SSIOAccountResponseObject[["currency"]] <-
          self$`currency`
      }
      if (!is.null(self$`pmp_names`)) {
        SSIOAccountResponseObject[["pmp_names"]] <-
          lapply(self$`pmp_names`, function(x) x$toJSON())
      }
      if (!is.null(self$`error`)) {
        SSIOAccountResponseObject[["error"]] <-
          self$`error`
      }
      SSIOAccountResponseObject
    },
    #' Deserialize JSON string into an instance of SSIOAccountResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of SSIOAccountResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOAccountResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`eligible`)) {
        self$`eligible` <- this_object$`eligible`
      }
      if (!is.null(this_object$`can_edit`)) {
        self$`can_edit` <- this_object$`can_edit`
      }
      if (!is.null(this_object$`billto_infos`)) {
        self$`billto_infos` <- ApiClient$new()$deserializeObj(this_object$`billto_infos`, "array[SSIOAccountItem]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`currency`)) {
        self$`currency` <- this_object$`currency`
      }
      if (!is.null(this_object$`pmp_names`)) {
        self$`pmp_names` <- ApiClient$new()$deserializeObj(this_object$`pmp_names`, "array[SSIOAccountPMPName]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`error`)) {
        self$`error` <- this_object$`error`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SSIOAccountResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`eligible`)) {
          sprintf(
          '"eligible":
            %s
                    ',
          tolower(self$`eligible`)
          )
        },
        if (!is.null(self$`can_edit`)) {
          sprintf(
          '"can_edit":
            %s
                    ',
          tolower(self$`can_edit`)
          )
        },
        if (!is.null(self$`billto_infos`)) {
          sprintf(
          '"billto_infos":
          [%s]
',
          paste(sapply(self$`billto_infos`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`currency`)) {
          sprintf(
          '"currency":
            "%s"
                    ',
          self$`currency`
          )
        },
        if (!is.null(self$`pmp_names`)) {
          sprintf(
          '"pmp_names":
          [%s]
',
          paste(sapply(self$`pmp_names`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`error`)) {
          sprintf(
          '"error":
            "%s"
                    ',
          self$`error`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SSIOAccountResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of SSIOAccountResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of SSIOAccountResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`eligible` <- this_object$`eligible`
      self$`can_edit` <- this_object$`can_edit`
      self$`billto_infos` <- ApiClient$new()$deserializeObj(this_object$`billto_infos`, "array[SSIOAccountItem]", loadNamespace("openapi"))
      self$`currency` <- this_object$`currency`
      self$`pmp_names` <- ApiClient$new()$deserializeObj(this_object$`pmp_names`, "array[SSIOAccountPMPName]", loadNamespace("openapi"))
      self$`error` <- this_object$`error`
      self
    },
    #' Validate JSON input with respect to SSIOAccountResponse
    #'
    #' @description
    #' Validate JSON input with respect to SSIOAccountResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SSIOAccountResponse
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# SSIOAccountResponse$unlock()
#
## Below is an example to define the print function
# SSIOAccountResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SSIOAccountResponse$lock()

