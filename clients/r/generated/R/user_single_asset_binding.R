#' Create a new UserSingleAssetBinding
#'
#' @description
#' An object containing the permissions a business member/partner has on the asset.
#'
#' @docType class
#' @title UserSingleAssetBinding
#' @description UserSingleAssetBinding Class
#' @format An \code{R6Class} generator object
#' @field permissions Permission levels member or partner has on an asset. list(character) [optional]
#' @field user  \link{BusinessAccessUserSummary} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UserSingleAssetBinding <- R6::R6Class(
  "UserSingleAssetBinding",
  public = list(
    `permissions` = NULL,
    `user` = NULL,

    #' @description
    #' Initialize a new UserSingleAssetBinding class.
    #'
    #' @param permissions Permission levels member or partner has on an asset.
    #' @param user user
    #' @param ... Other optional arguments.
    initialize = function(`permissions` = NULL, `user` = NULL, ...) {
      if (!is.null(`permissions`)) {
        stopifnot(is.vector(`permissions`), length(`permissions`) != 0)
        sapply(`permissions`, function(x) stopifnot(is.character(x)))
        self$`permissions` <- `permissions`
      }
      if (!is.null(`user`)) {
        stopifnot(R6::is.R6(`user`))
        self$`user` <- `user`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return UserSingleAssetBinding in JSON format
    toJSON = function() {
      UserSingleAssetBindingObject <- list()
      if (!is.null(self$`permissions`)) {
        UserSingleAssetBindingObject[["permissions"]] <-
          self$`permissions`
      }
      if (!is.null(self$`user`)) {
        UserSingleAssetBindingObject[["user"]] <-
          self$`user`$toJSON()
      }
      UserSingleAssetBindingObject
    },

    #' @description
    #' Deserialize JSON string into an instance of UserSingleAssetBinding
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserSingleAssetBinding
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`permissions`)) {
        self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`user`)) {
        `user_object` <- BusinessAccessUserSummary$new()
        `user_object`$fromJSON(jsonlite::toJSON(this_object$`user`, auto_unbox = TRUE, digits = NA))
        self$`user` <- `user_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return UserSingleAssetBinding in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`permissions`)) {
          sprintf(
          '"permissions":
             [%s]
          ',
          paste(unlist(lapply(self$`permissions`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`user`)) {
          sprintf(
          '"user":
          %s
          ',
          jsonlite::toJSON(self$`user`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of UserSingleAssetBinding
    #'
    #' @param input_json the JSON input
    #' @return the instance of UserSingleAssetBinding
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[character]", loadNamespace("openapi"))
      self$`user` <- BusinessAccessUserSummary$new()$fromJSON(jsonlite::toJSON(this_object$`user`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to UserSingleAssetBinding and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UserSingleAssetBinding
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
# UserSingleAssetBinding$unlock()
#
## Below is an example to define the print function
# UserSingleAssetBinding$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UserSingleAssetBinding$lock()

