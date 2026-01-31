#' Create a new S3FilePart
#'
#' @description
#' S3FilePart Class
#'
#' @docType class
#' @title S3FilePart
#' @description S3FilePart Class
#' @format An \code{R6Class} generator object
#' @field part_number Part number for upload. integer
#' @field presigned_url Pre-signed URL. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
S3FilePart <- R6::R6Class(
  "S3FilePart",
  public = list(
    `part_number` = NULL,
    `presigned_url` = NULL,

    #' @description
    #' Initialize a new S3FilePart class.
    #'
    #' @param part_number Part number for upload.
    #' @param presigned_url Pre-signed URL.
    #' @param ... Other optional arguments.
    initialize = function(`part_number`, `presigned_url`, ...) {
      if (!missing(`part_number`)) {
        if (!(is.numeric(`part_number`) && length(`part_number`) == 1)) {
          stop(paste("Error! Invalid data for `part_number`. Must be an integer:", `part_number`))
        }
        self$`part_number` <- `part_number`
      }
      if (!missing(`presigned_url`)) {
        if (!(is.character(`presigned_url`) && length(`presigned_url`) == 1)) {
          stop(paste("Error! Invalid data for `presigned_url`. Must be a string:", `presigned_url`))
        }
        self$`presigned_url` <- `presigned_url`
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
    #' @return S3FilePart as a base R list.
    #' @examples
    #' # convert array of S3FilePart (x) to a data frame
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
    #' Convert S3FilePart to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      S3FilePartObject <- list()
      if (!is.null(self$`part_number`)) {
        S3FilePartObject[["part_number"]] <-
          self$`part_number`
      }
      if (!is.null(self$`presigned_url`)) {
        S3FilePartObject[["presigned_url"]] <-
          self$`presigned_url`
      }
      return(S3FilePartObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of S3FilePart
    #'
    #' @param input_json the JSON input
    #' @return the instance of S3FilePart
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`part_number`)) {
        self$`part_number` <- this_object$`part_number`
      }
      if (!is.null(this_object$`presigned_url`)) {
        self$`presigned_url` <- this_object$`presigned_url`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return S3FilePart in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of S3FilePart
    #'
    #' @param input_json the JSON input
    #' @return the instance of S3FilePart
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`part_number` <- this_object$`part_number`
      self$`presigned_url` <- this_object$`presigned_url`
      self
    },

    #' @description
    #' Validate JSON input with respect to S3FilePart and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `part_number`
      if (!is.null(input_json$`part_number`)) {
        if (!(is.numeric(input_json$`part_number`) && length(input_json$`part_number`) == 1)) {
          stop(paste("Error! Invalid data for `part_number`. Must be an integer:", input_json$`part_number`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for S3FilePart: the required field `part_number` is missing."))
      }
      # check the required field `presigned_url`
      if (!is.null(input_json$`presigned_url`)) {
        if (!(is.character(input_json$`presigned_url`) && length(input_json$`presigned_url`) == 1)) {
          stop(paste("Error! Invalid data for `presigned_url`. Must be a string:", input_json$`presigned_url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for S3FilePart: the required field `presigned_url` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of S3FilePart
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `part_number` is null
      if (is.null(self$`part_number`)) {
        return(FALSE)
      }

      # check if the required `presigned_url` is null
      if (is.null(self$`presigned_url`)) {
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
      # check if the required `part_number` is null
      if (is.null(self$`part_number`)) {
        invalid_fields["part_number"] <- "Non-nullable required field `part_number` cannot be null."
      }

      # check if the required `presigned_url` is null
      if (is.null(self$`presigned_url`)) {
        invalid_fields["presigned_url"] <- "Non-nullable required field `presigned_url` cannot be null."
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
# S3FilePart$unlock()
#
## Below is an example to define the print function
# S3FilePart$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# S3FilePart$lock()

