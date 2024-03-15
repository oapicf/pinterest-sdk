#' Create a new AdAccountsCountryResponseData
#'
#' @description
#' AdAccountsCountryResponseData Class
#'
#' @docType class
#' @title AdAccountsCountryResponseData
#' @description AdAccountsCountryResponseData Class
#' @format An \code{R6Class} generator object
#' @field code  \link{AdCountry} [optional]
#' @field currency Country currency. character [optional]
#' @field index Country index numeric [optional]
#' @field name Country name character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdAccountsCountryResponseData <- R6::R6Class(
  "AdAccountsCountryResponseData",
  public = list(
    `code` = NULL,
    `currency` = NULL,
    `index` = NULL,
    `name` = NULL,
    #' Initialize a new AdAccountsCountryResponseData class.
    #'
    #' @description
    #' Initialize a new AdAccountsCountryResponseData class.
    #'
    #' @param code code
    #' @param currency Country currency.
    #' @param index Country index
    #' @param name Country name
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`code` = NULL, `currency` = NULL, `index` = NULL, `name` = NULL, ...) {
      if (!is.null(`code`)) {
        if (!(`code` %in% c())) {
          stop(paste("Error! \"", `code`, "\" cannot be assigned to `code`. Must be .", sep = ""))
        }
        if (!(is.character(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be a string:", `code`))
        }
        stopifnot(R6::is.R6(`code`))
        self$`code` <- `code`
      }
      if (!is.null(`currency`)) {
        if (!(is.character(`currency`) && length(`currency`) == 1)) {
          stop(paste("Error! Invalid data for `currency`. Must be a string:", `currency`))
        }
        self$`currency` <- `currency`
      }
      if (!is.null(`index`)) {
        self$`index` <- `index`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdAccountsCountryResponseData in JSON format
    #' @export
    toJSON = function() {
      AdAccountsCountryResponseDataObject <- list()
      if (!is.null(self$`code`)) {
        AdAccountsCountryResponseDataObject[["code"]] <-
          self$`code`$toJSON()
      }
      if (!is.null(self$`currency`)) {
        AdAccountsCountryResponseDataObject[["currency"]] <-
          self$`currency`
      }
      if (!is.null(self$`index`)) {
        AdAccountsCountryResponseDataObject[["index"]] <-
          self$`index`
      }
      if (!is.null(self$`name`)) {
        AdAccountsCountryResponseDataObject[["name"]] <-
          self$`name`
      }
      AdAccountsCountryResponseDataObject
    },
    #' Deserialize JSON string into an instance of AdAccountsCountryResponseData
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdAccountsCountryResponseData
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountsCountryResponseData
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        `code_object` <- AdCountry$new()
        `code_object`$fromJSON(jsonlite::toJSON(this_object$`code`, auto_unbox = TRUE, digits = NA))
        self$`code` <- `code_object`
      }
      if (!is.null(this_object$`currency`)) {
        self$`currency` <- this_object$`currency`
      }
      if (!is.null(this_object$`index`)) {
        self$`index` <- this_object$`index`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdAccountsCountryResponseData in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`code`)) {
          sprintf(
          '"code":
          %s
          ',
          jsonlite::toJSON(self$`code`$toJSON(), auto_unbox = TRUE, digits = NA)
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
        if (!is.null(self$`index`)) {
          sprintf(
          '"index":
            %d
                    ',
          self$`index`
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AdAccountsCountryResponseData
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdAccountsCountryResponseData
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountsCountryResponseData
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code` <- AdCountry$new()$fromJSON(jsonlite::toJSON(this_object$`code`, auto_unbox = TRUE, digits = NA))
      self$`currency` <- this_object$`currency`
      self$`index` <- this_object$`index`
      self$`name` <- this_object$`name`
      self
    },
    #' Validate JSON input with respect to AdAccountsCountryResponseData
    #'
    #' @description
    #' Validate JSON input with respect to AdAccountsCountryResponseData and throw an exception if invalid
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
    #' @return String representation of AdAccountsCountryResponseData
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
# AdAccountsCountryResponseData$unlock()
#
## Below is an example to define the print function
# AdAccountsCountryResponseData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdAccountsCountryResponseData$lock()

