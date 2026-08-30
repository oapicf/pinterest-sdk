#' Create a new DeleteBusinessMembershipBody
#'
#' @description
#' List of members with role to delete.
#'
#' @docType class
#' @title DeleteBusinessMembershipBody
#' @description DeleteBusinessMembershipBody Class
#' @format An \code{R6Class} generator object
#' @field members  list(\link{DeleteBusinessMembershipMember})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeleteBusinessMembershipBody <- R6::R6Class(
  "DeleteBusinessMembershipBody",
  public = list(
    `members` = NULL,

    #' @description
    #' Initialize a new DeleteBusinessMembershipBody class.
    #'
    #' @param members members
    #' @param ... Other optional arguments.
    initialize = function(`members`, ...) {
      if (!missing(`members`)) {
        stopifnot(is.vector(`members`), length(`members`) != 0)
        sapply(`members`, function(x) stopifnot(R6::is.R6(x)))
        self$`members` <- `members`
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
    #' @return DeleteBusinessMembershipBody as a base R list.
    #' @examples
    #' # convert array of DeleteBusinessMembershipBody (x) to a data frame
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
    #' Convert DeleteBusinessMembershipBody to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      DeleteBusinessMembershipBodyObject <- list()
      if (!is.null(self$`members`)) {
        DeleteBusinessMembershipBodyObject[["members"]] <-
          self$extractSimpleType(self$`members`)
      }
      return(DeleteBusinessMembershipBodyObject)
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
    #' Deserialize JSON string into an instance of DeleteBusinessMembershipBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteBusinessMembershipBody
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`members`)) {
        self$`members` <- ApiClient$new()$deserializeObj(this_object$`members`, "array[DeleteBusinessMembershipMember]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return DeleteBusinessMembershipBody in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of DeleteBusinessMembershipBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteBusinessMembershipBody
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`members` <- ApiClient$new()$deserializeObj(this_object$`members`, "array[DeleteBusinessMembershipMember]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to DeleteBusinessMembershipBody and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `members`
      if (!is.null(input_json$`members`)) {
        stopifnot(is.vector(input_json$`members`), length(input_json$`members`) != 0)
        tmp <- sapply(input_json$`members`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DeleteBusinessMembershipBody: the required field `members` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeleteBusinessMembershipBody
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `members` is null
      if (is.null(self$`members`)) {
        return(FALSE)
      }

      if (length(self$`members`) > 50) {
        return(FALSE)
      }
      if (length(self$`members`) < 1) {
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
      # check if the required `members` is null
      if (is.null(self$`members`)) {
        invalid_fields["members"] <- "Non-nullable required field `members` cannot be null."
      }

      if (length(self$`members`) > 50) {
        invalid_fields["members"] <- "Invalid length for `members`, number of items must be less than or equal to 50."
      }
      if (length(self$`members`) < 1) {
        invalid_fields["members"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# DeleteBusinessMembershipBody$unlock()
#
## Below is an example to define the print function
# DeleteBusinessMembershipBody$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeleteBusinessMembershipBody$lock()

