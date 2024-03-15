#' Create a new CatalogsProductGroupPricingCurrencyCriteria
#'
#' @description
#' CatalogsProductGroupPricingCurrencyCriteria Class
#'
#' @docType class
#' @title CatalogsProductGroupPricingCurrencyCriteria
#' @description CatalogsProductGroupPricingCurrencyCriteria Class
#' @format An \code{R6Class} generator object
#' @field operator  character
#' @field value  numeric
#' @field currency  \link{NonNullableCatalogsCurrency}
#' @field negated  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupPricingCurrencyCriteria <- R6::R6Class(
  "CatalogsProductGroupPricingCurrencyCriteria",
  public = list(
    `operator` = NULL,
    `value` = NULL,
    `currency` = NULL,
    `negated` = NULL,
    #' Initialize a new CatalogsProductGroupPricingCurrencyCriteria class.
    #'
    #' @description
    #' Initialize a new CatalogsProductGroupPricingCurrencyCriteria class.
    #'
    #' @param operator operator
    #' @param value value
    #' @param currency currency
    #' @param negated negated. Default to FALSE.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`operator`, `value`, `currency`, `negated` = FALSE, ...) {
      if (!missing(`operator`)) {
        if (!(`operator` %in% c("GREATER_THAN", "GREATER_THAN_OR_EQUALS", "LESS_THAN", "LESS_THAN_OR_EQUALS"))) {
          stop(paste("Error! \"", `operator`, "\" cannot be assigned to `operator`. Must be \"GREATER_THAN\", \"GREATER_THAN_OR_EQUALS\", \"LESS_THAN\", \"LESS_THAN_OR_EQUALS\".", sep = ""))
        }
        if (!(is.character(`operator`) && length(`operator`) == 1)) {
          stop(paste("Error! Invalid data for `operator`. Must be a string:", `operator`))
        }
        self$`operator` <- `operator`
      }
      if (!missing(`value`)) {
        self$`value` <- `value`
      }
      if (!missing(`currency`)) {
        if (!(`currency` %in% c())) {
          stop(paste("Error! \"", `currency`, "\" cannot be assigned to `currency`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currency`))
        self$`currency` <- `currency`
      }
      if (!is.null(`negated`)) {
        if (!(is.logical(`negated`) && length(`negated`) == 1)) {
          stop(paste("Error! Invalid data for `negated`. Must be a boolean:", `negated`))
        }
        self$`negated` <- `negated`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductGroupPricingCurrencyCriteria in JSON format
    #' @export
    toJSON = function() {
      CatalogsProductGroupPricingCurrencyCriteriaObject <- list()
      if (!is.null(self$`operator`)) {
        CatalogsProductGroupPricingCurrencyCriteriaObject[["operator"]] <-
          self$`operator`
      }
      if (!is.null(self$`value`)) {
        CatalogsProductGroupPricingCurrencyCriteriaObject[["value"]] <-
          self$`value`
      }
      if (!is.null(self$`currency`)) {
        CatalogsProductGroupPricingCurrencyCriteriaObject[["currency"]] <-
          self$`currency`$toJSON()
      }
      if (!is.null(self$`negated`)) {
        CatalogsProductGroupPricingCurrencyCriteriaObject[["negated"]] <-
          self$`negated`
      }
      CatalogsProductGroupPricingCurrencyCriteriaObject
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroupPricingCurrencyCriteria
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupPricingCurrencyCriteria
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupPricingCurrencyCriteria
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`operator`)) {
        if (!is.null(this_object$`operator`) && !(this_object$`operator` %in% c("GREATER_THAN", "GREATER_THAN_OR_EQUALS", "LESS_THAN", "LESS_THAN_OR_EQUALS"))) {
          stop(paste("Error! \"", this_object$`operator`, "\" cannot be assigned to `operator`. Must be \"GREATER_THAN\", \"GREATER_THAN_OR_EQUALS\", \"LESS_THAN\", \"LESS_THAN_OR_EQUALS\".", sep = ""))
        }
        self$`operator` <- this_object$`operator`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      if (!is.null(this_object$`currency`)) {
        `currency_object` <- NonNullableCatalogsCurrency$new()
        `currency_object`$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
        self$`currency` <- `currency_object`
      }
      if (!is.null(this_object$`negated`)) {
        self$`negated` <- this_object$`negated`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductGroupPricingCurrencyCriteria in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`operator`)) {
          sprintf(
          '"operator":
            "%s"
                    ',
          self$`operator`
          )
        },
        if (!is.null(self$`value`)) {
          sprintf(
          '"value":
            %d
                    ',
          self$`value`
          )
        },
        if (!is.null(self$`currency`)) {
          sprintf(
          '"currency":
          %s
          ',
          jsonlite::toJSON(self$`currency`$toJSON(), auto_unbox = TRUE, digits = NA)
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
    #' Deserialize JSON string into an instance of CatalogsProductGroupPricingCurrencyCriteria
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupPricingCurrencyCriteria
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupPricingCurrencyCriteria
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`operator`) && !(this_object$`operator` %in% c("GREATER_THAN", "GREATER_THAN_OR_EQUALS", "LESS_THAN", "LESS_THAN_OR_EQUALS"))) {
        stop(paste("Error! \"", this_object$`operator`, "\" cannot be assigned to `operator`. Must be \"GREATER_THAN\", \"GREATER_THAN_OR_EQUALS\", \"LESS_THAN\", \"LESS_THAN_OR_EQUALS\".", sep = ""))
      }
      self$`operator` <- this_object$`operator`
      self$`value` <- this_object$`value`
      self$`currency` <- NonNullableCatalogsCurrency$new()$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
      self$`negated` <- this_object$`negated`
      self
    },
    #' Validate JSON input with respect to CatalogsProductGroupPricingCurrencyCriteria
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsProductGroupPricingCurrencyCriteria and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `operator`
      if (!is.null(input_json$`operator`)) {
        if (!(is.character(input_json$`operator`) && length(input_json$`operator`) == 1)) {
          stop(paste("Error! Invalid data for `operator`. Must be a string:", input_json$`operator`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupPricingCurrencyCriteria: the required field `operator` is missing."))
      }
      # check the required field `value`
      if (!is.null(input_json$`value`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupPricingCurrencyCriteria: the required field `value` is missing."))
      }
      # check the required field `currency`
      if (!is.null(input_json$`currency`)) {
        stopifnot(R6::is.R6(input_json$`currency`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupPricingCurrencyCriteria: the required field `currency` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsProductGroupPricingCurrencyCriteria
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
      # check if the required `operator` is null
      if (is.null(self$`operator`)) {
        return(FALSE)
      }

      # check if the required `value` is null
      if (is.null(self$`value`)) {
        return(FALSE)
      }

      if (self$`value` < 0) {
        return(FALSE)
      }

      # check if the required `currency` is null
      if (is.null(self$`currency`)) {
        return(FALSE)
      }

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
      # check if the required `operator` is null
      if (is.null(self$`operator`)) {
        invalid_fields["operator"] <- "Non-nullable required field `operator` cannot be null."
      }

      # check if the required `value` is null
      if (is.null(self$`value`)) {
        invalid_fields["value"] <- "Non-nullable required field `value` cannot be null."
      }

      if (self$`value` < 0) {
        invalid_fields["value"] <- "Invalid value for `value`, must be bigger than or equal to 0."
      }

      # check if the required `currency` is null
      if (is.null(self$`currency`)) {
        invalid_fields["currency"] <- "Non-nullable required field `currency` cannot be null."
      }

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
# CatalogsProductGroupPricingCurrencyCriteria$unlock()
#
## Below is an example to define the print function
# CatalogsProductGroupPricingCurrencyCriteria$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsProductGroupPricingCurrencyCriteria$lock()

