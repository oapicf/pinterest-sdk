#' Create a new UserWebsiteCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title UserWebsiteCreate
#' @description UserWebsiteCreate Class
#' @format An \code{R6Class} generator object
#' @field verification_method Method used to verify website ownership. \link{WebsiteVerificationMethod} [optional]
#' @field website Website with path or domain only character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UserWebsiteCreate <- R6::R6Class(
  "UserWebsiteCreate",
  public = list(
    `verification_method` = NULL,
    `website` = NULL,

    #' @description
    #' Initialize a new UserWebsiteCreate class.
    #'
    #' @param verification_method Method used to verify website ownership.
    #' @param website Website with path or domain only
    #' @param ... Other optional arguments.
    initialize = function(`verification_method` = NULL, `website` = NULL, ...) {
      if (!is.null(`verification_method`)) {
        if (!(`verification_method` %in% c())) {
          stop(paste("Error! \"", `verification_method`, "\" cannot be assigned to `verification_method`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`verification_method`))
        self$`verification_method` <- `verification_method`
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
    #' @return UserWebsiteCreate as a base R list.
    #' @examples
    #' # convert array of UserWebsiteCreate (x) to a data frame
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
    #' Convert UserWebsiteCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      UserWebsiteCreateObject <- list()
      if (!is.null(self$`verification_method`)) {
        UserWebsiteCreateObject[["verification_method"]] <-
          self$extractSimpleType(self$`verification_method`)
      }
      if (!is.null(self$`website`)) {
        UserWebsiteCreateObject[["website"]] <-
          self$`website`
      }
      return(UserWebsiteCreateObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of UserWebsiteCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserWebsiteCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`verification_method`)) {
        `verification_method_object` <- WebsiteVerificationMethod$new()
        `verification_method_object`$fromJSON(jsonlite::toJSON(this_object$`verification_method`, auto_unbox = TRUE, digits = NA))
        self$`verification_method` <- `verification_method_object`
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
    #' @return UserWebsiteCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of UserWebsiteCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserWebsiteCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`verification_method` <- WebsiteVerificationMethod$new()$fromJSON(jsonlite::toJSON(this_object$`verification_method`, auto_unbox = TRUE, digits = NA))
      self$`website` <- this_object$`website`
      self
    },

    #' @description
    #' Validate JSON input with respect to UserWebsiteCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UserWebsiteCreate
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
# UserWebsiteCreate$unlock()
#
## Below is an example to define the print function
# UserWebsiteCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UserWebsiteCreate$lock()

