#' Create a new RecordCounts
#'
#' @description
#' Record processing counts
#'
#' @docType class
#' @title RecordCounts
#' @description RecordCounts Class
#' @format An \code{R6Class} generator object
#' @field invalid Number of invalid records processed integer
#' @field processed Number of records processed integer
#' @field valid Number of valid records processed integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RecordCounts <- R6::R6Class(
  "RecordCounts",
  public = list(
    `invalid` = NULL,
    `processed` = NULL,
    `valid` = NULL,

    #' @description
    #' Initialize a new RecordCounts class.
    #'
    #' @param invalid Number of invalid records processed
    #' @param processed Number of records processed
    #' @param valid Number of valid records processed
    #' @param ... Other optional arguments.
    initialize = function(`invalid`, `processed`, `valid`, ...) {
      if (!missing(`invalid`)) {
        if (!(is.numeric(`invalid`) && length(`invalid`) == 1)) {
          stop(paste("Error! Invalid data for `invalid`. Must be an integer:", `invalid`))
        }
        self$`invalid` <- `invalid`
      }
      if (!missing(`processed`)) {
        if (!(is.numeric(`processed`) && length(`processed`) == 1)) {
          stop(paste("Error! Invalid data for `processed`. Must be an integer:", `processed`))
        }
        self$`processed` <- `processed`
      }
      if (!missing(`valid`)) {
        if (!(is.numeric(`valid`) && length(`valid`) == 1)) {
          stop(paste("Error! Invalid data for `valid`. Must be an integer:", `valid`))
        }
        self$`valid` <- `valid`
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
    #' @return RecordCounts as a base R list.
    #' @examples
    #' # convert array of RecordCounts (x) to a data frame
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
    #' Convert RecordCounts to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RecordCountsObject <- list()
      if (!is.null(self$`invalid`)) {
        RecordCountsObject[["invalid"]] <-
          self$`invalid`
      }
      if (!is.null(self$`processed`)) {
        RecordCountsObject[["processed"]] <-
          self$`processed`
      }
      if (!is.null(self$`valid`)) {
        RecordCountsObject[["valid"]] <-
          self$`valid`
      }
      return(RecordCountsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RecordCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of RecordCounts
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`invalid`)) {
        self$`invalid` <- this_object$`invalid`
      }
      if (!is.null(this_object$`processed`)) {
        self$`processed` <- this_object$`processed`
      }
      if (!is.null(this_object$`valid`)) {
        self$`valid` <- this_object$`valid`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RecordCounts in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RecordCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of RecordCounts
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`invalid` <- this_object$`invalid`
      self$`processed` <- this_object$`processed`
      self$`valid` <- this_object$`valid`
      self
    },

    #' @description
    #' Validate JSON input with respect to RecordCounts and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `invalid`
      if (!is.null(input_json$`invalid`)) {
        if (!(is.numeric(input_json$`invalid`) && length(input_json$`invalid`) == 1)) {
          stop(paste("Error! Invalid data for `invalid`. Must be an integer:", input_json$`invalid`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RecordCounts: the required field `invalid` is missing."))
      }
      # check the required field `processed`
      if (!is.null(input_json$`processed`)) {
        if (!(is.numeric(input_json$`processed`) && length(input_json$`processed`) == 1)) {
          stop(paste("Error! Invalid data for `processed`. Must be an integer:", input_json$`processed`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RecordCounts: the required field `processed` is missing."))
      }
      # check the required field `valid`
      if (!is.null(input_json$`valid`)) {
        if (!(is.numeric(input_json$`valid`) && length(input_json$`valid`) == 1)) {
          stop(paste("Error! Invalid data for `valid`. Must be an integer:", input_json$`valid`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RecordCounts: the required field `valid` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RecordCounts
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `invalid` is null
      if (is.null(self$`invalid`)) {
        return(FALSE)
      }

      # check if the required `processed` is null
      if (is.null(self$`processed`)) {
        return(FALSE)
      }

      # check if the required `valid` is null
      if (is.null(self$`valid`)) {
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
      # check if the required `invalid` is null
      if (is.null(self$`invalid`)) {
        invalid_fields["invalid"] <- "Non-nullable required field `invalid` cannot be null."
      }

      # check if the required `processed` is null
      if (is.null(self$`processed`)) {
        invalid_fields["processed"] <- "Non-nullable required field `processed` cannot be null."
      }

      # check if the required `valid` is null
      if (is.null(self$`valid`)) {
        invalid_fields["valid"] <- "Non-nullable required field `valid` cannot be null."
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
# RecordCounts$unlock()
#
## Below is an example to define the print function
# RecordCounts$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RecordCounts$lock()

