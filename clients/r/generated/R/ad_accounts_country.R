#' Create a new AdAccountsCountry
#'
#' @description
#' AdAccountsCountry Class
#'
#' @docType class
#' @title AdAccountsCountry
#' @description AdAccountsCountry Class
#' @format An \code{R6Class} generator object
#' @field code  \link{Country}
#' @field currency Country currency. character
#' @field index Country index numeric
#' @field name Country name character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdAccountsCountry <- R6::R6Class(
  "AdAccountsCountry",
  public = list(
    `code` = NULL,
    `currency` = NULL,
    `index` = NULL,
    `name` = NULL,

    #' @description
    #' Initialize a new AdAccountsCountry class.
    #'
    #' @param code code
    #' @param currency Country currency.
    #' @param index Country index
    #' @param name Country name
    #' @param ... Other optional arguments.
    initialize = function(`code`, `currency`, `index`, `name`, ...) {
      if (!missing(`code`)) {
        if (!(`code` %in% c())) {
          stop(paste("Error! \"", `code`, "\" cannot be assigned to `code`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`code`))
        self$`code` <- `code`
      }
      if (!missing(`currency`)) {
        if (!(is.character(`currency`) && length(`currency`) == 1)) {
          stop(paste("Error! Invalid data for `currency`. Must be a string:", `currency`))
        }
        self$`currency` <- `currency`
      }
      if (!missing(`index`)) {
        self$`index` <- `index`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
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
    #' @return AdAccountsCountry as a base R list.
    #' @examples
    #' # convert array of AdAccountsCountry (x) to a data frame
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
    #' Convert AdAccountsCountry to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdAccountsCountryObject <- list()
      if (!is.null(self$`code`)) {
        AdAccountsCountryObject[["code"]] <-
          self$extractSimpleType(self$`code`)
      }
      if (!is.null(self$`currency`)) {
        AdAccountsCountryObject[["currency"]] <-
          self$`currency`
      }
      if (!is.null(self$`index`)) {
        AdAccountsCountryObject[["index"]] <-
          self$`index`
      }
      if (!is.null(self$`name`)) {
        AdAccountsCountryObject[["name"]] <-
          self$`name`
      }
      return(AdAccountsCountryObject)
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
    #' Deserialize JSON string into an instance of AdAccountsCountry
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountsCountry
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        `code_object` <- Country$new()
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

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdAccountsCountry in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdAccountsCountry
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountsCountry
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code` <- Country$new()$fromJSON(jsonlite::toJSON(this_object$`code`, auto_unbox = TRUE, digits = NA))
      self$`currency` <- this_object$`currency`
      self$`index` <- this_object$`index`
      self$`name` <- this_object$`name`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdAccountsCountry and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `code`
      if (!is.null(input_json$`code`)) {
        stopifnot(R6::is.R6(input_json$`code`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdAccountsCountry: the required field `code` is missing."))
      }
      # check the required field `currency`
      if (!is.null(input_json$`currency`)) {
        if (!(is.character(input_json$`currency`) && length(input_json$`currency`) == 1)) {
          stop(paste("Error! Invalid data for `currency`. Must be a string:", input_json$`currency`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdAccountsCountry: the required field `currency` is missing."))
      }
      # check the required field `index`
      if (!is.null(input_json$`index`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdAccountsCountry: the required field `index` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdAccountsCountry: the required field `name` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdAccountsCountry
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `code` is null
      if (is.null(self$`code`)) {
        return(FALSE)
      }

      # check if the required `currency` is null
      if (is.null(self$`currency`)) {
        return(FALSE)
      }

      # check if the required `index` is null
      if (is.null(self$`index`)) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
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
      # check if the required `code` is null
      if (is.null(self$`code`)) {
        invalid_fields["code"] <- "Non-nullable required field `code` cannot be null."
      }

      # check if the required `currency` is null
      if (is.null(self$`currency`)) {
        invalid_fields["currency"] <- "Non-nullable required field `currency` cannot be null."
      }

      # check if the required `index` is null
      if (is.null(self$`index`)) {
        invalid_fields["index"] <- "Non-nullable required field `index` cannot be null."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
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
# AdAccountsCountry$unlock()
#
## Below is an example to define the print function
# AdAccountsCountry$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdAccountsCountry$lock()

