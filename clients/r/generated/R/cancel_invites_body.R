#' Create a new CancelInvitesBody
#'
#' @description
#' Request body used to cancel invites
#'
#' @docType class
#' @title CancelInvitesBody
#' @description CancelInvitesBody Class
#' @format An \code{R6Class} generator object
#' @field invite_ids List of invite/request ids to be cancelled list(character)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CancelInvitesBody <- R6::R6Class(
  "CancelInvitesBody",
  public = list(
    `invite_ids` = NULL,

    #' @description
    #' Initialize a new CancelInvitesBody class.
    #'
    #' @param invite_ids List of invite/request ids to be cancelled
    #' @param ... Other optional arguments.
    initialize = function(`invite_ids`, ...) {
      if (!missing(`invite_ids`)) {
        stopifnot(is.vector(`invite_ids`), length(`invite_ids`) != 0)
        sapply(`invite_ids`, function(x) stopifnot(is.character(x)))
        self$`invite_ids` <- `invite_ids`
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
    #' @return CancelInvitesBody as a base R list.
    #' @examples
    #' # convert array of CancelInvitesBody (x) to a data frame
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
    #' Convert CancelInvitesBody to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CancelInvitesBodyObject <- list()
      if (!is.null(self$`invite_ids`)) {
        CancelInvitesBodyObject[["invite_ids"]] <-
          self$`invite_ids`
      }
      return(CancelInvitesBodyObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CancelInvitesBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of CancelInvitesBody
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`invite_ids`)) {
        self$`invite_ids` <- ApiClient$new()$deserializeObj(this_object$`invite_ids`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CancelInvitesBody in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CancelInvitesBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of CancelInvitesBody
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`invite_ids` <- ApiClient$new()$deserializeObj(this_object$`invite_ids`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CancelInvitesBody and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `invite_ids`
      if (!is.null(input_json$`invite_ids`)) {
        stopifnot(is.vector(input_json$`invite_ids`), length(input_json$`invite_ids`) != 0)
        tmp <- sapply(input_json$`invite_ids`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CancelInvitesBody: the required field `invite_ids` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CancelInvitesBody
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `invite_ids` is null
      if (is.null(self$`invite_ids`)) {
        return(FALSE)
      }

      if (length(self$`invite_ids`) > 50) {
        return(FALSE)
      }
      if (length(self$`invite_ids`) < 1) {
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
      # check if the required `invite_ids` is null
      if (is.null(self$`invite_ids`)) {
        invalid_fields["invite_ids"] <- "Non-nullable required field `invite_ids` cannot be null."
      }

      if (length(self$`invite_ids`) > 50) {
        invalid_fields["invite_ids"] <- "Invalid length for `invite_ids`, number of items must be less than or equal to 50."
      }
      if (length(self$`invite_ids`) < 1) {
        invalid_fields["invite_ids"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# CancelInvitesBody$unlock()
#
## Below is an example to define the print function
# CancelInvitesBody$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CancelInvitesBody$lock()

