#' Create a new CatalogsProductGroupPricingCriteria
#'
#' @description
#' CatalogsProductGroupPricingCriteria Class
#'
#' @docType class
#' @title CatalogsProductGroupPricingCriteria
#' @description CatalogsProductGroupPricingCriteria Class
#' @format An \code{R6Class} generator object
#' @field inclusion  character [optional]
#' @field values  numeric
#' @field negated  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupPricingCriteria <- R6::R6Class(
  "CatalogsProductGroupPricingCriteria",
  public = list(
    `inclusion` = NULL,
    `values` = NULL,
    `negated` = NULL,

    #' @description
    #' Initialize a new CatalogsProductGroupPricingCriteria class.
    #'
    #' @param values values
    #' @param inclusion inclusion. Default to TRUE.
    #' @param negated negated. Default to FALSE.
    #' @param ... Other optional arguments.
    initialize = function(`values`, `inclusion` = TRUE, `negated` = FALSE, ...) {
      if (!missing(`values`)) {
        self$`values` <- `values`
      }
      if (!is.null(`inclusion`)) {
        if (!(is.logical(`inclusion`) && length(`inclusion`) == 1)) {
          stop(paste("Error! Invalid data for `inclusion`. Must be a boolean:", `inclusion`))
        }
        self$`inclusion` <- `inclusion`
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
    #' @return CatalogsProductGroupPricingCriteria in JSON format
    toJSON = function() {
      CatalogsProductGroupPricingCriteriaObject <- list()
      if (!is.null(self$`inclusion`)) {
        CatalogsProductGroupPricingCriteriaObject[["inclusion"]] <-
          self$`inclusion`
      }
      if (!is.null(self$`values`)) {
        CatalogsProductGroupPricingCriteriaObject[["values"]] <-
          self$`values`
      }
      if (!is.null(self$`negated`)) {
        CatalogsProductGroupPricingCriteriaObject[["negated"]] <-
          self$`negated`
      }
      CatalogsProductGroupPricingCriteriaObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupPricingCriteria
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupPricingCriteria
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`inclusion`)) {
        self$`inclusion` <- this_object$`inclusion`
      }
      if (!is.null(this_object$`values`)) {
        self$`values` <- this_object$`values`
      }
      if (!is.null(this_object$`negated`)) {
        self$`negated` <- this_object$`negated`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductGroupPricingCriteria in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`inclusion`)) {
          sprintf(
          '"inclusion":
            %s
                    ',
          tolower(self$`inclusion`)
          )
        },
        if (!is.null(self$`values`)) {
          sprintf(
          '"values":
            %d
                    ',
          self$`values`
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
    #' Deserialize JSON string into an instance of CatalogsProductGroupPricingCriteria
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupPricingCriteria
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`inclusion` <- this_object$`inclusion`
      self$`values` <- this_object$`values`
      self$`negated` <- this_object$`negated`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsProductGroupPricingCriteria and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `values`
      if (!is.null(input_json$`values`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupPricingCriteria: the required field `values` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsProductGroupPricingCriteria
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

      if (self$`values` < 0) {
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

      if (self$`values` < 0) {
        invalid_fields["values"] <- "Invalid value for `values`, must be bigger than or equal to 0."
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
# CatalogsProductGroupPricingCriteria$unlock()
#
## Below is an example to define the print function
# CatalogsProductGroupPricingCriteria$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsProductGroupPricingCriteria$lock()

