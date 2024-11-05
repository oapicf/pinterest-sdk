#' Create a new CatalogsProductGroupCurrencyCriteria
#'
#' @description
#' A currency filter. This filter cannot be negated
#'
#' @docType class
#' @title CatalogsProductGroupCurrencyCriteria
#' @description CatalogsProductGroupCurrencyCriteria Class
#' @format An \code{R6Class} generator object
#' @field values  \link{NonNullableCatalogsCurrency}
#' @field negated  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupCurrencyCriteria <- R6::R6Class(
  "CatalogsProductGroupCurrencyCriteria",
  public = list(
    `values` = NULL,
    `negated` = NULL,

    #' @description
    #' Initialize a new CatalogsProductGroupCurrencyCriteria class.
    #'
    #' @param values values
    #' @param negated negated. Default to FALSE.
    #' @param ... Other optional arguments.
    initialize = function(`values`, `negated` = FALSE, ...) {
      if (!missing(`values`)) {
        if (!(`values` %in% c())) {
          stop(paste("Error! \"", `values`, "\" cannot be assigned to `values`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`values`))
        self$`values` <- `values`
      }
      if (!is.null(`negated`)) {
        if (!(is.logical(`negated`) && length(`negated`) == 1)) {
          stop(paste("Error! Invalid data for `negated`. Must be a boolean:", `negated`))
        }
        self$`negated` <- `negated`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductGroupCurrencyCriteria in JSON format
    toJSON = function() {
      CatalogsProductGroupCurrencyCriteriaObject <- list()
      if (!is.null(self$`values`)) {
        CatalogsProductGroupCurrencyCriteriaObject[["values"]] <-
          self$`values`$toJSON()
      }
      if (!is.null(self$`negated`)) {
        CatalogsProductGroupCurrencyCriteriaObject[["negated"]] <-
          self$`negated`
      }
      CatalogsProductGroupCurrencyCriteriaObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupCurrencyCriteria
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupCurrencyCriteria
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`values`)) {
        `values_object` <- NonNullableCatalogsCurrency$new()
        `values_object`$fromJSON(jsonlite::toJSON(this_object$`values`, auto_unbox = TRUE, digits = NA))
        self$`values` <- `values_object`
      }
      if (!is.null(this_object$`negated`)) {
        self$`negated` <- this_object$`negated`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductGroupCurrencyCriteria in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`values`)) {
          sprintf(
          '"values":
          %s
          ',
          jsonlite::toJSON(self$`values`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`negated`)) {
          sprintf(
          '"negated":
            %s
                    ',
          tolower(self$`negated`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupCurrencyCriteria
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupCurrencyCriteria
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`values` <- NonNullableCatalogsCurrency$new()$fromJSON(jsonlite::toJSON(this_object$`values`, auto_unbox = TRUE, digits = NA))
      self$`negated` <- this_object$`negated`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsProductGroupCurrencyCriteria and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `values`
      if (!is.null(input_json$`values`)) {
        stopifnot(R6::is.R6(input_json$`values`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupCurrencyCriteria: the required field `values` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsProductGroupCurrencyCriteria
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `values` is null
      if (is.null(self$`values`)) {
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
      # check if the required `values` is null
      if (is.null(self$`values`)) {
        invalid_fields["values"] <- "Non-nullable required field `values` cannot be null."
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
# CatalogsProductGroupCurrencyCriteria$unlock()
#
## Below is an example to define the print function
# CatalogsProductGroupCurrencyCriteria$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsProductGroupCurrencyCriteria$lock()

