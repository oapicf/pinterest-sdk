#' Create a new CatalogsProductGroupMultipleGenderCriteria
#'
#' @description
#' CatalogsProductGroupMultipleGenderCriteria Class
#'
#' @docType class
#' @title CatalogsProductGroupMultipleGenderCriteria
#' @description CatalogsProductGroupMultipleGenderCriteria Class
#' @format An \code{R6Class} generator object
#' @field values  list(\link{Gender})
#' @field negated  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupMultipleGenderCriteria <- R6::R6Class(
  "CatalogsProductGroupMultipleGenderCriteria",
  public = list(
    `values` = NULL,
    `negated` = NULL,
    #' Initialize a new CatalogsProductGroupMultipleGenderCriteria class.
    #'
    #' @description
    #' Initialize a new CatalogsProductGroupMultipleGenderCriteria class.
    #'
    #' @param values values
    #' @param negated negated. Default to FALSE.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`values`, `negated` = FALSE, ...) {
      if (!missing(`values`)) {
        stopifnot(is.vector(`values`), length(`values`) != 0)
        sapply(`values`, function(x) stopifnot(R6::is.R6(x)))
        self$`values` <- `values`
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
    #' @return CatalogsProductGroupMultipleGenderCriteria in JSON format
    #' @export
    toJSON = function() {
      CatalogsProductGroupMultipleGenderCriteriaObject <- list()
      if (!is.null(self$`values`)) {
        CatalogsProductGroupMultipleGenderCriteriaObject[["values"]] <-
          lapply(self$`values`, function(x) x$toJSON())
      }
      if (!is.null(self$`negated`)) {
        CatalogsProductGroupMultipleGenderCriteriaObject[["negated"]] <-
          self$`negated`
      }
      CatalogsProductGroupMultipleGenderCriteriaObject
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroupMultipleGenderCriteria
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupMultipleGenderCriteria
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupMultipleGenderCriteria
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`values`)) {
        self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[Gender]", loadNamespace("openapi"))
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
    #' @return CatalogsProductGroupMultipleGenderCriteria in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`values`)) {
          sprintf(
          '"values":
          [%s]
',
          paste(sapply(self$`values`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
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
    #' Deserialize JSON string into an instance of CatalogsProductGroupMultipleGenderCriteria
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupMultipleGenderCriteria
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupMultipleGenderCriteria
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[Gender]", loadNamespace("openapi"))
      self$`negated` <- this_object$`negated`
      self
    },
    #' Validate JSON input with respect to CatalogsProductGroupMultipleGenderCriteria
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsProductGroupMultipleGenderCriteria and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `values`
      if (!is.null(input_json$`values`)) {
        stopifnot(is.vector(input_json$`values`), length(input_json$`values`) != 0)
        tmp <- sapply(input_json$`values`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupMultipleGenderCriteria: the required field `values` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsProductGroupMultipleGenderCriteria
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
      # check if the required `values` is null
      if (is.null(self$`values`)) {
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
      # check if the required `values` is null
      if (is.null(self$`values`)) {
        invalid_fields["values"] <- "Non-nullable required field `values` cannot be null."
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
# CatalogsProductGroupMultipleGenderCriteria$unlock()
#
## Below is an example to define the print function
# CatalogsProductGroupMultipleGenderCriteria$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsProductGroupMultipleGenderCriteria$lock()

