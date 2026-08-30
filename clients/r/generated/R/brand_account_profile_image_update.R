#' Create a new BrandAccountProfileImageUpdate
#'
#' @description
#' Base64-encoded image media source
#'
#' @docType class
#' @title BrandAccountProfileImageUpdate
#' @description BrandAccountProfileImageUpdate Class
#' @format An \code{R6Class} generator object
#' @field content_type  character [optional]
#' @field data  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BrandAccountProfileImageUpdate <- R6::R6Class(
  "BrandAccountProfileImageUpdate",
  public = list(
    `content_type` = NULL,
    `data` = NULL,

    #' @description
    #' Initialize a new BrandAccountProfileImageUpdate class.
    #'
    #' @param content_type content_type
    #' @param data data
    #' @param ... Other optional arguments.
    initialize = function(`content_type` = NULL, `data` = NULL, ...) {
      if (!is.null(`content_type`)) {
        if (!(`content_type` %in% c("image/jpeg", "image/png"))) {
          stop(paste("Error! \"", `content_type`, "\" cannot be assigned to `content_type`. Must be \"image/jpeg\", \"image/png\".", sep = ""))
        }
        if (!(is.character(`content_type`) && length(`content_type`) == 1)) {
          stop(paste("Error! Invalid data for `content_type`. Must be a string:", `content_type`))
        }
        self$`content_type` <- `content_type`
      }
      if (!is.null(`data`)) {
        if (!(is.character(`data`) && length(`data`) == 1)) {
          stop(paste("Error! Invalid data for `data`. Must be a string:", `data`))
        }
        self$`data` <- `data`
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
    #' @return BrandAccountProfileImageUpdate as a base R list.
    #' @examples
    #' # convert array of BrandAccountProfileImageUpdate (x) to a data frame
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
    #' Convert BrandAccountProfileImageUpdate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BrandAccountProfileImageUpdateObject <- list()
      if (!is.null(self$`content_type`)) {
        BrandAccountProfileImageUpdateObject[["content_type"]] <-
          self$`content_type`
      }
      if (!is.null(self$`data`)) {
        BrandAccountProfileImageUpdateObject[["data"]] <-
          self$`data`
      }
      return(BrandAccountProfileImageUpdateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BrandAccountProfileImageUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BrandAccountProfileImageUpdate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`content_type`)) {
        if (!is.null(this_object$`content_type`) && !(this_object$`content_type` %in% c("image/jpeg", "image/png"))) {
          stop(paste("Error! \"", this_object$`content_type`, "\" cannot be assigned to `content_type`. Must be \"image/jpeg\", \"image/png\".", sep = ""))
        }
        self$`content_type` <- this_object$`content_type`
      }
      if (!is.null(this_object$`data`)) {
        self$`data` <- this_object$`data`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BrandAccountProfileImageUpdate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BrandAccountProfileImageUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BrandAccountProfileImageUpdate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`content_type`) && !(this_object$`content_type` %in% c("image/jpeg", "image/png"))) {
        stop(paste("Error! \"", this_object$`content_type`, "\" cannot be assigned to `content_type`. Must be \"image/jpeg\", \"image/png\".", sep = ""))
      }
      self$`content_type` <- this_object$`content_type`
      self$`data` <- this_object$`data`
      self
    },

    #' @description
    #' Validate JSON input with respect to BrandAccountProfileImageUpdate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BrandAccountProfileImageUpdate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`data`, "[a-zA-Z0-9+/=]+")) {
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
      if (!str_detect(self$`data`, "[a-zA-Z0-9+/=]+")) {
        invalid_fields["data"] <- "Invalid value for `data`, must conform to the pattern [a-zA-Z0-9+/=]+."
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
# BrandAccountProfileImageUpdate$unlock()
#
## Below is an example to define the print function
# BrandAccountProfileImageUpdate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BrandAccountProfileImageUpdate$lock()

