#' Create a new TargetingSpecOperationAgeBucket
#'
#' @description
#' TargetingSpecOperationAgeBucket Class
#'
#' @docType class
#' @title TargetingSpecOperationAgeBucket
#' @description TargetingSpecOperationAgeBucket Class
#' @format An \code{R6Class} generator object
#' @field field  character
#' @field operation  character
#' @field values  list(\link{TargetingSpecAgeBucket})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TargetingSpecOperationAgeBucket <- R6::R6Class(
  "TargetingSpecOperationAgeBucket",
  public = list(
    `field` = NULL,
    `operation` = NULL,
    `values` = NULL,

    #' @description
    #' Initialize a new TargetingSpecOperationAgeBucket class.
    #'
    #' @param field field
    #' @param operation operation
    #' @param values values
    #' @param ... Other optional arguments.
    initialize = function(`field`, `operation`, `values`, ...) {
      if (!missing(`field`)) {
        if (!(`field` %in% c("AGE_BUCKET"))) {
          stop(paste("Error! \"", `field`, "\" cannot be assigned to `field`. Must be \"AGE_BUCKET\".", sep = ""))
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
      if (!missing(`values`)) {
        stopifnot(is.vector(`values`), length(`values`) != 0)
        sapply(`values`, function(x) stopifnot(R6::is.R6(x)))
        self$`values` <- `values`
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
    #' @return TargetingSpecOperationAgeBucket as a base R list.
    #' @examples
    #' # convert array of TargetingSpecOperationAgeBucket (x) to a data frame
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
    #' Convert TargetingSpecOperationAgeBucket to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TargetingSpecOperationAgeBucketObject <- list()
      if (!is.null(self$`field`)) {
        TargetingSpecOperationAgeBucketObject[["field"]] <-
          self$`field`
      }
      if (!is.null(self$`operation`)) {
        TargetingSpecOperationAgeBucketObject[["operation"]] <-
          self$`operation`
      }
      if (!is.null(self$`values`)) {
        TargetingSpecOperationAgeBucketObject[["values"]] <-
          lapply(self$`values`, function(x) x$toSimpleType())
      }
      return(TargetingSpecOperationAgeBucketObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingSpecOperationAgeBucket
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingSpecOperationAgeBucket
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`field`)) {
        if (!is.null(this_object$`field`) && !(this_object$`field` %in% c("AGE_BUCKET"))) {
          stop(paste("Error! \"", this_object$`field`, "\" cannot be assigned to `field`. Must be \"AGE_BUCKET\".", sep = ""))
        }
        self$`field` <- this_object$`field`
      }
      if (!is.null(this_object$`operation`)) {
        if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("SET"))) {
          stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"SET\".", sep = ""))
        }
        self$`operation` <- this_object$`operation`
      }
      if (!is.null(this_object$`values`)) {
        self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[TargetingSpecAgeBucket]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TargetingSpecOperationAgeBucket in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingSpecOperationAgeBucket
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingSpecOperationAgeBucket
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`field`) && !(this_object$`field` %in% c("AGE_BUCKET"))) {
        stop(paste("Error! \"", this_object$`field`, "\" cannot be assigned to `field`. Must be \"AGE_BUCKET\".", sep = ""))
      }
      self$`field` <- this_object$`field`
      if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("SET"))) {
        stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"SET\".", sep = ""))
      }
      self$`operation` <- this_object$`operation`
      self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[TargetingSpecAgeBucket]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to TargetingSpecOperationAgeBucket and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for TargetingSpecOperationAgeBucket: the required field `field` is missing."))
      }
      # check the required field `operation`
      if (!is.null(input_json$`operation`)) {
        if (!(is.character(input_json$`operation`) && length(input_json$`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", input_json$`operation`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TargetingSpecOperationAgeBucket: the required field `operation` is missing."))
      }
      # check the required field `values`
      if (!is.null(input_json$`values`)) {
        stopifnot(is.vector(input_json$`values`), length(input_json$`values`) != 0)
        tmp <- sapply(input_json$`values`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TargetingSpecOperationAgeBucket: the required field `values` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TargetingSpecOperationAgeBucket
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
# TargetingSpecOperationAgeBucket$unlock()
#
## Below is an example to define the print function
# TargetingSpecOperationAgeBucket$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TargetingSpecOperationAgeBucket$lock()

