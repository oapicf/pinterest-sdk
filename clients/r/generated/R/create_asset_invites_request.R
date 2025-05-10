#' Create a new CreateAssetInvitesRequest
#'
#' @description
#' Request body for updating asset roles for existing invites.
#'
#' @docType class
#' @title CreateAssetInvitesRequest
#' @description CreateAssetInvitesRequest Class
#' @format An \code{R6Class} generator object
#' @field invites  list(\link{CreateAssetInvitesRequestItem})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateAssetInvitesRequest <- R6::R6Class(
  "CreateAssetInvitesRequest",
  public = list(
    `invites` = NULL,

    #' @description
    #' Initialize a new CreateAssetInvitesRequest class.
    #'
    #' @param invites invites
    #' @param ... Other optional arguments.
    initialize = function(`invites`, ...) {
      if (!missing(`invites`)) {
        stopifnot(is.vector(`invites`), length(`invites`) != 0)
        sapply(`invites`, function(x) stopifnot(R6::is.R6(x)))
        self$`invites` <- `invites`
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
    #' @return CreateAssetInvitesRequest as a base R list.
    #' @examples
    #' # convert array of CreateAssetInvitesRequest (x) to a data frame
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
    #' Convert CreateAssetInvitesRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateAssetInvitesRequestObject <- list()
      if (!is.null(self$`invites`)) {
        CreateAssetInvitesRequestObject[["invites"]] <-
          lapply(self$`invites`, function(x) x$toSimpleType())
      }
      return(CreateAssetInvitesRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssetInvitesRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssetInvitesRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`invites`)) {
        self$`invites` <- ApiClient$new()$deserializeObj(this_object$`invites`, "array[CreateAssetInvitesRequestItem]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateAssetInvitesRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssetInvitesRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssetInvitesRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`invites` <- ApiClient$new()$deserializeObj(this_object$`invites`, "array[CreateAssetInvitesRequestItem]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateAssetInvitesRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `invites`
      if (!is.null(input_json$`invites`)) {
        stopifnot(is.vector(input_json$`invites`), length(input_json$`invites`) != 0)
        tmp <- sapply(input_json$`invites`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateAssetInvitesRequest: the required field `invites` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateAssetInvitesRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `invites` is null
      if (is.null(self$`invites`)) {
        return(FALSE)
      }

      if (length(self$`invites`) > 50) {
        return(FALSE)
      }
      if (length(self$`invites`) < 1) {
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
      # check if the required `invites` is null
      if (is.null(self$`invites`)) {
        invalid_fields["invites"] <- "Non-nullable required field `invites` cannot be null."
      }

      if (length(self$`invites`) > 50) {
        invalid_fields["invites"] <- "Invalid length for `invites`, number of items must be less than or equal to 50."
      }
      if (length(self$`invites`) < 1) {
        invalid_fields["invites"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# CreateAssetInvitesRequest$unlock()
#
## Below is an example to define the print function
# CreateAssetInvitesRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateAssetInvitesRequest$lock()

