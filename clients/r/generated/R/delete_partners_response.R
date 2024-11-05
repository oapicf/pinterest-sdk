#' Create a new DeletePartnersResponse
#'
#' @description
#' An object with a list of partners that were deleted.
#'
#' @docType class
#' @title DeletePartnersResponse
#' @description DeletePartnersResponse Class
#' @format An \code{R6Class} generator object
#' @field deleted_partners List of partners whose business partnership have been terminated. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeletePartnersResponse <- R6::R6Class(
  "DeletePartnersResponse",
  public = list(
    `deleted_partners` = NULL,

    #' @description
    #' Initialize a new DeletePartnersResponse class.
    #'
    #' @param deleted_partners List of partners whose business partnership have been terminated.
    #' @param ... Other optional arguments.
    initialize = function(`deleted_partners` = NULL, ...) {
      if (!is.null(`deleted_partners`)) {
        stopifnot(is.vector(`deleted_partners`), length(`deleted_partners`) != 0)
        sapply(`deleted_partners`, function(x) stopifnot(is.character(x)))
        self$`deleted_partners` <- `deleted_partners`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeletePartnersResponse in JSON format
    toJSON = function() {
      DeletePartnersResponseObject <- list()
      if (!is.null(self$`deleted_partners`)) {
        DeletePartnersResponseObject[["deleted_partners"]] <-
          self$`deleted_partners`
      }
      DeletePartnersResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of DeletePartnersResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeletePartnersResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`deleted_partners`)) {
        self$`deleted_partners` <- ApiClient$new()$deserializeObj(this_object$`deleted_partners`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeletePartnersResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`deleted_partners`)) {
          sprintf(
          '"deleted_partners":
             [%s]
          ',
          paste(unlist(lapply(self$`deleted_partners`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of DeletePartnersResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeletePartnersResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`deleted_partners` <- ApiClient$new()$deserializeObj(this_object$`deleted_partners`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to DeletePartnersResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeletePartnersResponse
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
# DeletePartnersResponse$unlock()
#
## Below is an example to define the print function
# DeletePartnersResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeletePartnersResponse$lock()

