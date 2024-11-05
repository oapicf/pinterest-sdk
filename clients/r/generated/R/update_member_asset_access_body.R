#' Create a new UpdateMemberAssetAccessBody
#'
#' @description
#' An object with a list of all the new accesses.
#'
#' @docType class
#' @title UpdateMemberAssetAccessBody
#' @description UpdateMemberAssetAccessBody Class
#' @format An \code{R6Class} generator object
#' @field accesses  list(\link{UpdateMemberAssetAccessBodyAccessesInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateMemberAssetAccessBody <- R6::R6Class(
  "UpdateMemberAssetAccessBody",
  public = list(
    `accesses` = NULL,

    #' @description
    #' Initialize a new UpdateMemberAssetAccessBody class.
    #'
    #' @param accesses accesses
    #' @param ... Other optional arguments.
    initialize = function(`accesses`, ...) {
      if (!missing(`accesses`)) {
        stopifnot(is.vector(`accesses`), length(`accesses`) != 0)
        sapply(`accesses`, function(x) stopifnot(R6::is.R6(x)))
        self$`accesses` <- `accesses`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return UpdateMemberAssetAccessBody in JSON format
    toJSON = function() {
      UpdateMemberAssetAccessBodyObject <- list()
      if (!is.null(self$`accesses`)) {
        UpdateMemberAssetAccessBodyObject[["accesses"]] <-
          lapply(self$`accesses`, function(x) x$toJSON())
      }
      UpdateMemberAssetAccessBodyObject
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdateMemberAssetAccessBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateMemberAssetAccessBody
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`accesses`)) {
        self$`accesses` <- ApiClient$new()$deserializeObj(this_object$`accesses`, "array[UpdateMemberAssetAccessBodyAccessesInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return UpdateMemberAssetAccessBody in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`accesses`)) {
          sprintf(
          '"accesses":
          [%s]
',
          paste(sapply(self$`accesses`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdateMemberAssetAccessBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateMemberAssetAccessBody
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`accesses` <- ApiClient$new()$deserializeObj(this_object$`accesses`, "array[UpdateMemberAssetAccessBodyAccessesInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to UpdateMemberAssetAccessBody and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `accesses`
      if (!is.null(input_json$`accesses`)) {
        stopifnot(is.vector(input_json$`accesses`), length(input_json$`accesses`) != 0)
        tmp <- sapply(input_json$`accesses`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UpdateMemberAssetAccessBody: the required field `accesses` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateMemberAssetAccessBody
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `accesses` is null
      if (is.null(self$`accesses`)) {
        return(FALSE)
      }

      if (length(self$`accesses`) > 50) {
        return(FALSE)
      }
      if (length(self$`accesses`) < 1) {
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
      # check if the required `accesses` is null
      if (is.null(self$`accesses`)) {
        invalid_fields["accesses"] <- "Non-nullable required field `accesses` cannot be null."
      }

      if (length(self$`accesses`) > 50) {
        invalid_fields["accesses"] <- "Invalid length for `accesses`, number of items must be less than or equal to 50."
      }
      if (length(self$`accesses`) < 1) {
        invalid_fields["accesses"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# UpdateMemberAssetAccessBody$unlock()
#
## Below is an example to define the print function
# UpdateMemberAssetAccessBody$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateMemberAssetAccessBody$lock()

