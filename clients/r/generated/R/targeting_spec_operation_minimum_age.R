#' Create a new TargetingSpecOperationMinimumAge
#'
#' @description
#' TargetingSpecOperationMinimumAge Class
#'
#' @docType class
#' @title TargetingSpecOperationMinimumAge
#' @description TargetingSpecOperationMinimumAge Class
#' @format An \code{R6Class} generator object
#' @field field  character
#' @field operation  character
#' @field value  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TargetingSpecOperationMinimumAge <- R6::R6Class(
  "TargetingSpecOperationMinimumAge",
  public = list(
    `field` = NULL,
    `operation` = NULL,
    `value` = NULL,

    #' @description
    #' Initialize a new TargetingSpecOperationMinimumAge class.
    #'
    #' @param field field
    #' @param operation operation
    #' @param value value
    #' @param ... Other optional arguments.
    initialize = function(`field`, `operation`, `value`, ...) {
      if (!missing(`field`)) {
        if (!(`field` %in% c("MINIMUM_AGE"))) {
          stop(paste("Error! \"", `field`, "\" cannot be assigned to `field`. Must be \"MINIMUM_AGE\".", sep = ""))
        }
        if (!(is.character(`field`) && length(`field`) == 1)) {
          stop(paste("Error! Invalid data for `field`. Must be a string:", `field`))
        }
        self$`field` <- `field`
      }
      if (!missing(`operation`)) {
        if (!(`operation` %in% c("SET"))) {
          stop(paste("Error! \"", `operation`, "\" cannot be assigned to `operation`. Must be \"SET\".", sep = ""))
        }
        if (!(is.character(`operation`) && length(`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", `operation`))
        }
        self$`operation` <- `operation`
      }
      if (!missing(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
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
    #' @return TargetingSpecOperationMinimumAge as a base R list.
    #' @examples
    #' # convert array of TargetingSpecOperationMinimumAge (x) to a data frame
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
    #' Convert TargetingSpecOperationMinimumAge to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TargetingSpecOperationMinimumAgeObject <- list()
      if (!is.null(self$`field`)) {
        TargetingSpecOperationMinimumAgeObject[["field"]] <-
          self$`field`
      }
      if (!is.null(self$`operation`)) {
        TargetingSpecOperationMinimumAgeObject[["operation"]] <-
          self$`operation`
      }
      if (!is.null(self$`value`)) {
        TargetingSpecOperationMinimumAgeObject[["value"]] <-
          self$`value`
      }
      return(TargetingSpecOperationMinimumAgeObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingSpecOperationMinimumAge
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingSpecOperationMinimumAge
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`field`)) {
        if (!is.null(this_object$`field`) && !(this_object$`field` %in% c("MINIMUM_AGE"))) {
          stop(paste("Error! \"", this_object$`field`, "\" cannot be assigned to `field`. Must be \"MINIMUM_AGE\".", sep = ""))
        }
        self$`field` <- this_object$`field`
      }
      if (!is.null(this_object$`operation`)) {
        if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("SET"))) {
          stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"SET\".", sep = ""))
        }
        self$`operation` <- this_object$`operation`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TargetingSpecOperationMinimumAge in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingSpecOperationMinimumAge
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingSpecOperationMinimumAge
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`field`) && !(this_object$`field` %in% c("MINIMUM_AGE"))) {
        stop(paste("Error! \"", this_object$`field`, "\" cannot be assigned to `field`. Must be \"MINIMUM_AGE\".", sep = ""))
      }
      self$`field` <- this_object$`field`
      if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("SET"))) {
        stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"SET\".", sep = ""))
      }
      self$`operation` <- this_object$`operation`
      self$`value` <- this_object$`value`
      self
    },

    #' @description
    #' Validate JSON input with respect to TargetingSpecOperationMinimumAge and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `field`
      if (!is.null(input_json$`field`)) {
        if (!(is.character(input_json$`field`) && length(input_json$`field`) == 1)) {
          stop(paste("Error! Invalid data for `field`. Must be a string:", input_json$`field`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TargetingSpecOperationMinimumAge: the required field `field` is missing."))
      }
      # check the required field `operation`
      if (!is.null(input_json$`operation`)) {
        if (!(is.character(input_json$`operation`) && length(input_json$`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", input_json$`operation`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TargetingSpecOperationMinimumAge: the required field `operation` is missing."))
      }
      # check the required field `value`
      if (!is.null(input_json$`value`)) {
        if (!(is.character(input_json$`value`) && length(input_json$`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", input_json$`value`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TargetingSpecOperationMinimumAge: the required field `value` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TargetingSpecOperationMinimumAge
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `field` is null
      if (is.null(self$`field`)) {
        return(FALSE)
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        return(FALSE)
      }

      if (!str_detect(self$`value`, "^\\d+\\+?$")) {
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
      # check if the required `field` is null
      if (is.null(self$`field`)) {
        invalid_fields["field"] <- "Non-nullable required field `field` cannot be null."
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        invalid_fields["operation"] <- "Non-nullable required field `operation` cannot be null."
      }

      if (!str_detect(self$`value`, "^\\d+\\+?$")) {
        invalid_fields["value"] <- "Invalid value for `value`, must conform to the pattern ^\\d+\\+?$."
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
# TargetingSpecOperationMinimumAge$unlock()
#
## Below is an example to define the print function
# TargetingSpecOperationMinimumAge$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TargetingSpecOperationMinimumAge$lock()

