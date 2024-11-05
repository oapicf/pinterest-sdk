#' Create a new CreateAssetAccessRequestErrorMessageInner
#'
#' @description
#' CreateAssetAccessRequestErrorMessageInner Class
#'
#' @docType class
#' @title CreateAssetAccessRequestErrorMessageInner
#' @description CreateAssetAccessRequestErrorMessageInner Class
#' @format An \code{R6Class} generator object
#' @field code Error code associated with the error in requesting asset access. integer [optional]
#' @field messages  list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateAssetAccessRequestErrorMessageInner <- R6::R6Class(
  "CreateAssetAccessRequestErrorMessageInner",
  public = list(
    `code` = NULL,
    `messages` = NULL,

    #' @description
    #' Initialize a new CreateAssetAccessRequestErrorMessageInner class.
    #'
    #' @param code Error code associated with the error in requesting asset access.
    #' @param messages messages
    #' @param ... Other optional arguments.
    initialize = function(`code` = NULL, `messages` = NULL, ...) {
      if (!is.null(`code`)) {
        if (!(is.numeric(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be an integer:", `code`))
        }
        self$`code` <- `code`
      }
      if (!is.null(`messages`)) {
        stopifnot(is.vector(`messages`), length(`messages`) != 0)
        sapply(`messages`, function(x) stopifnot(is.character(x)))
        self$`messages` <- `messages`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateAssetAccessRequestErrorMessageInner in JSON format
    toJSON = function() {
      CreateAssetAccessRequestErrorMessageInnerObject <- list()
      if (!is.null(self$`code`)) {
        CreateAssetAccessRequestErrorMessageInnerObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`messages`)) {
        CreateAssetAccessRequestErrorMessageInnerObject[["messages"]] <-
          self$`messages`
      }
      CreateAssetAccessRequestErrorMessageInnerObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssetAccessRequestErrorMessageInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssetAccessRequestErrorMessageInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`messages`)) {
        self$`messages` <- ApiClient$new()$deserializeObj(this_object$`messages`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateAssetAccessRequestErrorMessageInner in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`code`)) {
          sprintf(
          '"code":
            %d
                    ',
          self$`code`
          )
        },
        if (!is.null(self$`messages`)) {
          sprintf(
          '"messages":
             [%s]
          ',
          paste(unlist(lapply(self$`messages`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssetAccessRequestErrorMessageInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssetAccessRequestErrorMessageInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code` <- this_object$`code`
      self$`messages` <- ApiClient$new()$deserializeObj(this_object$`messages`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateAssetAccessRequestErrorMessageInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateAssetAccessRequestErrorMessageInner
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
# CreateAssetAccessRequestErrorMessageInner$unlock()
#
## Below is an example to define the print function
# CreateAssetAccessRequestErrorMessageInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateAssetAccessRequestErrorMessageInner$lock()

