#' Create a new UserWebsiteVerifyRequest
#'
#' @description
#' User website verification request
#'
#' @docType class
#' @title UserWebsiteVerifyRequest
#' @description UserWebsiteVerifyRequest Class
#' @format An \code{R6Class} generator object
#' @field website  character [optional]
#' @field verification_method  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UserWebsiteVerifyRequest <- R6::R6Class(
  "UserWebsiteVerifyRequest",
  public = list(
    `website` = NULL,
    `verification_method` = NULL,

    #' @description
    #' Initialize a new UserWebsiteVerifyRequest class.
    #'
    #' @param website website
    #' @param verification_method verification_method. Default to "METATAG".
    #' @param ... Other optional arguments.
    initialize = function(`website` = NULL, `verification_method` = "METATAG", ...) {
      if (!is.null(`website`)) {
        if (!(is.character(`website`) && length(`website`) == 1)) {
          stop(paste("Error! Invalid data for `website`. Must be a string:", `website`))
        }
        self$`website` <- `website`
      }
      if (!is.null(`verification_method`)) {
        if (!(`verification_method` %in% c("FILENAME", "METATAG", "DNSTXT"))) {
          stop(paste("Error! \"", `verification_method`, "\" cannot be assigned to `verification_method`. Must be \"FILENAME\", \"METATAG\", \"DNSTXT\".", sep = ""))
        }
        if (!(is.character(`verification_method`) && length(`verification_method`) == 1)) {
          stop(paste("Error! Invalid data for `verification_method`. Must be a string:", `verification_method`))
        }
        self$`verification_method` <- `verification_method`
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
    #' @return UserWebsiteVerifyRequest as a base R list.
    #' @examples
    #' # convert array of UserWebsiteVerifyRequest (x) to a data frame
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
    #' Convert UserWebsiteVerifyRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      UserWebsiteVerifyRequestObject <- list()
      if (!is.null(self$`website`)) {
        UserWebsiteVerifyRequestObject[["website"]] <-
          self$`website`
      }
      if (!is.null(self$`verification_method`)) {
        UserWebsiteVerifyRequestObject[["verification_method"]] <-
          self$`verification_method`
      }
      return(UserWebsiteVerifyRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of UserWebsiteVerifyRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserWebsiteVerifyRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`website`)) {
        self$`website` <- this_object$`website`
      }
      if (!is.null(this_object$`verification_method`)) {
        if (!is.null(this_object$`verification_method`) && !(this_object$`verification_method` %in% c("FILENAME", "METATAG", "DNSTXT"))) {
          stop(paste("Error! \"", this_object$`verification_method`, "\" cannot be assigned to `verification_method`. Must be \"FILENAME\", \"METATAG\", \"DNSTXT\".", sep = ""))
        }
        self$`verification_method` <- this_object$`verification_method`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return UserWebsiteVerifyRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of UserWebsiteVerifyRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserWebsiteVerifyRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`website` <- this_object$`website`
      if (!is.null(this_object$`verification_method`) && !(this_object$`verification_method` %in% c("FILENAME", "METATAG", "DNSTXT"))) {
        stop(paste("Error! \"", this_object$`verification_method`, "\" cannot be assigned to `verification_method`. Must be \"FILENAME\", \"METATAG\", \"DNSTXT\".", sep = ""))
      }
      self$`verification_method` <- this_object$`verification_method`
      self
    },

    #' @description
    #' Validate JSON input with respect to UserWebsiteVerifyRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UserWebsiteVerifyRequest
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
# UserWebsiteVerifyRequest$unlock()
#
## Below is an example to define the print function
# UserWebsiteVerifyRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UserWebsiteVerifyRequest$lock()

