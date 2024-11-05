#' Create a new DeleteAssetGroupBody
#'
#' @description
#' Request body used to delete asset groups
#'
#' @docType class
#' @title DeleteAssetGroupBody
#' @description DeleteAssetGroupBody Class
#' @format An \code{R6Class} generator object
#' @field asset_groups_to_delete List of ids of asset groups to be deleted list(character)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeleteAssetGroupBody <- R6::R6Class(
  "DeleteAssetGroupBody",
  public = list(
    `asset_groups_to_delete` = NULL,

    #' @description
    #' Initialize a new DeleteAssetGroupBody class.
    #'
    #' @param asset_groups_to_delete List of ids of asset groups to be deleted
    #' @param ... Other optional arguments.
    initialize = function(`asset_groups_to_delete`, ...) {
      if (!missing(`asset_groups_to_delete`)) {
        stopifnot(is.vector(`asset_groups_to_delete`), length(`asset_groups_to_delete`) != 0)
        sapply(`asset_groups_to_delete`, function(x) stopifnot(is.character(x)))
        self$`asset_groups_to_delete` <- `asset_groups_to_delete`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeleteAssetGroupBody in JSON format
    toJSON = function() {
      DeleteAssetGroupBodyObject <- list()
      if (!is.null(self$`asset_groups_to_delete`)) {
        DeleteAssetGroupBodyObject[["asset_groups_to_delete"]] <-
          self$`asset_groups_to_delete`
      }
      DeleteAssetGroupBodyObject
    },

    #' @description
    #' Deserialize JSON string into an instance of DeleteAssetGroupBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteAssetGroupBody
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`asset_groups_to_delete`)) {
        self$`asset_groups_to_delete` <- ApiClient$new()$deserializeObj(this_object$`asset_groups_to_delete`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeleteAssetGroupBody in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`asset_groups_to_delete`)) {
          sprintf(
          '"asset_groups_to_delete":
             [%s]
          ',
          paste(unlist(lapply(self$`asset_groups_to_delete`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of DeleteAssetGroupBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteAssetGroupBody
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`asset_groups_to_delete` <- ApiClient$new()$deserializeObj(this_object$`asset_groups_to_delete`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to DeleteAssetGroupBody and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `asset_groups_to_delete`
      if (!is.null(input_json$`asset_groups_to_delete`)) {
        stopifnot(is.vector(input_json$`asset_groups_to_delete`), length(input_json$`asset_groups_to_delete`) != 0)
        tmp <- sapply(input_json$`asset_groups_to_delete`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DeleteAssetGroupBody: the required field `asset_groups_to_delete` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeleteAssetGroupBody
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `asset_groups_to_delete` is null
      if (is.null(self$`asset_groups_to_delete`)) {
        return(FALSE)
      }

      if (length(self$`asset_groups_to_delete`) > 50) {
        return(FALSE)
      }
      if (length(self$`asset_groups_to_delete`) < 1) {
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
      # check if the required `asset_groups_to_delete` is null
      if (is.null(self$`asset_groups_to_delete`)) {
        invalid_fields["asset_groups_to_delete"] <- "Non-nullable required field `asset_groups_to_delete` cannot be null."
      }

      if (length(self$`asset_groups_to_delete`) > 50) {
        invalid_fields["asset_groups_to_delete"] <- "Invalid length for `asset_groups_to_delete`, number of items must be less than or equal to 50."
      }
      if (length(self$`asset_groups_to_delete`) < 1) {
        invalid_fields["asset_groups_to_delete"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# DeleteAssetGroupBody$unlock()
#
## Below is an example to define the print function
# DeleteAssetGroupBody$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeleteAssetGroupBody$lock()

