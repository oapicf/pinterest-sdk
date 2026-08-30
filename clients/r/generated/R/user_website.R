#' Create a new UserWebsite
#'
#' @description
#' UserWebsite Class
#'
#' @docType class
#' @title UserWebsite
#' @description UserWebsite Class
#' @format An \code{R6Class} generator object
#' @field status Status of the verification process character [optional]
#' @field verified_at UTC timestamp when the verification happened - sometimes missing character [optional]
#' @field website Website with path or domain only character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UserWebsite <- R6::R6Class(
  "UserWebsite",
  public = list(
    `status` = NULL,
    `verified_at` = NULL,
    `website` = NULL,

    #' @description
    #' Initialize a new UserWebsite class.
    #'
    #' @param status Status of the verification process
    #' @param verified_at UTC timestamp when the verification happened - sometimes missing
    #' @param website Website with path or domain only
    #' @param ... Other optional arguments.
    initialize = function(`status` = NULL, `verified_at` = NULL, `website` = NULL, ...) {
      if (!is.null(`status`)) {
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!is.null(`verified_at`)) {
        if (!(is.character(`verified_at`) && length(`verified_at`) == 1)) {
          stop(paste("Error! Invalid data for `verified_at`. Must be a string:", `verified_at`))
        }
        self$`verified_at` <- `verified_at`
      }
      if (!is.null(`website`)) {
        if (!(is.character(`website`) && length(`website`) == 1)) {
          stop(paste("Error! Invalid data for `website`. Must be a string:", `website`))
        }
        self$`website` <- `website`
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
    #' @return UserWebsite as a base R list.
    #' @examples
    #' # convert array of UserWebsite (x) to a data frame
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
    #' Convert UserWebsite to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      UserWebsiteObject <- list()
      if (!is.null(self$`status`)) {
        UserWebsiteObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`verified_at`)) {
        UserWebsiteObject[["verified_at"]] <-
          self$`verified_at`
      }
      if (!is.null(self$`website`)) {
        UserWebsiteObject[["website"]] <-
          self$`website`
      }
      return(UserWebsiteObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of UserWebsite
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserWebsite
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`status`)) {
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`verified_at`)) {
        self$`verified_at` <- this_object$`verified_at`
      }
      if (!is.null(this_object$`website`)) {
        self$`website` <- this_object$`website`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return UserWebsite in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of UserWebsite
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserWebsite
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`status` <- this_object$`status`
      self$`verified_at` <- this_object$`verified_at`
      self$`website` <- this_object$`website`
      self
    },

    #' @description
    #' Validate JSON input with respect to UserWebsite and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UserWebsite
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# UserWebsite$unlock()
#
## Below is an example to define the print function
# UserWebsite$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UserWebsite$lock()

