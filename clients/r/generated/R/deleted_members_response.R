#' Create a new DeletedMembersResponse
#'
#' @description
#' An object with a list of members that were deleted.
#'
#' @docType class
#' @title DeletedMembersResponse
#' @description DeletedMembersResponse Class
#' @format An \code{R6Class} generator object
#' @field deleted_members List of members whose business membership have been terminated. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeletedMembersResponse <- R6::R6Class(
  "DeletedMembersResponse",
  public = list(
    `deleted_members` = NULL,

    #' @description
    #' Initialize a new DeletedMembersResponse class.
    #'
    #' @param deleted_members List of members whose business membership have been terminated.
    #' @param ... Other optional arguments.
    initialize = function(`deleted_members` = NULL, ...) {
      if (!is.null(`deleted_members`)) {
        stopifnot(is.vector(`deleted_members`), length(`deleted_members`) != 0)
        sapply(`deleted_members`, function(x) stopifnot(is.character(x)))
        self$`deleted_members` <- `deleted_members`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeletedMembersResponse in JSON format
    toJSON = function() {
      DeletedMembersResponseObject <- list()
      if (!is.null(self$`deleted_members`)) {
        DeletedMembersResponseObject[["deleted_members"]] <-
          self$`deleted_members`
      }
      DeletedMembersResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of DeletedMembersResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeletedMembersResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`deleted_members`)) {
        self$`deleted_members` <- ApiClient$new()$deserializeObj(this_object$`deleted_members`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeletedMembersResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`deleted_members`)) {
          sprintf(
          '"deleted_members":
             [%s]
          ',
          paste(unlist(lapply(self$`deleted_members`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of DeletedMembersResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeletedMembersResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`deleted_members` <- ApiClient$new()$deserializeObj(this_object$`deleted_members`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to DeletedMembersResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeletedMembersResponse
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
# DeletedMembersResponse$unlock()
#
## Below is an example to define the print function
# DeletedMembersResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeletedMembersResponse$lock()

