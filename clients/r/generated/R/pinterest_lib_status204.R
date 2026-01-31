#' Create a new PinterestLibStatus204
#'
#' @description
#' The resource was successfully deleted.
#'
#' @docType class
#' @title PinterestLibStatus204
#' @description PinterestLibStatus204 Class
#' @format An \code{R6Class} generator object
#' @field statusCode  numeric
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinterestLibStatus204 <- R6::R6Class(
  "PinterestLibStatus204",
  public = list(
    `statusCode` = NULL,

    #' @description
    #' Initialize a new PinterestLibStatus204 class.
    #'
    #' @param statusCode statusCode
    #' @param ... Other optional arguments.
    initialize = function(`statusCode`, ...) {
      if (!missing(`statusCode`)) {
        if (!(`statusCode` %in% c("204"))) {
          stop(paste("Error! \"", `statusCode`, "\" cannot be assigned to `statusCode`. Must be \"204\".", sep = ""))
        }
        self$`statusCode` <- `statusCode`
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
    #' @return PinterestLibStatus204 as a base R list.
    #' @examples
    #' # convert array of PinterestLibStatus204 (x) to a data frame
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
    #' Convert PinterestLibStatus204 to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PinterestLibStatus204Object <- list()
      if (!is.null(self$`statusCode`)) {
        PinterestLibStatus204Object[["statusCode"]] <-
          self$`statusCode`
      }
      return(PinterestLibStatus204Object)
    },

    #' @description
    #' Deserialize JSON string into an instance of PinterestLibStatus204
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinterestLibStatus204
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`statusCode`)) {
        if (!is.null(this_object$`statusCode`) && !(this_object$`statusCode` %in% c("204"))) {
          stop(paste("Error! \"", this_object$`statusCode`, "\" cannot be assigned to `statusCode`. Must be \"204\".", sep = ""))
        }
        self$`statusCode` <- this_object$`statusCode`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PinterestLibStatus204 in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PinterestLibStatus204
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinterestLibStatus204
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`statusCode`) && !(this_object$`statusCode` %in% c("204"))) {
        stop(paste("Error! \"", this_object$`statusCode`, "\" cannot be assigned to `statusCode`. Must be \"204\".", sep = ""))
      }
      self$`statusCode` <- this_object$`statusCode`
      self
    },

    #' @description
    #' Validate JSON input with respect to PinterestLibStatus204 and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `statusCode`
      if (!is.null(input_json$`statusCode`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinterestLibStatus204: the required field `statusCode` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinterestLibStatus204
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `statusCode` is null
      if (is.null(self$`statusCode`)) {
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
      # check if the required `statusCode` is null
      if (is.null(self$`statusCode`)) {
        invalid_fields["statusCode"] <- "Non-nullable required field `statusCode` cannot be null."
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
# PinterestLibStatus204$unlock()
#
## Below is an example to define the print function
# PinterestLibStatus204$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinterestLibStatus204$lock()

